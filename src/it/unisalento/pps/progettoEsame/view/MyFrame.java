package it.unisalento.pps.progettoEsame.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Label;

import it.unisalento.pps.progettoEsame.view.actionListener.MenuListener;

public class MyFrame extends JFrame {

	private JPanel contentPane;

	private JMenuBar menuBar;
	
	private JMenu mnFile;
	private JMenuItem mntmLogin;
	private JMenuItem mntmLogout;
	private JMenuItem mntmRegistrazione;
	private JMenuItem mntmExit;
	
	private JMenu mnAmministratore;
	private JMenuItem mntmVisualizzaBanche; 
	private JMenuItem mntmVisualRichiesteRegistr; 
	private JMenuItem mntmCreaBanca; 
	
	private JMenu mnDirettore;
	private JMenuItem mntmVisualizzaFiliali; 
	private JMenuItem mntmCreaFiliale; 
	private JMenuItem mntmInserisciCassiere;
	private JMenuItem mntmCreaCatalogo;
	private JMenuItem mntmImpostaInteressi;
	
	private JMenu mnCassiere;
	private JMenuItem mntmVisualOperazClient;
	private JMenuItem mntmConvalidaOperazioni; 
	
	
	private JMenu mnCliente;
	private JMenuItem mntmVisualizzaOperazioni;
	private JMenuItem mnOperazioniInformative;
	private JMenuItem mnOperazioniDispositive;
	
	
	
	
	
