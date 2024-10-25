package it.unisalento.pps.progettoEsame.view.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import it.unisalento.pps.progettoEsame.business.SistemaCassiere;
import it.unisalento.pps.progettoEsame.model.Operazione;
import it.unisalento.pps.progettoEsame.view.FrameConvalidaOperazioni;

public class ConvalidaOperazioniPulsantiListener implements ActionListener{
	
	public static final String PULSANTE_ACCETTA="Accetta";
	public static final String PULSANTE_NON_ACCETTA="NonAccetta";
	public static final String PULSANTE_OK="Ok";
	public static final String PULSANTE_ANNULLA="Annulla";
	
	private FrameConvalidaOperazioni frame;
	
	private ArrayList<Operazione> listaOriginaleOperazioni;

	public ConvalidaOperazioniPulsantiListener(FrameConvalidaOperazioni frame, ArrayList<Operazione> listaOriginaleOperazioni) {
		this.frame=frame;
		
		this.listaOriginaleOperazioni = listaOriginaleOperazioni;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getActionCommand();
		
		if(src.equals(PULSANTE_ACCETTA)) {
			
			
			if(this.listaOriginaleOperazioni.size()!=0&&this.frame.getRigaTabella()>=0) {
				
				
				int esito = SistemaCassiere.getInstance().accettaOperazione(this.listaOriginaleOperazioni.get(this.frame.getRigaTabella()));
				
				if(esito==0) {
					
					//Elimino la riga della tabella e aggiorno la tabella
					this.listaOriginaleOperazioni.remove(this.frame.getRigaTabella());
					this.frame.setRigaTabella(-1);
					
					JOptionPane.showMessageDialog(this.frame, (Object)"Tutto ok l'operazione è stata ACCETTATA", "TUTTO OK!!!",1);
					
				}
				
				if(esito==1) {
					
				
					JOptionPane.showMessageDialog(this.frame, (Object)"Attenzione: errore durante l'esecuzione della convalida dell'operazione", "ATTENZIONE!!!",2);
					
				}		
				
				
			}
			
			frame.aggiornaTabella();
		}
		
		
		if(src.equals(PULSANTE_NON_ACCETTA)) {
			
			if(this.listaOriginaleOperazioni.size()!=0&&this.frame.getRigaTabella()>=0) {
				
				int esito = SistemaCassiere.getInstance().nonAccettaOperazione(this.listaOriginaleOperazioni.get(this.frame.getRigaTabella()));
				
				if(esito==0) {
					
					//Elimino la riga della tabella e aggiorno la tabella
					this.listaOriginaleOperazioni.remove(this.frame.getRigaTabella());
					this.frame.setRigaTabella(-1);
					
					JOptionPane.showMessageDialog(this.frame, (Object)"Tutto ok l'operazione NON è stata accettata", "TUTTO OK!!!",1);
					
				}
				
				if(esito==1) {
					
				
					JOptionPane.showMessageDialog(this.frame, (Object)"Attenzione: errore durante l'esecuzione della convalida dell'operazione", "ATTENZIONE!!!",2);
					
				}		

			}
			
			frame.aggiornaTabella();

			
		}
		
		if(src.equals(PULSANTE_OK)) {
			
			frame.dispose();
			
		}
		
		if(src.equals(PULSANTE_ANNULLA)) {
			
			frame.dispose();
		}
		
		
		
	}


}
