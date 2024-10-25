package it.unisalento.pps.progettoEsame.business;

import java.util.ArrayList;

import it.unisalento.pps.progettoEsame.business.SistemaAccesso;
import it.unisalento.pps.progettoEsame.business.SistemaOperazione;
import it.unisalento.pps.progettoEsame.model.CartaPrepagata;
import it.unisalento.pps.progettoEsame.model.Catalogo;
import it.unisalento.pps.progettoEsame.model.Cliente;
import it.unisalento.pps.progettoEsame.model.ContoCorrente;
import it.unisalento.pps.progettoEsame.model.ListaCartePrepagate;
import it.unisalento.pps.progettoEsame.model.ListaContiCorrenti;
import it.unisalento.pps.progettoEsame.view.FrameOpDispositive;
import it.unisalento.pps.progettoEsame.view.FrameOpInformative;
import it.unisalento.pps.progettoEsame.view.FrameVisualizzaOperazioni;
//import it.unisalento.pps.progettoEsame.model.Data;


public class SistemaCliente {
	
	private Cliente cliente = SistemaAccesso.getInstance().getCliente();
	private ListaContiCorrenti listaContiCorrenti = new ListaContiCorrenti();
	private ListaCartePrepagate listaCartePrepagate = new ListaCartePrepagate();
	
	
	private static SistemaCliente instance;
	
	public static synchronized SistemaCliente getInstance() {
		
		if(instance == null)
			
			instance = new SistemaCliente();
		
		return instance;
	}

	public void setCliente() {
		
		cliente = SistemaAccesso.getInstance().getCliente();
		//cliente=accesso.getCliente();
		
	}
	
	/**
	 * Avvia il frame operazioni dispositive
	 * */
	public void avviaOperazioniDispositive() {
		
		setCliente();
		Catalogo catalogo = new Catalogo();
		
		boolean contoCorrente;
		boolean cartaPrepagata;
		boolean bolloAuto;
		boolean ricaricaCell;
		
		SistemaBanca sistemaBanca = new SistemaBanca();
		
		
		
		catalogo = sistemaBanca.getCatalogoDaFiliale(cliente.getCodiceFiliale());
		
		
		if(catalogo.getContoCorrente().equals(catalogo.getCostanteDisponibile())) {
			
			contoCorrente = true;
			
		}else
			
			contoCorrente = false;
		
		if(catalogo.getCartaPrepagata().equals(catalogo.getCostanteDisponibile())) {
			
			cartaPrepagata = true;
		}else
			cartaPrepagata = false;
		
		if(catalogo.getBolloAuto().equals(catalogo.getCostanteDisponibile())) {
			
			bolloAuto = true;
		
		}else
			bolloAuto= false;
		
		if(catalogo.getRicaricaCellulare().equals(catalogo.getCostanteDisponibile())) {
			
			ricaricaCell=true;
		}else
			ricaricaCell=false;
		
		
		FrameOpDispositive frameOpDispositive = new FrameOpDispositive(contoCorrente,cartaPrepagata,bolloAuto,ricaricaCell,listaContiCorrenti.getIdContiCorrentiCliente(cliente.getUsername()),listaCartePrepagate.getIdCartePrepagateCliente(cliente.getUsername()));
		
	}
	

	
	/**
	 * Registra un versamento usando il Conto Corrente
	 * @param importo è l'importo da versare sul conto corrente
	 * @param contoCorrente è l'identificativo del conto corrente
	 * @return ritorna 0 se la registrazione è avvenuta con successo, 1 altrimenti
	 * */
	public int registraVersamentoContoCorrente(String importo, String contoCorrente) {
		
		if(Double.parseDouble(importo)<0)
			
			return 1;
		
		SistemaOperazione.getInstance().registraVersamentoContoCorrente(importo,contoCorrente,cliente.getEmail());
		
		return 0;
		
	}
	
	/**
	 * Registra un prelievo usando il Conto Corrente
	 * @param importo è l'importo da prelevare dal conto corrente
	 * @param contoCorrente è l'identificativo del conto corrente
	 * @return ritorna 0 se la registrazione è avvenuta con successo, 1 altrimenti
	 * */
	public int registraPrelievoContoCorrente(String importo, String contoCorrente) {
		
		if(Double.parseDouble(importo)<0)
			
			return 1;
		
		SistemaOperazione.getInstance().registraPrelievoContoCorrente(importo,contoCorrente,cliente.getEmail());
		
		return 0;
	
		
	}
	
