package it.unisalento.pps.progettoEsame.view.actionListener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


import it.unisalento.pps.progettoEsame.view.FrameLogin;
import it.unisalento.pps.progettoEsame.business.SistemaAccesso;

public class LoginListener implements ActionListener {
	
	private FrameLogin login;
	public final static String PULSANTE_OK="Ok";
	public final static String PULSANTE_ANNULLA="Annulla";
	
	public LoginListener(FrameLogin login) {
		
		this.login=login;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object src = e.getActionCommand();
		
		if(src.equals(PULSANTE_OK)) {
			
			/* E' stato premuto il pulsante OK nella finestra di Login */
			
			String username=login.getusername();
			
			String password=login.getpassword();
			
			/* Se almeno uno dei due campi di username e password sono vuoti mostra
			 * un messaggio di errore*/
			
			if(username.isEmpty()||password.isEmpty()) {
				
				String m="Attenzione non tutti i campi sono inseriti";
				Object messaggio=m;
				
				// l'intero 1 sta a significare un INFORMATION_MESSAGE, 0 sta per ERROR_MESSAGE
				JOptionPane.showMessageDialog(login, messaggio, "Login SBAGLIATO!!!",1);
				
				
			}else {
				
				SistemaAccesso.getInstance().setusername(username);
				//System.out.println(SistemaAccesso.getInstance().getusername());
				
				SistemaAccesso.getInstance().setpassword(password);
				//System.out.println(SistemaAccesso.getInstance().getpassword());
				
				String accesso=SistemaAccesso.getInstance().getloggato();
				//System.out.println(accesso);
				
				if(accesso.equals(SistemaAccesso.getInstance().getCostanteOspite())){
					
					String m="Attenzione NON sei registrato";
					Object messaggio=m;
					
					// l'intero 2 sta a significare un WARNING_ERROR, 
					JOptionPane.showMessageDialog(login, messaggio, "Login SBAGLIATO!!!",2);
					
					
				}else
					
					login.dispose();
					
			}
			
			
			
		}else if(src.equals(PULSANTE_ANNULLA)) {
			
			/* E' stato premuto il pulsante ANNULLA nella finestra di Login 
			 * si chiude la finestra di login solamente, non quella del programma*/
			
			//System.exit(0);
			
			login.dispose();
			
		}
		
		
	}

}
