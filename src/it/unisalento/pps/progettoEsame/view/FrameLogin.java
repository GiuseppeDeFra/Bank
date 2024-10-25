package it.unisalento.pps.progettoEsame.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;

import it.unisalento.pps.progettoEsame.view.actionListener.LoginListener;

public class FrameLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Username;
	private JPasswordField passwordField;
	private JPanel panel_3;
	private JPanel panel_pulsanti;
	private JButton btnOK;
	private JButton btnAnnulla;
	private JPanel panel_lblusername;
	private JLabel lbl_Username;
	private JPanel panel_txtusername;
	private JPanel panel_centrale;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_lblpassword;
	private JLabel lblpassword;
	private JPanel panel_pwfield;
	
	/**
	 * Launch the application.
	 */
	
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
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
	public FrameLogin(String titolo) throws HeadlessException {
		
		super(titolo);
		setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setDefaultCloseOperation(FrameLogin.HIDE_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		//JPanel panel_3 = new JPanel();
		panel_3 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_3.getLayout();
		contentPane.add(panel_3, BorderLayout.NORTH);
		
		//JPanel panel_4 = new JPanel();
		panel_pulsanti = new JPanel();
		contentPane.add(panel_pulsanti, BorderLayout.SOUTH);
		
		
		
		//JButton btnNewButton = new JButton("OK");
		btnOK = new JButton("OK");
		panel_pulsanti.add(btnOK);
		
		//JButton btnAnnulla = new JButton("Annulla");
		btnAnnulla = new JButton("Annulla");
		panel_pulsanti.add(btnAnnulla);
		
		//JPanel panel_centrale = new JPanel();
		panel_centrale = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_centrale.getLayout();
		flowLayout.setVgap(30);
		flowLayout.setHgap(10);
		flowLayout.setAlignment(FlowLayout.LEADING);
		contentPane.add(panel_centrale, BorderLayout.CENTER);
		
		//JPanel panel_username = new JPanel();
		panel_lblusername = new JPanel();
		panel_centrale.add(panel_lblusername);
		
		//JLabel lbl_Username = new JLabel("Username");
		lbl_Username = new JLabel("Username");
		panel_lblusername.add(lbl_Username);
		
		//JPanel panel_2 = new JPanel();
		panel_txtusername = new JPanel();
		panel_centrale.add(panel_txtusername);
		
		textField_Username = new JTextField();
		panel_txtusername.add(textField_Username);
		textField_Username.setColumns(20);
		
		//JPanel panel_5 = new JPanel();
		panel_5 = new JPanel();
		panel_centrale.add(panel_5);
		
		//JPanel panel_6 = new JPanel();
		panel_6 = new JPanel();
		panel_centrale.add(panel_6);
		
		//JPanel panel_lblpassword = new JPanel();
		panel_lblpassword = new JPanel();
		panel_centrale.add(panel_lblpassword);
		
		//JLabel lblpassword = new JLabel("Password");
		lblpassword = new JLabel("Password");
		panel_lblpassword.add(lblpassword);
		
		//JPanel panel_pwfield = new JPanel();
		panel_pwfield = new JPanel();
		panel_centrale.add(panel_pwfield);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(15);
		panel_pwfield.add(passwordField);
		
		/*Inserisco degli ascoltatori per il frame di login*/
		
		LoginListener loginlistener=new LoginListener(this);
		
		/* Quando clicco sul pulsante OK*/
		
		btnOK.addActionListener(loginlistener);		
		btnOK.setActionCommand(LoginListener.PULSANTE_OK);
		
		
		/* Quando clicco sul pulsante Annulla, imposto l'ActionCommand con un
		 * comando di ANNULLA destritto in LoginListener*/
		
		btnAnnulla.addActionListener(loginlistener);
		btnAnnulla.setActionCommand(LoginListener.PULSANTE_ANNULLA);
		
		
		/* Quando scrivo qualcosa nel campo username, passo il contenuto 
		 * del campo username nel loginlistener */
		
		textField_Username.addActionListener(loginlistener);
		textField_Username.setActionCommand(textField_Username.getText());
		
	}
	
	
	/* Prendo l' USERNAME dal campo di testo dell'username */
	
	public String getusername() {
		
		return textField_Username.getText();
	}
	
	
	/* Prendo la PASSWORD dal campo password, però non posso farlo direttamente, perchè 
	 * il campo passwordi restituisce un vettore di char, char [], quindi bisogna 
	 * trasformarlo in una Stringa come segue*/
	public String getpassword() {
		
		String password=String.valueOf(passwordField.getPassword());
		
		return password;
		
		//return passwordField.getPassword();
		
	}

}
