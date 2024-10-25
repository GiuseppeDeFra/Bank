package it.unisalento.pps.progettoEsame.business;

import it.unisalento.pps.progettoEsame.model.BolloAuto;
import it.unisalento.pps.progettoEsame.model.Data;
import it.unisalento.pps.progettoEsame.model.ListaBolliAuto;

/**
 * Gestisce un sistema per il bollo auto
 * */
public class SistemaBollo {
	
	private static SistemaBollo instance;
	
	public static synchronized SistemaBollo getInstance() {
		
		if(instance == null)
			
			instance = new SistemaBollo();
		
		return instance;
	}
	
	/**
	 * Registra un Bollo Auto usando il Conto Corrente
	 * @param importo l'importo del bollo
	 * @param contoCorrente l'identificativo del conto Corrente a cui intestare il pagamento
	 * @param targa la targa della macchina
	 * @param marca la marca della macchina
	 * @param modello il modello della macchina
	 * @param cilindrata la cilindrata della macchina
	 * @param Kwatt i kwatt della macchina
	 * @param email l'email del cliente
	 * @param codCliente l'identificativo del cliente
	 * @param codFiliale l'identificativo della filiale a cui è registrato il cliente
	 * @param codBanca l'identificativo della banca della filiale
	 * */
	public void registraBolloContoCorrente(String importo, String contoCorrente, String targa, String marca, String modello, String cilindrata, String Kwatt, String email, String codCliente, String codFiliale, String codBanca) {
		
		ListaBolliAuto listaBolli = new ListaBolliAuto();
		
		BolloAuto bolloAuto = new BolloAuto();
		
		bolloAuto.setTarga(targa);
		bolloAuto.setMarca(marca);
		bolloAuto.setModello(modello);
		bolloAuto.setCilindrata(cilindrata);
		bolloAuto.setKwatt(Kwatt);
		bolloAuto.setImporto(importo);
		bolloAuto.setCodCliente(codCliente);
		bolloAuto.setCodFiliale(codFiliale);
		
		Data data=new Data();
		String oggi=data.getDataOggi();
		bolloAuto.setData(oggi);
		
		bolloAuto.setCodBanca(codBanca);		
		
		bolloAuto.setCodContoCorrente(contoCorrente);
		
		listaBolli.addBolloAuto(bolloAuto);
		
		SistemaOperazione.getInstance().registraPagamentoContoCorrente(importo, contoCorrente, email, "Pagamento Bollo Auto con Targa: "+targa, oggi);
		
	}
	
	
	/**
	 * Registra un Bollo Auto usando la Carta Prepagata
	 * @param importo l'importo del bollo
	 * @param cartaPrepagata l'identificativo della Carta Prepagata a cui intestare il pagamento
	 * @param targa la targa della macchina
	 * @param marca la marca della macchina
	 * @param modello il modello della macchina
	 * @param cilindrata la cilindrata della macchina
	 * @param Kwatt i kwatt della macchina
	 * @param email l'email del cliente
	 * @param codCliente l'identificativo del cliente
	 * @param codFiliale l'identificativo della filiale a cui è registrato il cliente
	 * @param codBanca l'identificativo della banca della filiale
	 * */
	public void registraBolloCartaPrepagata(String importo, String cartaPrepagata, String targa, String marca, String modello, String cilindrata, String Kwatt, String email, String codCliente, String codFiliale, String codBanca) {
		
		ListaBolliAuto listaBolli = new ListaBolliAuto();
		
		BolloAuto bolloAuto = new BolloAuto();
		
		bolloAuto.setTarga(targa);
		bolloAuto.setMarca(marca);
		bolloAuto.setModello(modello);
		bolloAuto.setCilindrata(cilindrata);
		bolloAuto.setKwatt(Kwatt);
		bolloAuto.setImporto(importo);
		bolloAuto.setCodCliente(codCliente);
		bolloAuto.setCodFiliale(codFiliale);
		
		Data data=new Data();
		String oggi=data.getDataOggi();
		bolloAuto.setData(oggi);
		
		bolloAuto.setCodBanca(codBanca);		
		
		bolloAuto.setCodCartaPrepagata(cartaPrepagata);
		
		listaBolli.addBolloAuto(bolloAuto);
		
		SistemaOperazione.getInstance().registraPagamentoCartaPrepagata(importo, cartaPrepagata, email, "Pagamento Bollo Auto con Targa: "+targa, oggi);
				
	}

	


}
