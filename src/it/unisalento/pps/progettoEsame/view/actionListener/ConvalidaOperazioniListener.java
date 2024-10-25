package it.unisalento.pps.progettoEsame.view.actionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.SwingUtilities;

import it.unisalento.pps.progettoEsame.model.Operazione;
import it.unisalento.pps.progettoEsame.view.FrameConvalidaOperazioni;


public class ConvalidaOperazioniListener implements MouseListener {
	
	public static final String TABELLA="tabella";
	
	public static final String PULSANTE_ACCETTA="Accetta";
	public static final String PULSANTE_NON_ACCETTA="NonAccetta";
	public static final String PULSANTE_OK="Ok";
	public static final String PULSANTE_ANNULLA="Annulla";

	
	
	private FrameConvalidaOperazioni frameConvalidaOperazioni;
	
	
	
	public ConvalidaOperazioniListener(FrameConvalidaOperazioni frameConvalidaOperazioni) {
		
		this.frameConvalidaOperazioni = frameConvalidaOperazioni;
		
		
	}
	
	
	/*
	public ConvalidaOperazioniListener(FrameConvalidaOperazioni frameConvalidaOperazioni) {
		
		this.frameConvalidaOperazioni = frameConvalidaOperazioni;
	}
	*/



	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		
		

		
		if(arg0.getComponent().getName().equals(TABELLA)) {
			
			//System.out.println("Premuta Tabella elemento: "+Integer.toString(frameConvalidaOperazioni.getValoreTabella()));
			
			frameConvalidaOperazioni.setRigaTabella(frameConvalidaOperazioni.getValoreTabella());
			
		}


		
	}



	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}



}
