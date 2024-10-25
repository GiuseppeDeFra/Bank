package it.unisalento.pps.progettoEsame.model;

import java.util.ArrayList;


import it.unisalento.pps.progettoEsame.dao.ContoCorrenteDAO;

/**
 * Gestisce una Lista di Conti correnti
 * */
public class ListaContiCorrenti {
	
	private ArrayList<ContoCorrente> listaconti = new ArrayList<ContoCorrente>();
	
	/**
	 * Aggiunge un Conto Corrente nella lista
	 * @param contocorrente il contocorrente da inserire
	 * */
	public void addInLista(ContoCorrente contocorrente) {
		
		this.listaconti.add(contocorrente);
		return;
		
	}
	
	/**
	 * Aggiunge un Conto Corrente nel database
	 * @param contocorrente il ContoCorrente da aggiungere nel database
	 * @return esito l'esito della registrazione 
	 * */
	public boolean addContoCorrente(ContoCorrente contocorrente) {
		
		boolean esito;
		esito = ContoCorrenteDAO.getInstance().salvaContoCorrente(contocorrente);
		return esito;
	}
	
	/**
	 * carica la lista di conti correnti di un cliente
	 * @param idCliente la Stringa identificativo del cliente
	 * */
	private void caricaListaContiCorrenti(String idCliente) {
		
		listaconti=ContoCorrenteDAO.getInstance().getContiCorrenti(idCliente);
	}
	
	
	/**
	 * Ritorna una lista di conti correnti di un cliente
	 * @param idCliente la Stringa identificativo del cliente
	 * @return la ArrayList di Conti Correnti
	 * */
	public ArrayList<ContoCorrente> getListaContiCorrentiCliente(String idCliente){
		
		caricaListaContiCorrenti(idCliente);
		return listaconti; 
	}
	
	/**
	 * Ritorna un'arrayList di Stringhe degli identificativi dei conti correnti
	 * @param idCliente la Stringa contenente l'identificativo del cliente
	 * @return un ArrayList di Stringhe contenente gli identificativi dei conti correnti del cliente
	 * */
	public ArrayList<String> getIdContiCorrentiCliente(String idCliente){
		
		ArrayList<String> lista = new ArrayList<String>();
		
		listaconti = getListaContiCorrentiCliente(idCliente);
		
		for(int i=0; i<listaconti.size();i++) {
			
			lista.add(listaconti.get(i).getIdProdotto());
		}
		
		return lista;
		
	}
	
	
	/**
	 * Ritorna una lista di conti correnti di una filiale
	 * @param idFiliale la Stringa identificativo della Filiale
	 * @return la ArrayList di Conti Correnti
	 * */
	public ArrayList<ContoCorrente> getListaContiCorrentiFiliale(String idFiliale){
		
		listaconti = ContoCorrenteDAO.getInstance().getContiCorrentiFiliale(idFiliale);
		return listaconti; 
	}

	
	
	
	
	/**
	 * Ritorna un'arrayList di Stringhe degli identificativi dei conti correnti
	 * @param idFiliale la Stringa contenente l'identificativo della Filiale
	 * @return un ArrayList di Stringhe contenente gli identificativi dei conti correnti della filiale
	 * */
	public ArrayList<String> getIdContiCorrentiFiliale(String idFiliale){
		
		ArrayList<String> lista = new ArrayList<String>();
		
		listaconti = getListaContiCorrentiFiliale(idFiliale);
		
		for(int i=0; i<listaconti.size();i++) {
			
			lista.add(listaconti.get(i).getIdProdotto());
			
			System.out.println(listaconti.get(i).getIdProdotto());
		}
		
		return lista;
		
	}
	
	/**
	 * Cerca un Conto Corrente avente l'idContoCorrente corrispondente
	 * @param idContoCorrente l'identifiacativo del Conto Corrente da cercare
	 * @return un ContoCorrente pieno, altrimenti NULL
	 */
	public ContoCorrente getContoCorrenteDaIdConto(String idContoCorrente) {
		
		return ContoCorrenteDAO.getInstance().cercaContoCorrente(idContoCorrente);
		
	}
	
	
	/**
	 * Aggiorna il saldo di un conto corrente
	 * @param idContoCorrente l'identificativo del conto corrente da aggiornare
	 * @param importo l'importo da agiiungere al conto corrente
	 * @param data la data dell'avvenuto aggiornamento
	 * @return TRUE se l'aggiornamento è stato eseguito, FALSE altrimenti
	 */
	public boolean aggiornaSaldo(String idContoCorrente, String importo, String data) {
		
		System.out.println("aggiorna saldo il lista conto corr = ");
		
		ContoCorrente conto = new ContoCorrente();
		
		conto=this.getContoCorrenteDaIdConto(idContoCorrente);
		
		double saldo;
		
		saldo = Double.parseDouble(conto.getSaldo());
		
		System.out.println(" saldo = "+String.valueOf(saldo));
		
		double saldo_due= +Double.parseDouble(importo);
		
		System.out.println(" saldo_due = "+String.valueOf(saldo_due));
		
		saldo = saldo + saldo_due;
		
		System.out.println(" il nuovo saldo = "+String.valueOf(saldo));
		
		boolean esito = ContoCorrenteDAO.getInstance().aggiornaSaldo(idContoCorrente,String.valueOf(saldo), data);
		
		return esito;
	}
	
	/**
	 * Restituisce la Stringa dell'ideficatore del cliente che ha il Conto Corrente
	 * @param idContoCorrente l'identificativo del Conto Corrente
	 * @return la Stringa contenente l'identificatore del cliente che ha il Conto Corrente, NULL altrimneti
	 */
	public String getIdCliente(String idContoCorrente) {
		
		return ContoCorrenteDAO.getInstance().getIdCliente(idContoCorrente);
		
	}


}
