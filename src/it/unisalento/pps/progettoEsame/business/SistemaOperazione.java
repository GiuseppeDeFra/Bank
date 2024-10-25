package it.unisalento.pps.progettoEsame.business;


import it.unisalento.pps.progettoEsame.model.Operazione;
import it.unisalento.pps.progettoEsame.model.ListaOperazioni;

import java.util.ArrayList;

//import it.unisalento.pps.progettoEsame.model.Cassiere;
import it.unisalento.pps.progettoEsame.model.Cliente;
import it.unisalento.pps.progettoEsame.model.Data;
import it.unisalento.pps.progettoEsame.model.ListaCartePrepagate;
import it.unisalento.pps.progettoEsame.model.ListaContiCorrenti;

import it.unisalento.pps.progettoEsame.business.SistemaEmail;

/**
 * Gestisce un sistema di operazioni bancarie
 * */
public class SistemaOperazione {
	
	private static SistemaOperazione instance;
	
	public static synchronized SistemaOperazione getInstance() {
		
		if(instance == null)
			
			instance = new SistemaOperazione();
		
		return instance;
	}
	
	/**
	 * Registra un versamento al conto corrente e invia un'email di presa in carico al cliente
	 * @param importo l'importo da versare
	 * @param contoCorrente l'identificativo del contoCorrente
	 * @param email l'email del cliente 
	 * */
	public void registraVersamentoContoCorrente(String importo, String contoCorrente, String email) {
		
		ListaOperazioni listaoperazioni = new ListaOperazioni();
		Operazione operazione = new Operazione();
		
		operazione.setImporto(importo);
		operazione.setCodContoCorrente(contoCorrente);
		//operazione.setAccettataNO();
		Data data=new Data();
		operazione.setdata(data.getDataOggi());
		operazione.setDescrizione("Versamento su conto corrente");
		
		listaoperazioni.addOperazione(operazione);
		
		SistemaEmail.getInstance().inviaEmail(SistemaEmail.getInstance().creaEmail(email, "Versamento Conto Corrente ", "E' stata presa in carico la richiesta di versamento nr."+contoCorrente+"\nDi importo "+importo+"€"));
		
	}
	
	/**
	 * Registra un prelievo al conto corrente e invia un'email di presa in carico al cliente
	 * @param importo l'importo da prelevare
	 * @param contoCorrente l'identificativo del contoCorrente
	 * @param email l'email del cliente 
	 * */
	public void registraPrelievoContoCorrente(String importo, String contoCorrente, String email) {
		
		ListaOperazioni listaoperazioni = new ListaOperazioni();
		Operazione operazione = new Operazione();
		
		double numero=Double.valueOf(importo);
		numero=-numero;		
		operazione.setImporto(String.valueOf(numero));
		
		operazione.setCodContoCorrente(contoCorrente);
		
		//operazione.setAccettataNO();
		
		Data data=new Data();
		operazione.setdata(data.getDataOggi());
		
		operazione.setDescrizione("Prelievo da conto corrente");
		
		listaoperazioni.addOperazione(operazione);
		
		SistemaEmail.getInstance().inviaEmail(SistemaEmail.getInstance().creaEmail(email, "Prelievo da Conto Corrente", "E' stata presa in carico la richiesta di versamento  nr."+contoCorrente+"\nDi importo "+importo+"€"));
		
	}

	/**
	 * Registra un versamento su una Carta prepagata e invia un'email di presa in carico al cliente
	 * @param importo l'importo da versare
	 * @param cartaPrepagata l'identificativo della carta prepagata
	 * @param email l'email del cliente 
	 * */
	public void registraVersamentoCartaPrepagata(String importo, String cartaPrepagata, String email) {
		
		ListaOperazioni listaoperazioni = new ListaOperazioni();
		Operazione operazione = new Operazione();
		
		operazione.setImporto(importo);
		operazione.setCodCartaPrepagata(cartaPrepagata);
		//operazione.setAccettataNO();
		Data data=new Data();
		operazione.setdata(data.getDataOggi());
		operazione.setDescrizione("Versamento su Carta Prepagata");
		
		listaoperazioni.addOperazione(operazione);
		
		SistemaEmail.getInstance().inviaEmail(SistemaEmail.getInstance().creaEmail(email, "Versamento Carta Prepagata", "E' stata presa in carico la richiesta di versamento  nr."+cartaPrepagata+"\nDi importo "+importo+"€"));
		
	}
	
