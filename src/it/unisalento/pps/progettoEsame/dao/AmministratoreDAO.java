package it.unisalento.pps.progettoEsame.dao;

import java.util.ArrayList;
import java.util.Iterator;

import it.unisalento.pps.progettoEsame.dbConnection.DbConnection;
import it.unisalento.pps.progettoEsame.model.Amministratore;

/**
 * Ottiene i dati dell' Amministratore dal Database
 * */
public class AmministratoreDAO {
	
	private static AmministratoreDAO instance;
	
	public static synchronized AmministratoreDAO getInstance() {
		
		if(instance == null)
			
			instance = new AmministratoreDAO();
		
		return instance;
	}
	
	/**
	 * Cerca un singolo Amministratore
	 * @param username è la Stringa username corrispondente al amministratore da trovare 
	 * */
	public Amministratore cercaDaUsername(String username) {
		
		Amministratore amministratore=new Amministratore();
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM amministratore WHERE Username='"+username+"' ");
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga=risultato.get(0);
		
		amministratore.setUsername(riga[0]);
		amministratore.setPassword(riga[1]);
		amministratore.setNome(riga[2]);
		amministratore.setCognome(riga[3]);
		amministratore.setStipendioDaStringinDouble(riga[4]);
		
				
		return amministratore;
	}
	
	/**
	 * Inserisce nel database un unico amministratore
	 * @param cassiere è l'oggetto Amministratore da inserire
	 * */
	public boolean salvaAmministratore(Amministratore amministratore) {
		
		
		boolean esito=DbConnection.getInstance().eseguiAggiornamento("INSERT INTO amministratore VALUES ('"+amministratore.getUsername()+"', '"+amministratore.getPassword()+"', '"+amministratore.getNome()+"', '"+amministratore.getCognome()+"', '"+amministratore.getStipendioInString()+"') ");
		
		System.out.println("INSERT INTO amministratore VALUES ('"+amministratore.getUsername()+"', '"+amministratore.getPassword()+"', '"+amministratore.getNome()+"', '"+amministratore.getCognome()+"', '"+amministratore.getStipendioInString()+"') ");
		
		return esito;
	}

}
