package it.unisalento.pps.progettoEsame.view.actionListener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import it.unisalento.pps.progettoEsame.view.MyFrame;
import it.unisalento.pps.progettoEsame.view.FrameCreaBanca;
import it.unisalento.pps.progettoEsame.view.FrameCreaFiliale;
import it.unisalento.pps.progettoEsame.view.FrameLogin;

import it.unisalento.pps.progettoEsame.business.SistemaAccesso;
import it.unisalento.pps.progettoEsame.business.SistemaCassiere;
import it.unisalento.pps.progettoEsame.business.SistemaCliente;

public class MenuListener implements ActionListener {
	
	private MyFrame homebancking;
	
	/** Costanti per il MENU FILE
	 * */
	public final static String MENU_FILE_LOGIN="Login";
	public final static String MENU_FILE_LOGOUT="Logout";
	public final static String MENU_FILE_REGISTRAZIONE="Registrazione";
	public final static String MENU_FILE_EXIT="Exit";
	
	/**
	 * Costanti per il MENU AMMINISTRATORE
	 * */
	public final static String MENU_AMMINISTRATORE_VIS_BANCHE="Visualizza_Banche";
	public final static String MENU_AMMINISTRATORE_VIS_RICHIESTE_REG="Visualizza_Richieste_Registrazioni";
	public final static String MENU_AMMINISTRATORE_CREA_BANCA="Crea_Banca";
	
	
	/**
	 * Costanti per il MENU DIRETTORE
	 * */
	public final static String MENU_DIRETTORE_VISUALIZZA_FILIALI="Visualizza_filiali";
	public final static String MENU_DIRETTORE_CREA_FILIALE="Crea_filiale";
	public final static String MENU_DIRETTORE_INSERISCI_CASSIERE="Inserisci_Cassiere";
	public final static String MENU_DIRETTORE_CREA_CATALOGO="Crea_Catalogo";
	public final static String MENU_DIRETTORE_IMPOSTA_INTERESSI="Imposta_interessi";
	
	/**
	 * Costanti per il MENU CASSIERE
	 * */
	public final static String MENU_CASSIERE_VISUAL_OPERAZIONI_CLIENTE="Visualizza_Operazioni_Cliente";
	public final static String MENU_CASSIERE_CONVALIDA_OPERAZIONI="Convalida_Operazioni";
	
	/**
	 * Costanti per il MENU CLIENTE
	 * */
	public final static String MENU_CLIENTE_VISUAL_OPERAZIONI="Visualizza_Operazioni";
	public final static String MENU_CLIENTE_OPERAZIONI_INFORMATIVE="Operazioni_Informative";
	public final static String MENU_CLIENTE_OPERAZIONI_DISPOSITIVE="Operazioni_Dispositive";
	
	public MenuListener(MyFrame homebancking) {
		
		this.homebancking=homebancking;
	}
	
	/**
	 * Devinisce le azioni da svolgere in base alle action definite nel MyFrame
	 **/
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getActionCommand();
		
		
		//* Se è stato premuto il PULSANTE LOGIN dal Menu File 
		if(src.equals(MENU_FILE_LOGIN)) {
			
			FrameLogin login=new FrameLogin("Login");
			
		}
		

	
		//* Se è stato premuto il PULSANTE LOGOUT dal Menu File
		if(src.equals(MENU_FILE_LOGOUT)) {
			
			SistemaAccesso.getInstance().Logout();   //Fai il Logout azzerando le variabili di SessionLogin
		}
		
		//* Se è stato premuto il PULSANTE REGISTRAZIONE dal Menu File
		if(src.equals(MENU_FILE_REGISTRAZIONE)) {	
			
			
			
		}
		

		//* Se è stato premuto il PULSANTE EXIT dal Menu File
		if(src.equals(MENU_FILE_EXIT)) {			
			
			System.exit(0);   //esci dal programma
			
			//System.out.println("Ho premuto exit");
		}
		
		
		/**AMMINISTRATORE*/
		
		if(src.equals(MENU_AMMINISTRATORE_CREA_BANCA)) {	
			
			FrameCreaBanca frameCreaBanca = new FrameCreaBanca();
			
		}
		
		
		/**DIRETTORE*/
		
		if(src.equals(MENU_DIRETTORE_CREA_FILIALE)) {
			
			FrameCreaFiliale frameCreaFiliale= new FrameCreaFiliale(); 
		}
		
		
		/**CASSIERE*/
		if(src.equals(MENU_CASSIERE_CONVALIDA_OPERAZIONI)) {
			
			SistemaCassiere.getInstance().avviaConvalidaOperazioni();
		}
		
		if(src.equals(MENU_CASSIERE_VISUAL_OPERAZIONI_CLIENTE)) {
			
			SistemaCassiere.getInstance().avviaVisualizzaOperazioni();
		}
		
		
		
		/**CLIENTE*/
		
		if(src.equals(MENU_CLIENTE_OPERAZIONI_DISPOSITIVE)) {
			
			SistemaCliente.getInstance().avviaOperazioniDispositive();
		}
		
		
		if(src.equals(MENU_CLIENTE_OPERAZIONI_INFORMATIVE)) {
			
			SistemaCliente.getInstance().avviaOperazioniInformative();
		}
		
		if(src.equals(MENU_CLIENTE_VISUAL_OPERAZIONI)) {
			
			SistemaCliente.getInstance().avviaVisualizzaOperazioni();
		}
	}

}