	/**
	 * Registra un prelievo al carta prepagata e invia un'email di presa in carico al cliente
	 * @param importo l'importo da prelevare
	 * @param cartaPrepagata l'identificativo della Carta Prepagata
	 * @param email l'email del cliente 
	 * */
	public void registraPrelievoCartaPrepagata(String importo, String cartaPrepagata, String email) {
		
		ListaOperazioni listaoperazioni = new ListaOperazioni();
		Operazione operazione = new Operazione();
		
		double numero=Double.valueOf(importo);
		numero=-numero;		
		operazione.setImporto(String.valueOf(numero));
		
		operazione.setCodCartaPrepagata(cartaPrepagata);
		
		//operazione.setAccettataNO();
		
		Data data=new Data();
		operazione.setdata(data.getDataOggi());
		
		operazione.setDescrizione("Prelievo da Carta Prepagata");
		
		listaoperazioni.addOperazione(operazione);
		
		SistemaEmail.getInstance().inviaEmail(SistemaEmail.getInstance().creaEmail(email, "Prelievo da Carta Prepagata", "E' stata presa in carico la richiesta di versamento  nr."+cartaPrepagata+"\nDi importo "+importo+"€"));
		
	}
	
	/**
	 * Registra un pagamento usando il conto corrente
	 * @param importo l'importo da pagare
	 * @param contoCorrente l'identificativo conto corrente usato
	 * @param email l'email del cliente
	 * @param descrizione la descrizione del pagamento
	 * @param data la data del pagamento
	 * */
	public void registraPagamentoContoCorrente(String importo, String contoCorrente, String email, String descrizione, String data) {
		
		ListaOperazioni listaoperazioni = new ListaOperazioni();
		Operazione operazione = new Operazione();
		
		double numero=Double.valueOf(importo);
		numero=-numero;		
		operazione.setImporto(String.valueOf(numero));
		
		operazione.setCodContoCorrente(contoCorrente);
		//operazione.setAccettataNO();
		operazione.setdata(data);
		operazione.setDescrizione(descrizione);
		
		listaoperazioni.addOperazione(operazione);
		
		SistemaEmail.getInstance().inviaEmail(SistemaEmail.getInstance().creaEmail(email, descrizione, "E' stata presa in carico la richiesta di "+descrizione+" dal Conto Corrente nr."+contoCorrente+"\nDi importo "+importo+"€"));

	}

