package it.unisalento.pps.progettoEsame.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import it.unisalento.pps.progettoEsame.view.actionListener.FrameOpDispositiveListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameOpDispositive extends JFrame {

	private JPanel contentPane;
	
	private JButton btnOk = new JButton("Ok");
	private JButton btnAnnulla = new JButton("Annulla");
			
	private JRadioButton rdbtnContoCorrente = new JRadioButton("Conto corrente");	
	private JComboBox comboBoxContoCorrente = new JComboBox();	
	
	private JRadioButton rdbtnCartaPrepagata = new JRadioButton("Carta prepagata");	
	private JComboBox comboBoxCartaPrepagata = new JComboBox();
	
	private JRadioButton rdbtnVersamento = new JRadioButton("Versamento");
	private JRadioButton rdbtnPrelievo = new JRadioButton("Prelievo");
	
	
	
	private JRadioButton rdbtnBollo = new JRadioButton("Bollo");
	private JLabel lblTarga = new JLabel("Targa");
	private JTextField textTarga;
	private JLabel lblMarca = new JLabel("Marca");
	private JTextField textMarca;
	private JLabel lblModello = new JLabel("Modello");
	private JTextField textModello;
	private JLabel lblCilindrata = new JLabel("Cilindrata");
	private JTextField textCilindrata;
	private JLabel lblKwatt = new JLabel("Kwatt");
	private JTextField textKwatt;
	
	
	private JRadioButton rdbtnRicarica = new JRadioButton("Ricarica");
	private JLabel lblCellulare = new JLabel("Cellulare");
	private JTextField textCellulare;
	private JLabel lblOperatore = new JLabel("Operatore");
	private JTextField textOperatore;

	
	private JTextField textImporto;
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameOpDispositive frame = new FrameOpDispositive();
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
	public FrameOpDispositive(boolean contoCorrente, boolean cartaPrepagata, boolean bolloAuto, boolean ricaricaCell, ArrayList<String> listaContiCorrenti, ArrayList<String> listaCartePrepagate) {
		setTitle("Operazioni Dispositive");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 608, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		setVisible(true);
		
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
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 13, 0, 0};
		gbl_panel_4.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		//JRadioButton rdbtnVersamento = new JRadioButton("Versamento");
		GridBagConstraints gbc_rdbtnVersamento = new GridBagConstraints();
		gbc_rdbtnVersamento.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnVersamento.gridx = 0;
		gbc_rdbtnVersamento.gridy = 1;
		panel_4.add(rdbtnVersamento, gbc_rdbtnVersamento);
		
		//JRadioButton rdbtnPrelievo = new JRadioButton("Prelievo");
		GridBagConstraints gbc_rdbtnPrelievo = new GridBagConstraints();
		gbc_rdbtnPrelievo.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnPrelievo.gridx = 1;
		gbc_rdbtnPrelievo.gridy = 1;
		panel_4.add(rdbtnPrelievo, gbc_rdbtnPrelievo);
		
		//JRadioButton rdbtnBollo = new JRadioButton("Bollo");
		GridBagConstraints gbc_rdbtnBollo = new GridBagConstraints();
		gbc_rdbtnBollo.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnBollo.gridx = 4;
		gbc_rdbtnBollo.gridy = 1;
		panel_4.add(rdbtnBollo, gbc_rdbtnBollo);
		
		//JRadioButton rdbtnRicarica = new JRadioButton("Ricarica");
		GridBagConstraints gbc_rdbtnRicarica = new GridBagConstraints();
		gbc_rdbtnRicarica.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnRicarica.gridx = 8;
		gbc_rdbtnRicarica.gridy = 1;
		panel_4.add(rdbtnRicarica, gbc_rdbtnRicarica);
		
		//JLabel lblTarga = new JLabel("Targa");
		GridBagConstraints gbc_lblTarga = new GridBagConstraints();
		gbc_lblTarga.anchor = GridBagConstraints.EAST;
		gbc_lblTarga.insets = new Insets(0, 0, 5, 5);
		gbc_lblTarga.gridx = 3;
		gbc_lblTarga.gridy = 2;
		panel_4.add(lblTarga, gbc_lblTarga);
		
		textTarga = new JTextField();
		GridBagConstraints gbc_textTarga = new GridBagConstraints();
		gbc_textTarga.insets = new Insets(0, 0, 5, 5);
		gbc_textTarga.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTarga.gridx = 4;
		gbc_textTarga.gridy = 2;
		panel_4.add(textTarga, gbc_textTarga);
		textTarga.setColumns(10);
		
		//JLabel lblCellulare = new JLabel("Cellulare");
		GridBagConstraints gbc_lblCellulare = new GridBagConstraints();
		gbc_lblCellulare.anchor = GridBagConstraints.EAST;
		gbc_lblCellulare.insets = new Insets(0, 0, 5, 5);
		gbc_lblCellulare.gridx = 7;
		gbc_lblCellulare.gridy = 2;
		panel_4.add(lblCellulare, gbc_lblCellulare);
		
		textCellulare = new JTextField();
		GridBagConstraints gbc_textCellulare = new GridBagConstraints();
		gbc_textCellulare.insets = new Insets(0, 0, 5, 5);
		gbc_textCellulare.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCellulare.gridx = 8;
		gbc_textCellulare.gridy = 2;
		panel_4.add(textCellulare, gbc_textCellulare);
		textCellulare.setColumns(10);
		
		//JLabel lblMarca = new JLabel("Marca");
		GridBagConstraints gbc_lblMarca = new GridBagConstraints();
		gbc_lblMarca.anchor = GridBagConstraints.EAST;
		gbc_lblMarca.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarca.gridx = 3;
		gbc_lblMarca.gridy = 3;
		panel_4.add(lblMarca, gbc_lblMarca);
		
		textMarca = new JTextField();
		GridBagConstraints gbc_textMarca = new GridBagConstraints();
		gbc_textMarca.insets = new Insets(0, 0, 5, 5);
		gbc_textMarca.fill = GridBagConstraints.HORIZONTAL;
		gbc_textMarca.gridx = 4;
		gbc_textMarca.gridy = 3;
		panel_4.add(textMarca, gbc_textMarca);
		textMarca.setColumns(10);
		
		//JLabel lblOperatore = new JLabel("Operatore");
		GridBagConstraints gbc_lblOperatore = new GridBagConstraints();
		gbc_lblOperatore.anchor = GridBagConstraints.EAST;
		gbc_lblOperatore.insets = new Insets(0, 0, 5, 5);
		gbc_lblOperatore.gridx = 7;
		gbc_lblOperatore.gridy = 3;
		panel_4.add(lblOperatore, gbc_lblOperatore);
		
		textOperatore = new JTextField();
		GridBagConstraints gbc_textOperatore = new GridBagConstraints();
		gbc_textOperatore.insets = new Insets(0, 0, 5, 5);
		gbc_textOperatore.fill = GridBagConstraints.HORIZONTAL;
		gbc_textOperatore.gridx = 8;
		gbc_textOperatore.gridy = 3;
		panel_4.add(textOperatore, gbc_textOperatore);
		textOperatore.setColumns(10);
		
		//JLabel lblModello = new JLabel("Modello");
		GridBagConstraints gbc_lblModello = new GridBagConstraints();
		gbc_lblModello.anchor = GridBagConstraints.EAST;
		gbc_lblModello.insets = new Insets(0, 0, 5, 5);
		gbc_lblModello.gridx = 3;
		gbc_lblModello.gridy = 4;
		panel_4.add(lblModello, gbc_lblModello);
		
		textModello = new JTextField();
		GridBagConstraints gbc_textModello = new GridBagConstraints();
		gbc_textModello.insets = new Insets(0, 0, 5, 5);
		gbc_textModello.fill = GridBagConstraints.HORIZONTAL;
		gbc_textModello.gridx = 4;
		gbc_textModello.gridy = 4;
		panel_4.add(textModello, gbc_textModello);
		textModello.setColumns(10);
		
		//JLabel lblCilindrata = new JLabel("Cilindrata");
		GridBagConstraints gbc_lblCilindrata = new GridBagConstraints();
		gbc_lblCilindrata.anchor = GridBagConstraints.EAST;
		gbc_lblCilindrata.insets = new Insets(0, 0, 5, 5);
		gbc_lblCilindrata.gridx = 3;
		gbc_lblCilindrata.gridy = 5;
		panel_4.add(lblCilindrata, gbc_lblCilindrata);
		
		textCilindrata = new JTextField();
		GridBagConstraints gbc_textCilindrata = new GridBagConstraints();
		gbc_textCilindrata.insets = new Insets(0, 0, 5, 5);
		gbc_textCilindrata.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCilindrata.gridx = 4;
		gbc_textCilindrata.gridy = 5;
		panel_4.add(textCilindrata, gbc_textCilindrata);
		textCilindrata.setColumns(10);
		
		//JLabel lblKwatt = new JLabel("Kwatt");
		GridBagConstraints gbc_lblKwatt = new GridBagConstraints();
		gbc_lblKwatt.anchor = GridBagConstraints.EAST;
		gbc_lblKwatt.insets = new Insets(0, 0, 5, 5);
		gbc_lblKwatt.gridx = 3;
		gbc_lblKwatt.gridy = 6;
		panel_4.add(lblKwatt, gbc_lblKwatt);
		
		textKwatt = new JTextField();
		GridBagConstraints gbc_textKwatt = new GridBagConstraints();
		gbc_textKwatt.insets = new Insets(0, 0, 5, 5);
		gbc_textKwatt.fill = GridBagConstraints.HORIZONTAL;
		gbc_textKwatt.gridx = 4;
		gbc_textKwatt.gridy = 6;
		panel_4.add(textKwatt, gbc_textKwatt);
		textKwatt.setColumns(10);
		
		JLabel lblImporto = new JLabel("Importo");
		GridBagConstraints gbc_lblImporto = new GridBagConstraints();
		gbc_lblImporto.anchor = GridBagConstraints.EAST;
		gbc_lblImporto.insets = new Insets(0, 0, 0, 5);
		gbc_lblImporto.gridx = 0;
		gbc_lblImporto.gridy = 8;
		panel_4.add(lblImporto, gbc_lblImporto);
		
		textImporto = new JTextField();
		GridBagConstraints gbc_textImporto = new GridBagConstraints();
		gbc_textImporto.insets = new Insets(0, 0, 0, 5);
		gbc_textImporto.fill = GridBagConstraints.HORIZONTAL;
		gbc_textImporto.gridx = 1;
		gbc_textImporto.gridy = 8;
		panel_4.add(textImporto, gbc_textImporto);
		textImporto.setColumns(10);
		
		
		/**
		 * Compongo i gruppi per i pulsanti Radio
		 * */
		
		ButtonGroup prodotti = new ButtonGroup();
		prodotti.add(rdbtnContoCorrente);
		prodotti.add(rdbtnCartaPrepagata);
		
		ButtonGroup servizi = new ButtonGroup();
		servizi.add(rdbtnVersamento);
		servizi.add(rdbtnPrelievo);
		servizi.add(rdbtnBollo);
		servizi.add(rdbtnRicarica);
		
		
		/**
		 * Imposto gli ascoltatori
		 * */
		
		FrameOpDispositiveListener opDispositiveListener = new FrameOpDispositiveListener(this);
		
		/**
		 * Aggiungo gli ascoltatori
		 * */
		
		this.rdbtnContoCorrente.addActionListener(opDispositiveListener);
		this.rdbtnCartaPrepagata.addActionListener(opDispositiveListener);
		this.rdbtnVersamento.addActionListener(opDispositiveListener);
		this.rdbtnPrelievo.addActionListener(opDispositiveListener);
		this.rdbtnBollo.addActionListener(opDispositiveListener);
		this.rdbtnRicarica.addActionListener(opDispositiveListener);
		this.btnOk.addActionListener(opDispositiveListener);
		this.btnAnnulla.addActionListener(opDispositiveListener);
	
		
		/**
		 * Setto gli ascoltatori
		 * */
		this.rdbtnContoCorrente.setActionCommand(opDispositiveListener.RADIO_BTN_CONTO_C);
		this.rdbtnCartaPrepagata.setActionCommand(opDispositiveListener.RADIO_BTN_CARTA_P);
		this.rdbtnVersamento.setActionCommand(opDispositiveListener.RADIO_BTN_VERSAMENTO);
		this.rdbtnPrelievo.setActionCommand(opDispositiveListener.RADIO_BTN_PRELIEVO);
		this.rdbtnBollo.setActionCommand(opDispositiveListener.RADIO_BTN_BOLLO);
		this.rdbtnRicarica.setActionCommand(opDispositiveListener.RADIO_BTN_RICARICA_C);
		this.btnOk.setActionCommand(opDispositiveListener.PULSANTE_OK);
		this.btnAnnulla.setActionCommand(opDispositiveListener.PULSANTE_ANNULLA);
		
		
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
		
		if(!bolloAuto) {
			
			this.spegniTuttoBollo();
			
		}
		
		if(!ricaricaCell) {
			
			this.spegniTuttoRicaricaCell();
			
		}
		
		
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
	 * Spegni la parde del versamento
	 * */
	public void spegniVersamento() {
		
		rdbtnVersamento.setSelected(false);
	}
	
	/**
	 * Accendi la parte del versamento
	 * */
	public void accendiVersamento() {
		
		rdbtnVersamento.setSelected(true);
	}
	
	/**
	 * Spegni la parte del prelievo
	 * */
	public void spegniPrelievo() {
		
		rdbtnPrelievo.setSelected(false);
		
	}
	
	/**
	 * Accendi la parte del prelievo
	 * */
	public void accendiPrelievo() {
		
		rdbtnPrelievo.setSelected(true);
		
	}
	
	/**
	 * Spegni tutto il settore del bollo auto
	 * */
	private void spegniTuttoBollo() {
		
		rdbtnBollo.setEnabled(false);
		lblTarga.setEnabled(false);
		textTarga.setEnabled(false);
		lblMarca.setEnabled(false);
		textMarca.setEnabled(false);
		lblModello.setEnabled(false);
		textModello.setEnabled(false);
		lblCilindrata.setEnabled(false);
		textCilindrata.setEnabled(false);
		lblKwatt.setEnabled(false);
		textKwatt.setEnabled(false);
	}
	
	/**
	 * Spegni il settore bollo, ma è selezionabile
	 * */
	public void spegniBollo() {
		
		rdbtnBollo.setSelected(false);;
		lblTarga.setEnabled(false);
		textTarga.setEnabled(false);
		lblMarca.setEnabled(false);
		textMarca.setEnabled(false);
		lblModello.setEnabled(false);
		textModello.setEnabled(false);
		lblCilindrata.setEnabled(false);
		textCilindrata.setEnabled(false);
		lblKwatt.setEnabled(false);
		textKwatt.setEnabled(false);
		
	}
	
	/**
	 * Accendi tutto il settore bollo
	 * */
	public void accendiBollo() {
		
		rdbtnBollo.setSelected(true);;
		lblTarga.setEnabled(true);
		textTarga.setEnabled(true);
		lblMarca.setEnabled(true);
		textMarca.setEnabled(true);
		lblModello.setEnabled(true);
		textModello.setEnabled(true);
		lblCilindrata.setEnabled(true);
		textCilindrata.setEnabled(true);
		lblKwatt.setEnabled(true);
		textKwatt.setEnabled(true);
		
	}
	
	/**
	 * Spegni tutto il settore ricarica cellulare, NON è selezionabile
	 * */
	private void spegniTuttoRicaricaCell() {
		
		rdbtnRicarica.setEnabled(false);
		lblCellulare.setEnabled(false);
		textCellulare.setEnabled(false);
		lblOperatore.setEnabled(false);
		textOperatore.setEnabled(false);
	}
	
	/**
	 * Spegni il settore ricarica cellulare, ma è selezionabile
	 * */
	public void spegniRicaricaCell() {
		
		rdbtnRicarica.setSelected(false);
		lblCellulare.setEnabled(false);
		textCellulare.setEnabled(false);
		lblOperatore.setEnabled(false);
		textOperatore.setEnabled(false);
	}
	
	
	/**
	 * Accendi il settore ricarica cellulare
	 * */
	public void accendiRicaricaCell() {
		
		rdbtnRicarica.setSelected(true);
		lblCellulare.setEnabled(true);
		textCellulare.setEnabled(true);
		lblOperatore.setEnabled(true);
		textOperatore.setEnabled(true);
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
	
	/**
	 * Ritorna il valore del radio button del Versamento
	 * @return TRUE se è selezionato, FALSE altrimenti
	 * */
	public boolean getRadioBtnVersamento() {
		
		return this.rdbtnVersamento.isSelected();
	}
	
	/**
	 * Ritorna il valore del radio button del Prelievo 
	 * @return TRUE se è selezionato, FALSE altrimenti
	 * */
	public boolean getRadioBtnPrelievo() {
		
		return this.rdbtnPrelievo.isSelected();
	}
	
	/**
	 * Ritorna il valore del radio button del bollo 
	 * @return TRUE se è selezionato, FALSE altrimenti
	 * */
	public boolean getRadioBtnBollo() {
		
		return this.rdbtnBollo.isSelected();
	}
	
	/**
	 * Ritorna il valore del radio button della Ricarica 
	 * @return TRUE se è selezionato, FALSE altrimenti
	 * */
	public boolean getRadioBtnRicarica() {
		
		return this.rdbtnRicarica.isSelected();
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
	 * Mi restituisce il valore dell'importo scelto
	 * @return la Stringa dell'importo
	 * */
	public String getImporto() {
		
		return this.textImporto.getText();
	}
	
	/**
	 * Mi restituisce il valore della targa inserita
	 * @return la Stringa della targa
	 * */
	public String getTarga() {
		
		return this.textTarga.getText();
	}

	/**
	 * Mi restituisce il valore della marca inserita
	 * @return la Stringa della marca
	 * */
	public String getMarca() {
		
		return this.textMarca.getText();
	}
	
	/**
	 * Mi restituisce il valore del modello inserito
	 * @return la Stringa del modello
	 * */
	public String getModello() {
		
		return this.textModello.getText();
	}

	/**
	 * Mi restituisce il valore della cilindrata
	 * @return la Stringa della cilindrata
	 * */
	public String getCilindrata() {
		
		return this.textCilindrata.getText();
	}

	/**
	 * Mi restituisce il valore dei Kwatt inseriti
	 * @return la Stringa deli Kwatt
	 * */
	public String getKwatt() {
		
		return this.textKwatt.getText();
	}

	/**
	 * Mi restituisce il valore del numero di cellulare inserito
	 * @return la Stringa del numero di cellulare
	 * */
	public String getCellulare() {
		
		return this.textCellulare.getText();
	}
	
	/**
	 * Mi restituisce il valore dell' operatore telefonico inserito
	 * @return la Stringa dell'operatore
	 * */
	public String getOperatore() {
		
		return this.textOperatore.getText();
	}
	
	/**
	 * Inizializza il frame 
	 * */
	private void azzeraFrame() {
		
		comboBoxContoCorrente.setEnabled(false);
		comboBoxCartaPrepagata.setEnabled(false);
		
		lblTarga.setEnabled(false);
		textTarga.setEnabled(false);
		lblMarca.setEnabled(false);
		textMarca.setEnabled(false);
		lblModello.setEnabled(false);
		textModello.setEnabled(false);
		lblCilindrata.setEnabled(false);
		textCilindrata.setEnabled(false);
		lblKwatt.setEnabled(false);
		textKwatt.setEnabled(false);
		
		lblCellulare.setEnabled(false);
		textCellulare.setEnabled(false);
		lblOperatore.setEnabled(false);
		textOperatore.setEnabled(false);		
		
	}

}
