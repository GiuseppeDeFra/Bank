package it.unisalento.pps.progettoEsame.view.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import it.unisalento.pps.progettoEsame.business.SistemaCliente;
import it.unisalento.pps.progettoEsame.view.FrameOpInformative;

public class FrameOpInformativeListener implements ActionListener{
	
	private FrameOpInformative opInformative;
	
	public static final String RADIO_BTN_CONTO_C="ContoCorrente";
	public static final String RADIO_BTN_CARTA_P="CartaPrepagata";
	public static final String PULSANTE_OK="Ok";
	public static final String PULSANTE_ANNULLA="Annulla";

	
	public FrameOpInformativeListener(FrameOpInformative opInformative) {
		
		this.opInformative = opInformative;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getActionCommand();
		
		
		if(src.equals(PULSANTE_OK)) {
			
			if(opInformative.getRadioBtnContoCorrente()) {
				
				opInformative.setSaldo(SistemaCliente.getInstance().getSaldoContoCorrente((opInformative.getComboBoxContoCorrente())));
				SwingUtilities.updateComponentTreeUI(opInformative);
			}
			
			if(opInformative.getRadioBtnCartaPrepagata()) {
				
				opInformative.setSaldo(SistemaCliente.getInstance().getSaldoCartaPrepagata(opInformative.getComboBoxCartaPrepagata()));
				SwingUtilities.updateComponentTreeUI(opInformative);

				
			}
			
		}
		
		
		
		if(src.equals(RADIO_BTN_CONTO_C)) {
			
			if(opInformative.getRadioBtnContoCorrente()) {
				
				opInformative.spegniCartaPrepagata();
				opInformative.accendiContoCorrente();
				
			}
							
		}
		
		if(src.equals(RADIO_BTN_CARTA_P)) {
			
			if(opInformative.getRadioBtnCartaPrepagata()) {
				
				opInformative.spegniContoCorrente();
				opInformative.accendiCartaPrepagata();
				
			}
		}
		
		
		if(src.equals(PULSANTE_ANNULLA)) {
			
			opInformative.dispose();
		}

	
	}



}
