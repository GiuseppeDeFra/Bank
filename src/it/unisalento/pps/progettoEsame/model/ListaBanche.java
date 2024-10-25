package it.unisalento.pps.progettoEsame.model;

import java.util.ArrayList;
import it.unisalento.pps.progettoEsame.model.Banca;
import it.unisalento.pps.progettoEsame.dao.BancaDAO;

/**
 * Gestisce una lista di banche
 * */
public class ListaBanche {
	
	ArrayList<Banca> listaBanche = new ArrayList<Banca>();
	
	/**
	 * Aggiunge una banca nella lista
	 * @param banca la banca da inserire
	 * */
	public void addInLista(Banca banca) {
		
		this.listaBanche.add(banca);
		//BancaDAO.getInstance().salvaBanca(banca);
	}
	
	
	/**
	 * Carica la lista di banche di tutte le banche disponibili
	 * */
	public void caricaListaBanche() {
		
		this.listaBanche=BancaDAO.getInstance().caricaTutteLeBanche();
	}
	
	/**
	 * Aggiunge una banca nel Database
	 * @param banca la banca da inserire
	 * @return boolean esito TRUE registrazione avvenuta, FALSE altrimenti
	 * */
	public boolean addBanca(Banca banca) {
		
		boolean esito;
		esito = BancaDAO.getInstance().salvaBanca(banca);
		return esito;
	}
	
	/**
	 * Trova una banca se esiste torna TRU altrimenti FALSE
	 * @param nome nome della banca da trovare
	 * @return boolean TRUE se la banca è stata trovata, FALSE altrimenti
	 * */
	public boolean trovataBanca(String nome) {
		
		return BancaDAO.getInstance().trovaBanca(nome);
	}
	
	/**
	 * Trova la banca diretta dal direttore
	 * @param codDirettore la Stringa del codice Direttore
	 * @return la Stringa del Codice della Banca
	 * */
	public String getBancaDaDirettore(String codDirettore) {
		
		return BancaDAO.getInstance().trovaBancaDaDirettore(codDirettore);
		
	}
	
	public String getCatalogo(String idBanca) {
		
		return BancaDAO.getInstance().cercaCatalogoDaBanca(idBanca);
	}

}
