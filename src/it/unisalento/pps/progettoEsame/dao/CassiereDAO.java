package it.unisalento.pps.progettoEsame.dao;

import java.util.ArrayList;

import it.unisalento.pps.progettoEsame.dbConnection.DbConnection;
import it.unisalento.pps.progettoEsame.model.Cassiere;

/**
 * Ottiene i dati del Cassiere dal Database
 * */
public class CassiereDAO {
	
	private static CassiereDAO instance;
	
	public static synchronized CassiereDAO getInstance() {
		
		if(instance == null)
			
			instance = new CassiereDAO();
		
		return instance;
	}

	/**
	 * Cerca un singolo Cassiere
	 * @param username è la Stringa username corrispondente al cassiere da trovare 
	 * */
	public Cassiere cercaDaUsername(String username) {
		
		Cassiere cassiere=new Cassiere();
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM cassiere WHERE Username='"+username+"' ");
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga=risultato.get(0);
		
		cassiere.setUsername(riga[0]);
		cassiere.setPassword(riga[1]);
		cassiere.setNome(riga[2]);
		cassiere.setCognome(riga[3]);
		cassiere.setStipendio(riga[4]);
		cassiere.setIdFiliale(riga[5]);
		
		
				
		return cassiere;
	}
	
	/**
	 * Inserisce nel database un unico cassiere
	 * @param cassiere è l'oggetto Cassiere da inserire
	 * */
	public boolean salvaCassiere(Cassiere cassiere) {
		
		
		boolean esito=DbConnection.getInstance().eseguiAggiornamento("INSERT INTO cassiere VALUES ('"+cassiere.getUsername()+"', '"+cassiere.getPassword()+"', '"+cassiere.getNome()+"', '"+cassiere.getCognome()+"', '"+cassiere.getStipendio()+"') ");
		
		System.out.println("INSERT INTO cassiere VALUES ('"+cassiere.getUsername()+"', '"+cassiere.getPassword()+"', '"+cassiere.getNome()+"', '"+cassiere.getCognome()+"', '"+cassiere.getStipendio()+"') ");
		
		return esito;
	}
	
}
	
