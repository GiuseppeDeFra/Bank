package it.unisalento.pps.progettoEsame.model;

import java.util.ArrayList;
import it.unisalento.pps.progettoEsame.dao.AperturaDAO;


/**
 * Gestisce una lista di aperture di una filiale
 * */
public class ListaAperture {
	
	private ArrayList<Apertura> listaAperture = new ArrayList<Apertura>();
	
	/**
	 * Aggiunge una Apertura della filiale nella lista
	 * @param apertura l'apertura della filiale da inserire
	 * */
	public void addInLista(Apertura apertura) {
		
		this.listaAperture.add(apertura);
		
	}
	
	/**
	 * Aggiunge una Apertura di una filiale nel database
	 * @param apertura l'apertura di una filiale da aggiungere nel database
	 * @return esito l'esito della registrazione 
	 * */
	public boolean addApertura(Apertura apertura) {
		
		boolean esito;
		esito = AperturaDAO.getInstance().salvaApertura(apertura);
		return esito;
	}
	
	/**
	 * Carica una Lista di aperture della filiale
	 * @param filiale la filiale da cercare
	 * */
	public void caricaListaAperture(String filiale){
		
		this.listaAperture = AperturaDAO.getInstance().cercaApertura(filiale);
		return;
	}

}
