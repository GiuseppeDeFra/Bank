package it.unisalento.pps.progettoEsame.model;

import it.unisalento.pps.progettoEsame.dao.CassiereDAO;

/**
 * Memorizza i dati di un Cassiere
 * */
public class Cassiere {
	
	private String username;
	private String password;
	private String nome;
	private String cognome;
	private String idFiliale;
	private String stipendio;
	
	/**
	 * Restituisce l'Username del Cassiere
	 * @return La stringa dell'username del Cassiere
	 * */	
	public String getUsername() {
		
		return this.username;
	}
	
	/**
	 * Imposta la stringa Username del Cassiere
	 * @param username è la stringa per impostare l'username del Cassiere 
	 * */
	public void setUsername(String username) {
		
		this.username=username;
	}
	
	/**
	 * Restituisce la Password del Cassiere
	 * @return La stringa della password del Cassiere
	 * */
	public String getPassword() {
		
		return this.password;
	}
	
	/**
	 * Imposta la stringa Password del Cassiere
	 * @param password è la stringa per impostare la password del Cassiere 
	 * */
	public void setPassword(String password) {
		
		this.password=password;
	}
	
	/**
	 * Restituisce il Nome del Cassiere
	 * @return La stringa del nome del Cassiere
	 * */
	public String getNome() {
		
		return this.nome;
	}
	
	/**
	 * Imposta la stringa Nome del Cassiere
	 * @param nome è la stringa per impostare la nome del Cassiere 
	 * */
	public void setNome(String nome) {
		
		this.nome=nome;
	}
	
	/**
	 * Restituisce il Cognome del Cassiere
	 * @return La stringa del cognome del Cassiere
	 * */
	public String getCognome() {
		
		return this.cognome;
	}
	
	/**
	 * Imposta la stringa Cognome del Cassiere
	 * @param cognome è la stringa per impostare la cognome del Cassiere 
	 * */
	public void setCognome(String cognome) {
		
		this.cognome=cognome;
	}
	
	/**
	 * Restituisce lo Stipendio del Cassiere
	 * @return ritorna la stringa dello stipendio del Cassiere
	 * */
	public String getStipendio() {
		
		return this.stipendio;
	}
	
	
	/**
	 * Imposta lo Stipendio del Cassiere
	 * @param stipendio è la stringa da impostare come stipendio del Cassiere 
	 * */
	public void setStipendio(String stipendio) {
		
		this.stipendio=stipendio;
	}
	
	
	/**
	 * Ritorna la Stringa idFiliale in cui lavora il cassiere
	 * @return idFiliale l'identificativo della filiale in cui lavora il cassiere
	 * */
	public String getIdFiliale() {
		
		return this.idFiliale;
	}
	
	/**
	 * Imposta il valore dell'idFiliale, la filiale in cui lavora il cassiere
	 * @param idFiliale l'identificativo della filiale in cui lavora il cassiere
	 */
	public void setIdFiliale(String idFiliale) {
		
		this.idFiliale = idFiliale;
	}
	
	
	/**
	 * Trova un Cassiere corrispondente al suo username
	 * @param username è la Stringa corrispondente all'username del Cassiere da cercare
	 * @return Un oggetto Cassiere
	 * */
	public Cassiere cercaCassiere_username(String username) {
		
		CassiereDAO cas=new CassiereDAO();
		
		return cas.cercaDaUsername(username);
	}


}