	private JPanel panel_centrale;
	private Label saluto;
	/**
	 * Launch the application.
	 */
	
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame1 frame = new MyFrame1();
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
	public MyFrame(String titolo) throws HeadlessException {
		
		super(titolo);		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		//JMenuBar menuBar = new JMenuBar();
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//JMenu mnFile = new JMenu("File");
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		//mnFile.setEnabled(false);
		
		//JMenuItem mntmLogin = new JMenuItem("Login");
		mntmLogin = new JMenuItem("Login");
		mnFile.add(mntmLogin);
		
		//JMenuItem mntmLogout = new JMenuItem("Logout");
		mntmLogout = new JMenuItem("Logout");
		mnFile.add(mntmLogout);
		//mntmLogout.setEnabled(false);
		
		//JMenuItem mntmRegistrazione = new JMenuItem("Registrazione");
		mntmRegistrazione = new JMenuItem("Registrazione");
		mnFile.add(mntmRegistrazione);
		
		//JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		
		mnAmministratore = new JMenu("Amministratore");
		menuBar.add(mnAmministratore);
		
		
		mntmVisualizzaBanche = new JMenuItem("Visualizza Banche");
		mnAmministratore.add(mntmVisualizzaBanche);
		
		mntmVisualRichiesteRegistr = new JMenuItem("Visualizza richieste di registrazioni");
		mnAmministratore.add(mntmVisualRichiesteRegistr);
		
		mntmCreaBanca = new JMenuItem("Crea Banca");
		mnAmministratore.add(mntmCreaBanca);
		
		
		
		
		mnDirettore = new JMenu("Direttore");
		menuBar.add(mnDirettore);		
		
		mntmVisualizzaFiliali = new JMenuItem("Visualizza Filiali");
		mnDirettore.add(mntmVisualizzaFiliali);
		
		mntmCreaFiliale = new JMenuItem("Crea Filiale");
		mnDirettore.add(mntmCreaFiliale);
		
		mntmInserisciCassiere = new JMenuItem("Inserisci Cassiere");
		mnDirettore.add(mntmInserisciCassiere);
		
		
		mntmCreaCatalogo = new JMenuItem("Crea Catalogo");
		mnDirettore.add(mntmCreaCatalogo);
		
		mntmImpostaInteressi = new JMenuItem("Imposta interessi");
		mnDirettore.add(mntmImpostaInteressi);
		
		
		
		mnCassiere = new JMenu("Cassiere");
		menuBar.add(mnCassiere);
		
		mntmVisualOperazClient = new JMenuItem("Visualizza Operazioni Cliente");
		mnCassiere.add(mntmVisualOperazClient);
		
		mntmConvalidaOperazioni = new JMenuItem("Convalida Operazioni");
		mnCassiere.add(mntmConvalidaOperazioni);
		
		
		
		mnCliente = new JMenu("Cliente");
		menuBar.add(mnCliente);
		
		mntmVisualizzaOperazioni = new JMenuItem("Visualizza Operazioni");
		mnCliente.add(mntmVisualizzaOperazioni);
		
		mnOperazioniInformative = new JMenuItem("Operazioni Informative");
		mnCliente.add(mnOperazioniInformative);		
		
		mnOperazioniDispositive = new JMenuItem("Operazioni Dispositive");
		mnCliente.add(mnOperazioniDispositive);
		
						
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel_centrale = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_centrale.getLayout();
		flowLayout.setVgap(100);
		flowLayout.setHgap(10);
		flowLayout.setAlignment(FlowLayout.LEADING);
		panel_centrale.setMaximumSize(getMaximumSize());
		
		//panel_centrale.setLayout(new LayoutManager 0);
		contentPane.add(panel_centrale, BorderLayout.CENTER);
		
		//Label saluto = new Label("Benvenuto");
		saluto = new Label("Benvenuto");
		saluto.setForeground(new Color(139, 69, 19));
		
		//saluto.setEnabled(false);
		panel_centrale.add(saluto, BorderLayout.CENTER);
		
		
		/** 
		 * Imposto gli Ascoltatori per il MENU
		 * 
		 * */		
		MenuListener menuFileListener = new MenuListener(this);
		
		
		/** 
		 * Aggiungo gli ascoltatori per il MENU FILE
		 * */
		mntmLogin.addActionListener(menuFileListener);
		mntmLogout.addActionListener(menuFileListener);
		mntmRegistrazione.addActionListener(menuFileListener);
		mntmExit.addActionListener(menuFileListener);
		
		/**
		 *  Setto gli ascoltatori per il MENU FILE
		 * 
		 * */		
		mntmLogin.setActionCommand(menuFileListener.MENU_FILE_LOGIN);
		mntmLogout.setActionCommand(menuFileListener.MENU_FILE_LOGOUT);
		mntmRegistrazione.setActionCommand(menuFileListener.MENU_FILE_REGISTRAZIONE);
		mntmExit.setActionCommand(menuFileListener.MENU_FILE_EXIT);
		
		
		/** 
		 * Aggiungo gli ascoltatori per il MENU AMMINISTRATORE 
		 * 
		 * */		
		mntmVisualizzaBanche.addActionListener(menuFileListener); 		
		mntmVisualRichiesteRegistr.addActionListener(menuFileListener);
		mntmCreaBanca.addActionListener(menuFileListener);
		
		/**
		 * Setto gli ascoltatori del MENU AMMINISTRATORE
		 * */
		mntmVisualizzaBanche.setActionCommand(menuFileListener.MENU_AMMINISTRATORE_VIS_BANCHE);
		mntmVisualRichiesteRegistr.setActionCommand(menuFileListener.MENU_AMMINISTRATORE_VIS_RICHIESTE_REG);
		mntmCreaBanca.setActionCommand(menuFileListener.MENU_AMMINISTRATORE_CREA_BANCA);
		
		
		/**
		 * Aggiungo gli ascoltatori per il MENU DIRETTORE
		 * 
		 */
		mntmVisualizzaFiliali.addActionListener(menuFileListener);
		mntmCreaFiliale.addActionListener(menuFileListener);
		mntmInserisciCassiere.addActionListener(menuFileListener);
		mntmCreaCatalogo.addActionListener(menuFileListener);
		mntmImpostaInteressi.addActionListener(menuFileListener);
		
		/**
		 * Setto gli ascoltatori del MENU DIRETTORE
		 * */
		mntmVisualizzaFiliali.setActionCommand(menuFileListener.MENU_DIRETTORE_VISUALIZZA_FILIALI);
		mntmCreaFiliale.setActionCommand(menuFileListener.MENU_DIRETTORE_CREA_FILIALE);
		mntmInserisciCassiere.setActionCommand(menuFileListener.MENU_DIRETTORE_INSERISCI_CASSIERE);
		mntmCreaCatalogo.setActionCommand(menuFileListener.MENU_DIRETTORE_CREA_CATALOGO);
		mntmImpostaInteressi.setActionCommand(menuFileListener.MENU_DIRETTORE_IMPOSTA_INTERESSI);
		
		/**
		 * Aggiungo gli ascoltatori per il MENU CASSIERE
		 * */
		mntmVisualOperazClient.addActionListener(menuFileListener);
		mntmConvalidaOperazioni.addActionListener(menuFileListener);
		
		/**
		 * Setto gli ascoltatori per il MENU CASSIERE
		 * */
		mntmVisualOperazClient.setActionCommand(menuFileListener.MENU_CASSIERE_VISUAL_OPERAZIONI_CLIENTE);
		mntmConvalidaOperazioni.setActionCommand(menuFileListener.MENU_CASSIERE_CONVALIDA_OPERAZIONI);
		
		/**
		 * Aggiungo gli ascoltatori per il MENU CLIENTE
		 */
		mntmVisualizzaOperazioni.addActionListener(menuFileListener);
		mnOperazioniInformative.addActionListener(menuFileListener);
		mnOperazioniDispositive.addActionListener(menuFileListener);
		
		/**
		 * Setto gli ascoltatori per il MENU CLIENTE
		 * */
		mntmVisualizzaOperazioni.setActionCommand(menuFileListener.MENU_CLIENTE_VISUAL_OPERAZIONI);
		mnOperazioniInformative.setActionCommand(menuFileListener.MENU_CLIENTE_OPERAZIONI_INFORMATIVE);
		mnOperazioniDispositive.setActionCommand(menuFileListener.MENU_CLIENTE_OPERAZIONI_DISPOSITIVE);
		
	}
	
	
	/**
	 *  Imposta il MyFrame se è un ospite
	 * */	
	public void setOspite() {
		
		/** 
		 * Impostazioni del Menu File
		 */
		this.mnFile.setEnabled(true);
		this.mntmLogout.setEnabled(false);
		this.mntmLogin.setEnabled(true);
		this.mntmRegistrazione.setEnabled(true);
						
		/** 
		 * Impostazioni del Menu Amministratore
		 * */
		this.mnAmministratore.setEnabled(false);
		
		/**
		 * Impostazioni del Menu Direttore
		 * */
		this.mnDirettore.setEnabled(false);
		
		/**
		 * Impostazioni del Menu Cassiere
		 * */
		this.mnCassiere.setEnabled(false);
		
		/**
		 * Impostazioni del Menu Cliente
		 * */
		this.mnCliente.setEnabled(false);		
		
		return;
	}
	
