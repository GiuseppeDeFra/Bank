package it.unisalento.pps.progettoEsame.model;

public class BolloAuto {
	
	private String idservizio;
	private String targa;
	private String marca;
	private String modello;
	private String cilindrata;
	private String kwatt;
	private String importo;
	private String codCliente;
	private String codFiliale;
	private String data;
	private String codBanca;
	private String codContoCorrente;
	private String codCartaPrepagata;
	
	/**
	 * Costruttore Bollo Auto vuoto
	 * */
	public BolloAuto() {
		
	}
	
	/**
	 * Costruttore Bollo Auto
	 * */
	public BolloAuto(String idservizio, String targa, String marca, String modello, String cilindrata, String kwatt, String importo, String codCliente, String codFiliale, String data, String codBanca, String codContoCorrente, String codCartaPrepagata) {
		
		this.idservizio = idservizio;
		this.targa = targa;
		this.marca = marca;
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.kwatt = kwatt;
		this.importo = importo;
		this.codCliente = codCliente;
		this.codFiliale = codFiliale;
		this.data = data;
		this.codBanca = codBanca;
		this.codContoCorrente = codContoCorrente;
		this.codCartaPrepagata = codCartaPrepagata;
	}
	
	/**
	 * Restituisce la Stringa IdServizio, l'identificativo del Bollo Auto
	 * @return la Stringa IdServizio
	 * */
	public String getIdServizio() {
		
		return this.idservizio;
	}
	
	/**
	 * Imposta la Stringa IdServizio, l'identificatore del Bollo Auto
	 * @param idservizio è la Stringa da inserire in IdServizio
	 * */
	public void setIdServizio(String idservizio) {
		
		this.idservizio=idservizio;
		return;
	}
	
	/**
	 * Restituisce la Stringa Targa, l'identificativo della macchia a cui pagare il Bollo Auto
	 * @return la String Targa
	 * */
	public String getTarga() {
		
		return this.targa;
	}
	
	/**
	 * Imposta la Stringa Targa, l'identificatore della macchina a cui pagare il Bollo Auto
	 * @param targa è la Stringa da inserire in Targa
	 * */
	public void setTarga(String targa) {
		
		this.targa=targa;
		return;
	}
	
	/**
	 * Restituisce la Stringa Marca, la marca dell'auto a cui pagare il Bollo Auto
	 * @return la Stringa Marca
	 * */
	public String getMarca() {
		
		return this.marca;
	}
	
	/**
	 * Imposta la Stringa Marca, la marca dell'auto a cui pagare il Bollo Auto
	 * @param marca è la Stringa da inserire in Marca
	 * */
	public void setMarca(String marca) {
		
		this.marca=marca;
		return;
	}
	
	/**
	 * Restituisce la Stringa Modello, il modello della macchina a cui pagare il Bollo Auto
	 * @return la Stringa Modello
	 * */
	public String getModello() {
		
		return this.modello;
	}
	
	/**
	 * Imposta la Stringa Modello, il modello della macchina a cui pagare il Bollo Auto
	 * @param modello è la Stringa da inserire in Modello
	 * */
	public void setModello(String modello) {
		
		this.modello = modello;
		return;
	}
	
	/**
	 * Restituisce la Stringa Cilindrata, la cilindrata della macchina a cui pagare il Bollo Auto
	 * @return la String Cilindrata
	 * */
	public String getCilindrata() {
		
		return this.cilindrata;
	}
	
	/**
	 * Imposta la Stringa Cilindrata, la cilindrata della macchina a cui pagare il Bollo Auto
	 * @param cilindrata è la Stringa da inserire in Cilindrata
	 * */
	public void setCilindrata(String cilindrata) {
		
		this.cilindrata = cilindrata;
		return;
	}
	
	/**
	 * Restituisce la Stringa Kwatt, i kwatt della macchina a cui pagare il Bollo Auto
	 * @return la String Kwatt
	 * */
	public String getKwatt() {
		
		return this.kwatt;
	}
	
	/**
	 * Imposta la Stringa Kwatt , i kwatt della macchina a cui pagare il Bollo Auto
	 * @param kwatt è la Stringa da inserire in Kwatt
	 * */
	public void setKwatt(String kwatt) {
		
		this.kwatt = kwatt;
		return;
	}
	
