package it.unisalento.pps.progettoEsame.view.actionListener;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import it.unisalento.pps.progettoEsame.view.FrameImmagini;

public class ImmaginiListSelectionListener implements ListSelectionListener{
	
	JList list;
	JLabel immagine;
	FrameImmagini frame;
	
	
	public ImmaginiListSelectionListener(JList list, JLabel immagine, FrameImmagini frame) {
		this.list=list;
		this.immagine=immagine;
		this.frame=frame;
	}
	
	public void valueChanged(ListSelectionEvent l){
		
		
		JLabel valore = (JLabel)list.getSelectedValue();
				
		//System.out.println("E' stato premuto: "+valore.getText());
		//System.out.println(getImmagini()+valore.getText());
		
		ImageIcon icon = new ImageIcon(getImmagini()+valore.getText());
		immagine.setIcon(icon);
		
		//setta il percorso completo
		//frame.setPercorso(getImmagini()+valore.getText());
		
		//setta solo l'immagine
		frame.setPercorso(valore.getText());
		
		SwingUtilities.updateComponentTreeUI(frame);
	}
	
	public String getImmagini() {
		URL directory;
		directory=this.getClass().getResource("/");
		
		String modifica=directory.toString();
		
		modifica=modifica.substring(6,modifica.length()-4)+"immagini/";
		
		modifica=modifica.replace('/', '\\');
		
		return modifica;
		
	}
	
	

}
