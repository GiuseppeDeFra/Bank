package it.unisalento.pps.progettoEsame.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;


import it.unisalento.pps.progettoEsame.view.actionListener.CreaFilialeListener;

import java.awt.Color;

public class FrameCreaFiliale extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textVia;
	private JTextField textCitta;
	private JTextField textProvincia;
	
	public JTextField textImmagineUno;
	public JTextField textImmagineDue;
	public JTextField textImmagineTre;
	
	//Lunedi
	private JLabel lblLunedi = new JLabel("Lunedi");
	private JCheckBox chckbxLunedi = new JCheckBox("Aperto");
	private JLabel lblAperturaLunedi = new JLabel("Apertura");
	private JLabel lblOreAperturaLunedi = new JLabel("Ore");
	private JLabel label = new JLabel(":");
	private JLabel lblMinutiAperturaLunedi = new JLabel("Minuti");
	private JComboBox comboBoxOreAperturaLunedi = new JComboBox();
	private JComboBox comboBoxMinutiAperturaLunedi = new JComboBox();
	private JLabel lblChiusuraLunedi = new JLabel("Chiusura");
	private JLabel lblOreChiusuraLunedi = new JLabel("Ore");
	private JLabel label_1 = new JLabel(":");
	private JLabel lblMinutiChiusuraLunedi = new JLabel("Minuti");
	private JComboBox comboBoxOreChiusuraLunedi = new JComboBox();
	private JComboBox comboBoxMinutiChiusuraLunedi = new JComboBox();
	
	
	//Martedi
	private JLabel lblMartedi = new JLabel("Martedi");
	private JCheckBox checkBoxMartedi = new JCheckBox("Aperto");
	private JLabel labelAperturaMartedi = new JLabel("Apertura");
	private JLabel labelOreAperturaMartedi = new JLabel("Ore");
	private JLabel label_5 = new JLabel(":");
	private JLabel labelMinutiAperturaMartedi = new JLabel("Minuti");
	private JComboBox comboBoxOreAperturaMartedi = new JComboBox();
	private JComboBox comboBoxMinutiAperturaMartedi = new JComboBox();
	private JLabel labelChiusuraMartedi = new JLabel("Chiusura");
	private JLabel labelOreChiusuraMartedi = new JLabel("Ore");
	private JLabel label_9 = new JLabel(":");
	private JLabel labelMinutiChiusuraMartedi = new JLabel("Minuti");
	private JComboBox comboBoxOreChiusuraMartedi = new JComboBox();
	private JComboBox comboBoxMinutiChiusuraMartedi = new JComboBox();
	
	//Mercoledi
	private JLabel lblMercoledi = new JLabel("Mercoledi");
	private JCheckBox checkBoxMercoledi = new JCheckBox("Aperto");
	private JLabel labelMercoledi = new JLabel("Apertura");
	private JLabel labelOreApertutaMercoledi = new JLabel("Ore");
	private JLabel label_14 = new JLabel(":");
	private JLabel labelMinutiAperturaMercoledi = new JLabel("Minuti");
	private JComboBox comboBoxOreAperturaMercoledi = new JComboBox();
	private JComboBox comboBoxMinutiAperturaMercoledi = new JComboBox();
	private JLabel labelChiusuraMercoledi = new JLabel("Chiusura");
	private JLabel labelOreChiusuraMercoledi = new JLabel("Ore");
	private JLabel label_18 = new JLabel(":");
	private JLabel labelMinutiChiusuraMercoledi = new JLabel("Minuti");
	private JComboBox comboBoxOreChiusuraMercoledi = new JComboBox();
	private JComboBox comboBoxMinutiChiusuraMercoledi = new JComboBox();
	
	
	//Giovedi
	private JLabel lblGiovedi = new JLabel("Giovedi");
	private JCheckBox checkBoxGiovedi = new JCheckBox("Aperto");
	private JLabel labelAperturaGiovedi = new JLabel("Apertura");
	private JPanel panelMercoledi = new JPanel();
	private JLabel labelOreAperturaGiovedi = new JLabel("Ore");
	private JLabel label_23 = new JLabel(":");
	private JLabel labelMinutiAperturaGiovedi = new JLabel("Minuti");
	private JComboBox comboBoxOreAperturaGiovedi = new JComboBox();
	private JComboBox comboBoxMinutiAperturaGiovedi = new JComboBox();
	private JLabel labelChiusuraGiovedi = new JLabel("Chiusura");
	private JLabel labelOreChiusuraGiovedi = new JLabel("Ore");
	private JLabel label_27 = new JLabel(":");
	private JLabel labelMinutiChiusuraGiovedi = new JLabel("Minuti");
	private JComboBox comboBoxOreChiusuraGiovedi = new JComboBox();
	private JComboBox comboBoxMinutiChiusuraGiovedi = new JComboBox();
	
	
	//Venerdi
	private JLabel lblVenerdi = new JLabel("Venerdi");
	private JCheckBox checkBoxVenerdi = new JCheckBox("Aperto");
	private JLabel labelAperturaVenerdi = new JLabel("Apertura");
	private JLabel labelOreAperturaVenerdi = new JLabel("Ore");
	private JLabel label_32 = new JLabel(":");
	private JLabel labelMinutiAperturaVenerdi = new JLabel("Minuti");
	private JComboBox comboBoxOreAperturaVenerdi = new JComboBox();
	private JComboBox comboBoxMinutiAperturaVenerdi = new JComboBox();
	private JLabel labelChiusuraVenerdi = new JLabel("Chiusura");
	private JLabel labelOreChiusuraVenerdi = new JLabel("Ore");
	private JLabel label_36 = new JLabel(":");
	private JLabel labelMinutiChiusuraVenerdi = new JLabel("Minuti");
	private JComboBox comboBoxOreChiusuraVenerdi = new JComboBox();
	private JComboBox comboBoxMinutiChiusuraVenerdi = new JComboBox();
	
	
	//Sabato
	private JLabel lblSabato = new JLabel("Sabato");
	private JCheckBox checkBoxSabato = new JCheckBox("Aperto");
	private JLabel labelAperturaSabato = new JLabel("Apertura");
	private JLabel labelOreAperturaSabato = new JLabel("Ore");
	private JLabel label_41 = new JLabel(":");
	private JLabel labelMinutiAperturaSabato = new JLabel("Minuti");
	private JComboBox comboBoxOreAperturaSabato = new JComboBox();
	private JComboBox comboBoxMinutiAperturaSabato = new JComboBox();
	private JLabel labelChiusuraSabato = new JLabel("Chiusura");
	private JLabel labelOreChiusuraSabato = new JLabel("Ore");
	private JLabel label_45 = new JLabel(":");
	private JLabel labelMinutiChiusuraSabato = new JLabel("Minuti");
	private JComboBox comboBoxOreChiusuraSabato = new JComboBox();
	private JComboBox comboBoxMinutiChiusuraSabato = new JComboBox();
	
	
	//Domenica
	private JLabel lblDomenica = new JLabel("Domenica");
	private JCheckBox checkBoxDomenica = new JCheckBox("Aperto");
	private JLabel labelAperturaDomenica = new JLabel("Apertura");
	private JLabel labelOreAperturaDomenica = new JLabel("Ore");
	private JLabel label_50 = new JLabel(":");
	private JLabel labelMinutiAperturaDomenica = new JLabel("Minuti");
	private JComboBox comboBoxOreAperturaDomenica = new JComboBox();
	private JComboBox comboBoxMinutiAperturaDomenica = new JComboBox();
	private JLabel labelChiusuraDomenica = new JLabel("Chiusura");
	private JLabel labelOreChiusuraDomenica = new JLabel("Ore");
	private JLabel label_54 = new JLabel(":");
	private JLabel labelMinutiChiusuraDomenica = new JLabel("Minuti");
	private JComboBox comboBoxOreChiusuraDomenica = new JComboBox();
	private JComboBox comboBoxMinutiChiusuraDomenica = new JComboBox();
	
	/*
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCreaFiliale frame = new FrameCreaFiliale();
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
	public FrameCreaFiliale() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 997, 549);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnOk = new JButton("Ok");
		panel.add(btnOk);
		
		JButton btnAnnulla = new JButton("Annulla");
		panel.add(btnAnnulla);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] {49, 0, 56, 0, 5};
		gbl_panel_2.rowHeights = new int[] {27, 0, 0, 0, 0, 0, 0, 0, 9};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblDescrizione = new JLabel("Inserisci i dati di una filiale:");
		GridBagConstraints gbc_lblDescrizione = new GridBagConstraints();
		gbc_lblDescrizione.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescrizione.gridx = 0;
		gbc_lblDescrizione.gridy = 0;
		panel_2.add(lblDescrizione, gbc_lblDescrizione);
		
		JLabel lblNome = new JLabel("Nome");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 1;
		gbc_lblNome.gridy = 1;
		panel_2.add(lblNome, gbc_lblNome);
		
		textNome = new JTextField();
		GridBagConstraints gbc_textNome = new GridBagConstraints();
		gbc_textNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNome.insets = new Insets(0, 0, 5, 5);
		gbc_textNome.gridx = 2;
		gbc_textNome.gridy = 1;
		panel_2.add(textNome, gbc_textNome);
		textNome.setColumns(10);
		
		JLabel lblVia = new JLabel("Via");
		GridBagConstraints gbc_lblVia = new GridBagConstraints();
		gbc_lblVia.anchor = GridBagConstraints.EAST;
		gbc_lblVia.insets = new Insets(0, 0, 5, 5);
		gbc_lblVia.gridx = 1;
		gbc_lblVia.gridy = 2;
		panel_2.add(lblVia, gbc_lblVia);
		
		textVia = new JTextField();
		textVia.setColumns(10);
		GridBagConstraints gbc_textVia = new GridBagConstraints();
		gbc_textVia.fill = GridBagConstraints.HORIZONTAL;
		gbc_textVia.insets = new Insets(0, 0, 5, 5);
		gbc_textVia.gridx = 2;
		gbc_textVia.gridy = 2;
		panel_2.add(textVia, gbc_textVia);
		
		JLabel lblCitta = new JLabel("Citta");
		GridBagConstraints gbc_lblCitta = new GridBagConstraints();
		gbc_lblCitta.anchor = GridBagConstraints.EAST;
		gbc_lblCitta.insets = new Insets(0, 0, 5, 5);
		gbc_lblCitta.gridx = 1;
		gbc_lblCitta.gridy = 3;
		panel_2.add(lblCitta, gbc_lblCitta);
		
		textCitta = new JTextField();
		textCitta.setColumns(10);
		GridBagConstraints gbc_textCitta = new GridBagConstraints();
		gbc_textCitta.fill = GridBagConstraints.HORIZONTAL;
		gbc_textCitta.insets = new Insets(0, 0, 5, 5);
		gbc_textCitta.gridx = 2;
		gbc_textCitta.gridy = 3;
		panel_2.add(textCitta, gbc_textCitta);
		
		JLabel lblProvincia = new JLabel("Provincia");
		GridBagConstraints gbc_lblProvincia = new GridBagConstraints();
		gbc_lblProvincia.anchor = GridBagConstraints.EAST;
		gbc_lblProvincia.insets = new Insets(0, 0, 5, 5);
		gbc_lblProvincia.gridx = 1;
		gbc_lblProvincia.gridy = 4;
		panel_2.add(lblProvincia, gbc_lblProvincia);
		
		textProvincia = new JTextField();
		textProvincia.setColumns(10);
		GridBagConstraints gbc_textProvincia = new GridBagConstraints();
		gbc_textProvincia.fill = GridBagConstraints.HORIZONTAL;
		gbc_textProvincia.insets = new Insets(0, 0, 5, 5);
		gbc_textProvincia.gridx = 2;
		gbc_textProvincia.gridy = 4;
		panel_2.add(textProvincia, gbc_textProvincia);
		
		JLabel lblImmagineUno = new JLabel("Immagine Uno");
		GridBagConstraints gbc_lblImmagineUno = new GridBagConstraints();
		gbc_lblImmagineUno.anchor = GridBagConstraints.EAST;
		gbc_lblImmagineUno.insets = new Insets(0, 0, 5, 5);
		gbc_lblImmagineUno.gridx = 1;
		gbc_lblImmagineUno.gridy = 5;
		panel_2.add(lblImmagineUno, gbc_lblImmagineUno);
		
		textImmagineUno = new JTextField();
		textImmagineUno.setColumns(10);
		GridBagConstraints gbc_textImmagineUno = new GridBagConstraints();
		gbc_textImmagineUno.fill = GridBagConstraints.HORIZONTAL;
		gbc_textImmagineUno.insets = new Insets(0, 0, 5, 5);
		gbc_textImmagineUno.gridx = 2;
		gbc_textImmagineUno.gridy = 5;
		panel_2.add(textImmagineUno, gbc_textImmagineUno);
		
		JButton btnCaricaUno = new JButton("Carica...");
		GridBagConstraints gbc_btnCaricaUno = new GridBagConstraints();
		gbc_btnCaricaUno.insets = new Insets(0, 0, 5, 0);
		gbc_btnCaricaUno.gridx = 3;
		gbc_btnCaricaUno.gridy = 5;
		panel_2.add(btnCaricaUno, gbc_btnCaricaUno);
		
		JLabel lblImmagineDue = new JLabel("Immagine Due");
		GridBagConstraints gbc_lblImmagineDue = new GridBagConstraints();
		gbc_lblImmagineDue.anchor = GridBagConstraints.EAST;
		gbc_lblImmagineDue.insets = new Insets(0, 0, 5, 5);
		gbc_lblImmagineDue.gridx = 1;
		gbc_lblImmagineDue.gridy = 6;
		panel_2.add(lblImmagineDue, gbc_lblImmagineDue);
		
		textImmagineDue = new JTextField();
		textImmagineDue.setColumns(10);
		GridBagConstraints gbc_textImmagineDue = new GridBagConstraints();
		gbc_textImmagineDue.fill = GridBagConstraints.HORIZONTAL;
		gbc_textImmagineDue.insets = new Insets(0, 0, 5, 5);
		gbc_textImmagineDue.gridx = 2;
		gbc_textImmagineDue.gridy = 6;
		panel_2.add(textImmagineDue, gbc_textImmagineDue);
		
		JButton btnCaricaDue = new JButton("Carica...");
		GridBagConstraints gbc_btnCaricaDue = new GridBagConstraints();
		gbc_btnCaricaDue.insets = new Insets(0, 0, 5, 0);
		gbc_btnCaricaDue.gridx = 3;
		gbc_btnCaricaDue.gridy = 6;
		panel_2.add(btnCaricaDue, gbc_btnCaricaDue);
		
		JLabel lblImmagineTre = new JLabel("Immagine Tre");
		GridBagConstraints gbc_lblImmagineTre = new GridBagConstraints();
		gbc_lblImmagineTre.anchor = GridBagConstraints.EAST;
		gbc_lblImmagineTre.insets = new Insets(0, 0, 0, 5);
		gbc_lblImmagineTre.gridx = 1;
		gbc_lblImmagineTre.gridy = 7;
		panel_2.add(lblImmagineTre, gbc_lblImmagineTre);
		
		textImmagineTre = new JTextField();
		textImmagineTre.setColumns(10);
		GridBagConstraints gbc_textImmagineTre = new GridBagConstraints();
		gbc_textImmagineTre.insets = new Insets(0, 0, 0, 5);
		gbc_textImmagineTre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textImmagineTre.gridx = 2;
		gbc_textImmagineTre.gridy = 7;
		panel_2.add(textImmagineTre, gbc_textImmagineTre);
		
		JButton btnCaricaTre = new JButton("Carica...");
		GridBagConstraints gbc_btnCaricaTre = new GridBagConstraints();
		gbc_btnCaricaTre.gridx = 3;
		gbc_btnCaricaTre.gridy = 7;
		panel_2.add(btnCaricaTre, gbc_btnCaricaTre);
		
		//Giorni di apertura
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(15, 0, 0, 0));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 7, 0, 0));
		
		JPanel panelLunedi = new JPanel();
		panelLunedi.setBorder(new LineBorder(Color.BLACK));
		panel_3.add(panelLunedi);
		GridBagLayout gbl_panelLunedi = new GridBagLayout();
		gbl_panelLunedi.columnWidths = new int[]{0, 10, 0, 0};
		gbl_panelLunedi.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelLunedi.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelLunedi.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelLunedi.setLayout(gbl_panelLunedi);
		
		
		//Lunedi
		
		//JLabel lblLunedi = new JLabel("Lunedi");
		GridBagConstraints gbc_lblLunedi = new GridBagConstraints();
		gbc_lblLunedi.insets = new Insets(0, 0, 5, 5);
		gbc_lblLunedi.gridx = 0;
		gbc_lblLunedi.gridy = 0;
		panelLunedi.add(lblLunedi, gbc_lblLunedi);
		
		//JCheckBox chckbxLunedi = new JCheckBox("Aperto");
		GridBagConstraints gbc_chckbxLunedi = new GridBagConstraints();
		gbc_chckbxLunedi.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxLunedi.gridx = 2;
		gbc_chckbxLunedi.gridy = 0;
		panelLunedi.add(chckbxLunedi, gbc_chckbxLunedi);
		
		//JLabel lblAperturaLunedi = new JLabel("Apertura");
		GridBagConstraints gbc_lblAperturaLunedi = new GridBagConstraints();
		gbc_lblAperturaLunedi.insets = new Insets(0, 0, 5, 5);
		gbc_lblAperturaLunedi.gridx = 0;
		gbc_lblAperturaLunedi.gridy = 2;
		panelLunedi.add(lblAperturaLunedi, gbc_lblAperturaLunedi);
		
		//JLabel lblOreAperturaLunedi = new JLabel("Ore");
		GridBagConstraints gbc_lblOreAperturaLunedi = new GridBagConstraints();
		gbc_lblOreAperturaLunedi.insets = new Insets(0, 0, 5, 5);
		gbc_lblOreAperturaLunedi.gridx = 0;
		gbc_lblOreAperturaLunedi.gridy = 3;
		panelLunedi.add(lblOreAperturaLunedi, gbc_lblOreAperturaLunedi);
		
		//JLabel label = new JLabel(":");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 1;
		gbc_label.gridy = 3;
		panelLunedi.add(label, gbc_label);
		
		//JLabel lblMinutiAperturaLunedi = new JLabel("Minuti");
		GridBagConstraints gbc_lblMinutiAperturaLunedi = new GridBagConstraints();
		gbc_lblMinutiAperturaLunedi.insets = new Insets(0, 0, 5, 0);
		gbc_lblMinutiAperturaLunedi.gridx = 2;
		gbc_lblMinutiAperturaLunedi.gridy = 3;
		panelLunedi.add(lblMinutiAperturaLunedi, gbc_lblMinutiAperturaLunedi);
		
		//JComboBox comboBoxOreAperturaLunedi = new JComboBox();
		comboBoxOreAperturaLunedi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comboBoxOreAperturaLunedi.setToolTipText("");
		GridBagConstraints gbc_comboBoxOreAperturaLunedi = new GridBagConstraints();
		gbc_comboBoxOreAperturaLunedi.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxOreAperturaLunedi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOreAperturaLunedi.gridx = 0;
		gbc_comboBoxOreAperturaLunedi.gridy = 4;
		panelLunedi.add(comboBoxOreAperturaLunedi, gbc_comboBoxOreAperturaLunedi);
		
		//JComboBox comboBoxMinutiAperturaLunedi = new JComboBox();
		comboBoxMinutiAperturaLunedi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		GridBagConstraints gbc_comboBoxMinutiAperturaLunedi = new GridBagConstraints();
		gbc_comboBoxMinutiAperturaLunedi.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxMinutiAperturaLunedi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMinutiAperturaLunedi.gridx = 2;
		gbc_comboBoxMinutiAperturaLunedi.gridy = 4;
		panelLunedi.add(comboBoxMinutiAperturaLunedi, gbc_comboBoxMinutiAperturaLunedi);
		
		//JLabel lblChiusuraLunedi = new JLabel("Chiusura");
		GridBagConstraints gbc_lblChiusuraLunedi = new GridBagConstraints();
		gbc_lblChiusuraLunedi.insets = new Insets(0, 0, 5, 5);
		gbc_lblChiusuraLunedi.gridx = 0;
		gbc_lblChiusuraLunedi.gridy = 6;
		panelLunedi.add(lblChiusuraLunedi, gbc_lblChiusuraLunedi);
		
		//JLabel lblOreChiusuraLunedi = new JLabel("Ore");
		GridBagConstraints gbc_lblOreChiusuraLunedi = new GridBagConstraints();
		gbc_lblOreChiusuraLunedi.insets = new Insets(0, 0, 5, 5);
		gbc_lblOreChiusuraLunedi.gridx = 0;
		gbc_lblOreChiusuraLunedi.gridy = 7;
		panelLunedi.add(lblOreChiusuraLunedi, gbc_lblOreChiusuraLunedi);
		
		//JLabel label_1 = new JLabel(":");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 7;
		panelLunedi.add(label_1, gbc_label_1);
		
		//JLabel lblMinutiChiusuraLunedi = new JLabel("Minuti");
		GridBagConstraints gbc_lblMinutiChiusuraLunedi = new GridBagConstraints();
		gbc_lblMinutiChiusuraLunedi.insets = new Insets(0, 0, 5, 0);
		gbc_lblMinutiChiusuraLunedi.gridx = 2;
		gbc_lblMinutiChiusuraLunedi.gridy = 7;
		panelLunedi.add(lblMinutiChiusuraLunedi, gbc_lblMinutiChiusuraLunedi);
		
		//JComboBox comboBoxOreChiusuraLunedi = new JComboBox();
		comboBoxOreChiusuraLunedi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		GridBagConstraints gbc_comboBoxOreChiusuraLunedi = new GridBagConstraints();
		gbc_comboBoxOreChiusuraLunedi.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxOreChiusuraLunedi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOreChiusuraLunedi.gridx = 0;
		gbc_comboBoxOreChiusuraLunedi.gridy = 8;
		panelLunedi.add(comboBoxOreChiusuraLunedi, gbc_comboBoxOreChiusuraLunedi);
		
		//JComboBox comboBoxMinutiChiusuraLunedi = new JComboBox();
		comboBoxMinutiChiusuraLunedi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		GridBagConstraints gbc_comboBoxMinutiChiusuraLunedi = new GridBagConstraints();
		gbc_comboBoxMinutiChiusuraLunedi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMinutiChiusuraLunedi.gridx = 2;
		gbc_comboBoxMinutiChiusuraLunedi.gridy = 8;
		panelLunedi.add(comboBoxMinutiChiusuraLunedi, gbc_comboBoxMinutiChiusuraLunedi);
		
		JPanel panelMartedi = new JPanel();
		panelMartedi.setBorder(new LineBorder(Color.BLACK));
		panel_3.add(panelMartedi);
		GridBagLayout gbl_panelMartedi = new GridBagLayout();
		gbl_panelMartedi.columnWidths = new int[]{0, 10, 0, 0};
		gbl_panelMartedi.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelMartedi.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelMartedi.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelMartedi.setLayout(gbl_panelMartedi);
		
		//JLabel lblMartedi = new JLabel("Martedi");
		GridBagConstraints gbc_lblMartedi = new GridBagConstraints();
		gbc_lblMartedi.insets = new Insets(0, 0, 5, 5);
		gbc_lblMartedi.gridx = 0;
		gbc_lblMartedi.gridy = 0;
		panelMartedi.add(lblMartedi, gbc_lblMartedi);
		
		//JCheckBox checkBoxMartedi = new JCheckBox("Aperto");
		GridBagConstraints gbc_checkBoxMartedi = new GridBagConstraints();
		gbc_checkBoxMartedi.insets = new Insets(0, 0, 5, 0);
		gbc_checkBoxMartedi.gridx = 2;
		gbc_checkBoxMartedi.gridy = 0;
		panelMartedi.add(checkBoxMartedi, gbc_checkBoxMartedi);
		
		//JLabel labelAperturaMartedi = new JLabel("Apertura");
		GridBagConstraints gbc_labelAperturaMartedi = new GridBagConstraints();
		gbc_labelAperturaMartedi.insets = new Insets(0, 0, 5, 5);
		gbc_labelAperturaMartedi.gridx = 0;
		gbc_labelAperturaMartedi.gridy = 2;
		panelMartedi.add(labelAperturaMartedi, gbc_labelAperturaMartedi);
		
		//JLabel labelOreAperturaMartedi = new JLabel("Ore");
		GridBagConstraints gbc_labelOreAperturaMartedi = new GridBagConstraints();
		gbc_labelOreAperturaMartedi.insets = new Insets(0, 0, 5, 5);
		gbc_labelOreAperturaMartedi.gridx = 0;
		gbc_labelOreAperturaMartedi.gridy = 3;
		panelMartedi.add(labelOreAperturaMartedi, gbc_labelOreAperturaMartedi);
		
		//JLabel label_5 = new JLabel(":");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 5);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 3;
		panelMartedi.add(label_5, gbc_label_5);
		
		//JLabel labelMinutiAperturaMartedi = new JLabel("Minuti");
		GridBagConstraints gbc_labelMinutiAperturaMartedi = new GridBagConstraints();
		gbc_labelMinutiAperturaMartedi.insets = new Insets(0, 0, 5, 0);
		gbc_labelMinutiAperturaMartedi.gridx = 2;
		gbc_labelMinutiAperturaMartedi.gridy = 3;
		panelMartedi.add(labelMinutiAperturaMartedi, gbc_labelMinutiAperturaMartedi);
		
		//JComboBox comboBoxOreAperturaMartedi = new JComboBox();
		comboBoxOreAperturaMartedi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comboBoxOreAperturaMartedi.setToolTipText("");
		GridBagConstraints gbc_comboBoxOreAperturaMartedi = new GridBagConstraints();
		gbc_comboBoxOreAperturaMartedi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOreAperturaMartedi.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxOreAperturaMartedi.gridx = 0;
		gbc_comboBoxOreAperturaMartedi.gridy = 4;
		panelMartedi.add(comboBoxOreAperturaMartedi, gbc_comboBoxOreAperturaMartedi);
		
		//JComboBox comboBoxMinutiAperturaMartedi = new JComboBox();
		comboBoxMinutiAperturaMartedi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		GridBagConstraints gbc_comboBoxMinutiAperturaMartedi = new GridBagConstraints();
		gbc_comboBoxMinutiAperturaMartedi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMinutiAperturaMartedi.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxMinutiAperturaMartedi.gridx = 2;
		gbc_comboBoxMinutiAperturaMartedi.gridy = 4;
		panelMartedi.add(comboBoxMinutiAperturaMartedi, gbc_comboBoxMinutiAperturaMartedi);
		
		//JLabel labelChiusuraMartedi = new JLabel("Chiusura");
		GridBagConstraints gbc_labelChiusuraMartedi = new GridBagConstraints();
		gbc_labelChiusuraMartedi.insets = new Insets(0, 0, 5, 5);
		gbc_labelChiusuraMartedi.gridx = 0;
		gbc_labelChiusuraMartedi.gridy = 6;
		panelMartedi.add(labelChiusuraMartedi, gbc_labelChiusuraMartedi);
		
		//JLabel labelOreChiusuraMartedi = new JLabel("Ore");
		GridBagConstraints gbc_labelOreChiusuraMartedi = new GridBagConstraints();
		gbc_labelOreChiusuraMartedi.insets = new Insets(0, 0, 5, 5);
		gbc_labelOreChiusuraMartedi.gridx = 0;
		gbc_labelOreChiusuraMartedi.gridy = 7;
		panelMartedi.add(labelOreChiusuraMartedi, gbc_labelOreChiusuraMartedi);
		
		//JLabel label_9 = new JLabel(":");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.insets = new Insets(0, 0, 5, 5);
		gbc_label_9.gridx = 1;
		gbc_label_9.gridy = 7;
		panelMartedi.add(label_9, gbc_label_9);
		
		//JLabel labelMinutiChiusuraMartedi = new JLabel("Minuti");
		GridBagConstraints gbc_labelMinutiChiusuraMartedi = new GridBagConstraints();
		gbc_labelMinutiChiusuraMartedi.insets = new Insets(0, 0, 5, 0);
		gbc_labelMinutiChiusuraMartedi.gridx = 2;
		gbc_labelMinutiChiusuraMartedi.gridy = 7;
		panelMartedi.add(labelMinutiChiusuraMartedi, gbc_labelMinutiChiusuraMartedi);
		
		//JComboBox comboBoxOreChiusuraMartedi = new JComboBox();
		comboBoxOreChiusuraMartedi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		GridBagConstraints gbc_comboBoxOreChiusuraMartedi = new GridBagConstraints();
		gbc_comboBoxOreChiusuraMartedi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOreChiusuraMartedi.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxOreChiusuraMartedi.gridx = 0;
		gbc_comboBoxOreChiusuraMartedi.gridy = 8;
		panelMartedi.add(comboBoxOreChiusuraMartedi, gbc_comboBoxOreChiusuraMartedi);
		
		//JComboBox comboBoxMinutiChiusuraMartedi = new JComboBox();
		comboBoxMinutiChiusuraMartedi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		GridBagConstraints gbc_comboBoxMinutiChiusuraMartedi = new GridBagConstraints();
		gbc_comboBoxMinutiChiusuraMartedi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMinutiChiusuraMartedi.gridx = 2;
		gbc_comboBoxMinutiChiusuraMartedi.gridy = 8;
		panelMartedi.add(comboBoxMinutiChiusuraMartedi, gbc_comboBoxMinutiChiusuraMartedi);
		
		//JPanel panelMercoledi = new JPanel();
		panelMercoledi.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.add(panelMercoledi);
		GridBagLayout gbl_panelMercoledi = new GridBagLayout();
		gbl_panelMercoledi.columnWidths = new int[]{0, 10, 0, 0};
		gbl_panelMercoledi.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelMercoledi.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelMercoledi.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelMercoledi.setLayout(gbl_panelMercoledi);
		
		
		GridBagConstraints gbc_lblMercoledi = new GridBagConstraints();
		gbc_lblMercoledi.insets = new Insets(0, 0, 5, 5);
		gbc_lblMercoledi.gridx = 0;
		gbc_lblMercoledi.gridy = 0;
		panelMercoledi.add(lblMercoledi, gbc_lblMercoledi);
		
		
		GridBagConstraints gbc_checkBoxMercoledi = new GridBagConstraints();
		gbc_checkBoxMercoledi.insets = new Insets(0, 0, 5, 0);
		gbc_checkBoxMercoledi.gridx = 2;
		gbc_checkBoxMercoledi.gridy = 0;
		panelMercoledi.add(checkBoxMercoledi, gbc_checkBoxMercoledi);
		
		
		GridBagConstraints gbc_labelMercoledi = new GridBagConstraints();
		gbc_labelMercoledi.insets = new Insets(0, 0, 5, 5);
		gbc_labelMercoledi.gridx = 0;
		gbc_labelMercoledi.gridy = 2;
		panelMercoledi.add(labelMercoledi, gbc_labelMercoledi);
		
		
		GridBagConstraints gbc_labelOreApertutaMercoledi = new GridBagConstraints();
		gbc_labelOreApertutaMercoledi.insets = new Insets(0, 0, 5, 5);
		gbc_labelOreApertutaMercoledi.gridx = 0;
		gbc_labelOreApertutaMercoledi.gridy = 3;
		panelMercoledi.add(labelOreApertutaMercoledi, gbc_labelOreApertutaMercoledi);
		
		
		GridBagConstraints gbc_label_14 = new GridBagConstraints();
		gbc_label_14.insets = new Insets(0, 0, 5, 5);
		gbc_label_14.gridx = 1;
		gbc_label_14.gridy = 3;
		panelMercoledi.add(label_14, gbc_label_14);
		
		
		GridBagConstraints gbc_labelMinutiAperturaMercoledi = new GridBagConstraints();
		gbc_labelMinutiAperturaMercoledi.insets = new Insets(0, 0, 5, 0);
		gbc_labelMinutiAperturaMercoledi.gridx = 2;
		gbc_labelMinutiAperturaMercoledi.gridy = 3;
		panelMercoledi.add(labelMinutiAperturaMercoledi, gbc_labelMinutiAperturaMercoledi);
		
		
		comboBoxOreAperturaMercoledi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comboBoxOreAperturaMercoledi.setToolTipText("");
		GridBagConstraints gbc_comboBoxOreAperturaMercoledi = new GridBagConstraints();
		gbc_comboBoxOreAperturaMercoledi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOreAperturaMercoledi.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxOreAperturaMercoledi.gridx = 0;
		gbc_comboBoxOreAperturaMercoledi.gridy = 4;
		panelMercoledi.add(comboBoxOreAperturaMercoledi, gbc_comboBoxOreAperturaMercoledi);
		
		
		comboBoxMinutiAperturaMercoledi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		GridBagConstraints gbc_comboBoxMinutiAperturaMercoledi = new GridBagConstraints();
		gbc_comboBoxMinutiAperturaMercoledi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMinutiAperturaMercoledi.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxMinutiAperturaMercoledi.gridx = 2;
		gbc_comboBoxMinutiAperturaMercoledi.gridy = 4;
		panelMercoledi.add(comboBoxMinutiAperturaMercoledi, gbc_comboBoxMinutiAperturaMercoledi);
		
		
		GridBagConstraints gbc_labelChiusuraMercoledi = new GridBagConstraints();
		gbc_labelChiusuraMercoledi.insets = new Insets(0, 0, 5, 5);
		gbc_labelChiusuraMercoledi.gridx = 0;
		gbc_labelChiusuraMercoledi.gridy = 6;
		panelMercoledi.add(labelChiusuraMercoledi, gbc_labelChiusuraMercoledi);
		
		
		GridBagConstraints gbc_labelOreChiusuraMercoledi = new GridBagConstraints();
		gbc_labelOreChiusuraMercoledi.insets = new Insets(0, 0, 5, 5);
		gbc_labelOreChiusuraMercoledi.gridx = 0;
		gbc_labelOreChiusuraMercoledi.gridy = 7;
		panelMercoledi.add(labelOreChiusuraMercoledi, gbc_labelOreChiusuraMercoledi);
		
		
		GridBagConstraints gbc_label_18 = new GridBagConstraints();
		gbc_label_18.insets = new Insets(0, 0, 5, 5);
		gbc_label_18.gridx = 1;
		gbc_label_18.gridy = 7;
		panelMercoledi.add(label_18, gbc_label_18);
		
		
		GridBagConstraints gbc_labelMinutiChiusuraMercoledi = new GridBagConstraints();
		gbc_labelMinutiChiusuraMercoledi.insets = new Insets(0, 0, 5, 0);
		gbc_labelMinutiChiusuraMercoledi.gridx = 2;
		gbc_labelMinutiChiusuraMercoledi.gridy = 7;
		panelMercoledi.add(labelMinutiChiusuraMercoledi, gbc_labelMinutiChiusuraMercoledi);
		
		
		comboBoxOreChiusuraMercoledi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		GridBagConstraints gbc_comboBoxOreChiusuraMercoledi = new GridBagConstraints();
		gbc_comboBoxOreChiusuraMercoledi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOreChiusuraMercoledi.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxOreChiusuraMercoledi.gridx = 0;
		gbc_comboBoxOreChiusuraMercoledi.gridy = 8;
		panelMercoledi.add(comboBoxOreChiusuraMercoledi, gbc_comboBoxOreChiusuraMercoledi);
		
		
		comboBoxMinutiChiusuraMercoledi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		GridBagConstraints gbc_comboBoxMinutiChiusuraMercoledi = new GridBagConstraints();
		gbc_comboBoxMinutiChiusuraMercoledi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMinutiChiusuraMercoledi.gridx = 2;
		gbc_comboBoxMinutiChiusuraMercoledi.gridy = 8;
		panelMercoledi.add(comboBoxMinutiChiusuraMercoledi, gbc_comboBoxMinutiChiusuraMercoledi);
		
		JPanel panelGiovedi = new JPanel();
		panelGiovedi.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.add(panelGiovedi);
		GridBagLayout gbl_panelGiovedi = new GridBagLayout();
		gbl_panelGiovedi.columnWidths = new int[]{0, 10, 0, 0};
		gbl_panelGiovedi.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelGiovedi.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelGiovedi.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelGiovedi.setLayout(gbl_panelGiovedi);
		
		//JLabel lblGiovedi = new JLabel("Giovedi");
		GridBagConstraints gbc_lblGiovedi = new GridBagConstraints();
		gbc_lblGiovedi.insets = new Insets(0, 0, 5, 5);
		gbc_lblGiovedi.gridx = 0;
		gbc_lblGiovedi.gridy = 0;
		panelGiovedi.add(lblGiovedi, gbc_lblGiovedi);
		
		//JCheckBox checkBoxGiovedi = new JCheckBox("Aperto");
		GridBagConstraints gbc_checkBoxGiovedi = new GridBagConstraints();
		gbc_checkBoxGiovedi.insets = new Insets(0, 0, 5, 0);
		gbc_checkBoxGiovedi.gridx = 2;
		gbc_checkBoxGiovedi.gridy = 0;
		panelGiovedi.add(checkBoxGiovedi, gbc_checkBoxGiovedi);
		
		//JLabel labelAperturaGiovedi = new JLabel("Apertura");
		GridBagConstraints gbc_labelAperturaGiovedi = new GridBagConstraints();
		gbc_labelAperturaGiovedi.insets = new Insets(0, 0, 5, 5);
		gbc_labelAperturaGiovedi.gridx = 0;
		gbc_labelAperturaGiovedi.gridy = 2;
		panelGiovedi.add(labelAperturaGiovedi, gbc_labelAperturaGiovedi);
		
		//JLabel labelOreAperturaGiovedi = new JLabel("Ore");
		GridBagConstraints gbc_labelOreAperturaGiovedi = new GridBagConstraints();
		gbc_labelOreAperturaGiovedi.insets = new Insets(0, 0, 5, 5);
		gbc_labelOreAperturaGiovedi.gridx = 0;
		gbc_labelOreAperturaGiovedi.gridy = 3;
		panelGiovedi.add(labelOreAperturaGiovedi, gbc_labelOreAperturaGiovedi);
		
		//JLabel label_23 = new JLabel(":");
		GridBagConstraints gbc_label_23 = new GridBagConstraints();
		gbc_label_23.insets = new Insets(0, 0, 5, 5);
		gbc_label_23.gridx = 1;
		gbc_label_23.gridy = 3;
		panelGiovedi.add(label_23, gbc_label_23);
		
		//JLabel labelMinutiAperturaGiovedi = new JLabel("Minuti");
		GridBagConstraints gbc_labelMinutiAperturaGiovedi = new GridBagConstraints();
		gbc_labelMinutiAperturaGiovedi.insets = new Insets(0, 0, 5, 0);
		gbc_labelMinutiAperturaGiovedi.gridx = 2;
		gbc_labelMinutiAperturaGiovedi.gridy = 3;
		panelGiovedi.add(labelMinutiAperturaGiovedi, gbc_labelMinutiAperturaGiovedi);
		
		//JComboBox comboBoxOreAperturaGiovedi = new JComboBox();
		comboBoxOreAperturaGiovedi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comboBoxOreAperturaGiovedi.setToolTipText("");
		GridBagConstraints gbc_comboBoxOreAperturaGiovedi = new GridBagConstraints();
		gbc_comboBoxOreAperturaGiovedi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOreAperturaGiovedi.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxOreAperturaGiovedi.gridx = 0;
		gbc_comboBoxOreAperturaGiovedi.gridy = 4;
		panelGiovedi.add(comboBoxOreAperturaGiovedi, gbc_comboBoxOreAperturaGiovedi);
		
		//JComboBox comboBoxMinutiAperturaGiovedi = new JComboBox();
		comboBoxMinutiAperturaGiovedi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		GridBagConstraints gbc_comboBoxMinutiAperturaGiovedi = new GridBagConstraints();
		gbc_comboBoxMinutiAperturaGiovedi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMinutiAperturaGiovedi.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxMinutiAperturaGiovedi.gridx = 2;
		gbc_comboBoxMinutiAperturaGiovedi.gridy = 4;
		panelGiovedi.add(comboBoxMinutiAperturaGiovedi, gbc_comboBoxMinutiAperturaGiovedi);
		
		//JLabel labelChiusuraGiovedi = new JLabel("Chiusura");
		GridBagConstraints gbc_labelChiusuraGiovedi = new GridBagConstraints();
		gbc_labelChiusuraGiovedi.insets = new Insets(0, 0, 5, 5);
		gbc_labelChiusuraGiovedi.gridx = 0;
		gbc_labelChiusuraGiovedi.gridy = 6;
		panelGiovedi.add(labelChiusuraGiovedi, gbc_labelChiusuraGiovedi);
		
		//JLabel labelOreChiusuraGiovedi = new JLabel("Ore");
		GridBagConstraints gbc_labelOreChiusuraGiovedi = new GridBagConstraints();
		gbc_labelOreChiusuraGiovedi.insets = new Insets(0, 0, 5, 5);
		gbc_labelOreChiusuraGiovedi.gridx = 0;
		gbc_labelOreChiusuraGiovedi.gridy = 7;
		panelGiovedi.add(labelOreChiusuraGiovedi, gbc_labelOreChiusuraGiovedi);
		
		//JLabel label_27 = new JLabel(":");
		GridBagConstraints gbc_label_27 = new GridBagConstraints();
		gbc_label_27.insets = new Insets(0, 0, 5, 5);
		gbc_label_27.gridx = 1;
		gbc_label_27.gridy = 7;
		panelGiovedi.add(label_27, gbc_label_27);
		
		//JLabel labelMinutiChiusuraGiovedi = new JLabel("Minuti");
		GridBagConstraints gbc_labelMinutiChiusuraGiovedi = new GridBagConstraints();
		gbc_labelMinutiChiusuraGiovedi.insets = new Insets(0, 0, 5, 0);
		gbc_labelMinutiChiusuraGiovedi.gridx = 2;
		gbc_labelMinutiChiusuraGiovedi.gridy = 7;
		panelGiovedi.add(labelMinutiChiusuraGiovedi, gbc_labelMinutiChiusuraGiovedi);
		
		//JComboBox comboBoxOreChiusuraGiovedi = new JComboBox();
		comboBoxOreChiusuraGiovedi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		GridBagConstraints gbc_comboBoxOreChiusuraGiovedi = new GridBagConstraints();
		gbc_comboBoxOreChiusuraGiovedi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOreChiusuraGiovedi.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxOreChiusuraGiovedi.gridx = 0;
		gbc_comboBoxOreChiusuraGiovedi.gridy = 8;
		panelGiovedi.add(comboBoxOreChiusuraGiovedi, gbc_comboBoxOreChiusuraGiovedi);
		
		//JComboBox comboBoxMinutiChiusuraGiovedi = new JComboBox();
		comboBoxMinutiChiusuraGiovedi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		GridBagConstraints gbc_comboBoxMinutiChiusuraGiovedi = new GridBagConstraints();
		gbc_comboBoxMinutiChiusuraGiovedi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMinutiChiusuraGiovedi.gridx = 2;
		gbc_comboBoxMinutiChiusuraGiovedi.gridy = 8;
		panelGiovedi.add(comboBoxMinutiChiusuraGiovedi, gbc_comboBoxMinutiChiusuraGiovedi);
		
		JPanel panelVenerdi = new JPanel();
		panelVenerdi.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.add(panelVenerdi);
		GridBagLayout gbl_panelVenerdi = new GridBagLayout();
		gbl_panelVenerdi.columnWidths = new int[]{0, 10, 0, 0};
		gbl_panelVenerdi.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelVenerdi.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelVenerdi.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelVenerdi.setLayout(gbl_panelVenerdi);
		
		//JLabel lblVenerdi = new JLabel("Venerdi");
		GridBagConstraints gbc_lblVenerdi = new GridBagConstraints();
		gbc_lblVenerdi.insets = new Insets(0, 0, 5, 5);
		gbc_lblVenerdi.gridx = 0;
		gbc_lblVenerdi.gridy = 0;
		panelVenerdi.add(lblVenerdi, gbc_lblVenerdi);
		
		//JCheckBox checkBoxVenerdi = new JCheckBox("Aperto");
		GridBagConstraints gbc_checkBoxVenerdi = new GridBagConstraints();
		gbc_checkBoxVenerdi.insets = new Insets(0, 0, 5, 0);
		gbc_checkBoxVenerdi.gridx = 2;
		gbc_checkBoxVenerdi.gridy = 0;
		panelVenerdi.add(checkBoxVenerdi, gbc_checkBoxVenerdi);
		
		//JLabel labelAperturaVenerdi = new JLabel("Apertura");
		GridBagConstraints gbc_labelAperturaVenerdi = new GridBagConstraints();
		gbc_labelAperturaVenerdi.insets = new Insets(0, 0, 5, 5);
		gbc_labelAperturaVenerdi.gridx = 0;
		gbc_labelAperturaVenerdi.gridy = 2;
		panelVenerdi.add(labelAperturaVenerdi, gbc_labelAperturaVenerdi);
		
		//JLabel labelOreAperturaVenerdi = new JLabel("Ore");
		GridBagConstraints gbc_labelOreAperturaVenerdi = new GridBagConstraints();
		gbc_labelOreAperturaVenerdi.insets = new Insets(0, 0, 5, 5);
		gbc_labelOreAperturaVenerdi.gridx = 0;
		gbc_labelOreAperturaVenerdi.gridy = 3;
		panelVenerdi.add(labelOreAperturaVenerdi, gbc_labelOreAperturaVenerdi);
		
		//JLabel label_32 = new JLabel(":");
		GridBagConstraints gbc_label_32 = new GridBagConstraints();
		gbc_label_32.insets = new Insets(0, 0, 5, 5);
		gbc_label_32.gridx = 1;
		gbc_label_32.gridy = 3;
		panelVenerdi.add(label_32, gbc_label_32);
		
		//JLabel labelMinutiAperturaVenerdi = new JLabel("Minuti");
		GridBagConstraints gbc_labelMinutiAperturaVenerdi = new GridBagConstraints();
		gbc_labelMinutiAperturaVenerdi.insets = new Insets(0, 0, 5, 0);
		gbc_labelMinutiAperturaVenerdi.gridx = 2;
		gbc_labelMinutiAperturaVenerdi.gridy = 3;
		panelVenerdi.add(labelMinutiAperturaVenerdi, gbc_labelMinutiAperturaVenerdi);
		
		//JComboBox comboBoxOreAperturaVenerdi = new JComboBox();
		comboBoxOreAperturaVenerdi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comboBoxOreAperturaVenerdi.setToolTipText("");
		GridBagConstraints gbc_comboBoxOreAperturaVenerdi = new GridBagConstraints();
		gbc_comboBoxOreAperturaVenerdi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOreAperturaVenerdi.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxOreAperturaVenerdi.gridx = 0;
		gbc_comboBoxOreAperturaVenerdi.gridy = 4;
		panelVenerdi.add(comboBoxOreAperturaVenerdi, gbc_comboBoxOreAperturaVenerdi);
		
		//JComboBox comboBoxMinutiAperturaVenerdi = new JComboBox();
		comboBoxMinutiAperturaVenerdi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		GridBagConstraints gbc_comboBoxMinutiAperturaVenerdi = new GridBagConstraints();
		gbc_comboBoxMinutiAperturaVenerdi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMinutiAperturaVenerdi.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxMinutiAperturaVenerdi.gridx = 2;
		gbc_comboBoxMinutiAperturaVenerdi.gridy = 4;
		panelVenerdi.add(comboBoxMinutiAperturaVenerdi, gbc_comboBoxMinutiAperturaVenerdi);
		
		//JLabel labelChiusuraVenerdi = new JLabel("Chiusura");
		GridBagConstraints gbc_labelChiusuraVenerdi = new GridBagConstraints();
		gbc_labelChiusuraVenerdi.insets = new Insets(0, 0, 5, 5);
		gbc_labelChiusuraVenerdi.gridx = 0;
		gbc_labelChiusuraVenerdi.gridy = 6;
		panelVenerdi.add(labelChiusuraVenerdi, gbc_labelChiusuraVenerdi);
		
		//JLabel labelOreChiusuraVenerdi = new JLabel("Ore");
		GridBagConstraints gbc_labelOreChiusuraVenerdi = new GridBagConstraints();
		gbc_labelOreChiusuraVenerdi.insets = new Insets(0, 0, 5, 5);
		gbc_labelOreChiusuraVenerdi.gridx = 0;
		gbc_labelOreChiusuraVenerdi.gridy = 7;
		panelVenerdi.add(labelOreChiusuraVenerdi, gbc_labelOreChiusuraVenerdi);
		
		//JLabel label_36 = new JLabel(":");
		GridBagConstraints gbc_label_36 = new GridBagConstraints();
		gbc_label_36.insets = new Insets(0, 0, 5, 5);
		gbc_label_36.gridx = 1;
		gbc_label_36.gridy = 7;
		panelVenerdi.add(label_36, gbc_label_36);
		
		//JLabel labelMinutiChiusuraVenerdi = new JLabel("Minuti");
		GridBagConstraints gbc_labelMinutiChiusuraVenerdi = new GridBagConstraints();
		gbc_labelMinutiChiusuraVenerdi.insets = new Insets(0, 0, 5, 0);
		gbc_labelMinutiChiusuraVenerdi.gridx = 2;
		gbc_labelMinutiChiusuraVenerdi.gridy = 7;
		panelVenerdi.add(labelMinutiChiusuraVenerdi, gbc_labelMinutiChiusuraVenerdi);
		
		//JComboBox comboBoxOreChiusuraVenerdi = new JComboBox();
		comboBoxOreChiusuraVenerdi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		GridBagConstraints gbc_comboBoxOreChiusuraVenerdi = new GridBagConstraints();
		gbc_comboBoxOreChiusuraVenerdi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOreChiusuraVenerdi.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxOreChiusuraVenerdi.gridx = 0;
		gbc_comboBoxOreChiusuraVenerdi.gridy = 8;
		panelVenerdi.add(comboBoxOreChiusuraVenerdi, gbc_comboBoxOreChiusuraVenerdi);
		
		//JComboBox comboBoxMinutiChiusuraVenerdi = new JComboBox();
		comboBoxMinutiChiusuraVenerdi.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		GridBagConstraints gbc_comboBoxMinutiChiusuraVenerdi = new GridBagConstraints();
		gbc_comboBoxMinutiChiusuraVenerdi.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMinutiChiusuraVenerdi.gridx = 2;
		gbc_comboBoxMinutiChiusuraVenerdi.gridy = 8;
		panelVenerdi.add(comboBoxMinutiChiusuraVenerdi, gbc_comboBoxMinutiChiusuraVenerdi);
		
		JPanel panelSabato = new JPanel();
		panelSabato.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.add(panelSabato);
		GridBagLayout gbl_panelSabato = new GridBagLayout();
		gbl_panelSabato.columnWidths = new int[]{0, 10, 0, 0};
		gbl_panelSabato.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelSabato.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelSabato.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelSabato.setLayout(gbl_panelSabato);
		
		//JLabel lblSabato = new JLabel("Sabato");
		GridBagConstraints gbc_lblSabato = new GridBagConstraints();
		gbc_lblSabato.insets = new Insets(0, 0, 5, 5);
		gbc_lblSabato.gridx = 0;
		gbc_lblSabato.gridy = 0;
		panelSabato.add(lblSabato, gbc_lblSabato);
		
		//JCheckBox checkBoxSabato = new JCheckBox("Aperto");
		GridBagConstraints gbc_checkBoxSabato = new GridBagConstraints();
		gbc_checkBoxSabato.insets = new Insets(0, 0, 5, 0);
		gbc_checkBoxSabato.gridx = 2;
		gbc_checkBoxSabato.gridy = 0;
		panelSabato.add(checkBoxSabato, gbc_checkBoxSabato);
		
		//JLabel labelAperturaSabato = new JLabel("Apertura");
		GridBagConstraints gbc_labelAperturaSabato = new GridBagConstraints();
		gbc_labelAperturaSabato.insets = new Insets(0, 0, 5, 5);
		gbc_labelAperturaSabato.gridx = 0;
		gbc_labelAperturaSabato.gridy = 2;
		panelSabato.add(labelAperturaSabato, gbc_labelAperturaSabato);
		
		//JLabel labelOreAperturaSabato = new JLabel("Ore");
		GridBagConstraints gbc_labelOreAperturaSabato = new GridBagConstraints();
		gbc_labelOreAperturaSabato.insets = new Insets(0, 0, 5, 5);
		gbc_labelOreAperturaSabato.gridx = 0;
		gbc_labelOreAperturaSabato.gridy = 3;
		panelSabato.add(labelOreAperturaSabato, gbc_labelOreAperturaSabato);
		
		//JLabel label_41 = new JLabel(":");
		GridBagConstraints gbc_label_41 = new GridBagConstraints();
		gbc_label_41.insets = new Insets(0, 0, 5, 5);
		gbc_label_41.gridx = 1;
		gbc_label_41.gridy = 3;
		panelSabato.add(label_41, gbc_label_41);
		
		//JLabel labelMinutiAperturaSabato = new JLabel("Minuti");
		GridBagConstraints gbc_labelMinutiAperturaSabato = new GridBagConstraints();
		gbc_labelMinutiAperturaSabato.insets = new Insets(0, 0, 5, 0);
		gbc_labelMinutiAperturaSabato.gridx = 2;
		gbc_labelMinutiAperturaSabato.gridy = 3;
		panelSabato.add(labelMinutiAperturaSabato, gbc_labelMinutiAperturaSabato);
		
		//JComboBox comboBoxOreAperturaSabato = new JComboBox();
		comboBoxOreAperturaSabato.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comboBoxOreAperturaSabato.setToolTipText("");
		GridBagConstraints gbc_comboBoxOreAperturaSabato = new GridBagConstraints();
		gbc_comboBoxOreAperturaSabato.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOreAperturaSabato.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxOreAperturaSabato.gridx = 0;
		gbc_comboBoxOreAperturaSabato.gridy = 4;
		panelSabato.add(comboBoxOreAperturaSabato, gbc_comboBoxOreAperturaSabato);
		
		//JComboBox comboBoxMinutiAperturaSabato = new JComboBox();
		comboBoxMinutiAperturaSabato.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		GridBagConstraints gbc_comboBoxMinutiAperturaSabato = new GridBagConstraints();
		gbc_comboBoxMinutiAperturaSabato.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMinutiAperturaSabato.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxMinutiAperturaSabato.gridx = 2;
		gbc_comboBoxMinutiAperturaSabato.gridy = 4;
		panelSabato.add(comboBoxMinutiAperturaSabato, gbc_comboBoxMinutiAperturaSabato);
		
		//JLabel labelChiusuraSabato = new JLabel("Chiusura");
		GridBagConstraints gbc_labelChiusuraSabato = new GridBagConstraints();
		gbc_labelChiusuraSabato.insets = new Insets(0, 0, 5, 5);
		gbc_labelChiusuraSabato.gridx = 0;
		gbc_labelChiusuraSabato.gridy = 6;
		panelSabato.add(labelChiusuraSabato, gbc_labelChiusuraSabato);
		
		//JLabel labelOreChiusuraSabato = new JLabel("Ore");
		GridBagConstraints gbc_labelOreChiusuraSabato = new GridBagConstraints();
		gbc_labelOreChiusuraSabato.insets = new Insets(0, 0, 5, 5);
		gbc_labelOreChiusuraSabato.gridx = 0;
		gbc_labelOreChiusuraSabato.gridy = 7;
		panelSabato.add(labelOreChiusuraSabato, gbc_labelOreChiusuraSabato);
		
		//JLabel label_45 = new JLabel(":");
		GridBagConstraints gbc_label_45 = new GridBagConstraints();
		gbc_label_45.insets = new Insets(0, 0, 5, 5);
		gbc_label_45.gridx = 1;
		gbc_label_45.gridy = 7;
		panelSabato.add(label_45, gbc_label_45);
		
		//JLabel labelMinutiChiusuraSabato = new JLabel("Minuti");
		GridBagConstraints gbc_labelMinutiChiusuraSabato = new GridBagConstraints();
		gbc_labelMinutiChiusuraSabato.insets = new Insets(0, 0, 5, 0);
		gbc_labelMinutiChiusuraSabato.gridx = 2;
		gbc_labelMinutiChiusuraSabato.gridy = 7;
		panelSabato.add(labelMinutiChiusuraSabato, gbc_labelMinutiChiusuraSabato);
		
		//JComboBox comboBoxOreChiusuraSabato = new JComboBox();
		comboBoxOreChiusuraSabato.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		GridBagConstraints gbc_comboBoxOreChiusuraSabato = new GridBagConstraints();
		gbc_comboBoxOreChiusuraSabato.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOreChiusuraSabato.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxOreChiusuraSabato.gridx = 0;
		gbc_comboBoxOreChiusuraSabato.gridy = 8;
		panelSabato.add(comboBoxOreChiusuraSabato, gbc_comboBoxOreChiusuraSabato);
		
		//JComboBox comboBoxMinutiChiusuraSabato = new JComboBox();
		comboBoxMinutiChiusuraSabato.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		GridBagConstraints gbc_comboBoxMinutiChiusuraSabato = new GridBagConstraints();
		gbc_comboBoxMinutiChiusuraSabato.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMinutiChiusuraSabato.gridx = 2;
		gbc_comboBoxMinutiChiusuraSabato.gridy = 8;
		panelSabato.add(comboBoxMinutiChiusuraSabato, gbc_comboBoxMinutiChiusuraSabato);
		
		JPanel panelDomenica = new JPanel();
		panelDomenica.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.add(panelDomenica);
		GridBagLayout gbl_panelDomenica = new GridBagLayout();
		gbl_panelDomenica.columnWidths = new int[]{0, 10, 0, 0};
		gbl_panelDomenica.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelDomenica.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panelDomenica.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelDomenica.setLayout(gbl_panelDomenica);
		
		//JLabel lblDomenica = new JLabel("Domenica");
		GridBagConstraints gbc_lblDomenica = new GridBagConstraints();
		gbc_lblDomenica.insets = new Insets(0, 0, 5, 5);
		gbc_lblDomenica.gridx = 0;
		gbc_lblDomenica.gridy = 0;
		panelDomenica.add(lblDomenica, gbc_lblDomenica);
		
		//JCheckBox checkBoxDomenica = new JCheckBox("Aperto");
		GridBagConstraints gbc_checkBoxDomenica = new GridBagConstraints();
		gbc_checkBoxDomenica.insets = new Insets(0, 0, 5, 0);
		gbc_checkBoxDomenica.gridx = 2;
		gbc_checkBoxDomenica.gridy = 0;
		panelDomenica.add(checkBoxDomenica, gbc_checkBoxDomenica);
		
		//JLabel labelAperturaDomenica = new JLabel("Apertura");
		GridBagConstraints gbc_labelAperturaDomenica = new GridBagConstraints();
		gbc_labelAperturaDomenica.insets = new Insets(0, 0, 5, 5);
		gbc_labelAperturaDomenica.gridx = 0;
		gbc_labelAperturaDomenica.gridy = 2;
		panelDomenica.add(labelAperturaDomenica, gbc_labelAperturaDomenica);
		
		//JLabel labelOreAperturaDomenica = new JLabel("Ore");
		GridBagConstraints gbc_labelOreAperturaDomenica = new GridBagConstraints();
		gbc_labelOreAperturaDomenica.insets = new Insets(0, 0, 5, 5);
		gbc_labelOreAperturaDomenica.gridx = 0;
		gbc_labelOreAperturaDomenica.gridy = 3;
		panelDomenica.add(labelOreAperturaDomenica, gbc_labelOreAperturaDomenica);
		
		//JLabel label_50 = new JLabel(":");
		GridBagConstraints gbc_label_50 = new GridBagConstraints();
		gbc_label_50.insets = new Insets(0, 0, 5, 5);
		gbc_label_50.gridx = 1;
		gbc_label_50.gridy = 3;
		panelDomenica.add(label_50, gbc_label_50);
		
		//JLabel labelMinutiAperturaDomenica = new JLabel("Minuti");
		GridBagConstraints gbc_labelMinutiAperturaDomenica = new GridBagConstraints();
		gbc_labelMinutiAperturaDomenica.insets = new Insets(0, 0, 5, 0);
		gbc_labelMinutiAperturaDomenica.gridx = 2;
		gbc_labelMinutiAperturaDomenica.gridy = 3;
		panelDomenica.add(labelMinutiAperturaDomenica, gbc_labelMinutiAperturaDomenica);
		
		//JComboBox comboBoxOreAperturaDomenica = new JComboBox();
		comboBoxOreAperturaDomenica.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		comboBoxOreAperturaDomenica.setToolTipText("");
		GridBagConstraints gbc_comboBoxOreAperturaDomenica = new GridBagConstraints();
		gbc_comboBoxOreAperturaDomenica.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOreAperturaDomenica.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxOreAperturaDomenica.gridx = 0;
		gbc_comboBoxOreAperturaDomenica.gridy = 4;
		panelDomenica.add(comboBoxOreAperturaDomenica, gbc_comboBoxOreAperturaDomenica);
		
		//JComboBox comboBoxMinutiAperturaDomenica = new JComboBox();
		comboBoxMinutiAperturaDomenica.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		GridBagConstraints gbc_comboBoxMinutiAperturaDomenica = new GridBagConstraints();
		gbc_comboBoxMinutiAperturaDomenica.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMinutiAperturaDomenica.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxMinutiAperturaDomenica.gridx = 2;
		gbc_comboBoxMinutiAperturaDomenica.gridy = 4;
		panelDomenica.add(comboBoxMinutiAperturaDomenica, gbc_comboBoxMinutiAperturaDomenica);
		
		//JLabel labelChiusuraDomenica = new JLabel("Chiusura");
		GridBagConstraints gbc_labelChiusuraDomenica = new GridBagConstraints();
		gbc_labelChiusuraDomenica.insets = new Insets(0, 0, 5, 5);
		gbc_labelChiusuraDomenica.gridx = 0;
		gbc_labelChiusuraDomenica.gridy = 6;
		panelDomenica.add(labelChiusuraDomenica, gbc_labelChiusuraDomenica);
		
		//JLabel labelOreChiusuraDomenica = new JLabel("Ore");
		GridBagConstraints gbc_labelOreChiusuraDomenica = new GridBagConstraints();
		gbc_labelOreChiusuraDomenica.insets = new Insets(0, 0, 5, 5);
		gbc_labelOreChiusuraDomenica.gridx = 0;
		gbc_labelOreChiusuraDomenica.gridy = 7;
		panelDomenica.add(labelOreChiusuraDomenica, gbc_labelOreChiusuraDomenica);
		
		//JLabel label_54 = new JLabel(":");
		GridBagConstraints gbc_label_54 = new GridBagConstraints();
		gbc_label_54.insets = new Insets(0, 0, 5, 5);
		gbc_label_54.gridx = 1;
		gbc_label_54.gridy = 7;
		panelDomenica.add(label_54, gbc_label_54);
		
		//JLabel labelMinutiChiusuraDomenica = new JLabel("Minuti");
		GridBagConstraints gbc_labelMinutiChiusuraDomenica = new GridBagConstraints();
		gbc_labelMinutiChiusuraDomenica.insets = new Insets(0, 0, 5, 0);
		gbc_labelMinutiChiusuraDomenica.gridx = 2;
		gbc_labelMinutiChiusuraDomenica.gridy = 7;
		panelDomenica.add(labelMinutiChiusuraDomenica, gbc_labelMinutiChiusuraDomenica);
		
		//JComboBox comboBoxOreChiusuraDomenica = new JComboBox();
		comboBoxOreChiusuraDomenica.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"}));
		GridBagConstraints gbc_comboBoxOreChiusuraDomenica = new GridBagConstraints();
		gbc_comboBoxOreChiusuraDomenica.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOreChiusuraDomenica.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxOreChiusuraDomenica.gridx = 0;
		gbc_comboBoxOreChiusuraDomenica.gridy = 8;
		panelDomenica.add(comboBoxOreChiusuraDomenica, gbc_comboBoxOreChiusuraDomenica);
		
		//JComboBox comboBoxMinutiChiusuraDomenica = new JComboBox();
		comboBoxMinutiChiusuraDomenica.setModel(new DefaultComboBoxModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		GridBagConstraints gbc_comboBoxMinutiChiusuraDomenica = new GridBagConstraints();
		gbc_comboBoxMinutiChiusuraDomenica.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMinutiChiusuraDomenica.gridx = 2;
		gbc_comboBoxMinutiChiusuraDomenica.gridy = 8;
		panelDomenica.add(comboBoxMinutiChiusuraDomenica, gbc_comboBoxMinutiChiusuraDomenica);
		
		spegniLunedi();
		spegniMartedi();
		spegniMercoledi();
		spegniGiovedi();
		spegniVenerdi();
		spegniSabato();
		spegniDomenica();
		
		/** 
		 * Imposto gli Ascoltatori per il FrameCreaBanca
		 * 
		 * */		
		CreaFilialeListener creaFilialeListener = new CreaFilialeListener(this);
		
		/**
		 * Aggiungo gli ascoltatori
		 * */
		btnCaricaUno.addActionListener(creaFilialeListener);
		btnCaricaDue.addActionListener(creaFilialeListener);
		btnCaricaTre.addActionListener(creaFilialeListener);
		chckbxLunedi.addActionListener(creaFilialeListener);
		checkBoxMartedi.addActionListener(creaFilialeListener);
		checkBoxMercoledi.addActionListener(creaFilialeListener);
		checkBoxGiovedi.addActionListener(creaFilialeListener);
		checkBoxVenerdi.addActionListener(creaFilialeListener);
		checkBoxSabato.addActionListener(creaFilialeListener);
		checkBoxDomenica.addActionListener(creaFilialeListener);
		btnOk.addActionListener(creaFilialeListener);
		btnAnnulla.addActionListener(creaFilialeListener);
		
		/**
		 * Setto gli ascoltatori
		 * */
		btnCaricaUno.setActionCommand(creaFilialeListener.PULSANTE_CARICA_UNO);
		btnCaricaDue.setActionCommand(creaFilialeListener.PULSANTE_CARICA_DUE);
		btnCaricaTre.setActionCommand(creaFilialeListener.PULSANTE_CARICA_TRE);
		chckbxLunedi.setActionCommand(creaFilialeListener.CKBOX_LUNEDI);
		checkBoxMartedi.setActionCommand(creaFilialeListener.CKBOX_MARTEDI);
		checkBoxMercoledi.setActionCommand(creaFilialeListener.CKBOX_MERCOLEDI);
		checkBoxGiovedi.setActionCommand(creaFilialeListener.CKBOX_GIOVEDI);
		checkBoxVenerdi.setActionCommand(creaFilialeListener.CKBOX_VENERDI);
		checkBoxSabato.setActionCommand(creaFilialeListener.CKBOX_SABATO);
		checkBoxDomenica.setActionCommand(creaFilialeListener.CKBOX_DOMENICA);
		btnOk.setActionCommand(creaFilialeListener.PULSANTE_OK);
		btnAnnulla.setActionCommand(creaFilialeListener.PULSANTE_ANNULLA);
		
		setVisible(true);
	}
	
	/**
	 * Spegne il settore riguardante il Lunedì
	 * */
	public void spegniLunedi() {
		
		lblAperturaLunedi.setEnabled(false);
		lblOreAperturaLunedi.setEnabled(false);
		label.setEnabled(false);
		lblMinutiAperturaLunedi.setEnabled(false);
		comboBoxOreAperturaLunedi.setEnabled(false);
		comboBoxMinutiAperturaLunedi.setEnabled(false);
		lblChiusuraLunedi.setEnabled(false);
		lblOreChiusuraLunedi.setEnabled(false);
		label_1.setEnabled(false);
		lblMinutiChiusuraLunedi.setEnabled(false);
		comboBoxOreChiusuraLunedi.setEnabled(false);		
		comboBoxMinutiChiusuraLunedi.setEnabled(false);
		
	}
	
	/**
	 * Accendi la parte riguardante il Lunedi
	 * */
	public void accendiLunedi() {
		
		lblAperturaLunedi.setEnabled(true);
		lblOreAperturaLunedi.setEnabled(true);
		label.setEnabled(true);
		lblMinutiAperturaLunedi.setEnabled(true);
		comboBoxOreAperturaLunedi.setEnabled(true);
		comboBoxMinutiAperturaLunedi.setEnabled(true);
		lblChiusuraLunedi.setEnabled(true);
		lblOreChiusuraLunedi.setEnabled(true);
		label_1.setEnabled(true);
		lblMinutiChiusuraLunedi.setEnabled(true);
		comboBoxOreChiusuraLunedi.setEnabled(true);		
		comboBoxMinutiChiusuraLunedi.setEnabled(true);
		
	}
	
	/**
	 * Spegni il settore riguardante Martedi
	 * */
	public void spegniMartedi() {
		
		
		labelAperturaMartedi.setEnabled(false);
		labelOreAperturaMartedi.setEnabled(false);
		label_5.setEnabled(false);
		labelMinutiAperturaMartedi.setEnabled(false);
		comboBoxOreAperturaMartedi.setEnabled(false);
		comboBoxMinutiAperturaMartedi.setEnabled(false);
		labelChiusuraMartedi.setEnabled(false);
		labelOreChiusuraMartedi.setEnabled(false);
		label_9.setEnabled(false);
		labelMinutiChiusuraMartedi.setEnabled(false);
		comboBoxOreChiusuraMartedi.setEnabled(false);
		comboBoxMinutiChiusuraMartedi.setEnabled(false);
	}
	
	/**
	 * Accendi il settore riguardante Martedi
	 * */
	public void accendiMartedi() {
		
		
		labelAperturaMartedi.setEnabled(true);
		labelOreAperturaMartedi.setEnabled(true);
		label_5.setEnabled(true);
		labelMinutiAperturaMartedi.setEnabled(true);
		comboBoxOreAperturaMartedi.setEnabled(true);
		comboBoxMinutiAperturaMartedi.setEnabled(true);
		labelChiusuraMartedi.setEnabled(true);
		labelOreChiusuraMartedi.setEnabled(true);
		label_9.setEnabled(true);
		labelMinutiChiusuraMartedi.setEnabled(true);
		comboBoxOreChiusuraMartedi.setEnabled(true);
		comboBoxMinutiChiusuraMartedi.setEnabled(true);
	}
	
	
	/**
	 * Spegni il settore riguardante Mercoledi
	 * */
	public void spegniMercoledi() {
		
		labelMercoledi.setEnabled(false);
		labelOreApertutaMercoledi.setEnabled(false);
		label_14.setEnabled(false);
		labelMinutiAperturaMercoledi.setEnabled(false);
		comboBoxOreAperturaMercoledi.setEnabled(false);
		comboBoxMinutiAperturaMercoledi.setEnabled(false);
		labelChiusuraMercoledi.setEnabled(false);
		labelOreChiusuraMercoledi.setEnabled(false);
		label_18.setEnabled(false);
		labelMinutiChiusuraMercoledi.setEnabled(false);
		comboBoxOreChiusuraMercoledi.setEnabled(false);
		comboBoxMinutiChiusuraMercoledi.setEnabled(false);
	}
	
	/**
	 * Accnedi il settore riguardante Mercoledi
	 * */
	public void accendiMercoledi() {
		
		labelMercoledi.setEnabled(true);
		labelOreApertutaMercoledi.setEnabled(true);
		label_14.setEnabled(true);
		labelMinutiAperturaMercoledi.setEnabled(true);
		comboBoxOreAperturaMercoledi.setEnabled(true);
		comboBoxMinutiAperturaMercoledi.setEnabled(true);
		labelChiusuraMercoledi.setEnabled(true);
		labelOreChiusuraMercoledi.setEnabled(true);
		label_18.setEnabled(true);
		labelMinutiChiusuraMercoledi.setEnabled(true);
		comboBoxOreChiusuraMercoledi.setEnabled(true);
		comboBoxMinutiChiusuraMercoledi.setEnabled(true);
	}
	
	/**
	 * Spegni il settore riguardante Giovedi
	 * */
	public void spegniGiovedi() {
				
		labelAperturaGiovedi.setEnabled(false);
		panelMercoledi.setEnabled(false);
		labelOreAperturaGiovedi.setEnabled(false);
		label_23.setEnabled(false);
		labelMinutiAperturaGiovedi.setEnabled(false);
		comboBoxOreAperturaGiovedi.setEnabled(false);
		comboBoxMinutiAperturaGiovedi.setEnabled(false);
		labelChiusuraGiovedi.setEnabled(false);
		labelOreChiusuraGiovedi.setEnabled(false);
		label_27.setEnabled(false);
		labelMinutiChiusuraGiovedi.setEnabled(false);
		comboBoxOreChiusuraGiovedi.setEnabled(false);
		comboBoxMinutiChiusuraGiovedi.setEnabled(false);
		
	}
	
	/**
	 * Accendi il settore riguardante Giovedi
	 * */
	public void accendiGiovedi() {
				
		labelAperturaGiovedi.setEnabled(true);
		panelMercoledi.setEnabled(true);
		labelOreAperturaGiovedi.setEnabled(true);
		label_23.setEnabled(true);
		labelMinutiAperturaGiovedi.setEnabled(true);
		comboBoxOreAperturaGiovedi.setEnabled(true);
		comboBoxMinutiAperturaGiovedi.setEnabled(true);
		labelChiusuraGiovedi.setEnabled(true);
		labelOreChiusuraGiovedi.setEnabled(true);
		label_27.setEnabled(true);
		labelMinutiChiusuraGiovedi.setEnabled(true);
		comboBoxOreChiusuraGiovedi.setEnabled(true);
		comboBoxMinutiChiusuraGiovedi.setEnabled(true);
		
	}
	
	/**
	 * Spegni il settore riguardante Venerdi
	 * */
	public void spegniVenerdi() {
		
		labelAperturaVenerdi.setEnabled(false);
		labelOreAperturaVenerdi.setEnabled(false);
		label_32.setEnabled(false);
		labelMinutiAperturaVenerdi.setEnabled(false);
		comboBoxOreAperturaVenerdi.setEnabled(false);
		comboBoxMinutiAperturaVenerdi.setEnabled(false);
		labelChiusuraVenerdi.setEnabled(false);
		labelOreChiusuraVenerdi.setEnabled(false);
		label_36.setEnabled(false);
		labelMinutiChiusuraVenerdi.setEnabled(false);
		comboBoxOreChiusuraVenerdi.setEnabled(false);
		comboBoxMinutiChiusuraVenerdi.setEnabled(false);

	}
	
	/**
	 * Accendi il settore riguardante Venerdi
	 * */
	public void accendiVenerdi() {
		
		labelAperturaVenerdi.setEnabled(true);
		labelOreAperturaVenerdi.setEnabled(true);
		label_32.setEnabled(true);
		labelMinutiAperturaVenerdi.setEnabled(true);
		comboBoxOreAperturaVenerdi.setEnabled(true);
		comboBoxMinutiAperturaVenerdi.setEnabled(true);
		labelChiusuraVenerdi.setEnabled(true);
		labelOreChiusuraVenerdi.setEnabled(true);
		label_36.setEnabled(true);
		labelMinutiChiusuraVenerdi.setEnabled(true);
		comboBoxOreChiusuraVenerdi.setEnabled(true);
		comboBoxMinutiChiusuraVenerdi.setEnabled(true);

	}
	
	/**
	 * Spegni il settore riguardante Sabato
	 * */
	public void spegniSabato() {
		
		labelAperturaSabato.setEnabled(false);
		labelOreAperturaSabato.setEnabled(false);
		label_41.setEnabled(false);
		labelMinutiAperturaSabato.setEnabled(false);
		comboBoxOreAperturaSabato.setEnabled(false);
		comboBoxMinutiAperturaSabato.setEnabled(false);
		labelChiusuraSabato.setEnabled(false);
		labelOreChiusuraSabato.setEnabled(false);
		label_45.setEnabled(false);
		labelMinutiChiusuraSabato.setEnabled(false);
		comboBoxOreChiusuraSabato.setEnabled(false);
		comboBoxMinutiChiusuraSabato.setEnabled(false);
		
	}
	
	/**
	 * Accendi il settore riguardante Sabato
	 * */
	public void accendiSabato() {
		
		labelAperturaSabato.setEnabled(true);
		labelOreAperturaSabato.setEnabled(true);
		label_41.setEnabled(true);
		labelMinutiAperturaSabato.setEnabled(true);
		comboBoxOreAperturaSabato.setEnabled(true);
		comboBoxMinutiAperturaSabato.setEnabled(true);
		labelChiusuraSabato.setEnabled(true);
		labelOreChiusuraSabato.setEnabled(true);
		label_45.setEnabled(true);
		labelMinutiChiusuraSabato.setEnabled(true);
		comboBoxOreChiusuraSabato.setEnabled(true);
		comboBoxMinutiChiusuraSabato.setEnabled(true);
		
	}
	
	/**
	 * Spegni il settore riguardante Domenica
	 * */
	public void spegniDomenica() {
		
		labelAperturaDomenica.setEnabled(false);
		labelOreAperturaDomenica.setEnabled(false);
		label_50.setEnabled(false);
		labelMinutiAperturaDomenica.setEnabled(false);
		comboBoxOreAperturaDomenica.setEnabled(false);
		comboBoxMinutiAperturaDomenica.setEnabled(false);
		labelChiusuraDomenica.setEnabled(false);
		labelOreChiusuraDomenica.setEnabled(false);
		label_54.setEnabled(false);
		labelMinutiChiusuraDomenica.setEnabled(false);
		comboBoxOreChiusuraDomenica.setEnabled(false);
		comboBoxMinutiChiusuraDomenica.setEnabled(false);
	}
	
	/**
	 * Accendi il settore riguardante Domenica
	 * */
	public void accendiDomenica() {
		
		labelAperturaDomenica.setEnabled(true);
		labelOreAperturaDomenica.setEnabled(true);
		label_50.setEnabled(true);
		labelMinutiAperturaDomenica.setEnabled(true);
		comboBoxOreAperturaDomenica.setEnabled(true);
		comboBoxMinutiAperturaDomenica.setEnabled(true);
		labelChiusuraDomenica.setEnabled(true);
		labelOreChiusuraDomenica.setEnabled(true);
		label_54.setEnabled(true);
		labelMinutiChiusuraDomenica.setEnabled(true);
		comboBoxOreChiusuraDomenica.setEnabled(true);
		comboBoxMinutiChiusuraDomenica.setEnabled(true);
	}
	
	/**
	 * Ritorna lo stato della JCheckBox di lunedi
	 * */
	public boolean getCkboxLunedi() {
		
		return chckbxLunedi.isSelected();
	}
	
	/**
	 * Ritorna lo stato della JCheckBox di martedi
	 * */
	public boolean getCkboxMartedi() {
		
		return checkBoxMartedi.isSelected();
	}
	
	/**
	 * Ritorna lo stato della JCheckBox di mercoledi
	 * */
	public boolean getCkboxMercoledi() {
		
		return checkBoxMercoledi.isSelected();
	}
	
	/**
	 * Ritorna lo stato della JCheckBox di giovedi
	 * */
	public boolean getCkboxGiovedi() {
		
		return checkBoxGiovedi.isSelected();
	}
	
	/**
	 * Ritorna lo stato della JCheckBox di venerdi
	 * */
	public boolean getCkboxVenerdi() {
		
		return checkBoxVenerdi.isSelected();
	}
	
	/**
	 * Ritorna lo stato della JCheckBox di sabato
	 * */
	public boolean getCkboxSabato() {
		
		return checkBoxSabato.isSelected();
	}
	
	/**
	 * Ritorna lo stato della JCheckBox di domenica
	 * */
	public boolean getCkboxDomenica() {
		
		return checkBoxDomenica.isSelected();
	}

	
	/**
	 * Ritorna la Stringa del Nome
	 * */
	public String getNome() {
		
		return this.textNome.getText();
	}
	
	/**
	 * Ritorna la Stringa del Via
	 * */
	public String getVia() {
		
		return this.textVia.getText();
	}

	/**
	 * Ritorna la Stringa del Citta
	 * */
	public String getCitta() {
		
		return this.textCitta.getText();
	}

	/**
	 * Ritorna la Stringa del Provincia
	 * */
	public String getProvincia() {
		
		return this.textProvincia.getText();
	}

	
	/**
	 * Ritorna la Stringa del Immagine Uno
	 * */
	public String getImmagineUno() {
		
		return this.textImmagineUno.getText();
	}
	
	/**
	 * Ritorna la Stringa del Immagine Due
	 * */
	public String getImmagineDue() {
		
		return this.textImmagineDue.getText();
	}
	
	/**
	 * Ritorna la Stringa del Immagine Tre
	 * */
	public String getImmagineTre() {
		
		return this.textImmagineTre.getText();
	}
	
	
	
	/**
	 * Mi restituisce il valore dell'ora di apertura selezionata per Lunedi
	 * */
	public String getOraAperturaLunedi() {
		
		 return String.valueOf(this.comboBoxOreAperturaLunedi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dei minuti di apertura selezionata per lunedi
	 * */
	public String getMinutiAperturaLunedi() {
		
		 return String.valueOf(this.comboBoxMinutiAperturaLunedi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dell'ora di chiusura selezionata per lunedi
	 * */
	public String getOraChiusuraLunedi() {
		
		 return String.valueOf(this.comboBoxOreChiusuraLunedi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dei minuti di chiusura selezionata per lunedi
	 * */
	public String getMinutiChiusuraLunedi() {
		
		 return String.valueOf(this.comboBoxMinutiChiusuraLunedi.getSelectedItem());
	}

	
	
	/**
	 * Mi restituisce il valore dell'ora di apertura selezionata per Martedi
	 * */
	public String getOraAperturaMartedi() {
		
		 return String.valueOf(this.comboBoxOreAperturaMartedi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dei minuti di apertura selezionata per Martedi
	 * */
	public String getMinutiAperturaMartedi() {
		
		 return String.valueOf(this.comboBoxMinutiAperturaMartedi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dell'ora di chiusura selezionata per Martedi
	 * */
	public String getOraChiusuraMartedi() {
		
		 return String.valueOf(this.comboBoxOreChiusuraMartedi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dei minuti di chiusura selezionata per Martedi
	 * */
	public String getMinutiChiusuraMartedi() {
		
		 return String.valueOf(this.comboBoxMinutiChiusuraMartedi.getSelectedItem());
	}


	/**
	 * Mi restituisce il valore dell'ora di apertura selezionata per Mercoledi
	 * */
	public String getOraAperturaMercoledi() {
		
		 return String.valueOf(this.comboBoxOreAperturaMercoledi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dei minuti di apertura selezionata per Mercoledi
	 * */
	public String getMinutiAperturaMercoledi() {
		
		 return String.valueOf(this.comboBoxMinutiAperturaMercoledi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dell'ora di chiusura selezionata per Mercoledi
	 * */
	public String getOraChiusuraMercoledi() {
		
		 return String.valueOf(this.comboBoxOreChiusuraMercoledi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dei minuti di chiusura selezionata per Mercoledi
	 * */
	public String getMinutiChiusuraMercoledi() {
		
		 return String.valueOf(this.comboBoxMinutiChiusuraMercoledi.getSelectedItem());
	}

	
	/**
	 * Mi restituisce il valore dell'ora di apertura selezionata per Giovedi
	 * */
	public String getOraAperturaGiovedi() {
		
		 return String.valueOf(this.comboBoxOreAperturaGiovedi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dei minuti di apertura selezionata per Giovedi
	 * */
	public String getMinutiAperturaGiovedi() {
		
		 return String.valueOf(this.comboBoxMinutiAperturaGiovedi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dell'ora di chiusura selezionata per Giovedi
	 * */
	public String getOraChiusuraGiovedi() {
		
		 return String.valueOf(this.comboBoxOreChiusuraGiovedi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dei minuti di chiusura selezionata per Giovedi
	 * */
	public String getMinutiChiusuraGiovedi() {
		
		 return String.valueOf(this.comboBoxMinutiChiusuraGiovedi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dell'ora di apertura selezionata per Venerdi
	 * */
	public String getOraAperturaVenerdi() {
		
		 return String.valueOf(this.comboBoxOreAperturaVenerdi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dei minuti di apertura selezionata per Venerdi
	 * */
	public String getMinutiAperturaVenerdi() {
		
		 return String.valueOf(this.comboBoxMinutiAperturaVenerdi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dell'ora di chiusura selezionata per Venerdi
	 * */
	public String getOraChiusuraVenerdi() {
		
		 return String.valueOf(this.comboBoxOreChiusuraVenerdi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dei minuti di chiusura selezionata per Venerdi
	 * */
	public String getMinutiChiusuraVenerdi() {
		
		 return String.valueOf(this.comboBoxMinutiChiusuraVenerdi.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dell'ora di apertura selezionata per Sabato
	 * */
	public String getOraAperturaSabato() {
		
		 return String.valueOf(this.comboBoxOreAperturaSabato.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dei minuti di apertura selezionata per Sabato
	 * */
	public String getMinutiAperturaSabato() {
		
		 return String.valueOf(this.comboBoxMinutiAperturaSabato.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dell'ora di chiusura selezionata per Sabato
	 * */
	public String getOraChiusuraSabato() {
		
		 return String.valueOf(this.comboBoxOreChiusuraSabato.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dei minuti di chiusura selezionata per Sabato
	 * */
	public String getMinutiChiusuraSabato() {
		
		 return String.valueOf(this.comboBoxMinutiChiusuraSabato.getSelectedItem());
	}
	
	/**
	 * Mi restituisce il valore dell'ora di apertura selezionata per Domenica
	 * */
	public String getOraAperturaDomenica() {
		
		 return String.valueOf(this.comboBoxOreAperturaDomenica.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dei minuti di apertura selezionata per Domenica
	 * */
	public String getMinutiAperturaDomenica() {
		
		 return String.valueOf(this.comboBoxMinutiAperturaDomenica.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dell'ora di chiusura selezionata per Domenica
	 * */
	public String getOraChiusuraDomenica() {
		
		 return String.valueOf(this.comboBoxOreChiusuraDomenica.getSelectedItem());
	}

	/**
	 * Mi restituisce il valore dei minuti di chiusura selezionata per Domenica
	 * */
	public String getMinutiChiusuraDomenica() {
		
		 return String.valueOf(this.comboBoxMinutiChiusuraDomenica.getSelectedItem());
	}
	
	
	
	
	
}
