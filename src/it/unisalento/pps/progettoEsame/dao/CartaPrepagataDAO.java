package it.unisalento.pps.progettoEsame.dao;

import java.util.ArrayList;

import it.unisalento.pps.progettoEsame.dbConnection.DbConnection;
import it.unisalento.pps.progettoEsame.model.CartaPrepagata;



/**
 * Gestisce i dati della Carta Prepagata con il database
 * */
public class CartaPrepagataDAO {
	
	private static CartaPrepagataDAO instance;
	
	public static synchronized CartaPrepagataDAO getInstance() {
		
		if(instance == null)
			
			instance = new CartaPrepagataDAO();
		
		return instance;
	}

	/**
	 * Inserisce nel database una Carta Prepagata
	 * @param cartaprepagata è l'oggetto CartaPrepagata da inserire nel database
	 * @return la registrazione è avvenuta con successo ritorna TRUE, altrimenti FAlSE
	 * */
	public boolean salvaCartaPrepagata(CartaPrepagata cartaprepagata) {
		
		
		boolean esito=DbConnection.getInstance().eseguiAggiornamento("INSERT INTO carta_prepagata VALUES (NULL, '"+cartaprepagata.getSaldo()+"', '"+cartaprepagata.getDataSaldo()+"', '"+cartaprepagata.getDataScadenza()+"', '"+cartaprepagata.getCvv()+"', '"+cartaprepagata.getPlafondMax()+"', '"+cartaprepagata.getCodBanca()+"', '"+cartaprepagata.getCodCliente()+"', '"+cartaprepagata.getCodFiliale()+"') ");
		
		System.out.println("INSERT INTO carta_prepagata VALUES (NULL, '"+cartaprepagata.getSaldo()+"', '"+cartaprepagata.getDataSaldo()+"', '"+cartaprepagata.getDataScadenza()+"', '"+cartaprepagata.getCvv()+"', '"+cartaprepagata.getPlafondMax()+"', '"+cartaprepagata.getCodBanca()+"', '"+cartaprepagata.getCodCliente()+"', '"+cartaprepagata.getCodFiliale()+"') ");
		
		return esito;
	}
	
	/**
	 * Ritorna un ArrayList di Carte Prepagate del Cliente
	 * @param idCliente l'identificativo del cliente a cui appartengono le carte prepagate
	 * @return ArrayList di Carte Prepagate del Cliente
	 */
	public ArrayList<CartaPrepagata> getCartePrepagate(String idCliente){
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM carta_prepagata WHERE Cod_cliente='"+idCliente+"'");
		
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga;
		
		ArrayList<CartaPrepagata> listaCartePrepagate = new ArrayList<CartaPrepagata>(); 
		
		for(int i=0; i<risultato.size();i++) {
			
			riga = risultato.get(i);
			
			CartaPrepagata cartaPrepagata = new CartaPrepagata();
			
			cartaPrepagata.setIdProdotto(riga[0]);
			cartaPrepagata.setSaldo(riga[1]);
			cartaPrepagata.setDataSaldo(riga[2]);
			cartaPrepagata.setDataScadenza(riga[3]);
			cartaPrepagata.setCvv(riga[4]);
			cartaPrepagata.setPlafondMax(riga[5]);
			cartaPrepagata.setCodBanca(riga[6]);
			cartaPrepagata.setCodCliente(riga[7]);
			cartaPrepagata.setCodFiliale(riga[8]);
			
			listaCartePrepagate.add(cartaPrepagata);
		}
		
		return listaCartePrepagate;
				
	}
	
	
	
	/**
	 * Ritorna un ArrayList di Carte Prepagate che appartengono a una filiale
	 * @param idFiliale identificativo della filiale
	 * @return un ArrayList di Carte Prepagate della Filiale
	 */
	public ArrayList<CartaPrepagata> getCartePrepagateFiliale(String idFiliale){
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM carta_prepagata WHERE Cod_filiale='"+idFiliale+"'");
		CartaPrepagata cartaPrepagata = new CartaPrepagata();
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga;
		
		ArrayList<CartaPrepagata> listaCartePrepagate = new ArrayList<CartaPrepagata>(); 
		
		for(int i=0; i<risultato.size();i++) {
			
			riga = risultato.get(i);
			cartaPrepagata.setIdProdotto(riga[0]);
			cartaPrepagata.setSaldo(riga[1]);
			cartaPrepagata.setDataSaldo(riga[2]);
			cartaPrepagata.setDataScadenza(riga[3]);
			cartaPrepagata.setCvv(riga[4]);
			cartaPrepagata.setPlafondMax(riga[5]);
			cartaPrepagata.setCodBanca(riga[6]);
			cartaPrepagata.setCodCliente(riga[7]);
			cartaPrepagata.setCodFiliale(riga[8]);
			
			listaCartePrepagate.add(cartaPrepagata);
		}
		
		return listaCartePrepagate;
		
		
	}
	
	
	
	/***
	 * Cerca una Carta Prepagata dal suo Id Carta Prepagata
	 * @param idCartaPrepagata l'identificatore del Carta Prepagata da cercare
	 * @return la Carta Prepagata cercato, altrimenti NULL
	 */
	public CartaPrepagata cercaCartaPrepagata(String idCartaPrepagata) {
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM carta_prepagata WHERE ID_Prodotto='"+idCartaPrepagata+"'");
		CartaPrepagata cartaPrepagata = new CartaPrepagata();
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga = risultato.get(0);
		
		cartaPrepagata.setIdProdotto(riga[0]);
		cartaPrepagata.setSaldo(riga[1]);
		cartaPrepagata.setDataSaldo(riga[2]);
		cartaPrepagata.setDataScadenza(riga[3]);
		cartaPrepagata.setCvv(riga[4]);
		cartaPrepagata.setPlafondMax(riga[5]);
		cartaPrepagata.setCodBanca(riga[6]);
		cartaPrepagata.setCodCliente(riga[7]);
		cartaPrepagata.setCodFiliale(riga[8]);

				
		return cartaPrepagata;		
	}
	
	
	/**
	 * Aggiorna il saldo di una Carta Prepagata
	 * @param idCartaPrepagata l'identificativo della carta prepagata da aggiornare
	 * @param nuovoSaldo il nuovo saldo da inserire
	 * @param data la nuova data del saldo
	 * @return TRUE se l'aggiornamento è avvenuto con successo, FALSE altrimenti
	 */
	public boolean aggiornaSaldo(String idCartaPrepagata, String nuovoSaldo, String data) {
		
		boolean esito = DbConnection.getInstance().eseguiAggiornamento("UPDATE carta_prepagata SET Saldo = '"+nuovoSaldo+"', Data_saldo = '"+data+"' WHERE carta_prepagata.ID_Prodotto = "+idCartaPrepagata+"");
		
		return esito;
		
	}

	
	/**
	 * Restituisce la Stringa codice identificativo del cliente che ha la carta prepagata
	 * @param idCartaPrepagata l'identificativo del conto corrente
	 * @return la Stringa contenente l'identificativo del cliente, NULL altrimenti
	 */
	public String getIdCliente(String idCartaPrepagata) {
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM carta_prepagata WHERE ID_Prodotto='"+idCartaPrepagata+"'");
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga = risultato.get(0);
		
		return riga[7];

	
	}

	
}
