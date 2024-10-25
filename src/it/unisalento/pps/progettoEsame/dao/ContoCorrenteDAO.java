package it.unisalento.pps.progettoEsame.dao;

import java.util.ArrayList;

import it.unisalento.pps.progettoEsame.dbConnection.DbConnection;

import it.unisalento.pps.progettoEsame.model.ContoCorrente;

/**
 * Gestisce i dati Conto Corrente con il database
 * */
public class ContoCorrenteDAO {
	
	private static ContoCorrenteDAO instance;
	
	public static synchronized ContoCorrenteDAO getInstance() {
		
		if(instance == null)
			
			instance = new ContoCorrenteDAO();
		
		return instance;
	}
	
	/**
	 * Inserisce nel database un Conto Corrente
	 * @param contoCorrente è l'oggetto ContoCorrente da inserire nel database
	 * @return la registrazione è avvenuta con successo ritorna TRUE, altrimenti FAlSE
	 * */
	public boolean salvaContoCorrente(ContoCorrente contoCorrente) {
		
		
		boolean esito=DbConnection.getInstance().eseguiAggiornamento("INSERT INTO conto_corrente VALUES (NULL, '"+contoCorrente.getSaldo()+"', '"+contoCorrente.getDataSaldo()+"', '"+contoCorrente.getImportoVincolato()+"', '"+contoCorrente.getCodBanca()+"', '"+contoCorrente.getCodCliente()+"', '"+contoCorrente.getCodFiliale()+"') ");
		
		System.out.println("INSERT INTO conto_corrente VALUES (NULL, '"+contoCorrente.getSaldo()+"', '"+contoCorrente.getDataSaldo()+"', '"+contoCorrente.getImportoVincolato()+"', '"+contoCorrente.getCodBanca()+"', '"+contoCorrente.getCodCliente()+"', '"+contoCorrente.getCodFiliale()+"') ");
		
		return esito;
	}
	
	
	/**
	 * Restituisce un ArrayList di Conti Correnti usando l'idCliente
	 * @param idCliente l'identificativo del cliente
	 * @return ArrayList di Conti Correnti del cliente
	 * */
	public ArrayList<ContoCorrente> getContiCorrenti(String idCliente){
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM conto_corrente WHERE Cod_cliente='"+idCliente+"'");
		ContoCorrente contoCorrente = new ContoCorrente();
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga;
		
		ArrayList<ContoCorrente> listaContiCorrenti = new ArrayList<ContoCorrente>(); 
		
		for(int i=0; i<risultato.size();i++) {
			
			riga = risultato.get(i);
			contoCorrente.setIdProdotto(riga[0]);
			contoCorrente.setSaldo(riga[1]);
			contoCorrente.setDataSaldo(riga[2]);
			contoCorrente.setImportoVincolato(riga[3]);
			contoCorrente.setCodBanca(riga[4]);
			contoCorrente.setCodCliente(riga[5]);
			contoCorrente.setCodFiliale(riga[6]);
			
			listaContiCorrenti.add(contoCorrente);
		}
		
		return listaContiCorrenti;
		
		
	}
	
	/**
	 * Restituisce un ArrayList di Conti correnti di una Filiale usando l'idFiliale
	 * @param idFiliale l'identificativo della filiale
	 * @return ArrayList di Conti Correnti della filiale
	 */
	public ArrayList<ContoCorrente> getContiCorrentiFiliale(String idFiliale){
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM conto_corrente WHERE Cod_filiale='"+idFiliale+"'");
		
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga;
		
		ArrayList<ContoCorrente> listaContiCorrenti = new ArrayList<ContoCorrente>(); 
		
		for(int i=0; i<risultato.size();i++) {
			
			riga = risultato.get(i);
			
			ContoCorrente contoCorrente = new ContoCorrente();
			
			contoCorrente.setIdProdotto(riga[0]);
			contoCorrente.setSaldo(riga[1]);
			contoCorrente.setDataSaldo(riga[2]);
			contoCorrente.setImportoVincolato(riga[3]);
			contoCorrente.setCodBanca(riga[4]);
			contoCorrente.setCodCliente(riga[5]);
			contoCorrente.setCodFiliale(riga[6]);
			
			listaContiCorrenti.add(contoCorrente);
		}
		
		
		
		for(int i=0; i<listaContiCorrenti.size();i++) {
			
			System.out.println(listaContiCorrenti.get(i).getIdProdotto()+" "+listaContiCorrenti.get(i).getSaldo()+" "+listaContiCorrenti.get(i).getCodFiliale()+" "+listaContiCorrenti.get(i).getCodCliente());
			
		}
		
		return listaContiCorrenti;
		
		
	}

	
	
	/***
	 * Cerca un Conto Corrente dal suo Id Conto Corrente
	 * @param idContoCorrente l'identificatore del Conto Corrente da cercare
	 * @return il Conto Corrente cercato, altrimenti NULL
	 */
	public ContoCorrente cercaContoCorrente(String idContoCorrente) {
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM conto_corrente WHERE ID_Prodotto='"+idContoCorrente+"'");
		ContoCorrente contoCorrente = new ContoCorrente();
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga = risultato.get(0);
		
		contoCorrente.setIdProdotto(riga[0]);
		contoCorrente.setSaldo(riga[1]);
		contoCorrente.setDataSaldo(riga[2]);
		contoCorrente.setImportoVincolato(riga[3]);
		contoCorrente.setCodBanca(riga[4]);
		contoCorrente.setCodCliente(riga[5]);
		contoCorrente.setCodFiliale(riga[6]);

		
		
		return contoCorrente;
		
		
	}
	
	/**
	 * Aggiorna il saldo di un Conto Corrente
	 * @param idContoCorrente l'identificativo del conto corrente da aggiornare
	 * @param nuovoSaldo il nuovo saldo da inserire
	 * @param data la nuova data del saldo
	 * @return TRUE se l'aggiornamento è avvenuto con successo, FALSE altrimenti
	 */
	public boolean aggiornaSaldo(String idContoCorrente, String nuovoSaldo, String data) {
		
		boolean esito = DbConnection.getInstance().eseguiAggiornamento("UPDATE conto_corrente SET Saldo = '"+nuovoSaldo+"', Data_saldo = '"+data+"' WHERE conto_corrente.ID_Prodotto = "+idContoCorrente+"");
		
		return esito;
		
	}
	
	
	/**
	 * Restituisce la Stringa codice identificativo del cliente che ha il conto corrente
	 * @param idContoCorrente l'identificativo del conto corrente
	 * @return la Stringa contenente l'identificativo del cliente, NULL altrimenti
	 */
	public String getIdCliente(String idContoCorrente) {
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM conto_corrente WHERE ID_Prodotto='"+idContoCorrente+"'");
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga = risultato.get(0);
		
		return riga[5];

	
	}

}
