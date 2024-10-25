package it.unisalento.pps.progettoEsame.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import it.unisalento.pps.progettoEsame.model.Operazione;
import it.unisalento.pps.progettoEsame.view.actionListener.FrameVisualizzaOperazioniListener;
import it.unisalento.pps.progettoEsame.view.render.ModelTableVisualizzaOperazioni;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class FrameVisualizzaOperazioni extends JFrame {

	private JPanel contentPane;
	private JTextField textIdUtente;
	private JLabel lblIdUtente = new JLabel("Id Utente:");
	private JButton btnCaricaUtente = new JButton("Carica Utente");
	
	private JRadioButton rdbtnContoCorrente = new JRadioButton("Conto corrente");	
	private JComboBox comboBoxContoCorrente = new JComboBox();	
	
	private JRadioButton rdbtnCartaPrepagata = new JRadioButton("Carta prepagata");	
	private JComboBox comboBoxCartaPrepagata = new JComboBox();
	
	private JButton btnCaricaOperazioni = new JButton("Carica Operazioni");
	
	private JPanel panel_3 = new JPanel();
	private JLabel lblNewLabel = new JLabel("Filtri");
	private JRadioButton rdbtnPagamento = new JRadioButton("Pagamento");
	private JRadioButton rdbtnAccredito = new JRadioButton("Accredito");
	private JRadioButton rdbtnSettimana = new JRadioButton("Settimana");
	private JRadioButton rdbtnMese = new JRadioButton("Mese");
	private JPanel panel_4 = new JPanel();
	private JRadioButton rdbtnGenericoPeriodo = new JRadioButton("Generico periodo");
	private JLabel lblDa = new JLabel("Da: ");
	private JTextField textDataInizio = new JTextField();
	private JLabel lblA = new JLabel("A: ");
	private JTextField textDataFine = new JTextField();
	private JLabel lblEs = new JLabel("Es.:2019-01-20");
	private JPanel panel_5 = new JPanel();
	private JPanel panel_6 = new JPanel();
	private JButton btnApplica = new JButton("Applica");
	private JScrollPane scrollPane = new JScrollPane();
	private JTable table = new JTable();
	private JPanel panel_7 = new JPanel();
	private JButton btnSalvaPdf = new JButton("Salva PDF");
	private JButton btnAnnulla = new JButton("Annulla");
	
	private ArrayList<Operazione> listaOperazioni = new ArrayList<Operazione>();
	
	private ModelTableVisualizzaOperazioni modelloTabella =  new ModelTableVisualizzaOperazioni(listaOperazioni);


	/**
	 * Launch the application.
	 */
	
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameVisualizzaOperazioni frame = new FrameVisualizzaOperazioni();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	*/

	/**
	 * Creazione del frame
	 */
	public FrameVisualizzaOperazioni() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 562, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		
		panel_1.add(lblIdUtente);
		
		textIdUtente = new JTextField();
		panel_1.add(textIdUtente);
		textIdUtente.setColumns(10);
		
		
		panel_1.add(btnCaricaUtente);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		//JRadioButton rdbtnContoCorrente = new JRadioButton("Conto corrente");
		panel_2.add(rdbtnContoCorrente);
		
		//JComboBox comboBoxContoCorrente = new JComboBox();
		panel_2.add(comboBoxContoCorrente);
		
		//JRadioButton rdbtnCartaPrepagata = new JRadioButton("Carta prepagata");
		panel_2.add(rdbtnCartaPrepagata);
		
		//JComboBox comboBoxCartaPrepagata = new JComboBox();
		panel_2.add(comboBoxCartaPrepagata);
		
		panel_2.add(btnCaricaOperazioni);
		
		
		/**
		 * Compongo i gruppi per i pulsanti Radio
		 * */
		
		ButtonGroup prodotti = new ButtonGroup();
		prodotti.add(rdbtnContoCorrente);
		prodotti.add(rdbtnCartaPrepagata);
		
		contentPane.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new GridLayout(8, 1, 0, 0));
		
		panel_3.add(lblNewLabel);
		
		panel_3.add(rdbtnPagamento);
		
		panel_3.add(rdbtnAccredito);
		
		panel_3.add(rdbtnSettimana);
		
		panel_3.add(rdbtnMese);
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		
		panel_3.add(panel_4);
		
		panel_4.add(rdbtnGenericoPeriodo);
		
		panel_4.add(lblEs);
		
		panel_3.add(panel_5);
		panel_5.add(lblDa);
		panel_5.add(textDataInizio);
		textDataInizio.setColumns(10);
		panel_5.add(lblA);
		panel_5.add(textDataFine);
		textDataFine.setColumns(10);
		
		panel_3.add(panel_6);
		
		
		/** Aggiungo un gruppo per i pulsanti radio filtri*/
		
		ButtonGroup filtri = new ButtonGroup();
		filtri.add(rdbtnPagamento);		
		filtri.add(rdbtnAccredito);		
		filtri.add(rdbtnSettimana);		
		filtri.add(rdbtnMese);		
		filtri.add(rdbtnGenericoPeriodo);
		
		
		
		panel_6.add(btnApplica);
		
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable(modelloTabella);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		scrollPane.setViewportView(table);
		
		contentPane.add(panel_7, BorderLayout.SOUTH);
		
		panel_7.add(btnSalvaPdf);
		
		panel_7.add(btnAnnulla);	
		
		
		/** Imposto gli ascoltatori */
		FrameVisualizzaOperazioniListener visualizzaOpListener = new FrameVisualizzaOperazioniListener(this);
		
		
		/** Aggiungo gli ascoltatori */
		this.rdbtnContoCorrente.addActionListener(visualizzaOpListener);
		this.rdbtnCartaPrepagata.addActionListener(visualizzaOpListener);
		this.btnCaricaUtente.addActionListener(visualizzaOpListener);
		this.btnApplica.addActionListener(visualizzaOpListener);
		this.btnSalvaPdf.addActionListener(visualizzaOpListener);
		this.btnAnnulla.addActionListener(visualizzaOpListener);
		this.btnCaricaOperazioni.addActionListener(visualizzaOpListener);
		
		
		/** Setto gli ascoltatori **/
		this.rdbtnContoCorrente.setActionCommand(visualizzaOpListener.RADIO_BTN_CONTO_C);
		this.rdbtnCartaPrepagata.setActionCommand(visualizzaOpListener.RADIO_BTN_CARTA_P);
		this.btnCaricaUtente.setActionCommand(visualizzaOpListener.PULSANTE_CARICA_CLIENTE);
		this.btnApplica.setActionCommand(visualizzaOpListener.PULSANTE_APPLICA);
		this.btnSalvaPdf.setActionCommand(visualizzaOpListener.PULSANTE_SALVA_PDF);
		this.btnAnnulla.setActionCommand(visualizzaOpListener.PULSANTE_ANNULLA);
		this.btnCaricaOperazioni.setActionCommand(visualizzaOpListener.PULSANTE_CARICA_OPERAZIONI);
		
		
		this.spegniTutto();

		setVisible(true);
	}
	
	
	
	public FrameVisualizzaOperazioni(String idCliente, ArrayList<String> listaConti, ArrayList<String> listaCarte) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 562, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(2, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		
		panel_1.add(lblIdUtente);
		
		textIdUtente = new JTextField();
		panel_1.add(textIdUtente);
		textIdUtente.setColumns(10);
		
		
		panel_1.add(btnCaricaUtente);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		
		//JRadioButton rdbtnContoCorrente = new JRadioButton("Conto corrente");
		panel_2.add(rdbtnContoCorrente);
		
		//JComboBox comboBoxContoCorrente = new JComboBox();
		panel_2.add(comboBoxContoCorrente);
		
		//JRadioButton rdbtnCartaPrepagata = new JRadioButton("Carta prepagata");
		panel_2.add(rdbtnCartaPrepagata);
		
		//JComboBox comboBoxCartaPrepagata = new JComboBox();
		panel_2.add(comboBoxCartaPrepagata);
		
		panel_2.add(btnCaricaOperazioni);
		
		
		/**
		 * Compongo i gruppi per i pulsanti Radio
		 * */
		
		ButtonGroup prodotti = new ButtonGroup();
		prodotti.add(rdbtnContoCorrente);
		prodotti.add(rdbtnCartaPrepagata);
		
		contentPane.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new GridLayout(8, 1, 0, 0));
		
		panel_3.add(lblNewLabel);
		
		panel_3.add(rdbtnPagamento);
		
		panel_3.add(rdbtnAccredito);
		
		panel_3.add(rdbtnSettimana);
		
		panel_3.add(rdbtnMese);
		FlowLayout flowLayout = (FlowLayout) panel_4.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		
		panel_3.add(panel_4);
		
		panel_4.add(rdbtnGenericoPeriodo);
		
		panel_4.add(lblEs);
		
		panel_3.add(panel_5);
		panel_5.add(lblDa);
		panel_5.add(textDataInizio);
		textDataInizio.setColumns(10);
		panel_5.add(lblA);
		panel_5.add(textDataFine);
		textDataFine.setColumns(10);
		
		panel_3.add(panel_6);
		
		
		/** Aggiungo un gruppo per i pulsanti radio filtri*/
		
		ButtonGroup filtri = new ButtonGroup();
		filtri.add(rdbtnPagamento);		
		filtri.add(rdbtnAccredito);		
		filtri.add(rdbtnSettimana);		
		filtri.add(rdbtnMese);		
		filtri.add(rdbtnGenericoPeriodo);
		
		
		
		panel_6.add(btnApplica);
		
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable(modelloTabella);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		scrollPane.setViewportView(table);
		
		contentPane.add(panel_7, BorderLayout.SOUTH);
		
		panel_7.add(btnSalvaPdf);
		
		panel_7.add(btnAnnulla);	
		
		
		/** Imposto gli ascoltatori */
		FrameVisualizzaOperazioniListener visualizzaOpListener = new FrameVisualizzaOperazioniListener(this);
		
		
		/** Aggiungo gli ascoltatori */
		this.rdbtnContoCorrente.addActionListener(visualizzaOpListener);
		this.rdbtnCartaPrepagata.addActionListener(visualizzaOpListener);
		this.btnCaricaUtente.addActionListener(visualizzaOpListener);
		this.btnApplica.addActionListener(visualizzaOpListener);
		this.btnSalvaPdf.addActionListener(visualizzaOpListener);
		this.btnAnnulla.addActionListener(visualizzaOpListener);
		this.btnCaricaOperazioni.addActionListener(visualizzaOpListener);
		
		
		/** Setto gli ascoltatori **/
		this.rdbtnContoCorrente.setActionCommand(visualizzaOpListener.RADIO_BTN_CONTO_C);
		this.rdbtnCartaPrepagata.setActionCommand(visualizzaOpListener.RADIO_BTN_CARTA_P);
		this.btnCaricaUtente.setActionCommand(visualizzaOpListener.PULSANTE_CARICA_CLIENTE);
		this.btnApplica.setActionCommand(visualizzaOpListener.PULSANTE_APPLICA);
		this.btnSalvaPdf.setActionCommand(visualizzaOpListener.PULSANTE_SALVA_PDF);
		this.btnAnnulla.setActionCommand(visualizzaOpListener.PULSANTE_ANNULLA);
		this.btnCaricaOperazioni.setActionCommand(visualizzaOpListener.PULSANTE_CARICA_OPERAZIONI);
		
		
		this.spegniSettoreIdCliente();
		this.setIdCliente(idCliente);
		this.caricaComboBoxContiCorr(listaConti);
		this.caricaComboBoxCartePre(listaCarte);
		
		this.aggiornaFrame();
		

		setVisible(true);
	}
	
	
	
	
	/**
	 * Imposta il valore del campo di testo idCliente in id Cliente
	 * @param idCliente l'identificativo di idCliente
	 */
	public void setIdCliente(String idCliente) {
		
		this.textIdUtente.setText(idCliente);
	}
	
	
	
	
	/**
	 * Carica la ComboBox delle Carte Prepagate
	 * @param listaCartePrepagate la lista di stringhe delle carte prepagate
	 */
	public void caricaComboBoxCartePre(ArrayList<String> listaCartePrepagate) {
		
		for(int i=0;i<listaCartePrepagate.size();i++) {
			
			comboBoxCartaPrepagata.addItem(listaCartePrepagate.get(i));			
		}

	}

	
	/**
	 * Carica la ComboBox dei Conti Correnti
	 * @param listaContiCorrenti la lista di stringhe dei Conti Correnti
	 */
	public void caricaComboBoxContiCorr(ArrayList<String> listaContiCorrenti) {
		
		for(int i=0;i<listaContiCorrenti.size();i++) {
			
			comboBoxContoCorrente.addItem(listaContiCorrenti.get(i));			
		}

	}
	
	
	/**
	 * Spegne tutta la parte sottostante a codice Cliente del frame
	 */
	public void spegniTutto() {
		
		
		rdbtnContoCorrente.setEnabled(false);
		comboBoxContoCorrente.setEnabled(false);
		rdbtnCartaPrepagata.setEnabled(false);	
		comboBoxCartaPrepagata.setEnabled(false);
		btnCaricaOperazioni.setEnabled(false);
		
		lblNewLabel.setEnabled(false);
		rdbtnPagamento.setEnabled(false);
		rdbtnAccredito.setEnabled(false);
		rdbtnSettimana.setEnabled(false);
		rdbtnMese.setEnabled(false);
		
		rdbtnGenericoPeriodo.setEnabled(false);
		lblDa.setEnabled(false);
		textDataInizio.setEnabled(false);
		lblA.setEnabled(false);
		textDataFine.setEnabled(false);
		lblEs.setEnabled(false);
		
		
		btnApplica.setEnabled(false);
		
		table.setEnabled(false);
		
		btnSalvaPdf.setEnabled(false);
				
		
	}
	
	/**
	 * Accendi tutta la parte sottostante a codice Cliente del frame
	 */
	public void accendiTutto() {
		
		rdbtnContoCorrente.setEnabled(true);
		comboBoxContoCorrente.setEnabled(true);
		rdbtnCartaPrepagata.setEnabled(true);	
		comboBoxCartaPrepagata.setEnabled(true);
		btnCaricaOperazioni.setEnabled(true);
		
		lblNewLabel.setEnabled(true);
		rdbtnPagamento.setEnabled(true);
		rdbtnAccredito.setEnabled(true);
		rdbtnSettimana.setEnabled(true);
		rdbtnMese.setEnabled(true);
		
		rdbtnGenericoPeriodo.setEnabled(true);
		lblDa.setEnabled(true);
		textDataInizio.setEnabled(true);
		lblA.setEnabled(true);
		textDataFine.setEnabled(true);
		lblEs.setEnabled(true);
		
		
		btnApplica.setEnabled(true);
		
		table.setEnabled(true);
		
		btnSalvaPdf.setEnabled(true);

		
	}
	
	/**
	 * Aggiorna lo stato del frame
	 */
	public void aggiornaFrame() {
		
		SwingUtilities.updateComponentTreeUI(this);
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
	
	
	/**
	 * Spegni la parte del Settore IdCliente
	 */
	public void spegniSettoreIdCliente() {
		
		textIdUtente.setEnabled(false);
		lblIdUtente.setEnabled(false);
		btnCaricaUtente.setEnabled(false);
		
	}
	
	/**
	 * Ritorna il valore della data di inizio del filtro
	 * @return la Stringa della data di inizio
	 */
	public String getDataInizio() {
		
		return textDataInizio.getText();
		

	}
	
	
	/**
	 * Ritorna il valore della data di fine del filtro
	 * @return la Stringa della data di fine
	 */
	public String getDataFine() {
		
		return textDataFine.getText();
	}
	
	/**
	 * Ritorna lo stadio del pulsante radio pagamento
	 * @return TRUE se è stato selezionato, FALSE altrimenti
	 */
	public boolean getRadioPagamento() {
		
		return this.rdbtnPagamento.isSelected();
	}
	
	/**
	 * Ritorna lo stadio del pulsante radio Accredito
	 * @return TRUE se è stato selezionato, FALSE altrimenti
	 */
	public boolean getRadioAccredito() {
		
		return this.rdbtnAccredito.isSelected();
	}
	
	/**
	 * Ritorna lo stadio del pulsante radio settimana
	 * @return TRUE se è stato selezionato, FALSE altrimenti
	 */
	public boolean getRadioSettimana() {
		
		return this.rdbtnSettimana.isSelected();
	}
	
	/**
	 * Ritorna lo stadio del pulsante radio mese
	 * @return TRUE se è stato selezionato, FALSE altrimenti
	 */
	public boolean getRadioMese() {
		
		return this.rdbtnMese.isSelected();
	}
	
	/**
	 * Ritorna lo stadio del pulsante radio pagamento
	 * @return TRUE se è stato selezionato, FALSE altrimenti
	 */
	public boolean getRadioGenericoPeriodo() {
		
		return this.rdbtnGenericoPeriodo.isSelected();
	}

	/**
	 * Setta la lista di operazioni da visualizzare nella tabella
	 * @param listaOperazioni
	 */
	public void setListaOperazioni(ArrayList<Operazione> listaOperazioni) {
		
		this.listaOperazioni = listaOperazioni;
	}
	
	/**
	 * Carica la tabella di una certa lista e aggiorna il frame
	 * @param lista da caricare nella tabella
	 */
	public void caricaTabella(ArrayList<Operazione> lista) {
		
		ModelTableVisualizzaOperazioni modelloTabella = new ModelTableVisualizzaOperazioni(lista);
		table = new JTable(modelloTabella);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(table);
		this.aggiornaFrame();

		
	}
	
	/**
	 * Ritorna il valore Stringa del campo Id Cliente
	 * @return la Stringa ID Cliente
	 */
	public String getIdCliente() {
		
		return textIdUtente.getText();
	}



}
