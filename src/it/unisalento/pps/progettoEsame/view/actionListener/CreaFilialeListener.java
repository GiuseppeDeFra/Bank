package it.unisalento.pps.progettoEsame.view.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import it.unisalento.pps.progettoEsame.business.SistemaBanca;
import it.unisalento.pps.progettoEsame.view.FrameCreaFiliale;
import it.unisalento.pps.progettoEsame.view.FrameImmagini;

public class CreaFilialeListener implements ActionListener{
	
	private FrameCreaFiliale frameCreaFiliale;
	public final static String PULSANTE_OK="Ok";
	public final static String PULSANTE_ANNULLA="Annulla";
	public final static String PULSANTE_CARICA_UNO="CaricaUno";
	public final static String PULSANTE_CARICA_DUE="CaricaDue";
	public final static String PULSANTE_CARICA_TRE="CaricaTre";
	public final static String CKBOX_LUNEDI="Lunedi";
	public final static String CKBOX_MARTEDI="Martedi";
	public final static String CKBOX_MERCOLEDI="Mercoledi";
	public final static String CKBOX_GIOVEDI="Giovedi";
	public final static String CKBOX_VENERDI="Venerdi";
	public final static String CKBOX_SABATO="Sabato";
	public final static String CKBOX_DOMENICA="Domenica";


