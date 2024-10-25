package it.unisalento.pps.progettoEsame.model;

import java.util.ArrayList;
import it.unisalento.pps.progettoEsame.model.Filiale;
import it.unisalento.pps.progettoEsame.dao.FilialeDAO;


/**
 * Gestisce una Lista di Filiali
 * */
public class ListaFiliali {
	
	ArrayList<Filiale> listaFiliali = new ArrayList<Filiale>();
	
	/**
	 * Aggiunge una filiale nella lista
	 * @param filiale la filiale da inserire
	 * */
	public void addInLista(Filiale filiale) {
		
		this.listaFiliali.add(filiale);
		//BancaDAO.getInstance().salvaBanca(banca);
	}
	
	/**
	 * Carica la lista di filiali di tutte le filiali disponibili
	 * 
	 * */
	public void caricaListaFiliali() {
		
		this.listaFiliali=FilialeDAO.getInstance().caricaTutteLeFiliali();
	}
	
	/**
	 * Aggiunge una filiale nel database
	 * @param filiale la filiale da inserire
	 * */
	public boolean addFiliale(Filiale filiale) {
		
		boolean esito;
		esito = FilialeDAO.getInstance().salvaFiliale(filiale);
		return esito;
	}
	
	/**
	 * Controlla se esiste un filiale passando il nome della filiale e il codice della banca
	 * @param nome la Stringa nome della filiale
	 * @param codBanca la String del Codice della Banca
	 * @return True se la filiale è stata trovata, False altrimenti
	 * */
	public boolean trovataFiliale(String nome, String codBanca) {
		
		boolean esito;
		esito =FilialeDAO.getInstance().trovataFiliale(nome,codBanca);
		return esito;
	}
	
	
	/**
	 * REstituisce il codice Filiale usando il nome della filiale e il codice banca
	 * @param nomeFiliale la Stringa contenente il nome della filiale
	 * @param codBanca la Stringa contenente il codice identificativo della filiale
	 * */
	public String cercaCodFiliale(String nomeFiliale, String codBanca) {
		
		return FilialeDAO.getInstance().cercaCodFiliale(nomeFiliale, codBanca);
	}
	
	
	/**
	 * Restituisce il codice della Banca usando il codice della filiale
	 * @param filiale la Stringa contenente il codice identificativo della filiale
	 * @return la Stringa contenente il codice identificativo della banca
	 * */
	public String cercaBancaDaFiliale(String filiale) {
		
		return FilialeDAO.getInstance().cercaBancaDaFiliale(filiale);
	}
	

}
