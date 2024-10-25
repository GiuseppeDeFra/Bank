package it.unisalento.pps.progettoEsame.model;

import it.unisalento.pps.progettoEsame.dao.AmministratoreDAO;

/**
 * Memorizza i dati di un'Amministratore
 * */
public class Amministratore {
	
	private String username;
	private String password;
	private String nome;
	private String cognome;
	private double stipendio;
	
	
	/**
	 * Restituisce l'Username dell'Amministratore
	 * @return La stringa dell'username dell'Amministratore
	 * */	
	public String getUsername() {
		
		return this.username;
	}
	
	/**
	 * Imposta la stringa Username dell'Amministratore
	 * @param username è la stringa per impostare l'username dell'Ammiistratore 
	 * */
	public void setUsername(String username) {
		
		this.username=username;
	}
	
	/**
	 * Restituisce la Password dell'Amministratore
	 * @return La stringa della password dell'Amministratore
	 * */
	public String getPassword() {
		
		return this.password;
	}
	
	/**
	 * Imposta la stringa Password dell'Amministratore
	 * @param password è la stringa per impostare la password dell'Ammiistratore 
	 * */
	public void setPassword(String password) {
		
		this.password=password;
	}
	
	/**
	 * Restituisce il Nome dell'Amministratore
	 * @return La stringa del nome dell'Amministratore
	 * */
	public String getNome() {
		
		return this.nome;
	}
	
	/**
	 * Imposta la stringa Nome dell'Amministratore
	 * @param nome è la stringa per impostare la nome dell'Ammiistratore 
	 * */
	public void setNome(String nome) {
		
		this.nome=nome;
	}
	
	/**
	 * Restituisce il Cognome dell'Amministratore
	 * @return La stringa del cognome dell'Amministratore
	 * */
	public String getCognome() {
		
		return this.cognome;
	}
	
	/**
	 * Imposta la stringa Cognome dell'Amministratore
	 * @param cognome è la stringa per impostare la cognome dell'Ammiistratore 
	 * */
	public void setCognome(String cognome) {
		
		this.cognome=cognome;
	}
	
	/**
	 * Restituisce lo Stipendio dell'Amministratore
	 * @return Un double dello stipendio dell'Amministratore
	 * */
	public double getStipendio() {
		
		return this.stipendio;
	}
	
	/**
	 * Restituisce lo Stipendio dell'Amministratore in formato Stringa
	 * @return La stringa dello stipendio dell'Amministratore
	 * */
	public String getStipendioInString() {
		
		return Double.toString(this.stipendio);
		
	}
	
	/**
	 * Imposta lo Stipendio dell'Amministratore
	 * @param stipendio è un double per impostare lo stipendio dell'Ammiistratore 
	 * */
	public void setStipendio(double stipendio) {
		
		this.stipendio=stipendio;
	}
	
	/**
	 * Converte la stringa stipendio in double per impostare lo stipendio dell'Amministratore
	 * @param stipendio è una stringa da convertire in double 
	 * */
	public void setStipendioDaStringinDouble (String stipendio) {
		
		this.stipendio=Double.parseDouble(stipendio);
		
		return;
	}

	
	/**
	 * Trova un Amministratore corrispondente al suo username
	 * @param username è la Stringa corrispondente all'username dell'amministratore da cercare
	 * @return Un oggetto Amministratore
	 * */
	public Amministratore cercaAmministratore_username(String username) {
		
		AmministratoreDAO admin=new AmministratoreDAO();
		
		return admin.cercaDaUsername(username);
	}
}



