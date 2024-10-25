package it.unisalento.pps.progettoEsame.view.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


import it.unisalento.pps.progettoEsame.view.FrameCreaBanca;
import it.unisalento.pps.progettoEsame.view.FrameCreaFiliale;
import it.unisalento.pps.progettoEsame.view.FrameImmagini;

public class FrameImmaginiListener implements ActionListener{
	
	public final static String PULSANTE_OK="Ok";
	public final static String PULSANTE_ANNULLA="Annulla";
	public final static String PULSANTE_OK_FILIALE="OkFiliale";
	//public static String percorso="";
	
	private FrameImmagini frameImmagini;
	private FrameCreaBanca frameCreaBanca;
	private JTextField textImmagine;
	private FrameCreaFiliale frameCreaFiliale;
	
	/**
	 * Costruttore di immaginiListener per Crea Banca
	 * */
	public FrameImmaginiListener(FrameImmagini frameImmagini, FrameCreaBanca frameCreaBanca,JTextField textImmagine) {
		
		this.frameImmagini = frameImmagini;
		this.frameCreaBanca = frameCreaBanca;
		this.textImmagine = textImmagine;
		
	}
	
	/**
	 * Costruttore di immaginiListener per Crea Filiale
	 * */
	public FrameImmaginiListener(FrameImmagini frameImmagini, FrameCreaFiliale frameCreafiliale,JTextField textImmagine) {
		
		this.frameImmagini = frameImmagini;
		this.frameCreaFiliale = frameCreafiliale;
		this.textImmagine = textImmagine;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getActionCommand();
		
		// E' stato premuto il pulsante OK
		if(src.equals(PULSANTE_OK)) {
			
			
			//da modificare qui la stringa del percorso
			
			textImmagine.setText(frameImmagini.getPercorso()); 
			frameImmagini.dispose();
			SwingUtilities.updateComponentTreeUI(frameCreaBanca);
			
		}
		

		// E' stato premuto il pulsante OK per la Filiale
		if(src.equals(PULSANTE_OK_FILIALE)) {
			
			//da modificare qui la stringa del percorso
			
			textImmagine.setText(frameImmagini.getPercorso()); 
			frameImmagini.dispose();
			SwingUtilities.updateComponentTreeUI(frameCreaFiliale);
			
		}
		
		
		
		//E' stato premuto il pulsante ANNULLA
		if(src.equals(PULSANTE_ANNULLA)) {
			
			frameImmagini.dispose();
			
		}
	}

}
