package it.unisalento.pps.progettoEsame.model;

import it.unisalento.pps.progettoEsame.model.Operazione;

import java.util.ArrayList;

import it.unisalento.pps.progettoEsame.dao.OperazioneDAO;

/**
 * Gestisce una lista di operazioni
 * */
public class ListaOperazioni {
	
	ArrayList<Operazione> listaOperazioni = new ArrayList<Operazione>();
	
	private static ListaOperazioni instance;
	
	public static synchronized ListaOperazioni getInstance() {
		
		if(instance == null)
			
			instance = new ListaOperazioni();
		
		return instance;
	}
	
	
	/**
	 * Aggiunge una operazione nella lista
	 * @param operazione l'operazione da inserire
	 * */
	public void addInLista(Operazione operazione) {
		
		this.listaOperazioni.add(operazione);
		//BancaDAO.getInstance().salvaBanca(banca);
	}
	
	/**
	 * Aggiunge un'operazione nel database
	 * @param operazione l'operazione da aggiungere nel database
	 * @return esito l'esito della registrazione 
	 * */
	public boolean addOperazione(Operazione operazione) {
		
		boolean esito;
		esito = OperazioneDAO.getInstance().salvaOperazione(operazione);
		return esito;
	}
	
	
	/**
	 * Ritorna un ArrayList di Operazioni partendo da un ArrayList di Stringhe contenti i conti correnti
	 * @param contiCorrenti contiene i conti correnti di qui voglio prelevare le operazioni
	 * @return l'ArrayList totale delle operazioni dei conti correnti
	 */
	public ArrayList<Operazione> getOperazioniDaListaContiCorrenti(ArrayList<String> contiCorrenti){
		
		ArrayList<Operazione> lista = new ArrayList<Operazione>(); 
		ArrayList<Operazione> operazioni = new ArrayList<Operazione>();
		
		
		for(String contoCorrente : contiCorrenti) {
			
			operazioni =OperazioneDAO.getInstance().getOperazioniDaContoCorrente(contoCorrente);
			
			lista.addAll(operazioni);
			
			operazioni.clear();
			

		}
		
		return lista;
	}
	
	/**
	 * Ritorna un ArrayList di Operazioni partendo da un ArrayList di Stringhe contenti le carte Prepagate
	 * @param cartePrepagate contiene le carte Prepagate di qui voglio prelevare le operazioni
	 * @return l'ArrayList totale delle operazioni delle CartePrepagate
	 */
	public ArrayList<Operazione> getOperazioniDaListaCartePrepagate(ArrayList<String> cartePrepagate){
		
		ArrayList<Operazione> lista = new ArrayList<Operazione>(); 

		ArrayList<Operazione> operazioni = new ArrayList<Operazione>();
		
		
		for(String cartaPrepagata : cartePrepagate) {
			
			operazioni =OperazioneDAO.getInstance().getOperazioniDaCartaPrepagata(cartaPrepagata);
			
			lista.addAll(operazioni);
			
			operazioni.clear();	
			
		}
		
		return lista;
	}
	
	
	/**
	 * Accetta Operazione bancaria
	 * @param idCassiere l'identificativo del cassiere che effettua l'accettazione
	 * @param operazione l'operazione da accettare
	 * @param data la Stringa della data dell'avvenuta accettazione
	 */
	public void accettaOperazione(String idCassiere, Operazione operazione, String data) {
		
		OperazioneDAO.getInstance().accettaOperazione(idCassiere, operazione.getIdOperazione(), operazione.getCostanteAccettataSi(), data);
		return;
		
	}
	
	
	/**
	 * NON Accetta l'Operazione bancaria
	 * @param idCassiere l'identificativo del cassiere che effettua l'accettazione
	 * @param operazione l'operazione da non accettare
	 * @param data la Stringa della data dell'avvenuta non accettazione
	 */
	public void nonAccettaOperazione(String idCassiere, Operazione operazione, String data) {
		
		OperazioneDAO.getInstance().accettaOperazione(idCassiere, operazione.getIdOperazione(), operazione.getCostanteAccettataNo(), data);
		return;
		
	}
	
	
	/**
	 * Ritorna un ArrayList di operazioni del conto corrente passato
	 * @param idContoCorrente l'identificativo del conto corrente
	 * @return Ritorna un ArrayList di operazioni, Null altrimenti
	 */
	public ArrayList<Operazione> getOperazioniDaContoCorrente(String idContoCorrente){
		
		return OperazioneDAO.getInstance().getOperazioniDaContoCorrente(idContoCorrente);
	}
	
	
	/**
	 * Ritorna un ArrayList di operazioni della carta prepagata passata
	 * @param idCartaPrepagata l'identificativo della carta prepagata
	 * @return Ritorna un ArrayList di operazioni, Null altrimenti
	 */
	public ArrayList<Operazione> getOperazioniDaCartaPrepagata(String idCartaPrepagata){
		
		return OperazioneDAO.getInstance().getOperazioniDaCartaPrepagata(idCartaPrepagata);
	}

}
