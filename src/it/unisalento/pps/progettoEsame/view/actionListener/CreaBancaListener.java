package it.unisalento.pps.progettoEsame.view.actionListener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import it.unisalento.pps.progettoEsame.view.FrameCreaBanca;
import it.unisalento.pps.progettoEsame.view.FrameImmagini;

import it.unisalento.pps.progettoEsame.business.SistemaAmministrativo;

public class CreaBancaListener implements ActionListener{
	
	private FrameCreaBanca frameCreaBanca;
	public final static String PULSANTE_OK="Ok";
	public final static String PULSANTE_AGGIUNGI="Aggiungi";
	public final static String PULSANTE_ANNULLA="Annulla";
	public final static String PULSANTE_CARICA_UNO="CaricaUno";
	public final static String PULSANTE_CARICA_DUE="CaricaDue";
	public final static String PULSANTE_CARICA_TRE="CaricaTre";
	
	public CreaBancaListener(FrameCreaBanca frameCreaBanca) {
		
		this.frameCreaBanca=frameCreaBanca;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getActionCommand();
		
		//E' stato premuto il Pulsante OK
		if(src.equals(PULSANTE_OK)) {
			
			
			if(!this.frameCreaBanca.getNomeBanca().isEmpty()&&!this.frameCreaBanca.getViaBanca().isEmpty()&&!this.frameCreaBanca.getCittaBanca().isEmpty()&&
					!this.frameCreaBanca.getProvinciaBanca().isEmpty()&&!this.frameCreaBanca.getNomeDirettore().isEmpty()&&!this.frameCreaBanca.getCognomeDirettore().isEmpty()&&
					!this.frameCreaBanca.getUsernameDirettore().isEmpty()&&!this.frameCreaBanca.getPasswordDirettore().isEmpty()) {
				
				int esito = SistemaAmministrativo.getInstance().CreaBanca(this.frameCreaBanca.getNomeBanca(), this.frameCreaBanca.getViaBanca(), this.frameCreaBanca.getCittaBanca(), this.frameCreaBanca.getProvinciaBanca(), this.frameCreaBanca.getImmagineUnoBanca(), this.frameCreaBanca.getImmagineDueBanca(), this.frameCreaBanca.getImmagineTreBanca(), this.frameCreaBanca.getNomeDirettore(), this.frameCreaBanca.getCognomeDirettore(), this.frameCreaBanca.getUsernameDirettore(), this.frameCreaBanca.getPasswordDirettore());
				
				if(esito==0) {
					
					JOptionPane.showMessageDialog(frameCreaBanca, (Object)"La registrazione e' avvenuta con successo!!!", "TUTTO OK!!!",1);
					//this.frameCreaBanca = new FrameCreaBanca(); mi crea una nuova finestra
					//this.frameCreaBanca.dispose(); chiudi solo la finestra
					
					
					frameCreaBanca.setTuttoAZero();
					
					//aggiorna il frame
					SwingUtilities.updateComponentTreeUI(frameCreaBanca);
					
				}
				
				if(esito==1) {
					JOptionPane.showMessageDialog(frameCreaBanca, (Object)"La banca inserita esiste gia", "BANCA ESISTENTE!!!",2);
				}
				
				if(esito==2) {
					JOptionPane.showMessageDialog(frameCreaBanca, (Object)"Il direttore inserito esiste gia", "DIRETTORE ESISTENTE!!!",2);
				}
				
				if(esito==3) {
					JOptionPane.showMessageDialog(frameCreaBanca, (Object)"Errore di registrazione della banca", "ERRORE!!!",0);
				}
				
				if(esito==4) {
					JOptionPane.showMessageDialog(frameCreaBanca, (Object)"Errore durante la registrazione del direttore", "ERRORE!!!",0);
				}
				
			}else
				
				JOptionPane.showMessageDialog(frameCreaBanca, (Object)"Mancano parametri da inserire", "ATTENZIONE!!!",2);
				
			
		}
		
		//E' stato premuto il Pulsante Aggiungi
		if(src.equals(PULSANTE_AGGIUNGI)) {
			
		}
		
		//E' stato premuto il Pulsante Annulla
		if(src.equals(PULSANTE_ANNULLA)) {
			
			/* E' stato premuto il pulsante ANNULLA nel frame Crea Banca 
			 * si chiude la finestra di Crea Banca solamente, non quella del programma*/
			
			this.frameCreaBanca.dispose();
			
		}
		
		//E' stato premuto il Pulsante Carica UNO
		if(src.equals(PULSANTE_CARICA_UNO)) {
						
			new FrameImmagini(frameCreaBanca, frameCreaBanca.textImmagineUno);			
			
		}
		
		//E' stato premuto il Pulsante Carica DUE
		if(src.equals(PULSANTE_CARICA_DUE)) {
								
			new FrameImmagini(frameCreaBanca, frameCreaBanca.textImmagineDue);			
					
		}
		
		//E' stato premuto il Pulsante Carica UNO
		if(src.equals(PULSANTE_CARICA_TRE)) {
								
			new FrameImmagini(frameCreaBanca, frameCreaBanca.textImmagineTre);			
					
		}
				

		
	}

}
