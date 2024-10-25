package it.unisalento.pps.progettoEsame.dao;

import it.unisalento.pps.progettoEsame.dbConnection.DbConnection;
import it.unisalento.pps.progettoEsame.model.RicaricaCellulare;

/**
 * Ottieni i dati Ricarica Cellulare dal Database
 * */
public class RicaricaCellulareDAO {
	
	private static RicaricaCellulareDAO instance;
	
	public static synchronized RicaricaCellulareDAO getInstance() {
		
		if(instance == null)
			
			instance = new RicaricaCellulareDAO();
		
		return instance;
	}
	
	
	/**
	 * Inserisce nel database un nuova RicaricaCellulare
	 * @param ricarica l'oggetto Ricarica Cellulare da inserire nel database
	 * */
	public boolean salvaRicaricaCellulare(RicaricaCellulare ricarica) {
		
		
		boolean esito=DbConnection.getInstance().eseguiAggiornamento("INSERT INTO ricarica_cellulare VALUES (NULL, '"+ricarica.getCellulare()+"', '"+ricarica.getOperatore()+"', '"+ricarica.getImporto()+"', '"+ricarica.getCodCliente()+"', '"+ricarica.getCodFiliale()+"', "+((!ricarica.getData().isEmpty())? "'"+ricarica.getData()+"'":"''")+",'"+ricarica.getCodBanca()+"','"+ricarica.getCodContoCorrente()+"','"+ricarica.getCodCartaPrepagata()+"') ");
		
		System.out.println("INSERT INTO ricarica_cellulare VALUES (NULL, '"+ricarica.getCellulare()+"', '"+ricarica.getOperatore()+"', '"+ricarica.getImporto()+"', '"+ricarica.getCodCliente()+"', '"+ricarica.getCodFiliale()+"', '"+ricarica.getData()+"','"+ricarica.getCodBanca()+"','"+ricarica.getCodContoCorrente()+"','"+ricarica.getCodCartaPrepagata()+"') ");
		
		return esito;
	}

}
