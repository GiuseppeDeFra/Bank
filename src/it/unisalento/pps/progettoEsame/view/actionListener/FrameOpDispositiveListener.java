package it.unisalento.pps.progettoEsame.view.actionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import it.unisalento.pps.progettoEsame.business.SistemaCliente;
import it.unisalento.pps.progettoEsame.view.FrameOpDispositive;

public class FrameOpDispositiveListener implements ActionListener{
	
	private FrameOpDispositive opDispositive;
	
	public static final String RADIO_BTN_CONTO_C="ContoCorrente";
	public static final String RADIO_BTN_CARTA_P="CartaPrepagata";
	public static final String RADIO_BTN_VERSAMENTO="Versamento";
	public static final String RADIO_BTN_PRELIEVO="Prelievo";
	public static final String RADIO_BTN_BOLLO="Bollo";
	public static final String RADIO_BTN_RICARICA_C="RicaricaCell";
	public static final String PULSANTE_OK="Ok";
	public static final String PULSANTE_ANNULLA="Annulla";
	
	public FrameOpDispositiveListener(FrameOpDispositive opDispositive) {
		
		this.opDispositive = opDispositive;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getActionCommand();
		
		if(src.equals(PULSANTE_OK)) {
			
			if(opDispositive.getImporto().isEmpty()) {
				
				JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione non è stato inserito nessun importo", "ATTENZIONE!!!",2);
							
			
			}else {
				
				try {				
					
					
					Double.valueOf(opDispositive.getImporto());
					
					
					if(opDispositive.getRadioBtnContoCorrente()) {
						
						if(opDispositive.getRadioBtnVersamento()) {
							
							int esito = SistemaCliente.getInstance().registraVersamentoContoCorrente(opDispositive.getImporto(), opDispositive.getComboBoxContoCorrente());
							
							if(esito==0)
								JOptionPane.showMessageDialog(opDispositive, (Object)"La registrazione del Versamento e' avvenuta con successo", "TUTTO OK!!!",1);
							
							if(esito==1)
								JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione l'importo non deve essere negativo", "ATTENZIONE!!!",2);
							
						}
						
						if(opDispositive.getRadioBtnPrelievo()) {
							
							int esito = SistemaCliente.getInstance().registraPrelievoContoCorrente(opDispositive.getImporto(), opDispositive.getComboBoxContoCorrente());
							
							if(esito==0)
								JOptionPane.showMessageDialog(opDispositive, (Object)"La registrazione del Prelievo e' avvenuta con successo", "TUTTO OK!!!",1);
							
							if(esito==1)
								JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione l'importo non deve essere negativo", "ATTENZIONE!!!",2);

						}
						
						if(opDispositive.getRadioBtnBollo()) {
							
							if(!opDispositive.getTarga().isEmpty()&&!opDispositive.getMarca().isEmpty()&&
									!opDispositive.getModello().isEmpty()&&!opDispositive.getCilindrata().isEmpty()&&
									!opDispositive.getKwatt().isEmpty()) {
								
								try {				
																		
									Double.valueOf(opDispositive.getCilindrata());
									
								
									
									try {
										
										Double.valueOf(opDispositive.getKwatt());
										
										
										//registra operazione
										int esito = SistemaCliente.getInstance().registraBolloContoCorrente(opDispositive.getImporto(), opDispositive.getComboBoxContoCorrente(), opDispositive.getTarga(), opDispositive.getMarca(), opDispositive.getModello(), opDispositive.getCilindrata(), opDispositive.getKwatt());
										
										if(esito==0)
											JOptionPane.showMessageDialog(opDispositive, (Object)"La registrazione del Bollo e' avvenuta con successo", "TUTTO OK!!!",1);
										
										if(esito==1)
											JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione l'importo non deve essere negativo", "ATTENZIONE!!!",2);

										
										
									}catch(NumberFormatException exception) {
										
										JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione il numero inserito nei KWatt non è un numero. \nPer i numeri decimali mettere il punto(.)", "ATTENZIONE!!!",2);
										
									}
								
								
								
								}catch(NumberFormatException exception) {
									
									JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione il numero inserito nella cilindrata non è un numero. \nPer i numeri decimali mettere il punto(.)", "ATTENZIONE!!!",2);
								}
								
							}else {
								
								JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione inserire tutti i campi in bollo", "ATTENZIONE!!!",2);
							}
								
							
						}
						
						if(opDispositive.getRadioBtnRicarica()) {
							
							if(!opDispositive.getCellulare().isEmpty()&&!opDispositive.getOperatore().isEmpty()) {
								
								
								//registra operazione
								
								int esito = SistemaCliente.getInstance().registraRicaricaCellContoCorrente(opDispositive.getImporto(), opDispositive.getComboBoxContoCorrente(), opDispositive.getCellulare(), opDispositive.getOperatore());
								
								if(esito==0)
									JOptionPane.showMessageDialog(opDispositive, (Object)"La registrazione della Ricarica Cellulare e' avvenuta con successo", "TUTTO OK!!!",1);
								
								if(esito==1)
									JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione l'importo non deve essere negativo", "ATTENZIONE!!!",2);

								
							}else {
								
								JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione inserire tutti i campi in Ricarica cellulare", "ATTENZIONE!!!",2);
							}
							
						}
						
					}
					
					if(opDispositive.getRadioBtnCartaPrepagata()) {
						
						if(opDispositive.getRadioBtnVersamento()) {
							
							int esito = SistemaCliente.getInstance().registraVersamentoCartaPrepagata(opDispositive.getImporto(), opDispositive.getComboBoxCartaPrepagata());
							
							if(esito==0)
								JOptionPane.showMessageDialog(opDispositive, (Object)"La registrazione del Versamento e' avvenuta con successo", "TUTTO OK!!!",1);
							
							if(esito==1)
								JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione l'importo non deve essere negativo", "ATTENZIONE!!!",2);

							
						}
						
						if(opDispositive.getRadioBtnPrelievo()) {
							
							int esito = SistemaCliente.getInstance().registraPrelievoCartaPrepagata(opDispositive.getImporto(), opDispositive.getComboBoxCartaPrepagata());
							
							if(esito==0)
								JOptionPane.showMessageDialog(opDispositive, (Object)"La registrazione del Prelievo e' avvenuta con successo", "TUTTO OK!!!",1);
							
							if(esito==1)
								JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione l'importo non deve essere negativo", "ATTENZIONE!!!",2);

							
						}
						
						if(opDispositive.getRadioBtnBollo()) {
							
							if(!opDispositive.getTarga().isEmpty()&&!opDispositive.getMarca().isEmpty()&&
									!opDispositive.getModello().isEmpty()&&!opDispositive.getCilindrata().isEmpty()&&
									!opDispositive.getKwatt().isEmpty()) {
								
								
								try {				
									
									Double.valueOf(opDispositive.getCilindrata());
									
								
									
									try {
										
										Double.valueOf(opDispositive.getKwatt());
										
										
										//registra operazione
										int esito = SistemaCliente.getInstance().registraBolloCartaPrepagata(opDispositive.getImporto(), opDispositive.getComboBoxCartaPrepagata(), opDispositive.getTarga(), opDispositive.getMarca(), opDispositive.getModello(), opDispositive.getCilindrata(), opDispositive.getKwatt());
										
										if(esito==0)
											JOptionPane.showMessageDialog(opDispositive, (Object)"La registrazione del Bollo e' avvenuta con successo", "TUTTO OK!!!",1);
										
										if(esito==1)
											JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione l'importo non deve essere negativo", "ATTENZIONE!!!",2);

										
										
									}catch(NumberFormatException exception) {
										
										JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione il numero inserito nei KWatt non è un numero. \nPer i numeri decimali mettere il punto(.)", "ATTENZIONE!!!",2);
										
									}
								
								
								
								}catch(NumberFormatException exception) {
									
									JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione il numero inserito nella cilindrata non è un numero. \nPer i numeri decimali mettere il punto(.)", "ATTENZIONE!!!",2);
								}
								
								
								
								
								
							}else {
								
								JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione inserire tutti i campi in bollo", "ATTENZIONE!!!",2);
							}

							
						}
						
						if(opDispositive.getRadioBtnRicarica()) {
							
							if(!opDispositive.getCellulare().isEmpty()&&!opDispositive.getOperatore().isEmpty()) {							
								
								//registra operazione
								
								int esito = SistemaCliente.getInstance().registraRicaricaCellCartaPrepagata(opDispositive.getImporto(), opDispositive.getComboBoxCartaPrepagata(), opDispositive.getCellulare(), opDispositive.getOperatore());
								
								if(esito==0)
									JOptionPane.showMessageDialog(opDispositive, (Object)"La registrazione della Ricarica Cellulare e' avvenuta con successo", "TUTTO OK!!!",1);
								
								if(esito==1)
									JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione l'importo non deve essere negativo", "ATTENZIONE!!!",2);

								
							}else {
								
								JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione inserire tutti i campi in Ricarica cellulare", "ATTENZIONE!!!",2);
							}

							
							
						}
						
					}			
					
					
				}catch(NumberFormatException exception) {
					
					JOptionPane.showMessageDialog(opDispositive, (Object)"Attenzione il numero inserito nell'importo non è un numero. \nPer i numeri decimali mettere il punto(.)", "ATTENZIONE!!!",2);
					
				}
				
			}
				
		}
		
		
		
		
		if(src.equals(RADIO_BTN_CONTO_C)) {
			
			if(opDispositive.getRadioBtnContoCorrente()) {
				
				opDispositive.spegniCartaPrepagata();
				opDispositive.accendiContoCorrente();
				
			}
							
		}
		
		if(src.equals(RADIO_BTN_CARTA_P)) {
			
			if(opDispositive.getRadioBtnCartaPrepagata()) {
				
				opDispositive.spegniContoCorrente();
				opDispositive.accendiCartaPrepagata();
				
			}
		}
		
		if(src.equals(RADIO_BTN_PRELIEVO)) {
			
			if(opDispositive.getRadioBtnPrelievo()) {
				
				opDispositive.spegniBollo();
				opDispositive.spegniRicaricaCell();
				opDispositive.spegniVersamento();
			}
		}
		
		if(src.equals(RADIO_BTN_VERSAMENTO)) {
			
			if(opDispositive.getRadioBtnVersamento()) {
				
				opDispositive.spegniPrelievo();
				opDispositive.spegniBollo();
				opDispositive.spegniRicaricaCell();
				
			}
		}
		
		if(src.equals(RADIO_BTN_BOLLO)) {
			
			if(opDispositive.getRadioBtnBollo()) {
				
				opDispositive.accendiBollo();
				opDispositive.spegniRicaricaCell();
				opDispositive.spegniPrelievo();
				opDispositive.spegniVersamento();
			}
		}
		
		if(src.equals(RADIO_BTN_RICARICA_C)) {
			
			if(opDispositive.getRadioBtnRicarica()) {
				
				opDispositive.accendiRicaricaCell();
				opDispositive.spegniBollo();
				opDispositive.spegniPrelievo();
				opDispositive.spegniVersamento();
			}
		}
		
		if(src.equals(PULSANTE_ANNULLA)) {
			
			opDispositive.dispose();
		}
		
	}

}