	/**
	 * Registra un Bollo Auto usando il Conto Corrente
	 * @param importo è l'importo del Bollo auto da pagare
	 * @param contoCorrente è l'identificativo del conto corrente
	 * @param targa è la targa dell'auto
	 * @param marca è la marca dell'auto
	 * @param modello è il modello della macchina
	 * @param cilindrata è la cilindrata della macchina 
	 * @param Kwatt sono i kwatt della macchina
	 * @return 0 se la registrazione è avvenuta con successo, 1 altrimenti
	 * */
	public int registraBolloContoCorrente(String importo, String contoCorrente, String targa, String marca, String modello, String cilindrata, String Kwatt) {
	
		if(Double.parseDouble(importo)<0)
			
			return 1;
		
		SistemaBollo.getInstance().registraBolloContoCorrente(importo, contoCorrente, targa, marca, modello, cilindrata, Kwatt, cliente.getEmail(), cliente.getUsername(), cliente.getCodiceFiliale(), SistemaBanca.getInstance().getIdBancaDaIdFiliale(cliente.getCodiceFiliale()));

		return 0;		
	}
	
	
	/**
	 * Registra una ricarica Cellullare usando il Conto Corrente
	 * @param importo è l'importo da ricaricare
	 * @param contoCorrente è l'identificativo del conto corrente
	 * @param cellulare è il numero di cellulare da ricaricare
	 * @param operatore è l'operatore telefonico del cellulare
	 * @return 0 se la registrazione è avvenuta con successo, 1 altrimenti
	 * */
	public int registraRicaricaCellContoCorrente(String importo, String contoCorrente, String cellulare, String operatore) {
		
		if(Double.parseDouble(importo)<0)
			
			return 1;
		
		SistemaRicaricaCell.getInstance().registraRicaricaCellContoCorrente(cellulare, operatore, importo, cliente.getUsername(), cliente.getEmail(), cliente.getCodiceFiliale(), SistemaBanca.getInstance().getIdBancaDaIdFiliale(cliente.getCodiceFiliale()), contoCorrente);

		return 0;		


	}
	
	
	
	
	/**
	 * Registra un versamento usando la Carta Prepagata
	 * @param importo è l'importo da versare sulla carta prepagata
	 * @param cartaPrepagata è l'identificativo della carta prepagata
	 * @return ritorna 0 se la registrazione è andata a buon fine, 1 altrimenti
	 * */
	public int registraVersamentoCartaPrepagata(String importo, String cartaPrepagata) {
		
		if(Double.parseDouble(importo)<0)
			
			return 1;
		
		SistemaOperazione.getInstance().registraVersamentoCartaPrepagata(importo, cartaPrepagata, cliente.getEmail());
		
		return 0;
		
	}
	
	/**
	 * Registra un prelievo usando il Carta Prepagata
	 * @param importo è l'importo da prelevare dalla carta prepagata
	 * @param contoCorrente è l'identificativo della carta prepagata
	 * @return ritorna 0 se la registrazione è avvenuta con successo, 1 altrimenti
	 * */
	public int registraPrelievoCartaPrepagata(String importo, String cartaPrepagata) {
		
		if(Double.parseDouble(importo)<0)
			
			return 1;
		
		SistemaOperazione.getInstance().registraPrelievoCartaPrepagata(importo, cartaPrepagata, cliente.getEmail());
		
		return 0;
		
	}
	
