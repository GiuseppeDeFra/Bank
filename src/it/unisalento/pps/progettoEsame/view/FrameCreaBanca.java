package it.unisalento.pps.progettoEsame.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import it.unisalento.pps.progettoEsame.view.actionListener.CreaBancaListener;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class FrameCreaBanca extends JFrame {

	private JPanel contentPane;
	private JTextField textNomeBanca;
	private JLabel lblViaBanca;
	private JTextField textViaBanca;
	private JLabel lblCittaBanca;
	private JTextField textCittaBanca;
	private JTextField textProvinciaBanca;
	private JLabel lblProvinciaBanca;
	public JTextField textImmagineUno;
	private JLabel lblImmagineUno;
	private JButton btnImmagineUno;
	private JLabel lblImmagineDue;
	public JTextField textImmagineDue;
	private JButton btnImmagineDue;
	public JTextField textImmagineTre;
	private JButton btnImmagineTre;
	private JLabel lblImmagineTre;
	private JTextField textNomeDirettore;
	private JLabel lblNomeDirettore;
	private JTextField textCognomeDirettore;
	private JLabel lblCognomeDirettore;
	private JTextField textUsernameDirettore;
	private JLabel lblUsernameDirettore;
	private JLabel lblPasswordDirettore;
	private JButton btnOk;
	private JButton btnAnnulla;
	private JLabel lblInserisciDirettore;
	private JLabel lblnserisciBanca;
	//private JPasswordField pwFieldPasswordDirettore;
	private JTextField pwFieldPasswordDirettore;

	
	/*
	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCreaBanca frame = new FrameCreaBanca();
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
	public FrameCreaBanca() {
		setTitle("Crea Banca");
		
		//da aggiungere
		setVisible(true);
		
		//da impostare
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		setBounds(100, 100, 530, 469);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[46px][200px][grow][][]", "[14px][][][][][][][][][][][][][][][][]"));
		
		lblnserisciBanca = new JLabel("Inserisci i dati di una banca:");
		contentPane.add(lblnserisciBanca, "cell 1 0,alignx right,aligny center");
		
		JLabel lblNomeBanca = new JLabel("Nome");
		contentPane.add(lblNomeBanca, "cell 1 1,alignx right,aligny center");
		
		textNomeBanca = new JTextField();
		contentPane.add(textNomeBanca, "cell 2 1,growx,aligny center");
		textNomeBanca.setColumns(10);
		
		lblViaBanca = new JLabel("Via");
		contentPane.add(lblViaBanca, "cell 1 2,alignx trailing,aligny center");
		
		textViaBanca = new JTextField();
		contentPane.add(textViaBanca, "cell 2 2,growx");
		textViaBanca.setColumns(10);
		
		lblCittaBanca = new JLabel("Citta");
		contentPane.add(lblCittaBanca, "cell 1 3,alignx trailing,aligny center");
		
		textCittaBanca = new JTextField();
		contentPane.add(textCittaBanca, "cell 2 3,growx");
		textCittaBanca.setColumns(10);
		
		lblProvinciaBanca = new JLabel("Provincia");
		contentPane.add(lblProvinciaBanca, "cell 1 4,alignx trailing,aligny center");
		
		textProvinciaBanca = new JTextField();
		contentPane.add(textProvinciaBanca, "cell 2 4,growx");
		textProvinciaBanca.setColumns(10);
		
		lblImmagineUno = new JLabel("Immagine1");
		contentPane.add(lblImmagineUno, "cell 1 5,alignx trailing,aligny center");
		
		textImmagineUno = new JTextField();
		contentPane.add(textImmagineUno, "cell 2 5,growx");
		textImmagineUno.setColumns(10);
		
		btnImmagineUno = new JButton("Carica...");
		contentPane.add(btnImmagineUno, "cell 3 5");
		
		lblImmagineDue = new JLabel("Immagine2");
		contentPane.add(lblImmagineDue, "cell 1 6,alignx trailing,aligny center");
		
		textImmagineDue = new JTextField();
		contentPane.add(textImmagineDue, "cell 2 6,growx");
		textImmagineDue.setColumns(10);
		
		btnImmagineDue = new JButton("Carica...");
		contentPane.add(btnImmagineDue, "cell 3 6");
		
		lblImmagineTre = new JLabel("Immagine3");
		contentPane.add(lblImmagineTre, "cell 1 7,alignx trailing");
		
		textImmagineTre = new JTextField();
		contentPane.add(textImmagineTre, "cell 2 7,growx");
		textImmagineTre.setColumns(10);
		
		btnImmagineTre = new JButton("Carica...");
		contentPane.add(btnImmagineTre, "cell 3 7,aligny top");
		
		lblInserisciDirettore = new JLabel("Inserisci i dati del Direttore della banca:");
		contentPane.add(lblInserisciDirettore, "cell 1 9,alignx right,aligny center");
		
		lblNomeDirettore = new JLabel("Nome");
		contentPane.add(lblNomeDirettore, "cell 1 10,alignx trailing");
		
		textNomeDirettore = new JTextField();
		contentPane.add(textNomeDirettore, "cell 2 10,growx");
		textNomeDirettore.setColumns(10);
		
		lblCognomeDirettore = new JLabel("Cognome");
		contentPane.add(lblCognomeDirettore, "cell 1 11,alignx trailing,aligny center");
		
		textCognomeDirettore = new JTextField();
		contentPane.add(textCognomeDirettore, "cell 2 11,growx");
		textCognomeDirettore.setColumns(10);
		
		lblUsernameDirettore = new JLabel("Username");
		contentPane.add(lblUsernameDirettore, "cell 1 12,alignx trailing");
		
		textUsernameDirettore = new JTextField();
		contentPane.add(textUsernameDirettore, "cell 2 12,growx");
		textUsernameDirettore.setColumns(10);
		
		lblPasswordDirettore = new JLabel("Password");
		contentPane.add(lblPasswordDirettore, "cell 1 13,alignx trailing,aligny center");
		
		pwFieldPasswordDirettore = new JPasswordField();
		contentPane.add(pwFieldPasswordDirettore, "cell 2 13,growx");
		
		/** 
		 * Imposto gli Ascoltatori per il FrameCreaBanca
		 * 
		 * */		
		CreaBancaListener creaBancaListener = new CreaBancaListener(this);
		
		/**
		 * Aggiungo gli ascoltatori
		 * */
		btnImmagineUno.addActionListener(creaBancaListener);
		btnImmagineDue.addActionListener(creaBancaListener);
		btnImmagineTre.addActionListener(creaBancaListener);
		
		
		/**
		 * Setto gli ascoltatori
		 * */
		btnImmagineUno.setActionCommand(creaBancaListener.PULSANTE_CARICA_UNO);
		btnImmagineDue.setActionCommand(creaBancaListener.PULSANTE_CARICA_DUE);
		btnImmagineTre.setActionCommand(creaBancaListener.PULSANTE_CARICA_TRE);
		
		btnOk = new JButton("OK\r\n");
		contentPane.add(btnOk, "cell 1 16,alignx right,aligny center");
		btnOk.addActionListener(creaBancaListener);
		btnOk.setActionCommand(creaBancaListener.PULSANTE_OK);
		
		btnAnnulla = new JButton("Annulla");
		contentPane.add(btnAnnulla, "cell 3 16");
		btnAnnulla.addActionListener(creaBancaListener);
		btnAnnulla.setActionCommand(creaBancaListener.PULSANTE_ANNULLA);
		
	}
	
	/**
	 * Restituisce il valore del campo Nome della Banca
	 * @return la Stringa Nome della Banca
	 * */
	public String getNomeBanca() {
		
		return this.textNomeBanca.getText();
	}
	
	/**
	 * Restituisce il valore del campo Via della Banca
	 * @return la Stringa Via della Banca
	 * */
	public String getViaBanca() {
		
		return this.textViaBanca.getText();
	}
	
	/**
	 * Restituisce il valore del campo Citta della Banca
	 * @return la Stringa Citta della Banca
	 * */
	public String getCittaBanca() {
		
		return this.textCittaBanca.getText();
	}
	
	/**
	 * Restituisce il valore del campo Provincia della Banca
	 * @return la Stringa Provincia della Banca
	 * */
	public String getProvinciaBanca() {
		
		return this.textProvinciaBanca.getText();
	}
	
	/**
	 * Restituisce il valore del campo Immagine Uno della Banca
	 * @return la Stringa Immagine Uno della Banca
	 * */
	public String getImmagineUnoBanca() {
		
		return this.textImmagineUno.getText();
	}
	
	/**
	 * Imposta il valore del campo Immagine Uno della Banca
	 * @param la Stringa Immagine Uno della Banca
	 * */
	public void setImmagineUnoBanca(String ImmagineUno) {
		
		this.textImmagineUno.setText(ImmagineUno);
		return;
	}
	
	/**
	 * Restituisce il valore del campo Immagine Due della Banca
	 * @return la Stringa Immagine Due della Banca
	 * */
	public String getImmagineDueBanca() {
		
		return this.textImmagineDue.getText();
	}
	
	/**
	 * Imposta il valore del campo Immagine Due della Banca
	 * @param la Stringa Immagine Due della Banca
	 * */
	public void setImmagineDueBanca(String ImmagineDue) {
		
		this.textImmagineDue.setText(ImmagineDue);
		return;
	}
	
	/**
	 * Restituisce il valore del campo Immagine Tre della Banca
	 * @return la Stringa Immagine Tre della Banca
	 * */
	public String getImmagineTreBanca() {
		
		return this.textImmagineTre.getText();
	}
	
	/**
	 * Imposta il valore del campo Immagine Tre della Banca
	 * @param la Stringa Immagine Tre della Banca
	 * */
	public void setImmagineTreBanca(String ImmagineTre) {
		
		this.textImmagineTre.setText(ImmagineTre);
		return;
	}
	
	/**
	 * Restituisce il valore del campo Nome Direttore della Banca
	 * @return la Stringa Nome Direttore della Banca
	 * */
	public String getNomeDirettore() {
		
		return this.textNomeDirettore.getText();
	}
	
	/**
	 * Restituisce il valore del campo Cognome Direttore della Banca
	 * @return la Stringa Cognome Direttore della Banca
	 * */
	public String getCognomeDirettore() {
		
		return this.textCognomeDirettore.getText();
	}
	
	/**
	 * Restituisce il valore del campo Username Direttore della Banca
	 * @return la Stringa Username Direttore della Banca
	 * */
	public String getUsernameDirettore() {
		
		return this.textUsernameDirettore.getText();
	}
	
	
	/**
	 * Restituisce il valore del campo Password Direttore della Banca
	 * @return la Stringa Password Direttore della Banca
	 * */
	/*
	public String getPasswordDirettore() {
		
		String password=String.valueOf(this.pwFieldPasswordDirettore.getPassword());
		return password;

	}	
	*/
	
	/**
	 * Restituisce il valore del campo Password Direttore della Banca
	 * @return la Stringa Password Direttore della Banca
	 * */
	public String getPasswordDirettore() {
		
		return this.pwFieldPasswordDirettore.getText();	

	}	
	
	/**
	 * Azzero tutti i campi del FrameCreaBanca
	 * */
	public void setTuttoAZero() {
		
		this.textNomeBanca.setText("");
		this.textViaBanca.setText("");
		this.textCittaBanca.setText("");
		this.textProvinciaBanca.setText("");
		this.textImmagineUno.setText("");
		this.textImmagineDue.setText("");
		this.textImmagineTre.setText("");
		this.textNomeDirettore.setText("");
		this.textCognomeDirettore.setText("");
		this.textUsernameDirettore.setText("");
		//this.pwFieldPasswordDirettore.setEchoChar((char)0); //mostra il campo invece che i pallini i caratteri
		this.pwFieldPasswordDirettore.setText("");

	
		
	}
		

}
