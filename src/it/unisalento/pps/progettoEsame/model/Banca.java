package it.unisalento.pps.progettoEsame.model;

/**
 * Memorizza i dati di una Banca
 * */
public class Banca {
	
	private String idbanca;
	private String nome;
	private String via;
	private String citta;
	private String provincia;
	private String codDirettore;
	private String interessi;
	private String datainteressi;
	private String ricorrenza;
	private String immagineUno;
	private String immagineDue;
	private String immagineTre;
	private String codCatalogo;
	
	/**
	 * Costruttore della classe Banca
	 * @param idbanca è la Stringa dell'identificativo della banca
	 * @param nome è la Stringa del nome della banca
	 * @param via è la Stringa della via della banca
	 * @param citta è la Stringa della citta in cui si trova la banca
	 * @param provincia è la Stringa della provincia in cui si trova la Banca
	 * @param codDirettore è l Stringa che contiene il codice identificativo del direttore
	 * @param interessi è la Stringa degli interessi della Banca
	 * @param datainteressi è la Stringa che contine la datadi quando devono essere applicati gli interessi
	 * @param ricorrenza è la Stringa che contiene quante volte devono essere applicati gli interessi nel corso dell'anno
	 * @param immagineUno è la Stringa che contiene il pathname dell'immagine della banca
	 * @param immagineDue è la Stringa che contiene il pathname dell'immagine della banca
	 * @param immmagineTre è la String che contiene il pathname dell'immagine della banca
	 * @param codCatalogo è la Stringa che contiene il Codice identificativo del catalogo
	 * */
	public Banca(String idbanca, String nome, String via, String citta, String provincia, String codDirettore, String interessi, String datainteressi, String ricorrenza, String immagineUno, String immagineDue, String immagineTre, String codCatalogo) {
		
		this.idbanca = idbanca;
		this.nome = nome;
		this.via = via;
		this.citta = citta;
		this.provincia = provincia;
		this.codDirettore = codDirettore;
		this.interessi = interessi;
		this.datainteressi = datainteressi;
		this.ricorrenza = ricorrenza;
		this.immagineUno = immagineUno;
		this.immagineDue = immagineDue;
		this.immagineTre = immagineTre;
		this.codCatalogo = codCatalogo;
	}
	
	/**
	 * Costruttore della classe Banca
	 * */
	public Banca() {
		
	}
	
	
	/**
	 * Restituisce il valore della Stringa Identificativo della banca
	 * @return La Stringa di Idbanca
	 * */
	public String getIdBanca() {
		
		return this.idbanca;
	}
	
	/**
	 * Imposta il valore della Stringa Idbanca rappresentativo del codice della banca
	 * @param idbanca è la Stringa da inserire nella Stringa Idbanca della banca
	 * */
	public void setIdBanca(String idbanca) {
		
		this.idbanca=idbanca;
		return;
	}

	/**
	 * Restituisce il valore della Stringa Nome, rappresentativo del nome della banca
	 * @return La Stringa nome
	 * */
	public String getNome() {
		
		return this.nome;
	}
	
	
	/**
	 * Imposta il valore della Stringa Nome, rappresentativo del nome della banca
	 * @param nome è la Stringa da inserire nella Stringa Nome della banca
	 * */
	public void setNome(String nome) {
		
		this.nome=nome;
		return;		
	}
	
	/**
	 * Restituisce il valore della Stringa Via, rappresentativo dell'indirizzo della banca
	 * @return La Stringa via
	 * */
	public String getVia() {
		
		return this.via;
	}
	
	/**
	 * Imposta il valore della Stringa Via, rappresentativo dell'invirizzo della banca
	 * @param via è la Stringa da inseririre nella Stringa Via della banca
	 * */
	public void setVia(String via) {
		
		this.via=via;
		return;
	}
	
	/**
	 * Restituisce il valore della Stringa Citta, rappresentativo della citta in cui si trova la banca
	 * @return la Stringa citta
	 * */
	public String getCitta() {
		
		return this.citta;
	}
	
	/**
	 * Imosta il valore della Stringa Citta, rappresentativo della citta in cui si trova la banca
	 * @param citta è la Stringa da inserire nella Stringa Citta della banca
	 * */
	public void setCitta(String citta) {
		
		this.citta=citta;
		return;
	}
	
	/**
	 * Restituisce il valore della Stringa Provincia, rappresentativo della provincia in cui si trova la banca
	 * @return la Stringa provincia
	 * */
	public String getProvincia() {
		
		return this.provincia;
	}
	
	/**
	 * Imposta il valore della Stringa provincia, rappresentativo dalla provincia in cui si trova la banca
	 * @param provincia è la Stringa da inserire nella Stringa Provincia della banca
	 * */
	public void setProvincia(String provincia) {
		
		this.provincia=provincia;
		return;
	}
	
