package it.unisalento.pps.progettoEsame.view.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import it.unisalento.pps.progettoEsame.business.SalvaDocumento;
import it.unisalento.pps.progettoEsame.business.SistemaCassiere;
import it.unisalento.pps.progettoEsame.business.SistemaOperazione;
import it.unisalento.pps.progettoEsame.model.Operazione;
import it.unisalento.pps.progettoEsame.view.FrameVisualizzaOperazioni;

public class FrameVisualizzaOperazioniListener implements ActionListener{
	
	
	
	public static final String RADIO_BTN_CONTO_C="ContoCorrente";
	public static final String RADIO_BTN_CARTA_P="CartaPrepagata";
	
	public static final String PULSANTE_CARICA_CLIENTE="CaricaCliente";
	public static final String PULSANTE_CARICA_OPERAZIONI="CaricaOperazioni";
	public static final String PULSANTE_APPLICA="Applica";
	public static final String PULSANTE_SALVA_PDF="SalvaPdf";
	//public static final String PULSANTE_OK="Ok";
	public static final String PULSANTE_ANNULLA="Annulla";
	
	private FrameVisualizzaOperazioni frame;
	private ArrayList<String> listaContiCorrenti = new ArrayList<String>();
	private ArrayList<String> listaCartePrepagate = new ArrayList<String>();
	
	private ArrayList<Operazione> listaOperazioniTot = new ArrayList<Operazione>();
	private ArrayList<Operazione> listaOperazioniModifica = new ArrayList<Operazione>();
	
	
	public FrameVisualizzaOperazioniListener(FrameVisualizzaOperazioni frame) {
		
		this.frame = frame;
		
	}


	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		Object src = e.getActionCommand();
		
		if(src.equals(RADIO_BTN_CONTO_C)) {
			
			if(frame.getRadioBtnContoCorrente()) {
				
				frame.spegniCartaPrepagata();
				frame.accendiContoCorrente();
				
			}
							
		}
		
		if(src.equals(RADIO_BTN_CARTA_P)) {
			
			if(frame.getRadioBtnCartaPrepagata()) {
				
				frame.spegniContoCorrente();
				frame.accendiCartaPrepagata();
				
			}
		}
		
		
		if(src.equals(PULSANTE_CARICA_CLIENTE)) {
			
			if(!frame.getIdCliente().isEmpty()) {
				
				ArrayList<String> listaConti = SistemaCassiere.getInstance().getListaIdContiCorrentiCliente(frame.getIdCliente());
				ArrayList<String> listaCarte = SistemaCassiere.getInstance().getListaIdCartePrepagateCliente(frame.getIdCliente());
				
				frame.caricaComboBoxContiCorr(listaConti);
				frame.caricaComboBoxCartePre(listaCarte);
				
				frame.accendiTutto();
			}
			
		}
		
		if(src.equals(PULSANTE_CARICA_OPERAZIONI)) {
			
			if(frame.getRadioBtnContoCorrente()) {
				
				listaOperazioniTot = SistemaOperazione.getInstance().getOperazioniContoCorrVisualizzare(frame.getComboBoxContoCorrente());
				frame.caricaTabella(listaOperazioniTot);
				
				listaOperazioniModifica = listaOperazioniTot; 
			}
			
			if(frame.getRadioBtnCartaPrepagata()) {
				
				listaOperazioniTot = SistemaOperazione.getInstance().getOperazioniCartaPrepVisualizzare(frame.getComboBoxCartaPrepagata());
				frame.caricaTabella(listaOperazioniTot);
				listaOperazioniModifica = listaOperazioniTot; 
				
			}
			
		}
		
		
		if(src.equals(PULSANTE_APPLICA)) {
			
			if(frame.getRadioPagamento()) {
				
				//listaOperazioniModifica = listaOperazioniTot; 
				//listaOperazioniModifica = SistemaOperazione.getInstance().getOperazioniPagamentoVilualizzare(listaOperazioniModifica);
				//frame.caricaTabella(listaOperazioniModifica);
				
				frame.caricaTabella(SistemaOperazione.getInstance().getOperazioniPagamentoVilualizzare(listaOperazioniTot));
				
			}
			
			if(frame.getRadioAccredito()) {
				
				//listaOperazioniModifica = listaOperazioniTot; 
				//listaOperazioniModifica = SistemaOperazione.getInstance().getOperazioniAccreditoVilualizzare(listaOperazioniModifica);
				//frame.caricaTabella(listaOperazioniModifica);
				
				frame.caricaTabella(SistemaOperazione.getInstance().getOperazioniAccreditoVilualizzare(listaOperazioniTot));
				
				

				
			}
			
		}
		
		
		if(src.equals(PULSANTE_SALVA_PDF)) {
			
			if(SalvaDocumento.getInstance().salvaDocumento(listaOperazioniModifica))
				
				JOptionPane.showMessageDialog(frame, (Object)"File PDF creato con successo", "TUTTO OK!!!",1);
		}
		
		
		if(src.equals(PULSANTE_ANNULLA)) {
			
			frame.dispose();
		}

		
	}



}
