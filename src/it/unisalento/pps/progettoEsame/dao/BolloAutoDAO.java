package it.unisalento.pps.progettoEsame.dao;

import it.unisalento.pps.progettoEsame.dbConnection.DbConnection;
import it.unisalento.pps.progettoEsame.model.BolloAuto;


/**
 * Gestisce i dati Bollo Auto con il database
 * */
public class BolloAutoDAO {
	
	private static BolloAutoDAO instance;
	
	public static synchronized BolloAutoDAO getInstance() {
		
		if(instance == null)
			
			instance = new BolloAutoDAO();
		
		return instance;
	}
	
	/**
	 * Inserisce nel database un Bollo Auto
	 * @param bolloauto è l'oggetto bolloAuto da inserire nel database
	 * @return la registrazione è avvenuta con successo ritorna TRUE, altrimenti FAlSE
	 * */
	public boolean salvaBolloAuto(BolloAuto bolloauto) {
		
		
		boolean esito=DbConnection.getInstance().eseguiAggiornamento("INSERT INTO bollo_auto VALUES (NULL, '"+bolloauto.getTarga()+"', '"+bolloauto.getMarca()+"', '"+bolloauto.getModello()+"', '"+bolloauto.getCilindrata()+"', '"+bolloauto.getKwatt()+"', '"+bolloauto.getImporto()+"','"+bolloauto.getCodCliente()+"','"+bolloauto.getCodFiliale()+"','"+bolloauto.getData()+"', '"+bolloauto.getCodBanca()+"', '"+bolloauto.getCodContoCorrente()+"', '"+bolloauto.getCodCartaPrepagata()+"') ");
		
		System.out.println("INSERT INTO bollo_auto VALUES (NULL, '"+bolloauto.getTarga()+"', '"+bolloauto.getMarca()+"', '"+bolloauto.getModello()+"', '"+bolloauto.getCilindrata()+"', '"+bolloauto.getKwatt()+"', '"+bolloauto.getImporto()+"','"+bolloauto.getCodCliente()+"','"+bolloauto.getCodFiliale()+"','"+bolloauto.getData()+"', '"+bolloauto.getCodBanca()+"', '"+bolloauto.getCodContoCorrente()+"', '"+bolloauto.getCodCartaPrepagata()+"') ");
		
		return esito;
	}

	

}