	/**
	 * Restituisce il valore della Stringa contenente il Codice Direttore della banca
	 * @return la Stringa Codice Direttore
	 * */
	public String getCodDirettore() {
		
		return this.codDirettore;
	}
	
	/**
	 * Imposta il valore della Stringa Codice Direttore della banca
	 * @param codDirettore è la Stringa da inserire nella Stringa CodDirettore della banca
	 * */
	public void setCodDirettore(String codDirettore) {
		
		this.codDirettore=codDirettore;
		return;
	}
	
	/**
	 * Restituisce il valore della Stringa contenente il tasso di interessi della banca
	 * @return la Stringa Interessi
	 * */
	public String getInteressi() {
		
		return this.interessi;
	}
	
	/**
	 * Imposta il valore della Stringa Interessi della banca
	 * @param interessi è la Stringa da inserire nella Stringa intererssi della banca
	 * */
	public void setInteressi(String interessi) {
		
		this.interessi=interessi;
		return;		
	}
	
	/**
	 * Restituisce il valore della Stringa contenente la data in cui devono essere applicati gli interessi
	 * @return la Stringa Data Interessi
	 * */
	public String getDataInteressi() {
		
		return this.datainteressi;
	}

	/**
	 * Imposta il valore della Stringa Data Interessi la data in cui devono essere applicati gli interessi
	 * @param dataInteressi è la Stringa da inserire nella Stringa datainteressi
	 * */
	public void setDataInteressi(String dataInteressi) {
		
		this.datainteressi=dataInteressi;
		return;
	}
	
	/**
	 * Restituisce il valore della Stringa contenente la ricorrenza di quante volte devono essere applicati 
	 * gli interessi nel corso di un anno da parte della banca
	 * @return la Stringa Ricorrenza
	 * */
	public String getRicorrenza() {
		
		return this.ricorrenza;
	}
	
	/**
	 * Imposta il valore della Stringa Ricorrenza, cioè quante volte devono essere applicati gli interessi nel corso della'anno
	 * @param ricorrenza è la Stringa da inserire nella Stringa ricorrenza
	 * */
	public void setRicorrenza(String ricorrenza) {
		
		this.ricorrenza=ricorrenza;
		return;
	}
	
	/**
	 * Restituisce il valore della Stringa ImmagineUno che rappresenta l'indirizzo in cui si trova l'immagine 
	 * della banca
	 * @return la Stringa ImmagineUno
	 * */
	public String getImmagineUno() {
		
		return this.immagineUno;
	}
	
	/**
	 * Imposta il valore della Stringa ImmagineUno che rappresenta l'indirizzo in cui si trova l'immagine della banca
	 * @param immagineUno è la Stringa da inserire nella Stringa ImmagineUno
	 * */
	public void setImmagineUno(String immagineUno) {
		
		this.immagineUno=immagineUno;
		return;
	}
	
	/**
	 * Restituisce il valore della Stringa ImmagineDue che rappresenta l'indirizzo in cui si trova l'immagine 
	 * della banca
	 * @return la Stringa ImmagineDue
	 * */
	public String getImmagineDue() {
		
		return this.immagineDue;
	}
	
	/**
	 * Imposta il valore della Stringa ImmagineDue che rappresenta l'indirizzo in cui si trova l'immagine della banca
	 * @param immagineDue è la Stringa da inserire nella Stringa ImmagineDue
	 * */
	public void setImmagineDue(String immagineDue) {
		
		this.immagineDue=immagineDue;
		return;
	}
	
	/**
	 * Restituisce il valore della Stringa ImmagineTre che rappresenta l'indirizzo in cui si trova l'immagine 
	 * della banca
	 * @return la Stringa ImmagineTre
	 * */
	public String getImmagineTre() {
		
		return this.immagineTre;
	}
	
	/**
	 * Imposta il valore della Stringa ImmagineTre che rappresenta l'indirizzo in cui si trova l'immagine della banca
	 * @param immagineTre è la Stringa da inserire nella Stringa ImmagineTre
	 * */
	public void setImmagineTre(String immagineTre) {
		
		this.immagineTre=immagineTre;
		return;
	}

	/**
	 * Restituisce il valore della Stringa CodCatalogo che rappresenta il Codice del catalogo dei proditti e servizi della banca
	 * @return la Stringa codCatalogo
	 * */
	public String getCodCatalogo() {
		
		return this.codCatalogo;
	}

	/**
	 * Imposta il valore della Stringa CodCatalogo che rappresenta il Codice del catalogo dei prodotti e servizi
	 * @param codCatalogo è la Stringa da inserire nella Stringa CodCatalogo
	 * */
	public void setCodCatalogo(String codCatalogo) {
		
		this.codCatalogo=codCatalogo;
		return;
	}

}