	/**
	 * Restituisce la Stringa Importo, l'importo del Bollo Auto da pagare
	 * @return la Stringa Importo
	 * */
	public String getImporto() {
		
		return this.importo;
	}
	
	/**
	 * Imposta la Stringa Importo, l'importo del Bollo Auto da pagare
	 * @param importo è la Stringa da inserire in Importo
	 * */
	public void setImporto(String importo) {
		
		this.importo = importo;
		return;
	}
	
	/**
	 * Restituisce la Stringa CodCliente, l'identificativo del Cliente che vuole fare il Bollo Auto
	 * @return la Stringa CodCliente
	 * */
	public String getCodCliente() {
		
		return this.codCliente;
	}
	
	/**
	 * Imposta la Stringa CodCliente, l'identificatore del Cliente che vuole fare il Bollo Auto
	 * @param codCliente è la Stringa da inserire in CodCliente
	 * */
	public void setCodCliente(String codCliente) {
		
		this.codCliente = codCliente;
		return;
	}
	
	/**
	 * Restituisce la Stringa codFiliale, l'identificativo della filiale a cui appartiene il cliente che vuole fare il Bollo Auto
	 * @return la Stringa codFiliale
	 * */
	public String getCodFiliale() {
		
		return this.codFiliale;
	}
	
	/**
	 * Imposta la Stringa codFiliale, l'identificatore della filiale a cui appartiene il cliente che vuole fare il Bollo Auto
	 * @param codFiliale è la Stringa da inserire in codFiliale
	 * */
	public void setCodFiliale(String codFiliale) {
		
		this.codFiliale = codFiliale;
		return;
	}
	
	/**
	 * Restituisce la Stringa Data, la data in cui il cliente vuole fare il Bollo Auto
	 * @return la Stringa Data
	 * */
	public String getData() {
		
		return this.data;
	}
	
	/**
	 * Imposta la Stringa Data, la data in cui il cliente vuole fare il Bollo Auto
	 * @param data è la Stringa da inserire in Data
	 * */
	public void setData(String data) {
		
		this.data = data;
		return;
	}
	
	/**
	 * Restituisce la Stringa CodBanca, l'identificativo della Banca che effettua il Bollo Auto
	 * @return la Stringa CodBanca
	 * */
	public String getCodBanca() {
		
		return this.codBanca;
	}
	
	/**
	 * Imposta la Stringa CodBanca, l'identificatore della Banca che effettua il Bollo Auto
	 * @param codBanca è la Stringa da inserire in CodBanca
	 * */
	public void setCodBanca(String codBanca) {
		
		this.codBanca = codBanca;
		return;
	}
	
	/**
	 * Restituisce la Stringa CodContoCorrente, l'identificativo del conto corrente con cui viene pagato il Bollo Auto
	 * @return la Stringa CodContoCorrente
	 * */
	public String getCodContoCorrente() {
		
		return this.codContoCorrente;
	}
	
	/**
	 * Imposta la Stringa CodContoCorrente, l'identificatore del conto corrente con cui viene pagato il Bollo Auto
	 * @param codContoCorrente è la Stringa da inserire in CodContoCorrente
	 * */
	public void setCodContoCorrente(String codContoCorrente) {
		
		this.codContoCorrente = codContoCorrente;
		return;
	}
	
	/**
	 * Restituisce la Stringa CodCartaPrepagata, l'identificativo della carta prepagata con cui viene pagato il Bollo Auto
	 * @return la Stringa CodCartaPrepagata
	 * */
	public String getCodCartaPrepagata() {
		
		return this.codCartaPrepagata;
	}
	
	/**
	 * Imposta la Stringa CodCartaPrepagata, l'identificatore della carta prepagata con cui viene pagato il Bollo Auto
	 * @param codCartaPrepagata è la Stringa da inserire in CodCartaPrepagata
	 * */
	public void setCodCartaPrepagata(String codCartaPrepagata) {
		
		this.codCartaPrepagata = codCartaPrepagata;
		return;
	}
}
