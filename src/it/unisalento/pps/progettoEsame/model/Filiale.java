package it.unisalento.pps.progettoEsame.model;

/**
 * Memorizza i dati di una Banca
 * */
public class Filiale {
	
	private String idfiliale;
	private String nome;
	private String via;
	private String citta;
	private String provincia;
	private String immagineUno;
	private String immagineDue;
	private String immagineTre;
	private String codBanca;
	
	/**
	 * Costruttore vuoto di filiale
	 * */
	public Filiale() {
		
	}
	
	/**
	 * Costruttore della classe Filiale
	 * @param idfiliale è la Stringa del codice identificativo della filiale
	 * @param nome è la Stringa del nome della filiale
	 * @param via è la Stringa della Via in cui si trova la filiale
	 * @param citta è la Stringa della città in cui si trova la filiale
	 * @param provincia è la Stringa della provincia in cui si trova la filiale
	 * @param immagineUno è la Stringa del percorso (path name) in cui si trova un'immagine rappresentativa della filiale
	 * @param immagineDue è la Stringa del percorso (path name) in cui si trova un'immagine rappresentativa della filiale
	 * @param immagineTre è la Stringa del percorso (path name) in cui si trova un'immagine rappresentativa della filiale
	 * @param codBanca è la Stringa del Codice della Banca a cui appartiene la filiale
	 * */
	public Filiale(String idfiliale, String nome, String via, String citta, String provincia, String immagineUno, String immagineDue, String immagineTre, String codBanca) {
		
		this.idfiliale=idfiliale;
		this.nome=nome;
		this.via=via;
		this.citta=citta;
		this.provincia=provincia;
		this.immagineUno=immagineUno;
		this.immagineDue=immagineDue;
		this.immagineTre=immagineTre;
		this.codBanca=codBanca;
	}

	/**
	 * Restituisce la Stringa dell'Identificativo della filiale
	 * @return la Stringa IdFiliale
	 * */
	public String getIdFiliale() {
		
		return this.idfiliale;
	}
	
	/**
	 * Imposta il valore della Stringa IdFiliale Identificativo della filiale
	 * @param idfiliale è la Stringa da impostare nella Stringa idfiliale della filiale
	 * */
	public void setIdFiliale(String idfiliale) {
		
		this.idfiliale=idfiliale;
		return;
	}
	
	/**
	 * Restituisce la Stringa del nome della filiale
	 * @return la Stringa Nome
	 * */
	public String getNome() {
		
		return this.nome;
	}
	
	/**
	 * Imposta il valore della Stringa Nome della filiale
	 * @param nome è la Stringa da impostare nella Stringa nome della filiale
	 * */
	public void setNome(String nome) {
		
		this.nome=nome;
		return;
	}
	
	/**
	 * Restituisce la Stringa della Via della filiale
	 * @return la Stringa Via
	 * */
	public String getVia() {
		
		return this.via;
	}
	
	/**
	 * Imposta il valore della Stringa Via della filiale
	 * @param via è la Stringa da impostare nella Stringa Via della filiale
	 * */
	public void setVia(String via) {
		
		this.via=via;
		return;
	}
	
	/**
	 * Restituisce la Stringa della Citta della filiale
	 * @return la Stringa Citta
	 * */
	public String getCitta() {
		
		return this.citta;
	}
	
	/**
	 * Imposta il valore della Stringa Citta della filiale
	 * @param citta è la Stringa da impostare nella Stringa Citta della filiale
	 * */
	public void setCitta(String citta) {
		
		this.citta=citta;
		return;
	}
	
	/**
	 * Restituisce la Stringa della Provincia della filiale
	 * @return la Stringa Provincia
	 * */
	public String getProvincia() {
		
		return this.provincia;
	}
	
	/**
	 * Imposta il valore della Stringa Provincia della filiale
	 * @param provincia è la Stringa da impostare nella Stringa provincia della filiale
	 * */
	public void setProvincia(String provincia) {
		
		this.provincia=provincia;
		return;
	}
	
	/**
	 * Restituisce la Stringa dell'immagineUno rappresentativa della filiale
	 * @return la Stringa contenente il pathname dell'immagineUno della filiale
	 * */
	public String getImmagineUno() {
		
		return this.immagineUno;
	}
	
	/**
	 * Imposta il valore della Stringa contenente il pathname dell'immagineUno della filiale
	 * @param immagineUno è la Stringa, contenente il pathname, da impostare nella Stringa immagineUno della filiale
	 * */
	public void setImmagineUno(String immagineUno) {
		
		this.immagineUno=immagineUno;
		return;
	}
	
	/**
	 * Restituisce la Stringa dell'immagineDue rappresentativa della filiale
	 * @return la Stringa contenente il pathname dell'immagineDue della filiale
	 * */
	public String getImmagineDue() {
		
		return this.immagineDue;
	}
	
	/**
	 * Imposta il valore della Stringa contenente il pathname dell'immagineDue della filiale
	 * @param immagineDue è la Stringa, contenente il pathname, da impostare nella Stringa immagineDue della filiale
	 * */
	public void setImmagineDue(String immagineDue) {
		
		this.immagineDue=immagineDue;
		return;
	}
	
	/**
	 * Restituisce la Stringa dell'immagineTre rappresentativa della filiale
	 * @return la Stringa contenente il pathname dell'immagineTre della filiale
	 * */
	public String getImmagineTre() {
		
		return this.immagineTre;
	}
	
	/**
	 * Imposta il valore della Stringa contenente il pathname dell'immagineTre della filiale
	 * @param immagineTre è la Stringa, contenente il pathname, da impostare nella Stringa immagineTre della filiale
	 * */
	public void setImmagineTre(String immagineTre) {
		
		this.immagineTre=immagineTre;
		return;
	}
	
	/**
	 * Restituisce la Stringa del Codice della Banca della filiale
	 * @return la Stringa Codice Banca
	 * */
	public String getCodiceBanca() {
		
		return this.codBanca;
	}
	
	/**
	 * Imposta il valore della Stringa del Codice della banca  della filiale
	 * @param codBanca è la Stringa da impostare nella Stringa codBanca della filiale
	 * */
	public void setCodiceBanca(String codBanca) {
		
		this.codBanca=codBanca;
		return;
	}
}