	/**
	 *  Imposta il MyFrame se è un Amministratore
	 */
	public void setAmministratore() {
		/** 
		 * Impostazioni del Menu File
		 */
		this.mnFile.setEnabled(true);
		this.mntmLogout.setEnabled(true);
		this.mntmLogin.setEnabled(false);
		this.mntmRegistrazione.setEnabled(false);		
				
		/** 
		 * Impostazioni del Menu Amministratore
		 * */
		this.mnAmministratore.setEnabled(true);	
		
		/**
		 * Impostazioni del Menu Direttore
		 * */
		this.mnDirettore.setEnabled(false);
		
		/**
		 * Impostazioni del Menu Cassiere
		 * */
		this.mnCassiere.setEnabled(false);
		
		/**
		 * Impostazioni del Menu Cliente
		 * */
		this.mnCliente.setEnabled(false);
		
		return;
	}
	
	
	/**
	 *  Imposta il MyFrame se è un Direttore
	 */
	
	public void setDirettore() {
		/** 
		 * Impostazioni del Menu File
		 */
		this.mnFile.setEnabled(true);
		this.mntmLogout.setEnabled(true);
		this.mntmLogin.setEnabled(false);
		this.mntmRegistrazione.setEnabled(false);
		
		/** 
		 * Impostazioni del Menu Amministratore
		 * */
		this.mnAmministratore.setEnabled(false);
		
		/**
		 * Impostazioni del Menu Direttore
		 * */
		this.mnDirettore.setEnabled(true);
		
		/**
		 * Impostazioni del Menu Cassiere
		 * */
		this.mnCassiere.setEnabled(false);
		
		/**
		 * Impostazioni del Menu Cliente
		 * */
		this.mnCliente.setEnabled(false);
		
		return;
	}
	
	
	/** 
	 * Imposta il MyFrame se è un Cassiere
	 */	
	public void setCassiere() {
		
		/**
		 * Impostazioni del Menu File
		 * */
		this.mnFile.setEnabled(true);
		this.mntmLogout.setEnabled(true);
		this.mntmLogin.setEnabled(false);
		this.mntmRegistrazione.setEnabled(false);
		
		/** 
		 * Impostazioni del Menu Amministratore
		 * */
		this.mnAmministratore.setEnabled(false);
		
		/**
		 * Impostazioni del Menu Direttore
		 * */
		this.mnDirettore.setEnabled(false);
		
		/**
		 * Impostazioni del Menu Cassiere
		 * */
		this.mnCassiere.setEnabled(true);
		
		/**
		 * Impostazioni del Menu Cliente
		 * */
		this.mnCliente.setEnabled(false);
		
		return;
	}
	
	public void setCliente() {
		
		/**
		 * Impostazioni del Menu File
		 * */
		this.mnFile.setEnabled(true);
		this.mntmLogout.setEnabled(true);
		this.mntmLogin.setEnabled(false);
		this.mntmRegistrazione.setEnabled(false);
		
		/** 
		 * Impostazioni del Menu Amministratore
		 * */
		this.mnAmministratore.setEnabled(false);
		
		/**
		 * Impostazioni del Menu Direttore
		 * */
		this.mnDirettore.setEnabled(false);
		
		/**
		 * Impostazioni del Menu Cassiere
		 * */
		this.mnCassiere.setEnabled(false);
		
		/**
		 * Impostazioni del Menu Cliente
		 * */
		this.mnCliente.setEnabled(true);
	}
	
	
	/**
	 * Imposta un saluto nella schermata di MyFrame
	 * @param saluto è una stringa testo del saluto
	 * @param colore è il colore di cui dovrà essere saluto 
	 * */
	public void setsaluto(String saluto,Color colore) {
		this.saluto.setText(saluto);
		this.saluto.setForeground(colore);
	}

}
