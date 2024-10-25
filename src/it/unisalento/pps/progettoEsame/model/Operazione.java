package it.unisalento.pps.progettoEsame.model;

/**
 * Gestisce i dati di un'Operazione bancaria
 * */
public class Operazione {
	
	private static final String ACCETTATO_SI="si";
	private static final String ACCETTATO_NO="no";
	
	private String idOperazione;
	private String data;
	private String importo;
	private String descrizione;
	private String accettata;
	private String dataAccettazione;
	private String codCassiere;
	private String codContoCorrente;
	private String codCartaPrepagata;
	
	/**
	 * Costruttore vuoto di un oggetto Operazione
	 * */	
	public Operazione() {
		
	}
	
	/**
	 * Costruttore di un oggetto Operazione
	 * @param idOperazione è la Stringa contenente l'identificativo dell'operazione
	 * @param data è la Stringa contenente la data di quando è stata emessa l'operazione
	 * @param importo è la Stringa contenente l'importo dell'operazione
	 * @param descrizione è la Stringa contenente la descrizione dell'operazione
	 * @param accettata è la Stringa che descrive se l'operazione è stata accettato o no
	 * @param dataAccettazione è la Stringa contenente la data di quando è stata accettata l'operazione
	 * @param codCassiere è la Stringa contenente il codice identificativo del Cassiere che ha accettato o meno l'operazione
	 * @param codContoCorrente è la Stringa contenente l'identificativo del conto corrente
	 * @param codCartaPrepagata è la Stringa contenente il codice identificativo della carta prepagata
	 */
	public Operazione(String idOperazione, String data, String importo, String descrizione, String accettata, String dataAccettazione, String codCassiere, String codContoCorrente, String codCartaPrepagata) {
		
		this.idOperazione = idOperazione;
		this.data = data;
		this.importo = importo;
		this.descrizione = descrizione;
		this.accettata = accettata;
		this.dataAccettazione = dataAccettazione;
		this.codCassiere = codCassiere;
		this.codContoCorrente = codContoCorrente;
		this.codCartaPrepagata = codCartaPrepagata;
	}
	
	/**
	 * Restituisce la Stringa dell'identificativo dell'Operazione idOperazione
	 * @return la Stringa contentente l'idOperazione
	 * */
	public String getIdOperazione() {
		
		return this.idOperazione;
	}
	
	/**
	 * Imposta la Stringa dell'identificativo dell'Operazione idOperazione
	 * @param idOperazione è la Stringa da inserire in idOperazione 
	 * */
	public void setIdOperazione(String idOperazione) {
		
		this.idOperazione = idOperazione;
		return;
	}
	
	/**
	 * Restituisce la Stringa della Data dell'Operazione
	 * @return la Stringa contentente la Data
	 * */
	public String getData() {
		
		return this.data;
	}
	
	/**
	 * Imposta la Stringa Data dell'Operazione
	 * @param data è la Stringa da inserire in Data 
	 * */
	public void setdata(String data) {
		
		this.data = data;
		return;
	}
	
	/**
	 * Restituisce la Stringa Importo dell'Operazione
	 * @return la Stringa contentente l'importo
	 * */
	public String getImporto() {
		
		return this.importo;
	}
	
	/**
	 * Imposta la Stringa dell'importo dell'Operazione
	 * @param importo è la Stringa da inserire in Importo 
	 * */
	public void setImporto(String importo) {
		
		this.importo = importo;
		return;
	}
	
	/**
	 * Restituisce la Stringa della descrizione dell'Operazione
	 * @return la Stringa contentente la descrizione
	 * */
	public String getDescrizione() {
		
		return this.descrizione;
	}
	
	/**
	 * Imposta la Stringa della descrizione dell'Operazione
	 * @param descrizione è la Stringa da inserire in Descrizione  
	 * */
	public void setDescrizione(String descrizione) {
		
		this.descrizione = descrizione;
		return;
	}
	
	/**
	 * Restituisce la Stringa Accettata che descrive se l'opeazione è stata accettata o meno
	 * @return la Stringa che identifica che l'operazione è stata accettata o meno
	 * */
	public String getAccettata() {
		
		return this.accettata;
	}
	
	/**
	 * Imposta la Stringa Accettata dell'Operazione
	 * @param accettata è la Stringa da inserire nella Stringa Accettata dell'operazioine 
	 * */
	public void setAccetata(String accettata) {
		
		this.accettata = accettata;
		return;
	}
	
	/**
	 * Restituisce la Stringa contenente la data di accettazione dell'Operazione bancaria, quando è stata accettata
	 * dal Cassiere
	 * @return la Stringa contentente la Data di Accettazione
	 * */
	public String getDataAccettazione() {
		
		return this.dataAccettazione;
	}
	
	/**
	 * Imposta la Stringa dell'identificativo dell'Operazione idOperazione
	 * @param idOperazione è la Stringa da inserire in idOperazione 
	 * */
	public void setDataAccettazione(String dataAccettazione) {
		
		this.dataAccettazione = dataAccettazione;
		return;
	}
	
	/**
	 * Restituisce la Stringa dell'identificativo del Cassiere che ha accattato l'Operazione
	 * @return la Stringa contentente il Codice del Cassiere
	 * */
	public String getCodCassiere() {
		
		return this.codCassiere;
	}
	
	/**
	 * Imposta la Stringa dell'identificativo del Codice del Casiere che ha accettato l'Operazione
	 * @param codCassiere è la Stringa da inserire in codCassiere 
	 * */
	public void setCodCassiere(String codCassiere) {
		
		this.codCassiere = codCassiere;
		return;
	}
	
	/**
	 * Restituisce la Stringa dell'identificativo del conto Corrente che ha fatto l'operazione
	 * @return la Stringa contentente il codice del conto corrente
	 * */
	public String getCodContoCorrente() {
		
		return this.codContoCorrente;
	}
	
	/**
	 * Imposta la Stringa dell'identificativo del conto corrente che ha effettuato l'Operazione
	 * @param codContoCorrente è la Stringa da inserire in codContoCorrente 
	 * */
	public void setCodContoCorrente(String codContoCorrente) {
		
		this.codContoCorrente = codContoCorrente;
		return;
	}
	
	/**
	 * Restituisce la Stringa dell'identificativo della carta prepagata che ha fatto l'operazione
	 * @return la Stringa contentente il Codice della carta prepagata
	 * */
	public String getCodCartaPrepagata() {
		
		return this.codCartaPrepagata;
	}
	
	/**
	 * Imposta la Stringa dell'identificativo della carta prepagata che ha fatto l'operazione
	 * @param codCartaPrepagata è la Stringa da inserire in codCartaPrepagata 
	 * */
	public void setCodCartaPrepagata(String codCartaPrepagata) {
		
		this.codCartaPrepagata = codCartaPrepagata;
		return;
	}
	
	/**
	 * Ritorna il valore della costante ACCETTATO_SI
	 * */
	public String getCostanteAccettataSi() {
		
		return ACCETTATO_SI;
	}
	
	/**
	 * Ritorna il valore della costante ACCETTATO_NO
	 * */
	public String getCostanteAccettataNo() {
		
		return ACCETTATO_NO;
	}

	/**
	 * Imposta il valore della Stringa Accettato con il valore della costante ACCETTATO_SI
	 * */
	public void setAccettataSI() {
		
		this.accettata=ACCETTATO_SI;
	}
	
	/**
	 * Imposta il valore della Stringa Accettato con il valore della costante ACCETTATO_NO
	 * */
	public void setAccettataNO() {
		
		this.accettata=ACCETTATO_NO;
	}
}
