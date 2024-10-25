package it.unisalento.pps.progettoEsame.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import it.unisalento.pps.progettoEsame.view.actionListener.FrameOpInformativeListener;

public class FrameOpInformative extends JFrame {

	private JPanel contentPane;
	
	private JButton btnOk = new JButton("Ok");
	private JButton btnAnnulla = new JButton("Annulla");
			
	private JRadioButton rdbtnContoCorrente = new JRadioButton("Conto corrente");	
	private JComboBox comboBoxContoCorrente = new JComboBox();	
	
	private JRadioButton rdbtnCartaPrepagata = new JRadioButton("Carta prepagata");	
	private JComboBox comboBoxCartaPrepagata = new JComboBox();
	
	private JLabel saldo = new JLabel();


	/**
	 * Launch the application.
	 */
	
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ArrayList<String> c = new ArrayList<String>();
					c.add("1");
					c.add("2");
					FrameOpInformative frame = new FrameOpInformative(true,true,c,c);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	*/


	/**
	 * Create the frame.
	 */
	public FrameOpInformative(boolean contoCorrente, boolean cartaPrepagata, ArrayList<String> listaContiCorrenti, ArrayList<String> listaCartePrepagate) {
		setTitle("Operazioni Dispositive");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		//JButton btnOk = new JButton("Ok");
		panel.add(btnOk);
		
		//JButton btnAnnulla = new JButton("Annulla");
		panel.add(btnAnnulla);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		
		//JRadioButton rdbtnContoCorrente = new JRadioButton("Conto corrente");
		panel_2.add(rdbtnContoCorrente);
		
		//JComboBox comboBoxContoCorrente = new JComboBox();
		panel_2.add(comboBoxContoCorrente);
		
		
		/* 
		 * 
		 * inserisco le stringhe nella combobox comboBoxContoCorrente
		 * 
		 * */
		
		for(int i=0;i<listaContiCorrenti.size();i++) {
			
			comboBoxContoCorrente.addItem(listaContiCorrenti.get(i));			
		}
		
		
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		//JRadioButton rdbtnCartaPrepagata = new JRadioButton("Carta prepagata");
		panel_3.add(rdbtnCartaPrepagata);
		
		//JComboBox comboBoxCartaPrepagata = new JComboBox();
		panel_3.add(comboBoxCartaPrepagata);
		
		
		/* 
		 * inserisco le stringhe nella combobox comboBoxContoCorrente
		 * 
		 * */
		
		for(int i=0;i<listaCartePrepagate.size();i++) {
			
			comboBoxCartaPrepagata.addItem(listaCartePrepagate.get(i));			
		}
		
		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.add(saldo);
		
		
		/**
		 * Compongo i gruppi per i pulsanti Radio
		 * */
		
		ButtonGroup prodotti = new ButtonGroup();
		prodotti.add(rdbtnContoCorrente);
		prodotti.add(rdbtnCartaPrepagata);
		
		
		/**
		 * Imposto gli ascoltatori
		 * */
		
		FrameOpInformativeListener opInformativeListener = new FrameOpInformativeListener(this);
		
		/**
		 * Aggiungo gli ascoltatori
		 * */
		
		this.rdbtnContoCorrente.addActionListener(opInformativeListener);
		this.rdbtnCartaPrepagata.addActionListener(opInformativeListener);
		this.btnOk.addActionListener(opInformativeListener);
		this.btnAnnulla.addActionListener(opInformativeListener);


		
		/**
		 * Setto gli ascoltatori
		 * */
		this.rdbtnContoCorrente.setActionCommand(opInformativeListener.RADIO_BTN_CONTO_C);
		this.rdbtnCartaPrepagata.setActionCommand(opInformativeListener.RADIO_BTN_CARTA_P);
		this.btnOk.setActionCommand(opInformativeListener.PULSANTE_OK);
		this.btnAnnulla.setActionCommand(opInformativeListener.PULSANTE_ANNULLA);

		
		
		/**
		 * Inizializzo il frame
		 * */
		azzeraFrame();
		
		if(!contoCorrente) {
			
			this.spegniTuttoContoCorrente();
			
		}
		
		if(!cartaPrepagata) {
			
			this.spegniTuttoCartaPrepagata();
			
		}
		
		setVisible(true);

	}
	
	
	/**
	 * Imposta il valore della Label Saldo
	 * @param descrizione la Stringa che contiene la sescrizione del saldo
	 */
	public void setSaldo(String descrizione) {
		
		this.saldo.setText(descrizione);
		
	}
	
	
	/**
	 * Spegni tutto il settore del conto corrente
	 * */
	private void spegniTuttoContoCorrente() {
		
		rdbtnContoCorrente.setEnabled(false);	
		comboBoxContoCorrente.setEnabled(false);	
	}
	
	/**
	 * Spegni ilsettore del conto corrente, ma è selezionabile
	 * */
	public void spegniContoCorrente() {
		
		rdbtnContoCorrente.setSelected(false);
		comboBoxContoCorrente.setEnabled(false);
		
	}
	
	/**
	 * Accendi tutto il settore del conto corrente
	 * */
	public void accendiContoCorrente() {
		
		rdbtnContoCorrente.setSelected(true);
		comboBoxContoCorrente.setEnabled(true);
	}
	
	/**
	 * Spegni tutto il settore della Carta Prepagata
	 * */
	private void spegniTuttoCartaPrepagata() {
		
		rdbtnCartaPrepagata.setEnabled(false);	
		comboBoxCartaPrepagata.setEnabled(false);
		
	}
	
	/**
	 * Spegni il settore della Carta Prepagata, ma è selezionabile
	 * */
	public void spegniCartaPrepagata() {
		
		rdbtnCartaPrepagata.setSelected(false);	
		comboBoxCartaPrepagata.setEnabled(false);
		
	}
	
	/**
	 * Accendi tutto il settore della Carta Prepagata
	 * */
	public void accendiCartaPrepagata() {
		
		rdbtnCartaPrepagata.setSelected(true);	
		comboBoxCartaPrepagata.setEnabled(true);
		
	}
	
	/**
	 * Inizializza il frame 
	 * */
	private void azzeraFrame() {
		
		comboBoxContoCorrente.setEnabled(false);
		comboBoxCartaPrepagata.setEnabled(false);
		
	}
	
	
	/**
	 * Mi restituisce il valore della combobox Conto Corrente che ho selezionato
	 * @return la Stringa del valore della combo box che ho selezionato
	 * */
	public String getComboBoxContoCorrente() {
		
		return String.valueOf(comboBoxContoCorrente.getSelectedItem());
	}
	
	/**
	 * Mi restituisce il valore della combobox Carta Prepagata che ho selezionato
	 * @return la Stringa del valore della combo box che ho selezionato
	 * */
	public String getComboBoxCartaPrepagata() {
		
		return String.valueOf(comboBoxCartaPrepagata.getSelectedItem());
	}
	
	/**
	 * Ritorna il valore del radio button del conto corrente 
	 * @return TRUE se è selezionato, FALSE altrimenti
	 * */
	public boolean getRadioBtnContoCorrente() {
		
		return this.rdbtnContoCorrente.isSelected();
		
	}
	
	/**
	 * Ritorna il valore del radio button della carta prepagata 
	 * @return TRUE se è selezionato, FALSE altrimenti
	 * */
	public boolean getRadioBtnCartaPrepagata() {
		
		return this.rdbtnCartaPrepagata.isSelected();
	}





}
