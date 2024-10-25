package it.unisalento.pps.progettoEsame.model;

/**
 * Gestisce i dati di una Carta Prepagata
 * */
public class CartaPrepagata {
	
	private String idprodotto;
	private String saldo;
	private String dataSaldo;
	private String dataScadenza;
	private String cvv;
	private String plafondMax;
	private String codBanca;
	private String codCliente;
	private String codFiliale;
	
	/**
	 * Costruttore vuoto di Carta Prepagata
	 * */
	public CartaPrepagata() {
		
	}
	
	/**
	 * Costruttore di Carta Prepagata
	 * @param idprodotto è la Stringa identificativo della Carta Prepagata
	 * @param saldo è la Stringa che indica il saldo della Carta Prepagata
	 * @param dataSaldo è la Stringa che indica la data del saldo della Carta Prepagata
	 * @param dataScadenza è la Stringa che indica la data di scadenza della Carta Prepagata
	 * @param cvv è la Stringa che indica il codice cvv della Carta Prepagata
	 * @param plafondMax è la Stringa che indica il plafond Max che può contenere la Carta Prepagata
	 * @param codBanca è la Stringa che indica l'identificativo della Banca a cui appartiene la Carta Prepagata
	 * @param codCliente è la Stringa che indica l'identificativo del Cliente che in possesso della Carta Prepagata
	 * @param codFiliale è la Stringa che indica l'identificativo della Filiale a cui è registrato il Cliente della Carta Prepagata
	 * */
	public CartaPrepagata(String idprodotto, String saldo, String dataSaldo, String dataScadenza, String cvv, String plafondMax, String codBanca, String codCliente, String codFiliale) {
		
		this.idprodotto = idprodotto;
		this.saldo = saldo;
		this.dataSaldo = dataSaldo;
		this.dataScadenza = dataScadenza;
		this.cvv = cvv;
		this.plafondMax = plafondMax;
		this.codBanca = codBanca;
		this.codCliente = codCliente;
		this.codFiliale = codFiliale;
	}
	
	
	/**
	 * Restituisce la Stringa IdProdotto, identificativo della Carta Prepagata
	 * @return la Stringa IdProdotto
	 * */
	public String getIdProdotto() {
		
		return this.idprodotto;
	}
	
	/**
	 * Imposta la Stringa IdProdotto, identificativo della Carta Prepagata
	 * @param idprodotto la Stringa da inserire in IdProdotto 
	 * */
	public void setIdProdotto(String idprodotto) {
		
		this.idprodotto = idprodotto;
		return;
	}
	
	/**
	 * Restituisce la Stringa Saldo, il saldo della Carta Prepagata
	 * @return la Stringa Saldo
	 * */
	public String getSaldo() {
		
		return this.saldo;
	}
	
	/**
	 * Imposta la Stringa Saldo, il saldo della Carta Prepagata
	 * @param saldo la Stringa da inserire in Saldo 
	 * */
	public void setSaldo(String saldo) {
		
		this.saldo = saldo;
		return;
	}
	
	/**
	 * Restituisce la Stringa DataSaldo, la data dell'ultimo saldo della Carta Prepagata
	 * @return la Stringa DataSaldo
	 * */
	public String getDataSaldo() {
		
		return this.dataSaldo;
	}
	
	/**
	 * Imposta la Stringa DataSaldo, la data dell'ultimo saldo della Carta Prepagata
	 * @param dataSaldo la Stringa da inserire in DataSaldo 
	 * */
	public void setDataSaldo(String dataSaldo) {
		
		this.dataSaldo = dataSaldo;
		return;
	}
	
	/**
	 * Restituisce la Stringa DataScadenza, la data di scadenza della Carta Prepagata
	 * @return la Stringa dataScadenza
	 * */
	public String getDataScadenza() {
		
		return this.dataScadenza;
	}
	
	/**
	 * Imposta la Stringa DataScadenza, la data di scadenza della Carta Prepagata
	 * @param dataScadenza la Stringa da inserire in DataScadenza 
	 * */
	public void setDataScadenza(String dataScadenza) {
		
		this.dataScadenza = dataScadenza;
		return;
	}

	/**
	 * Restituisce la Stringa Cvv, contiene il codice Cvv della Carta Prepagata
	 * @return la Stringa Cvv
	 * */
	public String getCvv() {
		
		return this.cvv;
	}
	
	/**
	 * Imposta la Stringa Cvv, contiene il codice Cvv della Carta Prepagata
	 * @param cvv la Stringa da inserire in Cvv 
	 * */
	public void setCvv(String cvv) {
		
		this.cvv = cvv;
		return;
	}
	
	/**
	 * Restituisce la Stringa PlafondMax, indica il massimo capitale che può contenere la Carta Prepagata
	 * @return la Stringa PlafondMax
	 * */
	public String getPlafondMax() {
		
		return this.plafondMax;
	}
	
	/**
	 * Imposta la Stringa PlafondMax, indica il massimo capitale che può contenere la Carta Prepagata
	 * @param plafondMax la Stringa da inserire in plafondMax 
	 * */
	public void setPlafondMax(String plafondMax) {
		
		this.plafondMax = plafondMax;
		return;
	}
	
	/**
	 * Restituisce la Stringa CodBanca è l'identificativo della Banca che ha emesso la Carta Prepagata
	 * @return la Stringa CodBanca
	 * */
	public String getCodBanca() {
		
		return this.codBanca;
	}
	
	/**
	 * Imposta la Stringa CodBanca è l'identificativo della Banca che ha emesso la Carta Prepagata
	 * @param codBanca la Stringa da inserire in CodBanca 
	 * */
	public void setCodBanca(String codBanca) {
		
		this.codBanca = codBanca;
		return;
	}
	
	/**
	 * Restituisce la Stringa CodCliente l'identificativo del Cliente possessore della Carta Prepagata
	 * @return la Stringa CodCliente
	 * */
	public String getCodCliente() {
		
		return this.codCliente;
	}
	
	/**
	 * Imposta la Stringa codCliente l'identificativo del Cliente possessore della Carta Prepagata
	 * @param codCliente la Stringa da inserire in CodCliente 
	 * */
	public void setCodCliente(String codCliente) {
		
		this.codCliente = codCliente;
		return;
	}
	
	/**
	 * Restituisce la Stringa CodFiliale l'identificativo della Filiale in cui si è registrato il Cliente della Carta Prepagata
	 * @return la Stringa CodFiliale
	 * */
	public String getCodFiliale() {
		
		return this.codFiliale;
	}
	
	/**
	 * Imposta la Stringa CodFiliale l'identificativo della Filiale in cui si è registrato il Cliente della Carta Prepagata
	 * @param codFiliale la Stringa da inserire in codFiliale 
	 * */
	public void setCodFiliale(String codFiliale) {
		
		this.codFiliale = codFiliale;
		return;
	}
	
	
	
}
