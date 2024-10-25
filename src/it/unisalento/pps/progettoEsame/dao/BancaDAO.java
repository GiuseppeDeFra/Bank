package it.unisalento.pps.progettoEsame.dao;

import java.util.ArrayList;

import it.unisalento.pps.progettoEsame.dbConnection.DbConnection;
import it.unisalento.pps.progettoEsame.model.Banca;
import it.unisalento.pps.progettoEsame.model.ListaBanche;


/**
 * Ottiene i dati della Banca dal Database
 * */
public class BancaDAO {
	
	private static BancaDAO instance;
	
	public static synchronized BancaDAO getInstance() {
		
		if(instance == null)
			
			instance = new BancaDAO();
		
		return instance;
	}
	
	/**
	 * Cerca una singola Banca usando il Codice Direttore della banca
	 * @param codDirettore è la Stringa corrispondente al Codice Direttore della banca da cercare 
	 * */
	public Banca cercaDaCodDirettore(String codDirettore) {
		
		Banca banca=new Banca();
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM banca WHERE Cod_dir='"+codDirettore+"' ");
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga=risultato.get(0);
		
		
		banca.setIdBanca(riga[0]);
		banca.setNome(riga[1]);
		banca.setVia(riga[2]);
		banca.setCitta(riga[3]);
		banca.setProvincia(riga[4]);
		banca.setCodDirettore(riga[5]);
		banca.setInteressi(riga[6]);
		banca.setDataInteressi(riga[7]);
		banca.setRicorrenza(riga[8]);
		banca.setImmagineUno(riga[9]);
		banca.setImmagineDue(riga[10]);
		banca.setImmagineTre(riga[11]);
		banca.setCodCatalogo(riga[12]);
		
				
		return banca;
	}
	
	/**
	 * Restituisce un ArrayList di Banche contenente tutte le banche disponibili
	 * @return lista un ArrayList<Banca> 
	 * */
	public ArrayList<Banca> caricaTutteLeBanche() {
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM banca");
		
		ArrayList<Banca> lista=new ArrayList<Banca>();
		
		
		
		if(risultato.size()==0)
			
			return null;
		
		for(int i=0; i<risultato.size();i++) {
			
			String[] riga=risultato.get(i);
			Banca banca=new Banca(riga[0],riga[1],riga[2],riga[3],riga[4],riga[5],riga[6],riga[7],riga[8],riga[9],riga[10],riga[11],riga[12]);
			lista.add(banca);
			
		}
		
		return lista;
	}
	
	/**
	 * Cerca nel Database la Banca che ha il nome passato nella funzione
	 * @param nome è la Stringa nome della banca da cercare
	 * @return boolean se è stato trovato ritorna TRUE, altrimenti FALSE
	 * */
	public boolean trovaBanca(String nome) {
		
		boolean trovato;
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM banca WHERE Nome='"+nome+"'");
		
		if(risultato.size()==0)
			
			trovato = false;
		else
			trovato = true;
		
		return trovato;
		
	}

	/**
	 * Inserisce nel database una banca
	 * @param banca è l'oggetto Banca da inserire
	 * @return l'esito dell'inserimento, ritorna TRUE se è andato a buon fine e FALSE altrimenti
	 * */
	public boolean salvaBanca(Banca banca) {
		
		
		boolean esito=DbConnection.getInstance().eseguiAggiornamento("INSERT INTO banca VALUES (NULL, '"+banca.getNome()+"', '"+banca.getVia()+"', '"+banca.getCitta()+"', '"+banca.getProvincia()+"', '"+banca.getCodDirettore()+"', '"+banca.getInteressi()+"','"+banca.getDataInteressi()+"','"+banca.getRicorrenza()+"','"+banca.getImmagineUno()+"','"+banca.getImmagineDue()+"','"+banca.getImmagineTre()+"','"+banca.getCodCatalogo()+"') ");
		
		System.out.println("INSERT INTO banca VALUES (NULL, '"+banca.getNome()+"', '"+banca.getVia()+"', '"+banca.getCitta()+"', '"+banca.getProvincia()+"', '"+banca.getCodDirettore()+"', '"+banca.getInteressi()+"','"+banca.getDataInteressi()+"','"+banca.getRicorrenza()+"','"+banca.getImmagineUno()+"','"+banca.getImmagineDue()+"','"+banca.getImmagineTre()+"','"+banca.getCodCatalogo()+"') ");
		
		return esito;
	}
	
	
	/**
	 * Trova la Banca sapendo il direttore della banca
	 * @param codDirettore la Stringa del codice Direttore della banca
	 * @return il Codice della Banca che dirige il direttore
	 * */
	public String trovaBancaDaDirettore(String codDirettore) {
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM banca WHERE Cod_dir='"+codDirettore+"'");
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga=risultato.get(0);
		
		return riga[0];
		
	}
	
	
	/**
	 * Ritorna il codice del catalogo della banca
	 * @param idBanca la stringa contenente l'identificativo della banca
	 * @param la Stringa contenente l'identificativo del catalogo
	 * */
	public String cercaCatalogoDaBanca(String idBanca) {
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM banca WHERE ID_Banca='"+idBanca+"'");
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga=risultato.get(0);
		
		return riga[12];
	}

	
}
