package it.unisalento.pps.progettoEsame.model;

/**
 * Gestisce l'apertura di una filiale
 * */
public class Apertura {
	
	public final String[] giorno = {"lunedi","martedi","mercoledi","giovedi","venerdi","sabato","domenica"};
	
	private String codFiliale;
	private String codGiorno;
	private String orarioApertura;
	private String orarioChiusura;
	
	
	/**
	 * Costruttore vuoto di Apertura 
	 * */
	public Apertura() {
						
	}
	
	/**
	 * Costruttore di Apertura
	 * @param codfiliale codice identificativo della filiale
	 * @param codgiorno codice identificativo del giorno
	 * @param orarioApertura orario di apertura della filiale
	 * @param orarioChiusura orario di chiusura della filiale
	 * */
	public Apertura(String codFiliale, String codGiorno, String orarioApertura, String orarioChiusura) {
		
		this.codFiliale = codFiliale;
		this.codGiorno = codGiorno;
		this.orarioApertura = orarioApertura;
		this.orarioChiusura = orarioChiusura;
	}
	
	/**
	 * Restituisce il CodFiliale, l'identificatore della Filiale
	 * @return la Stringa CodFiliale
	 * */
	public String getCodFiliale() {
		
		return this.codFiliale;
	}
	
	/**
	 * Imposta il CodFiliale, l'identificatore della Filiale
	 * @param codFiliale la Stringa da inserire in CodFiscale
	 * */
	public void setCodFiliale(String codFiliale) {
		
		this.codFiliale = codFiliale;
		return;
	}
	
	/**
	 * Restituisce il CodGiorno, l'identificatore del Giorno
	 * @return la Stringa CodGiorno
	 * */
	public String getCodGiorno() {
		
		return this.codGiorno;
	}
	
	/**
	 * Imposta il CodGiorno, l'identificatore del Giorno
	 * @param codGiorno la Stringa da inserire in CodGiorno
	 * */
	public void setCodGiorno(String codGiorno) {
		
		this.codGiorno = codGiorno;
		return;
	}
	
	/**
	 * Restituisce l'OrarioApertura, l'orario di apertura della Filiale
	 * @return la Stringa OrarioApertura
	 * */
	public String getOrarioApertura() {
		
		return this.orarioApertura;
	}
	
	/**
	 * Imposta l'Orarioapertura, l'orario di apertura della Filiale
	 * @param orarioApertura la Stringa da inserire in OrarioApertura
	 * */
	public void setOrarioApertura(String orarioApertura) {
		
		this.orarioApertura = orarioApertura;
		return;
	}
	
	/**
	 * Imposta l'Orarioapertura, l'orario di apertura della Filiale
	 * @param ora è un Intero rappresentante l'ora di apertura della filiale
	 * @param minuti è un Intero rappresentante i minuti nell'orario di apertura della filiale
	 * */
	public void setOrarioApertura(int ora, int minuti) {
		
		this.orarioApertura = String.valueOf(ora)+":"+String.valueOf(minuti)+":00";
		return;
	}
	
	/**
	 * Restituisce l'OrarioChiusura, l'orario di chiusura della Filiale
	 * @return la Stringa OrarioChiusura
	 * */
	public String getOrarioChiusura() {
		
		return this.orarioChiusura;
	}
	
	/**
	 * Imposta l'OrarioChiusura, l'orario di chiusura della Filiale
	 * @param orarioChiusura la Stringa da inserire in OrarioChiusura
	 * */
	public void setOrarioChiusura(String orarioChiusura) {
		
		this.orarioChiusura = orarioChiusura;
		return;
	}
	
	/**
	 * Imposta l'OrarioChiusura, l'orario di chiusura della Filiale
	 * @param ora è un Intero rappresentante l'ora di chiusura della filiale
	 * @param minuti è un Intero rappresentante i minuti nell'orario di chiusura della filiale
	 * */
	public void setOrarioChiusura(int ora, int minuti) {
		
		this.orarioApertura = String.valueOf(ora)+":"+String.valueOf(minuti)+":00";
		return;
	}

}
