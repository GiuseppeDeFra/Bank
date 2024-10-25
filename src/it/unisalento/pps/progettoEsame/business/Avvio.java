package it.unisalento.pps.progettoEsame.business;

import java.awt.*;
import java.io.File;
import java.net.URL;

//import javax.print.DocFlavor.URL;
import javax.swing.*;

//import java.sql.*;
import it.unisalento.pps.progettoEsame.model.Percorso;
import it.unisalento.pps.progettoEsame.view.MyFrame;


public class Avvio {
	

	public static void main(String[] args) throws Exception {
		
		
				MyFrame win = new MyFrame("Negozio");
			
				
				

				while(true)	{
				
					if(SistemaAccesso.getInstance().getloggato().equals(SistemaAccesso.getInstance().getCostanteOspite())) {
						
						win.setsaluto("Benvenuto                        ", new Color(139, 69, 19));    //ho lasciato la stringa lunga poichè altrimenti quando si aggiorna utente , amministratore, gestore non venivano visualizzati
						win.setOspite();
						
					}
					
					if(SistemaAccesso.getInstance().getloggato().equals(SistemaAccesso.getInstance().getCostanteAmministratore())) {
						
						win.setsaluto("Benvenuto "+SistemaAccesso.getInstance().getCostanteAmministratore(), new Color(10,10,255));
						win.setAmministratore();

					}
					
					if(SistemaAccesso.getInstance().getloggato().equals(SistemaAccesso.getInstance().getCostanteDirettore())) {
						
						win.setsaluto("Benvenuto "+SistemaAccesso.getInstance().getCostanteDirettore(), new Color(10,10,255));
						win.setDirettore();

					}
					
					if(SistemaAccesso.getInstance().getloggato().equals(SistemaAccesso.getInstance().getCostanteCassiere())) {
						
						win.setsaluto("Benvenuto "+SistemaAccesso.getInstance().getCostanteCassiere(), new Color(10,10,255));
						win.setCassiere();

					}
					
					if(SistemaAccesso.getInstance().getloggato().equals(SistemaAccesso.getInstance().getCostanteCliente())) {
						
						win.setsaluto("Benvenuto "+SistemaAccesso.getInstance().getCostanteCliente(), new Color(10,10,255));
						win.setCliente();

					}
					
					//sleep(2000);
					
					SwingUtilities.updateComponentTreeUI(win);
					
					Thread.sleep(2000); //aspetta 2 secondi
				}
				
				

			}

		
}
