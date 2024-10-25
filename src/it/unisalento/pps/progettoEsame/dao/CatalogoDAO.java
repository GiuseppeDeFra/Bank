package it.unisalento.pps.progettoEsame.dao;

import it.unisalento.pps.progettoEsame.model.Catalogo;

import java.util.ArrayList;

import it.unisalento.pps.progettoEsame.dbConnection.DbConnection;

/**
 * Gestisce i del Catalogo nel database
 * */
public class CatalogoDAO {
	
	private static CatalogoDAO instance;
	
	public static synchronized CatalogoDAO getInstance() {
		
		if(instance == null)
			
			instance = new CatalogoDAO();
		
		return instance;
	}
	
	/**
	 * Cerca un catalogo dando un conto corrente, carta prepagata, ricarica telefonicae un bollo auto
	 * @return NULL se non è stato trovato niente, altrimenti ritorna la Stringa Idcatalogo
	 * */
	public String getEsisteCatalogo(Catalogo catalogo) {
		
		ArrayList<String[]> risultato = new ArrayList<String[]>(); 
		
		
		//trovo per i vari elementi del catalogo e restituisci l'idcatalogo
		
		risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM `catalogo` WHERE `Conto_corrente`='"+catalogo.getContoCorrente()+"' AND `Carta_prepagata`='"+catalogo.getCartaPrepagata()+"' AND `Ricarica_cellulare`='"+catalogo.getRicaricaCellulare()+"' AND `Bollo_auto`='"+catalogo.getBolloAuto()+"'");
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga=risultato.get(0);
		
		return riga[0];
	}
	
	/**
	 * Salva un catalogo nel database
	 * @param catalogo il Catalogo da inserire
	 * @return l'esito dell'inserimento, ritorna TRUE se è andato a buon fine e FALSE altrimenti
	 * */
	public boolean salvaCatalogo(Catalogo catalogo) {
		
		boolean esito;
		esito = DbConnection.getInstance().eseguiAggiornamento("INSERT INTO `catalogo` (`ID_Catalogo`, `Conto_corrente`, `Carta_prepagata`, `Ricarica_cellulare`, `Bollo_auto`) VALUES (NULL, '"+catalogo.getContoCorrente()+"', '"+catalogo.getCartaPrepagata()+"', '"+catalogo.getRicaricaCellulare()+"', '"+catalogo.getBolloAuto()+"')");
		
		return esito;
	}
	
	public Catalogo cercaCatalogo(String idCatalogo) {
		
		ArrayList<String[]> risultato = new ArrayList<String[]>(); 		
		
		risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM catalogo WHERE ID_Catalogo="+idCatalogo);
		

		if(risultato.size()==0)
			
			return null;
		
		String[] riga=risultato.get(0);
		
		
		Catalogo catalogo = new Catalogo(riga[0],riga[1],riga[2],riga[3],riga[4]);
		
		
		return catalogo;
	}

}
