package it.unisalento.pps.progettoEsame.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import it.unisalento.pps.progettoEsame.model.Operazione;

import it.unisalento.pps.progettoEsame.view.actionListener.ConvalidaOperazioniListener;
import it.unisalento.pps.progettoEsame.view.actionListener.ConvalidaOperazioniPulsantiListener;
import it.unisalento.pps.progettoEsame.view.render.ModelTableConvalidaOperazioni;

import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

public class FrameConvalidaOperazioni extends JFrame {

	private JPanel contentPane;
	
	private JScrollPane scrollPane = new JScrollPane();
	
	
	private JButton btnAccetta = new JButton("Accetta");
	private JButton btnNonAccetta = new JButton("Non Accetta");
	private JButton btnOk = new JButton("Ok");
	private JButton btnAnnulla = new JButton("Annulla");
	
	private int rigaTabella;
	
	private ArrayList<Operazione> listaOriginaleOperazioni = new ArrayList<Operazione>();
	
	private JTable tabella;
	private ModelTableConvalidaOperazioni modelloTabella =  new ModelTableConvalidaOperazioni(listaOriginaleOperazioni);




	/**
	 * Create the frame.
	 */
	public FrameConvalidaOperazioni(ArrayList<Operazione> listaOperazioni) {
		
		
		
		setTitle("Convalida Operazioni");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(2, 1, 0, 0));
		
		//JButton btnAccetta = new JButton("Accetta");
		panel_1.add(btnAccetta);
		
		//JButton btnNonAccetta = new JButton("Non Accetta");
		panel_1.add(btnNonAccetta);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
		
		//JButton btnOk = new JButton("Ok");
		panel_2.add(btnOk);
		
		//JButton btnAnnulla = new JButton("Annulla");
		panel_2.add(btnAnnulla);
		
		
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		this.listaOriginaleOperazioni.addAll(listaOperazioni);
		
		
		
		//caricaTabella(listaOriginaleOperazioni);
		
		
		//ModelTableConvalidaOperazioni modelloTabella = new ModelTableConvalidaOperazioni(listaOriginaleOperazioni);
		
		tabella = new JTable(modelloTabella);
		tabella.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(tabella);
		
		
		setVisible(true);
	
		/*Imposto gli ascoltatori*/
		ConvalidaOperazioniListener conOperazioniListener = new ConvalidaOperazioniListener(this);
		ConvalidaOperazioniPulsantiListener pulsantiListener = new ConvalidaOperazioniPulsantiListener(this,listaOriginaleOperazioni);
		//ConvalidaOperazioniListener conOperazioniListener = new ConvalidaOperazioniListener(this);
		
		
		/*Inserisco gli ascoltatori*/
		tabella.addMouseListener(conOperazioniListener);
		
		btnAccetta.addActionListener(pulsantiListener);
		btnNonAccetta.addActionListener(pulsantiListener);
		btnOk.addActionListener(pulsantiListener);
		btnAnnulla.addActionListener(pulsantiListener);
		
		/*Setto gli ascoltatori*/
		
		btnAccetta.setActionCommand(pulsantiListener.PULSANTE_ACCETTA);
		btnNonAccetta.setActionCommand(pulsantiListener.PULSANTE_NON_ACCETTA);
		btnOk.setActionCommand(pulsantiListener.PULSANTE_OK);
		btnAnnulla.setActionCommand(pulsantiListener.PULSANTE_ANNULLA);

		/*
		btnOk.setName(conOperazioniListener.PULSANTE_OK);
		btnNonAccetta.setName(conOperazioniListener.PULSANTE_NON_ACCETTA);
		btnOk.setName(conOperazioniListener.PULSANTE_OK);
		btnAnnulla.setName(conOperazioniListener.PULSANTE_ANNULLA);
		*/
		
		tabella.setName(conOperazioniListener.TABELLA);

	}
	
	
	public int getValoreTabella() {
		
		//System.out.println("La riga selezionata: "+this.listaOriginaleOperazioni.get(this.tabella.getSelectedRow()).getIdOperazione()+" "+this.listaOriginaleOperazioni.get(this.tabella.getSelectedRow()).getImporto());
		return this.tabella.getSelectedRow(); // mi dice la riga selezionata
		
	}
	
	
	
	/**
	 * Restituisce il numero della riga della tabella
	 * @return il numero della riga della tabella
	 */
	public int getRigaTabella() {
		
		return this.rigaTabella;
	}

	
	/**
	 * Imposta il numero della riga della tabella selezionata
	 * @param rigaTabella il numero di riga da impostare
	 */
	public void setRigaTabella(int rigaTabella) {
		
		this.rigaTabella=rigaTabella;
	}
	
	private void caricaTabella(ArrayList<Operazione> lista) {
		
		ModelTableConvalidaOperazioni modelloTabella = new ModelTableConvalidaOperazioni(listaOriginaleOperazioni);
		tabella = new JTable(modelloTabella);
		tabella.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(tabella);

		
	}
	
	
	public void aggiornaTabella() {
		
		this.tabella.setModel(new ModelTableConvalidaOperazioni(listaOriginaleOperazioni));
		
		//this.btnAccetta.setBackground(new Color(139, 69, 19));
		
		try{
		      SwingUtilities.updateComponentTreeUI(this);
		      }
		      catch(Exception e){
		         System.out.println("beccato");
		      }
		
		
	}
	
	public void SettaColoreAccetta() {
		
		this.btnAccetta.setBackground(new Color(139, 69, 19));
		
		try{
		      SwingUtilities.updateComponentTreeUI(this);
		      }
		      catch(Exception e){
		         System.out.println("beccato");
		      }

		
	}

}
