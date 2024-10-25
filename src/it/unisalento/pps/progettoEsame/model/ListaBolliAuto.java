package it.unisalento.pps.progettoEsame.model;

import java.util.ArrayList;

import it.unisalento.pps.progettoEsame.dao.BolloAutoDAO;


/**
 * Gestisce una lista di Bolli Auto
 * */
public class ListaBolliAuto {
	
	private ArrayList<BolloAuto> listabolli = new ArrayList<BolloAuto>();
	
	/**
	 * Aggiunge un Bollo Auto nella lista
	 * @param bollo il bollo da inserire
	 * */
	public void addInLista(BolloAuto bollo) {
		
		this.listabolli.add(bollo);
		return;
		
	}
	
	/**
	 * Aggiunge un Bollo Auto nel database
	 * @param bollo, il bollo Auto da aggiungere nel database
	 * @return esito l'esito della registrazione 
	 * */
	public boolean addBolloAuto(BolloAuto bollo) {
		
		boolean esito;
		esito = BolloAutoDAO.getInstance().salvaBolloAuto(bollo);
		return esito;
	}

}
