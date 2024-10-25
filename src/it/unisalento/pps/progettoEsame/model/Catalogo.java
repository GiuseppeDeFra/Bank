package it.unisalento.pps.progettoEsame.model;

import it.unisalento.pps.progettoEsame.dao.CatalogoDAO;

/**
 * Gestisce un Catalogo
 * */
public class Catalogo {
	
	private static final String DISPONIBILE="si";
	private static final String NON_DISPONIBILE="no";
	
	private String idcatalogo;
	private String contoCorrente;
	private String cartaPrepagata;
	private String ricaricaCellulare;
	private String bolloAuto;
	
	/**
	 * Costrittore di un Catalogo vuoto
	 * */
	public Catalogo() {
		
	}
	
	/**
	 * Costruttore di un Catalogo
	 * @param idcatalogo è la Stringa identificativa del catalogo
	 * @param contoCorrente è la Stringa che indica se la banca gestisce o no il Conto Corrente
	 * @param cartaPrepagata è la Stringa che indica se la banca gestisce o no la Carta Prepagata
	 * @param ricaricaCellulare è la Stringa che indica se la banca gestisce o no la Ricarica Cellulare
	 * @param bolloAuto è la Stringa che indica se la banca gestisce o no il Bollo Auto 
	 * */
	public Catalogo(String idcatalogo, String contoCorrente, String cartaPrepagata, String ricaricaCellulare , String bolloAuto) {
		
		this.idcatalogo = idcatalogo;
		this.contoCorrente = contoCorrente;
		this.cartaPrepagata = cartaPrepagata;
		this.ricaricaCellulare = ricaricaCellulare;
		this.bolloAuto = bolloAuto;
	}
	
	/**
	 * Restituisce il valore della Costante DISPONIBILE
	 * @return la Stringa DISPONIBILE
	 * */
	public String getCostanteDisponibile() {
		
		return DISPONIBILE;
	}
	
	/**
	 * Restituisce il valore della Costante NON_DISPONIBILE
	 * @return la Stringa NON_DISPONIBILE
	 * */
	public String getCostanteNonDisponibile() {
		
		return NON_DISPONIBILE;
	}
	
		
	/**
	 * Restituisce la Stringa IdCatalogo l'indificativo del Catalogo
	 * @return la Stringa IdCatalogo
	 * */
	public String getIdCatalogo() {
		
		return this.idcatalogo;
	}
	
	/**
	 * Imposta la Stringa IdCatalogo l'identificativo del Catalogo
	 * @param idcatalogo la Stringa da inserire in IdCatalogo
	 * */
	public void setIdCatalogo(String idcatalogo) {
		 
		this.idcatalogo = idcatalogo;
	}
	
	/**
	 * Restituisce la Stringa Conto Corrente indicante se tale prodotto è attivo o no
	 * @return la Stringa ContoCorrente
	 * */
	public String getContoCorrente() {
		
		return this.contoCorrente;
	}
	
	/**
	 * Imposta la Stringa Conto Corrente come prodotto DISPONIBILE
	 * */
	public void setContoCorrenteDisponibile() {
		
		this.contoCorrente = DISPONIBILE;
	}
	
	/**
	 * Imposta la Stringa Conto Corrente come prodotto NON DISPONIBILE
	 * */
	public void setContoCorrenteNonDisponibile() {
		
		this.contoCorrente = NON_DISPONIBILE;
	}
	
	/**
	 * Restituisce la Stringa Carta Prepagata indicante se tale prodotto è attivo o no
	 * @return la Stringa CartaPrepagata
	 * */
	public String getCartaPrepagata() {
		
		return this.cartaPrepagata;
	}
	
	/**
	 * Imposta la Stringa Carta Prepagata come prodotto DISPONIBILE
	 * */
	public void setCartaPrepagataDisponibile() {
		
		this.cartaPrepagata = DISPONIBILE;
	}
	
	/**
	 * Imposta la Stringa Carta Prepagata come prodotto NON DISPONIBILE
	 * */
	public void setCartaPrepagataNonDisponibile() {
		
		this.cartaPrepagata = NON_DISPONIBILE;
	}
	
	/**
	 * Restituisce la Stringa Ricarica Cellulare indicante se tale servizio è attivo o no
	 * @return la Stringa RicaricaCellulare
	 * */
	public String getRicaricaCellulare() {
		
		return this.ricaricaCellulare;
	}
	
	/**
	 * Imposta la Stringa RicaricaCellulare come servizio DISPONIBILE
	 * */
	public void setRicaricaCellulareDisponibile() {
		
		this.ricaricaCellulare = DISPONIBILE;
	}
	
	/**
	 * Imposta la Stringa RicaricaCellulare come servizio NON DISPONIBILE
	 * */
	public void setRicaricaCellulareNonDisponibile() {
		
		this.ricaricaCellulare = NON_DISPONIBILE;
	}
	
	/**
	 * Restituisce la Stringa BolloAuto indicante se tale servizio è attivo o no
	 * @return la Stringa BolloAuto
	 * */
	public String getBolloAuto() {
		
		return this.bolloAuto;
	}
	
	/**
	 * Imposta la Stringa BolloAuto come servizio DISPONIBILE
	 * */
	public void setBolloAutoDisponibile() {
		
		this.bolloAuto = DISPONIBILE;
	}
	
	/**
	 * Imposta la Stringa BolloAuto come servizio NON DISPONIBILE
	 * */
	public void setBolloAutoNonDisponibile() {
		
		this.bolloAuto = NON_DISPONIBILE;
	}
	
	/**
	 * Cerca un Catalogo se esiste 
	 * @param catalogo è l'oggetto catalogo da cercare (anche senza l'idcatalogo)
	 * @return NULL se il Catalogo non esiste, altrimenti ritorna il suo IdCatalogo
	 * */
	public String getEsisteCatalogo(Catalogo catalogo) {
		
		return CatalogoDAO.getInstance().getEsisteCatalogo(catalogo);
	}
	
	/**
	 * Inserisci nel database un Catalogo
	 * @param catalogo è l'oggetto Catalogo da inserire
	 * @return true se è andato a buon fine l'inserimento nel database, altrimenti false
	 * */
	public boolean addCatalogo(Catalogo catalogo) {
		
		return CatalogoDAO.getInstance().salvaCatalogo(catalogo);
	}
	
	/**
	 * Cerca un Catalogo attravero l'idCatalogo
	 * @param idCatalogo è la Stringa identificativa del Catalogo da cercare 
	 * @return il Catalogo
	 * */
	public Catalogo cercaCatalogo(String idCatalogo) {
		
		return CatalogoDAO.getInstance().cercaCatalogo(idCatalogo);
	}
	
	

}