	/**
	 * Registra un pagamento usando la carta prepagata
	 * @param importo l'importo da pagare
	 * @param cartaPrepagata l'identificativo conto corrente usato
	 * @param email l'email del cliente
	 * @param descrizione la descrizione del pagamento
	 * @param data la data del pagamento
	 * */
	public void registraPagamentoCartaPrepagata(String importo, String cartaPrepagata, String email, String descrizione, String data) {
		
		ListaOperazioni listaoperazioni = new ListaOperazioni();
		Operazione operazione = new Operazione();
		
		double numero=Double.valueOf(importo);
		numero=-numero;		
		operazione.setImporto(String.valueOf(numero));
		
		operazione.setCodCartaPrepagata(cartaPrepagata);
		//operazione.setAccettataNO();
		operazione.setdata(data);
		operazione.setDescrizione(descrizione);
		
		listaoperazioni.addOperazione(operazione);
		
		SistemaEmail.getInstance().inviaEmail(SistemaEmail.getInstance().creaEmail(email, descrizione, "E' stata presa in carico la richiesta di "+descrizione+" dalla Carta Prepagata nr."+cartaPrepagata+"\nDi importo "+importo+"€"));

	}
	
	
	/**
	 * Accetta un operazione bancaria
	 * @param idCassiere l'identificativo del cassiere che esegue l'accettazione
	 * @param operazione l'operazione da accettare
	 * @param data quando è avvenuta l'accettazione
	 * @return 0 l'accettazione è avvenuta con successo, 1 errore durante l'aggiornamento
	 */
	public int accettaOperazione(String idCassiere, Operazione operazione) {
		
		ListaOperazioni listaoperazioni = new ListaOperazioni();
		ListaContiCorrenti listaConti = new ListaContiCorrenti();
		ListaCartePrepagate listaCarte = new ListaCartePrepagate();
		Cliente cliente = new Cliente();
		
		Data data=new Data();
		
		listaoperazioni.accettaOperazione(idCassiere, operazione,data.getDataOggi());
		
		
		
		if(!operazione.getCodCartaPrepagata().equals("null")&&!operazione.getCodCartaPrepagata().isEmpty()) {
			
			//per la carta prepagata
			
			boolean esito = listaCarte.aggiornaSaldo(operazione.getCodCartaPrepagata(), operazione.getImporto(), data.getDataOggi());			
			
			if(esito) {
				
				cliente = cliente.cercaCliente_username(listaCarte.getIdCliente(operazione.getCodCartaPrepagata()));
				
				
			}
			
			else 
				return 1;			

			
		}
		if(!operazione.getCodContoCorrente().equals("null")&&!operazione.getCodContoCorrente().isEmpty()) {
			
			
			
			//per il conto corrente
			
			boolean esito = listaConti.aggiornaSaldo(operazione.getCodContoCorrente(),operazione.getImporto(), data.getDataOggi());
			
			
			
			if(esito) {
				
				cliente = cliente.cercaCliente_username(listaConti.getIdCliente(operazione.getCodContoCorrente()));
				
				
			}
			
			else
				return 1;
	
			
		}
		
		//System.out.println("Invio email");
		
		SistemaEmail.getInstance().inviaEmail(SistemaEmail.getInstance().creaEmail(cliente.getEmail(), "Operazione accettata", "E' stata ACCETTATA la richiesta di "+operazione.getDescrizione()+((!operazione.getCodContoCorrente().equals("null")&&!operazione.getCodContoCorrente().isEmpty())?" dal Conto Corrente nr."+operazione.getCodContoCorrente():" dalla Carta Prepagata nr."+operazione.getCodCartaPrepagata())+"\nDi importo "+operazione.getImporto()+"€"));
				
		return 0;
		
	}
	
	
	/**
	 * Accetta un operazione bancaria
	 * @param idCassiere l'identificativo del cassiere che esegue l'accettazione
	 * @param operazione l'operazione da accettare
	 * @param data quando è avvenuta l'accettazione
	 * @return 0 l'accettazione è avvenuta con successo, 1 errore durante l'aggiornamento
	 */
	public int nonAccettaOperazione(String idCassiere, Operazione operazione) {
		
		ListaOperazioni listaoperazioni = new ListaOperazioni();
		ListaContiCorrenti listaConti = new ListaContiCorrenti();
		ListaCartePrepagate listaCarte = new ListaCartePrepagate();
		
		
		Cliente cliente = new Cliente();
		
		Data data=new Data();
		
		listaoperazioni.nonAccettaOperazione(idCassiere, operazione, data.getDataOggi());
		
		
		
		if(!operazione.getCodCartaPrepagata().equals("null")&&!operazione.getCodCartaPrepagata().isEmpty()) {
			
			//per la carta prepagata
					
	
				cliente = cliente.cercaCliente_username(listaCarte.getIdCliente(operazione.getCodCartaPrepagata()));
				
				
			}
			
		if(!operazione.getCodContoCorrente().equals("null")&&!operazione.getCodContoCorrente().isEmpty()) {
			
			
			//per il conto corrente
			
				cliente = cliente.cercaCliente_username(listaConti.getIdCliente(operazione.getCodContoCorrente()));
				
				//System.out.println("\n\nid conto corrente: "+idcon+"\ncodice cliente: "+idcli+"\nemail cliente: "+cliente.getEmail());

		}
		
				
		SistemaEmail.getInstance().inviaEmail(SistemaEmail.getInstance().creaEmail(cliente.getEmail(), "Operazione NON accettata", "NON e' stata ACCETTATA la richiesta di "+operazione.getDescrizione()+((!operazione.getCodContoCorrente().equals("null")&&!operazione.getCodContoCorrente().isEmpty())?" dal Conto Corrente nr."+operazione.getCodContoCorrente():" dalla Carta Prepagata nr."+operazione.getCodCartaPrepagata())+"\nDi importo "+operazione.getImporto()+"€"));
		
		return 0;
	}
	
	
	/**
	 * Restituisce un ArrayList di Operazioni da accettare per il cassiere
	 * @param idFiliale l'identificativo della filiale in cui lavora il cassiere
	 * @return un ArrayList di Operazioni da accettare per il cassiere
	 */
	public ArrayList<Operazione> getOperazioniDaAccettareCassiere(String idFiliale){
		ListaOperazioni listaOperazioniContiCorrenti = new ListaOperazioni();
		ListaOperazioni listaOperazioniCartePrepagate = new ListaOperazioni();
		
		ListaContiCorrenti listaContiCorrenti = new ListaContiCorrenti();
		
		ListaCartePrepagate listaCartePrepagate = new ListaCartePrepagate();
		
		ArrayList<String> listaconti = listaContiCorrenti.getIdContiCorrentiFiliale(idFiliale);
		
		ArrayList<Operazione> totConti =listaOperazioniContiCorrenti.getOperazioniDaListaContiCorrenti(listaconti);
		
		ArrayList<String> listacarte = listaCartePrepagate.getIdCartePrepagateFiliale(idFiliale);
		ArrayList<Operazione> totCarte = listaOperazioniCartePrepagate.getOperazioniDaListaCartePrepagate(listacarte);
		
	
		
		ArrayList<Operazione> operazioniTotali = new ArrayList<Operazione>();
		
		Operazione operazione = new Operazione();
		
		operazioniTotali.addAll(totConti);
		operazioniTotali.addAll(totCarte);
		
		
		//Elimino gli elementi già accettati
		for(int i=0; i<operazioniTotali.size();i++) {
			
			if(operazioniTotali.get(i).getAccettata().equals(operazione.getCostanteAccettataSi())||operazioniTotali.get(i).getAccettata().equals(operazione.getCostanteAccettataNo())) {
				
				//System.out.println("Elemento da eliminare"+Integer.toString(i)+" Operazione: "+operazioniTotali.get(i).getIdOperazione()+" "+operazioniTotali.get(i).getImporto()+" "+operazioniTotali.get(i).getDescrizione()+" "+operazioniTotali.get(i).getAccettata());
				operazioniTotali.remove(i);
				i--;
			}
		}
		
		/*
		System.out.println("\n\nElementi rimasti \n ");
		for(int i=0; i<operazioniTotali.size();i++) {
			
			System.out.println("Elemento "+Integer.toString(i)+" Operazione: "+operazioniTotali.get(i).getIdOperazione()+" "+operazioniTotali.get(i).getImporto()+" "+operazioniTotali.get(i).getDescrizione());
		}
		
		*/
		
		return operazioniTotali;
	}
	
