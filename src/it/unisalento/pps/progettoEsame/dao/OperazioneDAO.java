package it.unisalento.pps.progettoEsame.dao;

import java.util.ArrayList;
import java.util.Iterator;

import it.unisalento.pps.progettoEsame.dbConnection.DbConnection;
import it.unisalento.pps.progettoEsame.model.Operazione;


/**
 * Ottiene i dati di un'operazione dal database
 * */
public class OperazioneDAO {
	
	private static OperazioneDAO instance;
	
	public static synchronized OperazioneDAO getInstance() {
		
		if(instance == null)
			
			instance = new OperazioneDAO();
		
		return instance;
	}
	
	
	/**
	 * Inserisce nel database una operazione
	 * @param operazione è l'oggetto Operazione da inserire
	 * */
	public boolean salvaOperazione(Operazione operazione) {
		
		
		boolean esito=DbConnection.getInstance().eseguiAggiornamento("INSERT INTO operazione VALUES (NULL, '"+operazione.getData()+"', '"+operazione.getImporto()+"', '"+operazione.getDescrizione()+"', '"+operazione.getAccettata()+"', '"+operazione.getDataAccettazione()+"','"+operazione.getCodCassiere()+"','"+operazione.getCodContoCorrente()+"','"+operazione.getCodCartaPrepagata()+"') ");
		
		System.out.println("INSERT INTO operazione VALUES (NULL, '"+operazione.getData()+"', '"+operazione.getImporto()+"', '"+operazione.getDescrizione()+"', '"+operazione.getAccettata()+"', '"+operazione.getDataAccettazione()+"','"+operazione.getCodCassiere()+"','"+operazione.getCodContoCorrente()+"','"+operazione.getCodCartaPrepagata()+"') ");
		
		return esito;
	}
	
	
	/**
	 * Restituisce un arrayList di Operazioni bancarie usando un Conto Corrente
	 * @param contoCorrente l'identificativo del conto corrente per cui si vogliono trovare le operazioni
	 * @return un ArrayList delle operazioni di un conto corrente
	 */
	public ArrayList<Operazione> getOperazioniDaContoCorrente(String contoCorrente){
		
		//risultato contine il risultato della query
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM operazione WHERE Cod_c_Corr="+contoCorrente);
		
		ArrayList<Operazione> listaOperazioni = new ArrayList<Operazione>();    //creo un ArrayList di operazioni bancarie
		
		if(risultato.size()==0)
			
			return null;
		
		Iterator<String[]> iteratore = risultato.iterator();
		
		while(iteratore.hasNext()){
			
			String[] riga = iteratore.next();
			
			Operazione operazione = new Operazione();

			operazione.setIdOperazione(riga[0]);
			operazione.setdata(riga[1]);
			operazione.setImporto(riga[2]);
			operazione.setDescrizione(riga[3]);
			operazione.setAccetata(riga[4]);
			operazione.setDataAccettazione(riga[5]);
			operazione.setCodCassiere(riga[6]);
			operazione.setCodContoCorrente(riga[7]);
			operazione.setCodCartaPrepagata(riga[8]);			

			listaOperazioni.add(operazione);
		}
		
		
		/*
		for(Operazione oper : listaOperazioni) {
			
			System.out.println("\nID_operazione: "+oper.getIdOperazione());
			System.out.println("Data: "+oper.getData());
			System.out.println("Importo: "+oper.getImporto());
			System.out.println("Descrizione: "+oper.getDescrizione());
			System.out.println("Acettata: "+oper.getAccettata());
			System.out.println("Data_accettazione: "+oper.getDataAccettazione());
			System.out.println("Cod_Cassiere: "+oper.getCodCassiere());
			System.out.println("Cod conto corrente: "+oper.getCodContoCorrente());
			System.out.println("Cod_carta prepagata: "+oper.getCodCartaPrepagata()+"\n\n");
			
					
		}
		
		*/

			
		return listaOperazioni;

	}
	
	
	/**
	 * Restituisce un arrayList di Operazioni bancarie usando una Carta Prepagata
	 * @param cartaPrepagata l'identificativo del conto corrente per cui si vogliono trovare le operazioni
	 * @return un ArrayList delle operazioni di una Carta Prepagata
	 */
	public ArrayList<Operazione> getOperazioniDaCartaPrepagata(String cartaPrepagata){
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM operazione WHERE Cod_c_Prep='"+cartaPrepagata+"'");
		
		ArrayList<Operazione> listaOperazioni = new ArrayList<Operazione>();    //creo un ArrayList di operazioni bancarie
		
		if(risultato.size()==0)
			
			return null;
		
		Iterator<String[]> iteratore = risultato.iterator();
		
		while(iteratore.hasNext()){
			
			String[] riga = iteratore.next();
			
			Operazione operazione = new Operazione();

			operazione.setIdOperazione(riga[0]);
			operazione.setdata(riga[1]);
			operazione.setImporto(riga[2]);
			operazione.setDescrizione(riga[3]);
			operazione.setAccetata(riga[4]);
			operazione.setDataAccettazione(riga[5]);
			operazione.setCodCassiere(riga[6]);
			operazione.setCodContoCorrente(riga[7]);
			operazione.setCodCartaPrepagata(riga[8]);			

			listaOperazioni.add(operazione);
		}
		
		
		/*
		for(Operazione oper : listaOperazioni) {
			
			System.out.println("\nID_operazione: "+oper.getIdOperazione());
			System.out.println("Data: "+oper.getData());
			System.out.println("Importo: "+oper.getImporto());
			System.out.println("Descrizione: "+oper.getDescrizione());
			System.out.println("Acettata: "+oper.getAccettata());
			System.out.println("Data_accettazione: "+oper.getDataAccettazione());
			System.out.println("Cod_Cassiere: "+oper.getCodCassiere());
			System.out.println("Cod conto corrente: "+oper.getCodContoCorrente());
			System.out.println("Cod_carta prepagata: "+oper.getCodCartaPrepagata()+"\n\n");
			
					
		}
		
		*/

			
		return listaOperazioni;
		
	}
	
	/**
	 * Accetta o non accetta un'operazione bancaria
	 * @param idCassiere l'identificativo del cassiere che effettua l'accettazione
	 * @param idOperazione l'identificativo dell'operazione da accettare
	 * @param accettata la Stringa che contiene il valore se si vuole accettare o meno l'operazione
	 * @param data la Stringa data dell'avvenuta accettazione
	 */
	public void accettaOperazione(String idCassiere, String idOperazione, String accettata, String data) {
		
		boolean esito=DbConnection.getInstance().eseguiAggiornamento("UPDATE operazione SET Accettata = '"+accettata+"', Data_accettazione = '"+data+"', Cod_Cassiere = '"+idCassiere+"' WHERE `operazione`.`ID_Operazione` = "+idOperazione+"");
		
	}
	

}
