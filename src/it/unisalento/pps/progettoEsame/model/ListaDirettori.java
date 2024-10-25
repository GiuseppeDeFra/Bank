package it.unisalento.pps.progettoEsame.model;

import it.unisalento.pps.progettoEsame.model.Direttore;

import java.util.ArrayList;

import it.unisalento.pps.progettoEsame.dao.DirettoreDAO;

/**
 * Gestisce una lista di Direttori
 * */
public class ListaDirettori {
	
	ArrayList<Direttore> listaDirettori = new ArrayList<Direttore>();
	
	private static ListaDirettori instance;
	
	public static synchronized ListaDirettori getInstance() {
		
		if(instance == null)
			
			instance = new ListaDirettori();
		
		return instance;
	}
	
	/**
	 * Controlla se esiste un Direttore con un Username
	 * @param username la Stringa username da cercare
	 * @return boolean TRUE se lo trova, FALSE altrimenti
	 * */
	public boolean trovatoDirettore(String username) {
		
		return DirettoreDAO.getInstance().trovaDaUsername(username);
	}
	
	/**
	 * Aggiunge un direttore nel Database
	 * @param direttore la banca da inserire
	 * @return boolean esito TRUE registrazione avvenuta, FALSE altrimenti
	 * */
	public boolean addDirettore(Direttore direttore) {
		
		return DirettoreDAO.getInstance().salvaDirettore(direttore);
		
	}
	


}