	/**
	 * Registra un Bollo Auto usando la Carta Prepagata
	 * @param importo è l'importo del Bollo auto da pagare
	 * @param cartaPrepagata è l'identificativo della carta prepagata
	 * @param targa è la targa dell'auto
	 * @param marca è la marca dell'auto
	 * @param modello è il modello della macchina
	 * @param cilindrata è la cilindrata della macchina 
	 * @param Kwatt sono i kwatt della macchina
	 * @return 0 se la registrazione è avvenuta con successo, 1 altrimenti
	 * */
	public int registraBolloCartaPrepagata(String importo, String cartaPrepagata, String targa, String marca, String modello, String cilindrata, String Kwatt) {
		
		if(Double.parseDouble(importo)<0)
			
			return 1;
		
		SistemaBollo.getInstance().registraBolloCartaPrepagata(importo, cartaPrepagata, targa, marca, modello, cilindrata, Kwatt, cliente.getEmail(), cliente.getUsername(), cliente.getCodiceFiliale(), SistemaBanca.getInstance().getIdBancaDaIdFiliale(cliente.getCodiceFiliale()));

		return 0;		

		
	}
	
	
	/**
	 * Registra una ricarica Cellullare usando la Carta Prepagata
	 * @param importo è l'importo da ricaricare
	 * @param contoCorrente è l'identificativo della Carta Prepagata
	 * @param cellulare è il numero di cellulare da ricaricare
	 * @param operatore è l'operatore telefonico del cellulare
	 * @return 0 se la registrazione è avvenuta con successo, 1 altrimenti
	 * */
	public int registraRicaricaCellCartaPrepagata(String importo, String cartaPrepagata, String cellulare, String operatore) {
		
		if(Double.parseDouble(importo)<0)
			
			return 1;
		
		SistemaRicaricaCell.getInstance().registraRicaricaCellCartaPrepagata(cellulare, operatore, importo, cliente.getUsername(), cliente.getEmail(), cliente.getCodiceFiliale(), SistemaBanca.getInstance().getIdBancaDaIdFiliale(cliente.getCodiceFiliale()), cartaPrepagata);

		return 0;		


	}
	
	
	/**
	 * Avvia il frame operazioni informative
	 * */
	public void avviaOperazioniInformative() {
		
		setCliente();
		Catalogo catalogo = new Catalogo();
		
		boolean contoCorrente;
		boolean cartaPrepagata;
		
		SistemaBanca sistemaBanca = new SistemaBanca();
		
		
		
		catalogo = sistemaBanca.getCatalogoDaFiliale(cliente.getCodiceFiliale());
		
		
		if(catalogo.getContoCorrente().equals(catalogo.getCostanteDisponibile())) {
			
			contoCorrente = true;
			
		}else
			
			contoCorrente = false;
		
		if(catalogo.getCartaPrepagata().equals(catalogo.getCostanteDisponibile())) {
			
			cartaPrepagata = true;
		}else
			cartaPrepagata = false;
		
	
		
		FrameOpInformative frameOpInformative = new FrameOpInformative(contoCorrente,cartaPrepagata,listaContiCorrenti.getIdContiCorrentiCliente(cliente.getUsername()),listaCartePrepagate.getIdCartePrepagateCliente(cliente.getUsername()));
		
	}
	
	
	/**
	 * REstituisce la Stringa del saldo di un conto corrente
	 * @param idContoCorrente l'identificativo del conto corrente da cercare
	 * @return la Stringa descrizione del saldo
	 */
	public String getSaldoContoCorrente(String idContoCorrente) {
		
		ListaContiCorrenti lista = new ListaContiCorrenti();
		ContoCorrente conto = new ContoCorrente();
		
		conto = lista.getContoCorrenteDaIdConto(idContoCorrente);
		
		String s= "Saldo: "+conto.getSaldo()+"€"+"   In Data: "+conto.getDataSaldo();
		
		return s;		
		
	}
	
	
	/**
	 * Rastituisce la Stringa del saldo di una carta prepagata
	 * @param idCartaPrepagata l'identificativo della carta prepagata
	 * @return la Stringa descrizione del saldo
	 */
	public String getSaldoCartaPrepagata(String idCartaPrepagata) {
		
		ListaCartePrepagate lista = new ListaCartePrepagate();
		
		CartaPrepagata carta = new CartaPrepagata();
		
		carta = lista.getCartaPrepagataDaIdCarta(idCartaPrepagata);
		
		String s = "Saldo: "+carta.getSaldo()+"€"+"   In Data: "+carta.getDataSaldo();
		
		return s;
		
	}
	
	
	/**
	 * Avvia Visualizza Operazioni
	 */
	public void avviaVisualizzaOperazioni() {
		
		setCliente();
		
		FrameVisualizzaOperazioni frame = new FrameVisualizzaOperazioni(cliente.getUsername(),listaContiCorrenti.getIdContiCorrentiCliente(cliente.getUsername()),listaCartePrepagate.getIdCartePrepagateCliente(cliente.getUsername()));
	}

	

	
}
