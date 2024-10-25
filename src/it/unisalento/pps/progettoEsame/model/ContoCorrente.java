package it.unisalento.pps.progettoEsame.model;

/**
 * Gestisce i dati di un Conto Corrente
 * */
public class ContoCorrente {
	
	private String idprodotto;
	private String saldo;
	private String dataSaldo;
	private String importoVincolato;
	private String codBanca;
	private String codCliente;
	private String codFiliale;
	
	/**
	 * Costruttore Conto Corrente vuoto
	 * */
	public ContoCorrente() {
		
	}
	
	/**
	 * Costruttore Conto Corrente
	 * @param idprodotto la Stringa identificativo del Conto Corrente
	 * @param saldo è la String che contiene il saldo del Conto Corrente 
	 * @param dataSaldo è la Stringa che contiene la data dell'ultimo saldo del Conto Corrente 
	 * @param importoVincolato è la Stringa che indica l'importo vincolato del Conto Corrente 
	 * @param codBanca è la Stringa che contiene l'identificativo della Banca che ha rilasciato il Conto Corrente 
	 * @param codCliente è la Stringa che contiene l'identificativo del Cliente che possiede il Conto Corrente 
	 * @param codFiliale è la Stringa che contiene l'identificativo della Filiale a cui si è registrato il Cliente 
	 * 
	 * */
	public ContoCorrente(String idprodotto, String saldo, String dataSaldo, String importoVincolato, String codBanca, String codCliente, String codFiliale) {
		
		this.idprodotto = idprodotto;
		this.saldo = saldo;
		this.dataSaldo = dataSaldo;
		this.importoVincolato = importoVincolato;
		this.codBanca = codBanca;
		this.codCliente = codCliente;
		this.codFiliale = codFiliale;		
	}
	
	/**
	 * Restituisce la Stringa IdProdotto, identificativo del Conto Corrente
	 * @return la Stringa IdProdotto
	 * */
	public String getIdProdotto() {
		
		return this.idprodotto;
	}
	
	/**
	 * Imposta la Stringa IdProdotto, identificativo del Conto Corrente
	 * @param idprodotto la Stringa da inserire in IdProdotto 
	 * */
	public void setIdProdotto(String idprodotto) {
		
		this.idprodotto = idprodotto;
		return;
	}
	
	/**
	 * Restituisce la Stringa Saldo, contiene il Saldo del Conto Corrente
	 * @return la Stringa Saldo
	 * */
	public String getSaldo() {
		
		return this.saldo;
	}
	
	/**
	 * Imposta la Stringa Saldo, contiene il Saldo del Conto Corrente
	 * @param saldo la Stringa da inserire in Saldo 
	 * */
	public void setSaldo(String saldo) {
		
		this.saldo = saldo;
		return;
	}
	
	/**
	 * Restituisce la Stringa DataSaldo, contiene la data riferita all'ultimo aggiornamento del saldo del Conto Corrente
	 * @return la Stringa DataSaldo
	 * */
	public String getDataSaldo() {
		
		return this.dataSaldo;
	}
	
	/**
	 * Imposta la Stringa DataSaldo, contiene la data riferita all'ultimo aggiornamento del Conto Corrente
	 * @param dataSaldo la Stringa da inserire in DataSaldo 
	 * */
	public void setDataSaldo(String dataSaldo) {
		
		this.dataSaldo = dataSaldo;
		return;
	}
	
	/**
	 * Restituisce la Stringa ImportoVincolato, contiene l'importo vincolato del Conto Corrente
	 * @return la Stringa ImportoVincolato
	 * */
	public String getImportoVincolato() {
		
		return this.importoVincolato;
	}
	
	/**
	 * Imposta la Stringa ImportoVincolato, contiene l'importo vincolato del Conto Corrente
	 * @param importoVincolato la Stringa da inserire in ImportoVincolato 
	 * */
	public void setImportoVincolato(String importoVincolato) {
		
		this.importoVincolato = importoVincolato;
		return;
	}
	
	/**
	 * Restituisce la Stringa CodBanca, identificativo della Banca che ha aperto il Conto Corrente
	 * @return la Stringa CodBanca
	 * */
	public String getCodBanca() {
		
		return this.codBanca;
	}
	
	/**
	 * Imposta la Stringa CodBanca, identificativo della Banca che ha aperto il Conto Corrente
	 * @param codBanca la Stringa da inserire in CodBanca 
	 * */
	public void setCodBanca(String codBanca) {
		
		this.codBanca = codBanca;
		return;
	}
	
	/**
	 * Restituisce la Stringa CodCliente, identificativo del Cliente che ha il Conto Corrente
	 * @return la Stringa CodCliente
	 * */
	public String getCodCliente() {
		
		return this.codCliente;
	}
	
	/**
	 * Imposta la Stringa CodCliente, identificativo del Cliente che ha il Conto Corrente
	 * @param codCliente la Stringa da inserire in CodCliente 
	 * */
	public void setCodCliente(String codCliente) {
		
		this.codCliente = codCliente;
		return;
	}
	
	/**
	 * Restituisce la Stringa CodFiliale, identificativo della filiale a cui appartiene il Cliente che ha il Conto Corrente
	 * @return la Stringa CodFiliale
	 * */
	public String getCodFiliale() {
		
		return this.codFiliale;
	}
	
	/**
	 * Imposta la Stringa codFiliale, identificativo della filiale a cui appartiene il Cliente che ha il Conto Corrente
	 * @param codFiliale la Stringa da inserire in CodFiliale 
	 * */
	public void setCodFiliale(String codFiliale) {
		
		this.codFiliale = codFiliale;
		return;
	}
	
	
}