	public CreaFilialeListener(FrameCreaFiliale frameCreaFiliale) {
		
		this.frameCreaFiliale = frameCreaFiliale;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getActionCommand();
		
		//E' stato premuto il Pulsante OK
		if(src.equals(PULSANTE_OK)) {
			
			if(!frameCreaFiliale.getNome().isEmpty()&&!frameCreaFiliale.getVia().isEmpty()&&!frameCreaFiliale.getCitta().isEmpty()&&
					!frameCreaFiliale.getProvincia().isEmpty()) {
				
				int esito = SistemaBanca.getInstance().creaFiliale(frameCreaFiliale.getNome(), frameCreaFiliale.getVia(), frameCreaFiliale.getCitta(), frameCreaFiliale.getProvincia(), frameCreaFiliale.getImmagineUno(), frameCreaFiliale.getImmagineDue(), frameCreaFiliale.getImmagineTre());
				
				if(esito==0) {
					
					JOptionPane.showMessageDialog(frameCreaFiliale, (Object)"La registrazione e' avvenuta con successo!!!", "TUTTO OK!!!",1);
					
					//Posso procedere con l'inserimento delle aperture della filiale
					
					//se è acceso Lunedi
					if(frameCreaFiliale.getCkboxLunedi()) {
						
						SistemaBanca.getInstance().creaApertura(frameCreaFiliale.getNome(),CKBOX_LUNEDI,frameCreaFiliale.getOraAperturaLunedi()+":"+frameCreaFiliale.getMinutiAperturaLunedi()+":00",frameCreaFiliale.getOraChiusuraLunedi()+":"+frameCreaFiliale.getMinutiChiusuraLunedi()+":00");
						
					}
					
					//se è acceso Martedi
					if(frameCreaFiliale.getCkboxMartedi()) {
						
						SistemaBanca.getInstance().creaApertura(frameCreaFiliale.getNome(),CKBOX_MARTEDI,frameCreaFiliale.getOraAperturaMartedi()+":"+frameCreaFiliale.getMinutiAperturaMartedi()+":00",frameCreaFiliale.getOraChiusuraMartedi()+":"+frameCreaFiliale.getMinutiChiusuraMartedi()+":00");
						
					}
					
					//se è acceso Mercoledi
					if(frameCreaFiliale.getCkboxMercoledi()) {
						
						SistemaBanca.getInstance().creaApertura(frameCreaFiliale.getNome(),CKBOX_MERCOLEDI,frameCreaFiliale.getOraAperturaMercoledi()+":"+frameCreaFiliale.getMinutiAperturaMercoledi()+":00",frameCreaFiliale.getOraChiusuraMercoledi()+":"+frameCreaFiliale.getMinutiChiusuraMercoledi()+":00");
						
					}
					
					//se è acceso Giovedi
					if(frameCreaFiliale.getCkboxGiovedi()) {
						
						SistemaBanca.getInstance().creaApertura(frameCreaFiliale.getNome(),CKBOX_GIOVEDI,frameCreaFiliale.getOraAperturaGiovedi()+":"+frameCreaFiliale.getMinutiAperturaGiovedi()+":00",frameCreaFiliale.getOraChiusuraGiovedi()+":"+frameCreaFiliale.getMinutiChiusuraGiovedi()+":00");
						
					}
					
					//se è acceso Venerdi
					if(frameCreaFiliale.getCkboxVenerdi()) {
						
						SistemaBanca.getInstance().creaApertura(frameCreaFiliale.getNome(),CKBOX_VENERDI,frameCreaFiliale.getOraAperturaVenerdi()+":"+frameCreaFiliale.getMinutiAperturaVenerdi()+":00",frameCreaFiliale.getOraChiusuraVenerdi()+":"+frameCreaFiliale.getMinutiChiusuraVenerdi()+":00");
					}
					
					//se è acceso Sabato
					if(frameCreaFiliale.getCkboxSabato()) {
						
						SistemaBanca.getInstance().creaApertura(frameCreaFiliale.getNome(),CKBOX_SABATO,frameCreaFiliale.getOraAperturaSabato()+":"+frameCreaFiliale.getMinutiAperturaSabato()+":00",frameCreaFiliale.getOraChiusuraSabato()+":"+frameCreaFiliale.getMinutiChiusuraSabato()+":00");
					}
					
					//se è acceso Domenica
					if(frameCreaFiliale.getCkboxDomenica()) {
						
						SistemaBanca.getInstance().creaApertura(frameCreaFiliale.getNome(),CKBOX_DOMENICA,frameCreaFiliale.getOraAperturaDomenica()+":"+frameCreaFiliale.getMinutiAperturaDomenica()+":00",frameCreaFiliale.getOraChiusuraDomenica()+":"+frameCreaFiliale.getMinutiChiusuraDomenica()+":00");
					}
				}
				
				if(esito==1) {
					
					JOptionPane.showMessageDialog(frameCreaFiliale, (Object)"La filiale inserita esiste gia", "FILIALE ESISTENTE!!!",2);
					
					
				}				
				
			}else {
				
				JOptionPane.showMessageDialog(frameCreaFiliale, (Object)"Attenzione mancano alcuni parametri per la filiale", "ATTENZIONE!!!",2);
			}
					
		}
		
		//E' stata premuta la checkBox di lunedi
		if(src.equals(CKBOX_LUNEDI)) {
			
			if(frameCreaFiliale.getCkboxLunedi()) {
				
				frameCreaFiliale.accendiLunedi();
			}else {
				frameCreaFiliale.spegniLunedi();
			}
		}
		
		//E' stata premuta la checkBox di martedi
		if(src.equals(CKBOX_MARTEDI)) {
					
			if(frameCreaFiliale.getCkboxMartedi()) {
						
				frameCreaFiliale.accendiMartedi();
			}else {
				frameCreaFiliale.spegniMartedi();
			}
		}
		
		//E' stata premuta la checkBox di MERCOLEDI
		if(src.equals(CKBOX_MERCOLEDI)) {
					
			if(frameCreaFiliale.getCkboxMercoledi()) {
						
				frameCreaFiliale.accendiMercoledi();
			}else {
				frameCreaFiliale.spegniMercoledi();
			}
		}
		
		//E' stata premuta la checkBox di GIOVEDI
		if(src.equals(CKBOX_GIOVEDI)) {
					
			if(frameCreaFiliale.getCkboxGiovedi()) {
						
				frameCreaFiliale.accendiGiovedi();
			}else {
				frameCreaFiliale.spegniGiovedi();
			}
		}

		//E' stata premuta la checkBox di VENERDI
		if(src.equals(CKBOX_VENERDI)) {
					
			if(frameCreaFiliale.getCkboxVenerdi()) {
						
				frameCreaFiliale.accendiVenerdi();
			}else {
				frameCreaFiliale.spegniVenerdi();
			}
		}

		//E' stata premuta la checkBox di SABATO
		if(src.equals(CKBOX_SABATO)) {
					
			if(frameCreaFiliale.getCkboxSabato()) {
						
				frameCreaFiliale.accendiSabato();
			}else {
				frameCreaFiliale.spegniSabato();
			}
		}

		//E' stata premuta la checkBox di DOMENICA
		if(src.equals(CKBOX_DOMENICA)) {
					
			if(frameCreaFiliale.getCkboxDomenica()) {
						
				frameCreaFiliale.accendiDomenica();
			}else {
				frameCreaFiliale.spegniDomenica();
			}
		}
		
		//E' stato premuto il pulsante carica immagine uno
		if(src.equals(PULSANTE_CARICA_UNO)) {
			new FrameImmagini(frameCreaFiliale, frameCreaFiliale.textImmagineUno);
		}
		
		
		//E' stato premuto il pulsante carica immagine due
		if(src.equals(PULSANTE_CARICA_DUE)) {
			new FrameImmagini(frameCreaFiliale, frameCreaFiliale.textImmagineDue);
		}
		
		//E' stato premuto il pulsante carica immagine tre
		if(src.equals(PULSANTE_CARICA_TRE)) {
			new FrameImmagini(frameCreaFiliale, frameCreaFiliale.textImmagineTre);
		}


		
		
		
		
		//E' stato premuto il Pulsante Annulla
		if(src.equals(PULSANTE_ANNULLA)) {					
					
			this.frameCreaFiliale.dispose();
					
		}
		
		
		//new FrameImmagini(frameCreaBanca, frameCreaBanca.textImmagineUno);
	}

}