	/**
	 * Ritorna un ArrayList di operazioni del conto corrente passato, lista di operazioni accettate 
	 * @param idContoCorrente l'identificativo del conto corrente
	 * @return un ArrayList di operazioni, Null altrimenti
	 */
	public ArrayList<Operazione> getOperazioniContoCorrVisualizzare(String idContoCorrente){
		
		ListaOperazioni lista = new ListaOperazioni();
		
		ArrayList<Operazione> operazioni = new ArrayList<Operazione>();
		
		operazioni = lista.getOperazioniDaContoCorrente(idContoCorrente);
		
		for(int i=0; i<operazioni.size(); i++) {
			
			if(!operazioni.get(i).getAccettata().equals(operazioni.get(i).getCostanteAccettataSi())) {
				
				operazioni.remove(i);
				i--;				
			}
		}
		
		return operazioni;
		
	}
	
	/**
	 * Ritorna un ArrayList di operazioni della carta prepagata passata, lista di operazioni accettate
	 * @param idCartaPrepagata l'identificativo della carta prepagata
	 * @return un ArrayList di operazioni, Null altrimenti
	 */
	public ArrayList<Operazione> getOperazioniCartaPrepVisualizzare(String idCartaPrepagata){
		
		ListaOperazioni lista = new ListaOperazioni();
		
		ArrayList<Operazione> operazioni = new ArrayList<Operazione>();
		
		operazioni = lista.getOperazioniDaCartaPrepagata(idCartaPrepagata);
		
		for(int i=0; i<operazioni.size(); i++) {
			
			if(!operazioni.get(i).getAccettata().equals(operazioni.get(i).getCostanteAccettataSi())) {
				
				operazioni.remove(i);
				i--;				
			}
		}
		
		return operazioni;
		
	}
	
	
	/**
	 * Modifica una lista operazioni affinchè ci siano solo i pagamenti
	 * @param lista la lista di operazioni da modificare
	 * @return la lista di operazioni modificata, null altrimenti
	 */
	public ArrayList<Operazione> getOperazioniPagamentoVilualizzare(ArrayList<Operazione> lista){
		
		for(int i=0; i<lista.size(); i++) {
			
			if(Double.parseDouble(lista.get(i).getImporto())>0) {
				
				lista.remove(i);
				i--;				

			}
		}
		
		return lista;
	}
	
	/**
	 * Modifica una lista operazioni affinchè ci siano solo gli accrediti
	 * @param lista la lista di operazioni da modificare
	 * @return la lista di operazioni modificata, null altrimenti
	 */
	public ArrayList<Operazione> getOperazioniAccreditoVilualizzare(ArrayList<Operazione> lista){
		
		for(int i=0; i<lista.size(); i++) {
			
			if(Double.parseDouble(lista.get(i).getImporto())<0) {
				
				lista.remove(i);
				i--;				

			}
		}
		
		return lista;
	}

	



}
