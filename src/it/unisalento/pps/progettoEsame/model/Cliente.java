package it.unisalento.pps.progettoEsame.model;

import it.unisalento.pps.progettoEsame.dao.ClienteDAO;

/**
 * Memorizza i dati di un Cliente
 * */
public class Cliente {
	
	private static final String ACCETTATO_SI="si";
	private static final String ACCETTATO_NO="no";
	
	private String username;
	private String password;
	private String codicefiscale;
	private String nome;
	private String cognome;
	private String datanascita;
	private String via;
	private String citta;
	private String provincia;
	private String email;
	private String codfiliale;
	private String accettatto;
	
	
	/**
	 * Restituisce l'Username del Cliente
	 * @return La stringa dell'username del Cliente
	 * */	
	public String getUsername() {
		
		return this.username;
	}
	
	/**
	 * Imposta la stringa Username del Cliente
	 * @param username è la stringa per impostare l'username del Cliente 
	 * */
	public void setUsername(String username) {
		
		this.username=username;
	}
	
	/**
	 * Restituisce la Password del Cliente
	 * @return La stringa della password del Cliente
	 * */
	public String getPassword() {
		
		return this.password;
	}
	
	/**
	 * Imposta la stringa Password del Cliente
	 * @param password è la stringa per impostare la password del Cliente 
	 * */
	public void setPassword(String password) {
		
		this.password=password;
	}
	
	/**
	 * Restituisce il Codice Fiscale del Cliente
	 * @return La stringa della Codice Fiscale del Cliente
	 * */
	public String getCodiceFiscale() {
		
		return this.codicefiscale;
	}
	
	/**
	 * Imposta la stringa Codice Fiscale del Cliente
	 * @param codicefiscale è la stringa per impostare il Codice Fiscale del Cliente 
	 * */
	public void setCodiceFiscale(String codicefiscale) {
		
		this.codicefiscale=codicefiscale;
	}
	
	
	/**
	 * Restituisce il Nome del Cliente
	 * @return La stringa del nome del Cliente
	 * */
	public String getNome() {
		
		return this.nome;
	}
	
	/**
	 * Imposta la stringa Nome del Cliente
	 * @param nome è la stringa per impostare la nome del Cliente 
	 * */
	public void setNome(String nome) {
		
		this.nome=nome;
	}
	
	/**
	 * Restituisce il Cognome del Cliente
	 * @return La stringa del cognome del Cliente
	 * */
	public String getCognome() {
		
		return this.cognome;
	}
	
	/**
	 * Imposta la stringa Cognome del Cliente
	 * @param cognome è la stringa per impostare la cognome del Cliente 
	 * */
	public void setCognome(String cognome) {
		
		this.cognome=cognome;
	}
	
	/**
	 * Restituisce la Data di nascita  del Cliente
	 * @return La stringa della data di nascita del Cliente
	 * */	
	public String getDataNascita() {
		
		return this.datanascita;
	}
	
	/**
	 * Imposta la stringa Data di nascita del Cliente
	 * @param datanascita è la stringa per impostare la data di nascita del Cliente 
	 * */
	public void setDataNascita(String datanascita) {
		
		this.datanascita=datanascita;
	}
	
	
	
	
	/**
	 * Restituisce la via del Cliente
	 * @return La stringa della via del Cliente
	 * */	
	public String getVia() {
		
		return this.via;
	}
	
	/**
	 * Imposta la stringa Via del Cliente
	 * @param via è la stringa per impostare la via del Cliente 
	 * */
	public void setVia(String via) {
		
		this.via=via;
	}
	
	/**
	 * Restituisce la Citta del Cliente
	 * @return La stringa della Citta del Cliente
	 * */	
	public String getCitta() {
		
		return this.citta;
	}
	
	/**
	 * Imposta la stringa Citta del Cliente
	 * @param citta è la stringa per impostare la citta del Cliente 
	 * */
	public void setCitta(String citta) {
		
		this.citta=citta;
	}
	
	/**
	 * Restituisce la Provincia del Cliente
	 * @return La stringa della provincia del Cliente
	 * */	
	public String getProvincia() {
		
		return this.provincia;
	}
	
	/**
	 * Imposta la stringa Provincia del Cliente
	 * @param provincia è la stringa per impostare la provincia del Cliente 
	 * */
	public void setProvincia(String provincia) {
		
		this.provincia=provincia;
	}
	
	/**
	 * Restituisce l'Email del Cliente
	 * @return La stringa dell'email del Cliente
	 * */	
	public String getEmail() {
		
		return this.email;
	}
	
	/**
	 * Imposta la stringa Email del Cliente
	 * @param email è la stringa per impostare l'email del Cliente 
	 * */
	public void setEmail(String email) {
		
		this.email=email;
	}
	
	/**
	 * Restituisce il Codice Filiale del Cliente
	 * @return La stringa del Codice Filiale del Cliente
	 * */	
	public String getCodiceFiliale() {
		
		return this.codfiliale;
	}
	
	/**
	 * Imposta la stringa Codice Filiale del Cliente
	 * @param codicefiliale è la stringa per impostare il Codice Filiale del Cliente 
	 * */
	public void setCodiceFiliale(String codicefiliale) {
		
		this.codfiliale=codicefiliale;
	}
	
	/**
	 * Restituisce il valore del campo Accettato del Cliente
	 * @return La stringa di Accettato del Cliente
	 * */	
	public String getAccettato() {
		
		return this.accettatto;
	}
	
	/**
	 * Imposta la stringa Accettato del Cliente
	 * @param accettato è la stringa per impostare il campo Accettato del Cliente 
	 * */
	public void setAccettato(String accettato) {
		
		this.accettatto=accettato;
	}
	
	/**
	 * Imposta la stringa Accettato del Cliente con valore della costante ACCETTATO_SI
	 * 
	 * */
	public void setAccettatoSi() {
		
		this.accettatto=ACCETTATO_SI;
	}
	
	/**
	 * Imposta la stringa Accettato del Cliente con valore della costante ACCETTATO_NO
	 * 
	 * */
	public void setAccettatoNo() {
		
		this.accettatto=ACCETTATO_NO;
	}
	
		
	/**
	 * Trova un Cliente corrispondente al suo username
	 * @param username è la Stringa corrispondente all'username del Cliente da cercare
	 * @return Un oggetto Cliente
	 * */
	public Cliente cercaCliente_username(String username) {
		
		ClienteDAO cli=new ClienteDAO();
		
		return cli.cercaDaUsername(username);
	}
	
	/**
	 * Restituisce la costante ACCETTATO_SI
	 * */
	public String getACCETTATO_SI() {
		
		return ACCETTATO_SI;
	}
	
	/**
	 * Restituisce la costante ACCETTATO_NO
	 * */
	public String getACCETTATO_NO() {
		
		return ACCETTATO_NO;
	}
	
}