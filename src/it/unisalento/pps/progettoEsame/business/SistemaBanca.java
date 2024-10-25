package it.unisalento.pps.progettoEsame.business;

import it.unisalento.pps.progettoEsame.business.SistemaAccesso;
import it.unisalento.pps.progettoEsame.business.SistemaFiliale;
//import it.unisalento.pps.progettoEsame.model.Filiale;
import it.unisalento.pps.progettoEsame.model.ListaFiliali;
//import it.unisalento.pps.progettoEsame.model.Banca;
import it.unisalento.pps.progettoEsame.model.Catalogo;
import it.unisalento.pps.progettoEsame.model.ListaBanche;
//import it.unisalento.pps.progettoEsame.model.Direttore;

public class SistemaBanca {
	
	ListaBanche listaBanche = new ListaBanche();
	
	private static SistemaBanca instance;
	
	public static synchronized SistemaBanca getInstance() {
		
		if(instance == null)
			
			instance = new SistemaBanca();
		
		return instance;
	}
	
	
	/**
	 * Crea una nuova Filiale
	 * @param nome la Stringa nome della filiale
	 * @param via la Stringa via della filiale
	 * @param citta la Stringa della citta della filiale
	 * @param provincia la Stringa della provincia della filiale
	 * @param immagineUno la Stringa del percorso dell'immagine uno della filiale 
	 * @param immagineDue la Stringa del percorso dell'immagine due della filiale 
	 * @param immagineTre la Stringa del percorso dell'immagine tre della filiale
	 * @param codBanca la Stringa del codice della Banca della filiale
	 * @return ritorna int 0 se la registrazione della filiale è avvenuta correttamente, int 1 la registrazione Non è avvenuta 
	 * */
	public int creaFiliale(String nome, String via, String citta, String provincia, String immagineUno, String immagineDue, String immagineTre) {
		
		return SistemaFiliale.getInstance().creaFiliale(nome, via, citta, provincia, immagineUno, immagineDue, immagineTre, listaBanche.getBancaDaDirettore(SistemaAccesso.getInstance().getDirettore().getUsername()));
	}
	
	/**
	 * Inserisce un'apertura della filiale
	 * @param nomeFiliale la Stringa nome della filiale
	 * @param giorno la Stringa giorno di apertura della filiale
	 * @param oraApertura la Stringa ora di apertura della filiale
	 * @param oraChiusura la Stringa ora di chiusura della filiale
	 * */
	public void creaApertura(String nomeFiliale, String giorno, String oraApertura, String oraChiusura) {
		
		SistemaFiliale.getInstance().creaApertura(nomeFiliale, listaBanche.getBancaDaDirettore(SistemaAccesso.getInstance().getDirettore().getUsername()) ,giorno,oraApertura,oraChiusura);
		
	}
	
	
	/**
	 * Restituisce un catalogo passando l'id di una filiale
	 * */
	public Catalogo getCatalogoDaFiliale(String idFiliale) {
		
		ListaFiliali listaFiliali = new ListaFiliali();
		Catalogo catalogo = new Catalogo();
		
		String idCatalogo;
		
		//System.out.println("la Stringa id Banca dalla filiale Sistema Banca: "+listaFiliali.cercaBancaDaFiliale(idFiliale));
		
		idCatalogo =  listaBanche.getCatalogo(listaFiliali.cercaBancaDaFiliale(idFiliale));  // restituisce la stringa idcatalogo
		
		
		//System.out.println("idCatalogo in Sistema Banca: "+idCatalogo);
		catalogo = catalogo.cercaCatalogo(idCatalogo);
		return catalogo;
		
	}
	
	/**
	 * Restituisce l'idBanca usando un IdFiliale
	 * @param idFiliale l'identificativo della filiale
	 * @return la Stringa idBanca contenente l'identificativo della banca
	 * */
	public String getIdBancaDaIdFiliale(String idFiliale) {
		ListaFiliali listaFiliali = new ListaFiliali();
		
		return listaFiliali.cercaBancaDaFiliale(idFiliale);
	}

}
