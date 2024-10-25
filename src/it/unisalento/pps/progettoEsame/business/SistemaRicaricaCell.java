package it.unisalento.pps.progettoEsame.business;

import it.unisalento.pps.progettoEsame.model.Data;
import it.unisalento.pps.progettoEsame.model.ListaRicaricaCell;
import it.unisalento.pps.progettoEsame.model.RicaricaCellulare;

/**
 * Gestisce un sistema per le ricariche cellulari
 * */
public class SistemaRicaricaCell {

	private static SistemaRicaricaCell instance;
	
	public static synchronized SistemaRicaricaCell getInstance() {
		
		if(instance == null)
			
			instance = new SistemaRicaricaCell();
		
		return instance;
	}
	
	
	
	/**
	 * Registra una ricarica Cellulare usando il Conto Corrente
	 * @param cellulare il cellulare da ricaricare
	 * @param operatore l'operatore telefonico del cellulare
	 * @param importo l'importo da ricaricare
	 * @param codCliente l'identificativo del cliente
	 * @param email l'email del cliente
	 * @param codFiliale l'identificativo della filiale
	 * @param codBanca l'identificativo della banca
	 * @param contoCorrente l'identificativo del conto corrente che si vuole usare per la ricarica  
	 * */
	public void registraRicaricaCellContoCorrente(String cellulare, String operatore, String importo, String codCliente, String email, String codFiliale, String codBanca, String contoCorrente ) {
		
		ListaRicaricaCell listaRicariche = new ListaRicaricaCell();
		RicaricaCellulare ricaricaCell = new RicaricaCellulare();
		
		ricaricaCell.setCellulare(cellulare);
		ricaricaCell.setOperatore(operatore);
		ricaricaCell.setImporto(importo);
		ricaricaCell.setCodCliente(codCliente);
		ricaricaCell.setCodFiliale(codFiliale);
		
		Data data=new Data();
		String oggi=data.getDataOggi();
		ricaricaCell.setData(oggi);
		
		ricaricaCell.setCodBanca(codBanca);
		ricaricaCell.setCodContoCorrente(contoCorrente);
		
		listaRicariche.addRicaricaCellulare(ricaricaCell);
		
		SistemaOperazione.getInstance().registraPagamentoContoCorrente(importo, contoCorrente, email, "Pagamento Ricarica cellulare al numero: "+cellulare, oggi);
		
	}
	
	
	/**
	 * Registra una ricarica Cellulare usando la Carta Prepagata
	 * @param cellulare il cellulare da ricaricare
	 * @param operatore l'operatore telefonico del cellulare
	 * @param importo l'importo da ricaricare
	 * @param codCliente l'identificativo del cliente
	 * @param email l'email del cliente
	 * @param codFiliale l'identificativo della filiale
	 * @param codBanca l'identificativo della banca
	 * @param cartaPrepagata l'identificativo della carta prepagata che si vuole usare per la ricarica  
	 * */
	public void registraRicaricaCellCartaPrepagata(String cellulare, String operatore, String importo, String codCliente, String email, String codFiliale, String codBanca, String cartaPrepagata ) {
		
		ListaRicaricaCell listaRicariche = new ListaRicaricaCell();
		RicaricaCellulare ricaricaCell = new RicaricaCellulare();
		
		ricaricaCell.setCellulare(cellulare);
		ricaricaCell.setOperatore(operatore);
		ricaricaCell.setImporto(importo);
		ricaricaCell.setCodCliente(codCliente);
		ricaricaCell.setCodFiliale(codFiliale);
		
		Data data=new Data();
		String oggi=data.getDataOggi();
		ricaricaCell.setData(oggi);
		
		ricaricaCell.setCodBanca(codBanca);
		ricaricaCell.setCodCartaPrepagata(cartaPrepagata);
		
		listaRicariche.addRicaricaCellulare(ricaricaCell);
		
		SistemaOperazione.getInstance().registraPagamentoCartaPrepagata(importo, cartaPrepagata, email, "Pagamento Ricarica cellulare al numero: "+cellulare, oggi);
		
	}


	
}
