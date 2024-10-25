package it.unisalento.pps.progettoEsame.model;

import java.util.ArrayList;

import it.unisalento.pps.progettoEsame.dao.RicaricaCellulareDAO;
import it.unisalento.pps.progettoEsame.model.RicaricaCellulare;

public class ListaRicaricaCell {
	
	private ArrayList<RicaricaCellulare> listaRicariche = new ArrayList<RicaricaCellulare>();
	
	/**
	 * Aggiunge una Ricarica Cellulare nella lista
	 * @param ricarica, la ricarica da inserire
	 * */
	public void addInLista(RicaricaCellulare ricarica) {
		
		this.listaRicariche.add(ricarica);
		
	}
	
	/**
	 * Aggiunge una Ricarica Cellulare nel database
	 * @param ricarica,  la Ricarica Cellulare da aggiungere nel database
	 * @return esito l'esito della registrazione 
	 * */
	public boolean addRicaricaCellulare(RicaricaCellulare ricarica) {
		
		boolean esito;
		esito = RicaricaCellulareDAO.getInstance().salvaRicaricaCellulare(ricarica);
		return esito;
	}
	
	

}
