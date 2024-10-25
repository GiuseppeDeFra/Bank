package it.unisalento.pps.progettoEsame.model;

/**
 * Gestisce i dati di una email
 * */
public class Email {
	
	private String destinatario;
	private String oggetto;
	private String testo;
	
	/**
	 * Costruttore Email vuoto
	 * */
	public Email() {
		
	}
	
	/**
	 * Costruttore di Email
	 * @param destinatario è la Stringa contenente l'email del destinatario
	 * @param oggetto è la Stringa contenente l'oggetto dall'Email
	 * @param è la Stringa contenente il Testo dell'Email
	 * */
	public Email(String destinatario, String oggetto, String testo) {
		
		this.destinatario = destinatario;
		this.oggetto = oggetto;
		this.testo = testo;
		
	}
	
	/**
	 * Restituisce la Stringa destinatario dell'Email
	 * @return destinatario la Stringa destinatario dell'email
	 * */
	public String getDestinatario() {
		
		return this.destinatario;
	}
	
	/**
	 * Imposta la Stringa destinatario dell'Email
	 * @param destinatario la Stringa da inserire come destinatario dell'Email
	 * */
	public void setDestinatario(String destinatario) {
		
		this.destinatario = destinatario;
		
	}
	
	/**
	 * Restituisce la Stringa oggetto dell'Email
	 * @return oggetto la Stringa oggetto dell'Email
	 * */
	public String getOggetto() {
		
		return this.oggetto;
	}
	
	/**
	 * Imposta la Stringa oggetto dell'Email
	 * @param oggetto la Stringa da inserire come oggetto dell'Email
	 * */
	public void setOggetto(String oggetto) {
		
		this.oggetto = oggetto;
		
	}
	
	/**
	 * Restituisce la Stringa testo dell'Email
	 * @return testo la Stringa testo dell'email
	 * */
	public String getTesto() {
		
		return this.testo;
	}
	
	/**
	 * Imposta la Stringa testo dell'Email
	 * @param testo la Stringa da inserire come testo dell'Email
	 * */
	public void setTesto(String testo) {
		
		this.testo = testo;
		
	}

}
