package it.unisalento.pps.progettoEsame.dao;

import java.util.ArrayList;

import it.unisalento.pps.progettoEsame.dbConnection.DbConnection;
import it.unisalento.pps.progettoEsame.model.Filiale;

/**
 * Ottiene i dati della Filiale dal Database
 * */
public class FilialeDAO {
	
	private static FilialeDAO instance;
	
	public static synchronized FilialeDAO getInstance() {
		
		if(instance == null)
			
			instance = new FilialeDAO();
		
		return instance;
	}
	
	
	/**
	 * Cerca una singola Filiale usando il Identificativo della Filiale della banca
	 * @param idfiliale è la Stringa corrispondente al IDFiliale della filiale della banca da cercare 
	 * */
	public Filiale cercaDaIdFiliale(String idfiliale) {
		
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM filiale WHERE ID_Filiale='"+idfiliale+"' ");
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga=risultato.get(0);
		
		Filiale filiale=new Filiale(riga[0],riga[1],riga[2],riga[3],riga[4],riga[5],riga[6],riga[7],riga[8]);
				
		return filiale;
	}
	
	/**
	 * Restituisce un ArrayList di Filiali contenente tutte le filiali disponibili
	 * @return lista un ArrayList<Filiale> 
	 * */
	public ArrayList<Filiale> caricaTutteLeFiliali() {
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM filiale");
		
		ArrayList<Filiale> lista=new ArrayList<Filiale>();
		
		
		
		if(risultato.size()==0)
			
			return null;
		
		for(int i=0; i<risultato.size();i++) {
			
			String[] riga=risultato.get(i);
			Filiale filiale=new Filiale(riga[0],riga[1],riga[2],riga[3],riga[4],riga[5],riga[6],riga[7],riga[8]);
			lista.add(filiale);
			
		}
		
		return lista;
	}

	/**
	 * Inserisce nel database una filiale
	 * @param filiale è l'oggetto Filiale da inserire
	 * */
	public boolean salvaFiliale(Filiale filiale) {
		
		
		boolean esito=DbConnection.getInstance().eseguiAggiornamento("INSERT INTO filiale VALUES (NULL, '"+filiale.getNome()+"', '"+filiale.getVia()+"', '"+filiale.getCitta()+"', '"+filiale.getProvincia()+"', '"+filiale.getImmagineUno()+"','"+filiale.getImmagineDue()+"','"+filiale.getImmagineTre()+"','"+filiale.getCodiceBanca()+"') ");
		
		System.out.println("INSERT INTO filiale VALUES (NULL, '"+filiale.getNome()+"', '"+filiale.getVia()+"', '"+filiale.getCitta()+"', '"+filiale.getProvincia()+"', '"+filiale.getImmagineUno()+"','"+filiale.getImmagineDue()+"','"+filiale.getImmagineTre()+"','"+filiale.getCodiceBanca()+"') ");
		
		return esito;
	}
	
	
	/**
	 * Trova se esiste una filiale passando il nome e il codice della banca
	 * @param nome il nome della filiale
	 * @param codBanca la Stringa codice della banca
	 * @return True se la filiale è stata trovata, False altrimenti
	 * */
	public boolean trovataFiliale(String nome, String codBanca) {
		
		boolean trovato;
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM filiale WHERE Nome='"+nome+"' AND Cod_banca='"+codBanca+"'");
		
		if(risultato.size()==0)
			
			trovato = false;
		else
			trovato = true;
		
		return trovato;
		
	}
	
	
	/**
	 * Restituisce la Stringa codice identificativo della filiale usando il nome della filiale e
	 * codice identificativo della banca
	 * @param nomeFiliale la Stringa contenente il nome della filiale 
	 * @param codBanca la Stringa contenente il codice identificativo della banca
	 * */
	public String cercaCodFiliale(String nomeFiliale, String codBanca) {
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM filiale WHERE Nome='"+nomeFiliale+"' AND Cod_banca='"+codBanca+"'");
		
		String[] riga=risultato.get(0);
		
		return riga[0];
	}
	
	/**
	 * Restituisce la Stringa di codice identificativo della banca usando la filiale
	 * @param filiale la Stringa contenente il codice identificativo della filiale
	 * @return la Stringa codice identificativo della banca
	 * */
	public String cercaBancaDaFiliale(String filiale) {
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM filiale WHERE ID_Filiale='"+filiale+"'");
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga=risultato.get(0);
		
		return riga[8];
		
	}

}
