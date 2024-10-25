package it.unisalento.pps.progettoEsame.dao;

import java.util.ArrayList;

import it.unisalento.pps.progettoEsame.dbConnection.DbConnection;
import it.unisalento.pps.progettoEsame.model.Apertura;



/**
 * Gestisce i dati di apertura di una filiale nel database
 * */
public class AperturaDAO {
	
	private static AperturaDAO instance;
	
	public static synchronized AperturaDAO getInstance() {
		
		if(instance == null)
			
			instance = new AperturaDAO();
		
		return instance;
	}
	
	/**
	 * Cerca l'apertura di una filiale
	 * @param filiale la Stringa contenete la filiale per trovare i suoi orari di apertura
	 * @return NULL se non è stato trovato niente, altrimenti ritorna un ArrayList di Stringhe
	 * */
	public ArrayList<Apertura> cercaApertura(String filiale) {
		
		ArrayList<String[]> risultato = new ArrayList<String[]>(); 
		
		ArrayList<Apertura> listaAperture = new ArrayList<Apertura>();
		
		
		//trovo per i vari elementi del catalogo e restituisci l'idcatalogo
		
		risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM apertura WHERE `Cod_filiale`='"+filiale+"'");
		
		if(risultato.size()==0)
			
			return null;
		for(int i=0; i<risultato.size();i++) {
			
			String[] riga= risultato.get(i);
			
			Apertura apertura = new Apertura(riga[0],riga[1],riga[2],riga[3]);
			
			listaAperture.add(apertura);
		}
				
		return listaAperture;
	}
	
	/**
	 * Salva un catalogo nel database
	 * @param catalogo il Catalogo da inserire
	 * @return l'esito dell'inserimento, ritorna TRUE se è andato a buon fine e FALSE altrimenti
	 * */
	public boolean salvaApertura(Apertura apertura) {
		
		boolean esito;
		esito = DbConnection.getInstance().eseguiAggiornamento("INSERT INTO apertura (`Cod_filiale`, `Cod_giorno`, `Orario_apertura`, `Orario_chiusura`) VALUES ('"+apertura.getCodFiliale()+"', '"+apertura.getCodGiorno()+"', '"+apertura.getOrarioApertura()+"', '"+apertura.getOrarioChiusura()+"')");
		
		return esito;
	}
	
	

}
