package it.unisalento.pps.progettoEsame.business;

import it.unisalento.pps.progettoEsame.model.Banca;
import it.unisalento.pps.progettoEsame.model.Direttore;
import it.unisalento.pps.progettoEsame.model.ListaBanche;
import it.unisalento.pps.progettoEsame.model.ListaDirettori;


/**
 * Gestisce le azioni di un Amministratore
 * */
public class SistemaAmministrativo {
	
	private static SistemaAmministrativo instance;
	
	public static synchronized SistemaAmministrativo getInstance() {
		
		if(instance == null)
			
			instance = new SistemaAmministrativo();
		
		return instance;
	}
	
	
	/**
	 * Crea una nuova banca e un nuovo direttore, con il nuovo direttore a capo della nuova banca 
	 * @param nomeBanca il nome della banca
	 * @param viaBanca la via della banca
	 * @param cittaBanca la citta della banca
	 * @param provinciaBanca la provincia della banca
	 * @param immagineUno una immagine della banca
	 * @param immagineDue una immagine della banca
	 * @param immagineTre una immagine della banca
	 * @param nomeDirettore il nome del nuovo direttore
	 * @param cognomeDirettore il cognome del nuovo direttore
	 * @param usernameDirettore l'username del nuovo direttore
	 * @param passwordDirettore la password del nuovo direttore
	 * @return 0 se è stato registrato tutto, 1 se la banca esiste già, 2 se il direttore esiste già, 3 errore durante la registrazione
	 * della banca, 4 errore durante la registrazione del direttore
	 * */
	public int CreaBanca(String nomeBanca, String viaBanca, String cittaBanca, String provinciaBanca, String immagineUno, String immagineDue, String immagineTre, String nomeDirettore, String cognomeDirettore, String usernameDirettore, String passwordDirettore) {
		
		Banca banca = new Banca();
		banca.setNome(nomeBanca);
		banca.setVia(viaBanca);
		banca.setCitta(cittaBanca);
		banca.setProvincia(provinciaBanca);
		banca.setCodDirettore(usernameDirettore);
		//banca.setInteressi("0");
		//banca.setDataInteressi("2019-01-01");
		//banca.setRicorrenza("0");				
		banca.setImmagineUno(immagineUno);
		banca.setImmagineDue(immagineDue);
		banca.setImmagineTre(immagineTre);
		//banca.setCodCatalogo("0");
		
		Direttore direttore = new Direttore();
		direttore.setNome(nomeDirettore);
		direttore.setCognome(cognomeDirettore);
		direttore.setUsername(usernameDirettore);
		direttore.setPassword(passwordDirettore);
		
		ListaDirettori listaDirettori = new ListaDirettori();
		
		ListaBanche listaBanche = new ListaBanche();
		
		//Se è stato trovato il direttore o la banca entra nella if
		if(listaBanche.trovataBanca(nomeBanca)||listaDirettori.trovatoDirettore(usernameDirettore)) {
			
			if(listaBanche.trovataBanca(nomeBanca))
				return 1;
			
			if(listaDirettori.trovatoDirettore(usernameDirettore))
				return 2;
			
			
		}else {
			
			if(!listaBanche.addBanca(banca))
				return 3;
			
			if(!listaDirettori.addDirettore(direttore))
				return 4;
			
			
		}
		
		return 0;
	}
	
	
	
	
	
	
	

}
