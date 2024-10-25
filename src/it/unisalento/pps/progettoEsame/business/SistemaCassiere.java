package it.unisalento.pps.progettoEsame.business;

import it.unisalento.pps.progettoEsame.model.Cassiere;
import it.unisalento.pps.progettoEsame.model.ListaCartePrepagate;
import it.unisalento.pps.progettoEsame.model.ListaContiCorrenti;
//import it.unisalento.pps.progettoEsame.model.Cliente;
//import it.unisalento.pps.progettoEsame.model.ListaCartePrepagate;
//import it.unisalento.pps.progettoEsame.model.ListaContiCorrenti;
//import it.unisalento.pps.progettoEsame.model.ListaOperazioni;
import it.unisalento.pps.progettoEsame.business.SistemaOperazione;
import it.unisalento.pps.progettoEsame.model.Operazione;
import it.unisalento.pps.progettoEsame.view.FrameConvalidaOperazioni;
import it.unisalento.pps.progettoEsame.view.FrameVisualizzaOperazioni;

import java.util.ArrayList;

import it.unisalento.pps.progettoEsame.business.SistemaAccesso;

//import java.util.ArrayList;
//import java.util.Iterator;



public class SistemaCassiere {

	private Cassiere cassiere = SistemaAccesso.getInstance().getCassiere();
	
	private static SistemaCassiere instance;
	
	public static synchronized SistemaCassiere getInstance() {
		
		if(instance == null)
			
			instance = new SistemaCassiere();
		
		return instance;
	}

	/**
	 * Avvia il frame per la convalida delle Operazioni
	 */
	public void avviaConvalidaOperazioni() {
		

		FrameConvalidaOperazioni convalidaOperazioni = new FrameConvalidaOperazioni(SistemaOperazione.getInstance().getOperazioniDaAccettareCassiere(cassiere.getIdFiliale()));
		
				
	}
	
	
	public int accettaOperazione(Operazione operazione) {
		
		return SistemaOperazione.getInstance().accettaOperazione(cassiere.getUsername(), operazione);
	
	}
	
	public int nonAccettaOperazione(Operazione operazione) {
		
		return SistemaOperazione.getInstance().nonAccettaOperazione(cassiere.getUsername(), operazione);
	}
	
	
	/**
	 * Avvia Visualizza Operazioni
	 */
	public void avviaVisualizzaOperazioni() {
		
		FrameVisualizzaOperazioni frame = new FrameVisualizzaOperazioni();
	}
	
	/**
	 * Restituisce una lista di conti Correnti da un idCliente
	 * @param idCliente l'identificativo del cliente
	 * @return ArrayList di Stringhe dei conti correnti del cliente
	 */
	public ArrayList<String> getListaIdContiCorrentiCliente(String idCliente){
		
		ListaContiCorrenti listaConti = new ListaContiCorrenti();
		return listaConti.getIdContiCorrentiCliente(idCliente);
		
				
	}
	
	/**
	 * Restituisce una lista delle Carte Prepagate del Cliente
	 * @param idCliente l'identificativo del Cliente
	 * @return ArrayList di Stringhe delle carte prepagate
	 */
	public ArrayList<String> getListaIdCartePrepagateCliente(String idCliente){
		
		ListaCartePrepagate listaCarte = new ListaCartePrepagate();
		return listaCarte.getIdCartePrepagateCliente(idCliente);
	}

	
}
