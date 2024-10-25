package it.unisalento.pps.progettoEsame.model;

import java.util.ArrayList;

import it.unisalento.pps.progettoEsame.dao.CartaPrepagataDAO;
import it.unisalento.pps.progettoEsame.model.CartaPrepagata;


/**
 * Gestisce una Lista di Carte Prepagate
 * */
public class ListaCartePrepagate {
	
	private ArrayList<CartaPrepagata> listacarte = new ArrayList<CartaPrepagata>();

	/**
	 * Aggiunge un Carta Prepagata nella lista
	 * @param cartaprepagata la Carta Prepagata da inserire
	 * */
	public void addInLista(CartaPrepagata cartaprepagata) {
		
		this.listacarte.add(cartaprepagata);
		return;
		
	}
	
	/**
	 * Aggiunge una Carta Prepagata nel database
	 * @param cartaprepagata la Carta Prepagata da aggiungere nel database
	 * @return esito l'esito della registrazione 
	 * */
	public boolean addCartaPrepagata(CartaPrepagata cartaprepagata) {
		
		boolean esito;
		esito = CartaPrepagataDAO.getInstance().salvaCartaPrepagata(cartaprepagata);
		return esito;
	}
	
	/**
	 * carica la lista di carte prepagate di un cliente
	 * @param idCliente la Stringa identificativo del cliente
	 * */
	private void caricaListaCartePrepagate(String idCliente) {
		
		listacarte=CartaPrepagataDAO.getInstance().getCartePrepagate(idCliente);
	}
	
	
	/**
	 * Ritorna una lista di carte prepagate di un cliente
	 * @param idCliente la Stringa identificativo del cliente
	 * @return la ArrayList di Carte Prepagate
	 * */
	public ArrayList<CartaPrepagata> getListaCartePrepagateCliente(String idCliente){
		
		caricaListaCartePrepagate(idCliente);
		return listacarte; 
	}
	
	/**
	 * Ritorna un'arrayList di Stringhe degli identificativi delle carte prepagate
	 * @param idCliente la Stringa contenente l'identificativo del cliente
	 * @return un ArrayList di Stringhe contenente gli identificativi delle carte prepagate del cliente
	 * */
	public ArrayList<String> getIdCartePrepagateCliente(String idCliente){
		
		ArrayList<String> lista = new ArrayList<String>();
		
		listacarte = getListaCartePrepagateCliente(idCliente);
		
		for(int i=0; i<listacarte.size();i++) {
			
			lista.add(listacarte.get(i).getIdProdotto());
		}
		
		return lista;
		
	}
	
	
	/**
	 * Ritorna una lista di carte prepagate di una filiale
	 * @param idFiliale la Stringa identificativo della Filiale
	 * @return la ArrayList di Carte Prepagate
	 * */
	public ArrayList<CartaPrepagata> getListaContiCorrentiFiliale(String idFiliale){
		
		listacarte = CartaPrepagataDAO.getInstance().getCartePrepagateFiliale(idFiliale);
		return listacarte; 
	}

		
	/**
	 * Ritorna un'arrayList di Stringhe degli identificativi delle carte Prepagate
	 * @param idFiliale la Stringa contenente l'identificativo della Filiale
	 * @return un ArrayList di Stringhe contenente gli identificativi delle Carte Prepagate della filiale
	 * */
	public ArrayList<String> getIdCartePrepagateFiliale(String idFiliale){
		
		ArrayList<String> lista = new ArrayList<String>();
		
		listacarte = getListaContiCorrentiFiliale(idFiliale);
		
		for(int i=0; i<listacarte.size();i++) {
			
			lista.add(listacarte.get(i).getIdProdotto());
		}
		
		return lista;
		
	}
	
	
	/**
	 * Cerca un Carta Prepagata avente l'idCartaPrepagata corrispondente
	 * @param idCartaPrepagata l'identifiacativo della Carta Prepagata da cercare
	 * @return una Carta Prepagata piena, altrimenti NULL
	 */
	public CartaPrepagata getCartaPrepagataDaIdCarta(String idCartaPrepagata) {
		
		return CartaPrepagataDAO.getInstance().cercaCartaPrepagata(idCartaPrepagata);
		
	}
	
	
	/**
	 * Aggiorna il saldo di una carta prepagata
	 * @param idCartaPrepagata l'identificativo della carta prepagata da aggiornare
	 * @param importo l'importo da agiiungere alla carta prepagata
	 * @param data la data dell'avvenuto aggiornamento
	 * @return TRUE se l'aggiornamento è stato eseguito, FALSE altrimenti
	 */
	public boolean aggiornaSaldo(String idCartaPrepagata, String importo, String data) {
		
		CartaPrepagata carta = new CartaPrepagata();
		double saldo;
		
		carta = this.getCartaPrepagataDaIdCarta(idCartaPrepagata);
		
		saldo = Double.parseDouble(carta.getSaldo())+Double.parseDouble(importo);
		
		boolean esito = CartaPrepagataDAO.getInstance().aggiornaSaldo(idCartaPrepagata,String.valueOf(saldo), data);
		
		return esito;
	}


	/**
	 * Restituisce la Stringa dell'ideficatore del cliente che ha la Carta Prepagata
	 * @param idCartaPrepagata l'identificativo della Carta Prepagata
	 * @return la Stringa contenente l'identificatore del cliente che ha la Carta Prepagata, NULL altrimneti
	 */
	public String getIdCliente(String idCartaPrepagata) {
		
		return CartaPrepagataDAO.getInstance().getIdCliente(idCartaPrepagata);
		
	}

	
}
