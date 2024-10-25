package it.unisalento.pps.progettoEsame.business;

import it.unisalento.pps.progettoEsame.model.Apertura;
import it.unisalento.pps.progettoEsame.model.Filiale;
import it.unisalento.pps.progettoEsame.model.ListaAperture;
import it.unisalento.pps.progettoEsame.model.ListaFiliali;

/**
 * Gestisce un sistema per le filiali di una banca
 * */
public class SistemaFiliale {
	
	private static SistemaFiliale instance;
	
	public static synchronized SistemaFiliale getInstance() {
		
		if(instance == null)
			
			instance = new SistemaFiliale();
		
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
	 * */
	public int creaFiliale(String nome, String via, String citta, String provincia, String immagineUno, String immagineDue, String immagineTre, String codBanca) {
		
		Filiale filiale = new Filiale();
		
		filiale.setNome(nome);
		filiale.setVia(via);
		filiale.setCitta(citta);
		filiale.setProvincia(provincia);
		filiale.setImmagineUno(immagineUno);
		filiale.setImmagineDue(immagineDue);
		filiale.setImmagineTre(immagineTre);
		filiale.setCodiceBanca(codBanca);
		
		ListaFiliali listaFiliali = new ListaFiliali();
		
		if(listaFiliali.trovataFiliale(filiale.getNome(),filiale.getCodiceBanca())) {
			
			return 1;
		}
		listaFiliali.addFiliale(filiale);
		return 0;
	}
	
	/**
	 * Crea una nuova apertura della filiale
	 * @param nomeFiliale la Stringa nome della filiale
	 * @param codBanca la Stringa codice della banca
	 * @param giorno la Stringa giorno della settimana in cui è aperta la filiale
	 * @param orarioApertura la Stringa dell'orario di apertura della Filiale
	 * @param orarioChiusura la Stringa dell'arario di chiusura della Filiale
	 * */
	public void creaApertura(String nomeFiliale, String codBanca, String giorno, String orarioApertura, String orarioChiusura) {
		
		ListaFiliali listaFiliali = new ListaFiliali();
		ListaAperture listaAperture= new ListaAperture();
		Apertura apertura = new Apertura(listaFiliali.cercaCodFiliale(nomeFiliale, codBanca),giorno, orarioApertura, orarioChiusura);
		
		listaAperture.addApertura(apertura);
		
	}

}
