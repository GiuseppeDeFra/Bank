package it.unisalento.pps.progettoEsame.model;

import it.unisalento.pps.progettoEsame.dao.DirettoreDAO;

/**
 * Memorizza i dati di un Direttore
 * */
public class Direttore {
	
	private String username;
	private String password;
	private String nome;
	private String cognome;
	private double stipendio;
	
	/**
	 * Restituisce l'Username del Direttore
	 * @return La stringa dell'username del Direttore
	 * */	
	public String getUsername() {
		
		return this.username;
	}
	
	/**
	 * Imposta la stringa Username del Direttore
	 * @param username è la stringa per impostare l'username del Direttore 
	 * */
	public void setUsername(String username) {
		
		this.username=username;
	}
	
	/**
	 * Restituisce la Password del Direttore
	 * @return La stringa della password del Direttore
	 * */
	public String getPassword() {
		
		return this.password;
	}
	
	/**
	 * Imposta la stringa Password del Direttore
	 * @param password è la stringa per impostare la password del Direttore 
	 * */
	public void setPassword(String password) {
		
		this.password=password;
	}
	
	/**
	 * Restituisce il Nome del Direttore
	 * @return La stringa del nome del Direttore
	 * */
	public String getNome() {
		
		return this.nome;
	}
	
	/**
	 * Imposta la stringa Nome del Direttore
	 * @param nome è la stringa per impostare la nome del Direttore 
	 * */
	public void setNome(String nome) {
		
		this.nome=nome;
	}
	
	/**
	 * Restituisce il Cognome del Direttore
	 * @return La stringa del cognome del Direttore
	 * */
	public String getCognome() {
		
		return this.cognome;
	}
	
	/**
	 * Imposta la stringa Cognome del Direttore
	 * @param cognome è la stringa per impostare la cognome del Direttore 
	 * */
	public void setCognome(String cognome) {
		
		this.cognome=cognome;
	}
	
	/**
	 * Restituisce lo Stipendio del Direttore
	 * @return Un double dello stipendio del Direttore
	 * */
	public double getStipendio() {
		
		return this.stipendio;
	}
	
	/**
	 * Restituisce lo Stipendio del Direttore in formato Stringa
	 * @return La stringa dello stipendio del Direttore
	 * */
	public String getStipendioInString() {
		
		return Double.toString(this.stipendio);
		
	}
	
	/**
	 * Imposta lo Stipendio del Direttore
	 * @param stipendio è un double per impostare lo stipendio del Direttore 
	 * */
	public void setStipendio(double stipendio) {
		
		this.stipendio=stipendio;
	}
	
	/**
	 * Converte la stringa stipendio in double per impostare lo stipendio del Direttore
	 * @param stipendio è una stringa da convertire in double 
	 * */
	public void setStipendioDaStringinDouble (String stipendio) {
		
		this.stipendio=Double.parseDouble(stipendio);
		
		return;
	}
	
	/**
	 * Trova un Direttore corrispondente al suo username
	 * @param username è la Stringa corrispondente all'username del Direttore da cercare
	 * @return Un oggetto Direttore
	 * */
	public Direttore cercaDirettore_username(String username) {
		
		DirettoreDAO dir=new DirettoreDAO();
		
		return dir.cercaDaUsername(username);
	}
	
	

}
