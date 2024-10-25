package it.unisalento.pps.progettoEsame.model;


/**
 * Gestisce i dati di una ricarica cellulare
 * */
public class RicaricaCellulare {
	
	private String idservizio="";
	private String cellulare="";
	private String operatore="";
	private String importo="";
	private String codCliente="";
	private String codFiliale="";
	private String data="";
	private String codBanca="";
	private String codContoCorrente="";
	private String codCartaPrepagata="";
	
	/**
	 * Costruttore vuoto di Ricarica Cellulare
	 * */
	public RicaricaCellulare() {
		
	}

	/**
	 * Costruttore di Ricarica Cellulare
	 * */
	public RicaricaCellulare(String idservizio, String cellulare, String operatore, String importo, String codCliente, String codFiliale, String data, String codBanca, String codContoCorrente, String codCartaPrepagata) {
		
		this.idservizio = idservizio;
		this.cellulare = cellulare;
		this.operatore = operatore;
		this.importo = importo;
		this.codCliente = codCliente;
		this.codFiliale = codFiliale;
		this.data = data;
		this.codBanca = codBanca;
		this.codContoCorrente = codContoCorrente;
		this.codCartaPrepagata = codCartaPrepagata;
	}
	
	/**
	 * Restituisce la Stringa Id Servizio, l'identificativo della Ricarica Cellulare
	 * @return La Stringa Id Servizio
	 * */
	public String getIdservizio() {
		
		return this.idservizio;
	}
	
	/**
	 * Imposta la Stringa Idservizio della Ricarica Cellulare
	 * @param idservizio è la Stringa da impostare come IdServizio
	 * */
	public void setIdservizio(String idservizio) {
		
		this.idservizio = idservizio;
		return;
	}
	
	/**
	 * Restituisce la Stringa Cellulare, il numero di cellulare a cui fare la Ricarica Cellulare
	 * @return La Stringa cellulare
	 * */
	public String getCellulare() {
		
		return this.cellulare;
	}
	
	/**
	 * Imposta la Stringa Cellulare, il numero di telefono a cui fare la Ricarica Cellulare
	 * @param cellulare è la Stringa da impostare come Cellulare
	 * */
	public void setCellulare(String cellulare) {
		
		this.cellulare = cellulare;
		return;
	}
	
	/**
	 * Restituisce la Stringa Operatore, l'operatore telefonico della Ricarica Cellulare
	 * @return La Stringa Operatore
	 * */
	public String getOperatore() {
		
		return this.operatore;
	}
	
	/**
	 * Imposta la Stringa Operatore, l'operatore telefonico della Ricarica Cellulare
	 * @param operatore è la Stringa da impostare come Operatore
	 * */
	public void setOperatore(String operatore) {
		
		this.operatore = operatore;
		return;
	}
	
	/**
	 * Restituisce la Stringa Importo, l'importo della Ricarica Cellulare da effettuare
	 * @return La Stringa Importo
	 * */
	public String getImporto() {
		
		return this.importo;
	}
	
	/**
	 * Imposta la Stringa Importo, l'importo della Ricarica Cellulare da effettuare
	 * @param importo è la Stringa da impostare come Importo
	 * */
	public void setImporto(String importo) {
		
		this.importo = importo;
		return;
	}
	
	/**
	 * Restituisce la Stringa CodCliente, l'identificativo del Cliente che ha richiesto la Ricarica Cellulare
	 * @return La Stringa CodCliente
	 * */
	public String getCodCliente() {
		
		return this.codCliente;
	}
	
	/**
	 * Imposta la Stringa codCliente, l'identificativo del Cliente che ha richiesto la Ricarica Cellulare
	 * @param codCliente è la Stringa da impostare come codCliente
	 * */
	public void setCodCliente(String codCliente) {
		
		this.codCliente = codCliente;
		return;
	}
	
	/**
	 * Restituisce la Stringa CodFiliale, l'identificativo della Filiale del Cliente che ha effettuato la ricarica della Ricarica Cellulare
	 * @return La Stringa CodFiliale
	 * */
	public String getCodFiliale() {
		
		return this.codFiliale;
	}
	
	/**
	 * Imposta la Stringa codFiliale, l'identificativo della Filiale del Cliente che ha effettuato la Ricarica Cellulare
	 * @param codFiliale è la Stringa da impostare come CodFiliale
	 * */
	public void setCodFiliale(String codFiliale) {
		
		this.codFiliale = codFiliale;
		return;
	}
	
	/**
	 * Restituisce la Stringa Data, la Data di quando è stata fatta la Ricarica Cellulare
	 * @return La Stringa Data
	 * */
	public String getData() {
		
		return this.data;
	}
	
	/**
	 * Imposta la Stringa Data, la Data di quando è stata fatta la Ricarica Cellulare
	 * @param data è la Stringa da impostare come data
	 * */
	public void setData(String data) {
		
		this.data = data;
		return;
	}
	
	/**
	 * Restituisce la Stringa CodBanca, l'identificativo della Banca che ha effettuato la Ricarica Cellulare
	 * @return La Stringa CodBanca
	 * */
	public String getCodBanca() {
		
		return this.codBanca;
	}
	
	/**
	 * Imposta la Stringa CodBanca, l'identificativo della Banca che ha effettuato la Ricarica Cellulare
	 * @param codBanca è la Stringa da impostare come codBanca
	 * */
	public void setCodBanca(String codBanca) {
		
		this.codBanca = codBanca;
		return;
	}
	
	/**
	 * Restituisce la Stringa CodContoCorrente, l'identificativo del Conto Corrente a cui è stata accreditata la Ricarica Cellulare
	 * @return La Stringa CodContoCorrente
	 * */
	public String getCodContoCorrente() {
		
		return this.codContoCorrente;
	}
	
	/**
	 * Imposta la Stringa CodContoCorrente, l'identificativo del Conto Corrente a cui è stata accreditata la Ricarica Cellulare
	 * @param codContoCorrente è la Stringa da impostare come CodContoCorrente
	 * */
	public void setCodContoCorrente(String codContoCorrente) {
		
		this.codContoCorrente = codContoCorrente;
		return;
	}
	
	/**
	 * Restituisce la Stringa CodCartaPrepagata, l'identificativo della Carta Prepagata a cui è stata accreditata la Ricarica Cellulare
	 * @return La Stringa CodCartaPrepagata
	 * */
	public String getCodCartaPrepagata() {
		
		return this.codCartaPrepagata;
	}
	
	/**
	 * Imposta la Stringa CodCartaPrepagata, l'identificativo della Carta Prepagata a cui è stata accreditata la Ricarica Cellulare
	 * @param codCartaPrepagata è la Stringa da impostare come CodCartaPrepagata
	 * */
	public void setCodCartaPrepagata(String codCartaPrepagata) {
		
		this.codCartaPrepagata = codCartaPrepagata;
		return;
	}
	
	
	
}
