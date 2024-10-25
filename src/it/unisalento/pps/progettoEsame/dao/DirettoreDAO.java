package it.unisalento.pps.progettoEsame.dao;

import java.util.ArrayList;
import java.util.Iterator;

import it.unisalento.pps.progettoEsame.dbConnection.DbConnection;
import it.unisalento.pps.progettoEsame.model.Direttore;

/**
 * Ottiene i dati del Direttore dal Database
 * */
public class DirettoreDAO {
	
	private static DirettoreDAO instance;
	
	public static synchronized DirettoreDAO getInstance() {
		
		if(instance == null)
			
			instance = new DirettoreDAO();
		
		return instance;
	}

	/**
	 * Cerca un singolo Direttore
	 * @param username è la Stringa username corrispondente al direttore da trovare 
	 * */
	public Direttore cercaDaUsername(String username) {
		
		Direttore direttore=new Direttore();
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM direttore WHERE Username='"+username+"' ");
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga=risultato.get(0);
		
		direttore.setUsername(riga[0]);
		direttore.setPassword(riga[1]);
		direttore.setNome(riga[2]);
		direttore.setCognome(riga[3]);
		direttore.setStipendioDaStringinDouble(riga[4]);
		
				
		return direttore;
	}
	
	/**
	 * Cerca nel Database il Direttore che ha l'username passato nella funzione
	 * @param username è la Stringa username del direttore da cercare
	 * @return boolean se è stato trovato ritorna TRUE, altrimenti FALSE
	 * */
	public boolean trovaDaUsername(String username) {
		
		boolean trovato;
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM direttore WHERE Username='"+username+"' ");
		
		if(risultato.size()==0)
			
			trovato = false;
		else
			trovato = true;
		
		return trovato;
	}
	
	/**
	 * Inserisce nel database un unico direttore
	 * @param cassiere è l'oggetto Direttore da inserire
	 * */
	public boolean salvaDirettore(Direttore direttore) {
		
		
		boolean esito=DbConnection.getInstance().eseguiAggiornamento("INSERT INTO direttore VALUES ('"+direttore.getUsername()+"', '"+direttore.getPassword()+"', '"+direttore.getNome()+"', '"+direttore.getCognome()+"', '"+direttore.getStipendioInString()+"') ");
		
		System.out.println("INSERT INTO direttore VALUES ('"+direttore.getUsername()+"', '"+direttore.getPassword()+"', '"+direttore.getNome()+"', '"+direttore.getCognome()+"', '"+direttore.getStipendioInString()+"') ");
		
		return esito;
	}
	
	
}
