package it.unisalento.pps.progettoEsame.business;

import it.unisalento.pps.progettoEsame.model.Amministratore;
import it.unisalento.pps.progettoEsame.model.Direttore;
import it.unisalento.pps.progettoEsame.model.Cassiere;
import it.unisalento.pps.progettoEsame.model.Cliente;

/**
 * E' un sistema che permette di fare l'accesso a tutti gli utenti del sistema "Amministratore, Direttore, Cassiere, Cliente"
 * e di recuperare chi è stato ad effettuare l'accesso 
 * */
public class SistemaAccesso {
	
	private static SistemaAccesso instance;
	
	// Costanti da cambiare per le persone diverse che fanno accesso
	private static final String CLIENTE="cliente";
	private static final String CASSIERE="cassiere";
	private static final String DIRETTORE="direttore";
	private static final String AMMINISTRATORE="amministratore";
	private static final String OSPITE="ospite";
	
	// Variabili viste da qualsiasi classe
	private String username="";
	private String password="";
	private String loggato="ospite";
	
	//Oggetti visti da qualsiasi classe
	private Amministratore amministratore = new Amministratore();
	private Direttore direttore = new Direttore();
	private Cassiere cassiere = new Cassiere();
	private Cliente cliente = new Cliente();
	
	public static synchronized SistemaAccesso getInstance() {
		if(instance == null)
			instance = new SistemaAccesso();
		return instance;
	}
	
	/**
	 * Recupera la Stringa username di chi vuole fare l'accesso
	 * @return la Stringa username
	 * */
	public String getusername() {
		
		return this.username;
	}
	
	/**
	 * Imposta la Stringa usermane di chi vuole effettuare l'accesso
	 * @param username è la Stringa contenente l'username di chi vuole fare l'accesso
	 * */
	public void setusername(String username) {
		
		this.username=username;
		return;
	}
	
	/**
	 * Recupera la Stringa password di chi vuole fare l'accesso
	 * @return la Stringa password
	 * */
	public String getpassword() {
		
		return this.password;
	}
	
	/**
	 * Imposta la Stringa password di chi vuole effettuare l'accesso
	 * @param password è la Stringa contenente la password di chi vuole fare l'accesso
	 * */
	public void setpassword(String password) {
		
		this.password=password;
		return;
		
	}
	
	/**
	 * Imposta la Stringa loggato dell'utente che ha effettuato l'accesso
	 * @param loggato è la Stringa contenente il tipo di utente che ha effettuato l'accesso
	 * */
	public void setloggato(String loggato) {
		
		this.loggato=loggato;
		return;
	}
	
	/**
	 * Restituisce la Stringa contenente il tipo di utente che ha effettuato l'accesso,
	 * imposta amministratore, direttore, cassiere o cliente se hanno fatto il login
	 * */
	public String getloggato() {
		
		/* se loggato è una stringa vuota e username è piena e anche password è piena allora cerca
		 * chi ha fatto il login 
		 */
		//System.out.println("ciao a tutti dentro get loggato SessionLogin");
		if((this.loggato.compareTo(OSPITE)==0)&&(!(this.username.isEmpty()))&&(!(this.password.isEmpty()))) {
						
			//System.out.println("sono entrato nella if");
									
			this.amministratore = this.amministratore.cercaAmministratore_username(this.username);
			this.direttore = this.direttore.cercaDirettore_username(this.username);
			this.cassiere = this.cassiere.cercaCassiere_username(this.username);
			this.cliente = this.cliente.cercaCliente_username(this.username);
			
						
			if((this.amministratore!=null)&&(this.amministratore.getPassword().compareTo(this.password)==0))
				
				this.loggato=AMMINISTRATORE;
			
			
			if((this.direttore!=null)&&(this.direttore.getPassword().compareTo(this.password)==0))
				
				this.loggato=DIRETTORE;
			
			if((this.cassiere!=null)&&(this.cassiere.getPassword().compareTo(this.password)==0))
				
				this.loggato=CASSIERE;
			
			if((this.cliente!=null)&&(this.cliente.getPassword().compareTo(this.password)==0)&&this.cliente.getAccettato().compareTo(this.cliente.getACCETTATO_SI())==0)
				
				this.loggato=CLIENTE;
			
						
			
			// in caso in cui si inserisce un utente o password sbagliate
			
			if(this.loggato.compareTo(OSPITE)==0) {
				
				//System.out.println("Errore di accesso");
				this.Logout();
			}
							
		}
		
			//System.out.println("Sono al return dopo if");
			return this.loggato;
	}
	

	/**
	 * Restituisce la Stringa costante relativa all'Amministratore 
	 * @return la Stringa costante AMMINISTRATORE
	 * */
	public String getCostanteAmministratore() {
		
		return AMMINISTRATORE;
	}
	
	/**
	 * Restituisce la Stringa costante relativa al Direttore
	 * @return la Stringa costante DIRETTORE 
	 * */
	public String getCostanteDirettore() {
		
		return DIRETTORE;
	}
	
	/**
	 * Restituisce la Stringa costante relativa al Cassiere 
	 * @return la Stringa costante CASSIERE
	 * */
	public String getCostanteCassiere() {
		
		return CASSIERE;
	}
	
	/**
	 * Restituisce la Stringa costante relativa al Cliente
	 * @return la Stringa costante CLIENTE
	 * */
	public String getCostanteCliente() {
		
		return CLIENTE;
	}

	/**
	 * Restituisce la Stringa costante relativa all'Ospite, cioè utente non registrato
	 * @return la Stringa costante OSPITE
	 * */
	public String getCostanteOspite() {
		
		return OSPITE;
	}
	
	/**
	 * Restituisce l'intero oggetto Amministratore e sarà pieno se è stato fatto il login
	 * @return un oggetto Amministratore
	 * */
	public Amministratore getAmministratore() {
		
		return this.amministratore;
	}
	
	/**
	 * Restituisce l'intero oggetto Direttore e sarà pieno se è stato fatto il login
	 * @return un oggetto Direttore
	 * */
	public Direttore getDirettore() {
		
		return this.direttore;
	}
	
	/**
	 * Restituisce l'intero oggetto Cassiere e sarà pieno se è stato fatto il login
	 * @return un oggetto Cassiere
	 * */
	public Cassiere getCassiere() {
		
		return this.cassiere;
	}
	
	/**
	 * Restituisce l'intero oggetto Cliente e sarà pieno se è stato fatto il login
	 * @return un oggetto Cliente
	 * */
	public Cliente getCliente() {
		
		return this.cliente;
	}
	
	/**
	 * Fa il Logout dell'utente connesso, azzerando tutte le variabili
	 * */
	public void Logout() {
		
		this.username="";
		this.password="";
		this.loggato=OSPITE;
		
		this.amministratore = new Amministratore();
		this.direttore = new Direttore();
		this.cassiere = new Cassiere();
		this.cliente = new Cliente();
		
		return;
	}


}
