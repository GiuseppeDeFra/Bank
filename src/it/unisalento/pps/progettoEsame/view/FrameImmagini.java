package it.unisalento.pps.progettoEsame.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Panel;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;
import java.awt.ScrollPane;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

import it.unisalento.pps.progettoEsame.view.actionListener.FrameImmaginiListener;
import it.unisalento.pps.progettoEsame.view.actionListener.ImmaginiListSelectionListener;

import it.unisalento.pps.progettoEsame.view.render.ImmaginiListCellRender;

public class FrameImmagini extends JFrame {

	private JPanel contentPane;
	
	private String percorso;
	

	/**
	 * Create the frame.
	 */
	public FrameImmagini(FrameCreaBanca frameCreaBanca, JTextField textImmagine) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		Toolkit theKit = this.getToolkit();
		Dimension framesize = theKit.getScreenSize();
		this.setBounds(framesize.width/4, framesize.width/4, framesize.width/2, framesize.width/2);
		
		JLabel label = new JLabel();
		
		DefaultListModel modelloLista=new DefaultListModel();
		
		
		
		File dir = new File(this.getImmagini());
		  String[] children = dir.list();
		  if (children == null) {
		      // Either dir does not exist or is not a directory
		  } else {
			  
			  //System.out.println("\n");
		      for (int i=0; i < children.length; i++) {
		          // Get filename of file or directory
		          
		          String filename = children[i];
		          //System.out.println(filename);
		          label = new JLabel(filename);
		          modelloLista.addElement(label);	          
		      }
		  }
		  
		JList list=new JList(modelloLista);
		  
		list.setCellRenderer(new ImmaginiListCellRender());
		  
		JLabel labelImmagine = new JLabel();
		JScrollPane AnteprimaImmagine = new JScrollPane(labelImmagine);
			
			
		ImmaginiListSelectionListener listaListener = new ImmaginiListSelectionListener(list,labelImmagine,this);
		list.addListSelectionListener(listaListener);
		  
		//ScrollPane scrollPane = new ScrollPane();
		//contentPane.add(scrollPane, BorderLayout.CENTER);
		
		
		JScrollPane listScroller = new JScrollPane(list);
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		splitPane.setLeftComponent(listScroller);
		splitPane.setRightComponent(AnteprimaImmagine);
		splitPane.setOneTouchExpandable(true);
		splitPane.setDividerLocation(100);
		splitPane.setContinuousLayout(true);
		
		this.getContentPane().add(splitPane);
		
		
		
		//parte inferiore
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnOk = new JButton("OK");
		panel.add(btnOk);
		
		JButton btnAnnulla = new JButton("Annulla");
		panel.add(btnAnnulla);
		
		/*Inserisco degli ascoltatori per il frameImmagini*/
		
		FrameImmaginiListener frameImmaginiListener = new FrameImmaginiListener(this,frameCreaBanca,textImmagine);
		
		/* Quando clicco sul pulsante OK*/
		
		btnOk.addActionListener(frameImmaginiListener);		
		btnOk.setActionCommand(FrameImmaginiListener.PULSANTE_OK);
		
		
		/* Quando clicco sul pulsante Annulla*/
		
		btnAnnulla.addActionListener(frameImmaginiListener);
		btnAnnulla.setActionCommand(FrameImmaginiListener.PULSANTE_ANNULLA);
		
		
		setVisible(true);
	}
	
	
	/**
	 * Costruttore del FrameImmagini per caricare le immagini della Filiale
	 * */
	public FrameImmagini(FrameCreaFiliale frameCreaFiliale, JTextField textImmagine) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		Toolkit theKit = this.getToolkit();
		Dimension framesize = theKit.getScreenSize();
		this.setBounds(framesize.width/4, framesize.width/4, framesize.width/2, framesize.width/2);
		
		JLabel label = new JLabel();
		
		DefaultListModel modelloLista=new DefaultListModel();
		
		
		
		File dir = new File(this.getImmagini());
		  String[] children = dir.list();
		  if (children == null) {
		      // Either dir does not exist or is not a directory
		  } else {
			  
			  System.out.println("\n");
		      for (int i=0; i < children.length; i++) {
		          // Get filename of file or directory
		          
		          String filename = children[i];
		          System.out.println(filename);
		          label = new JLabel(filename);
		          modelloLista.addElement(label);	          
		      }
		  }
		  
		JList list=new JList(modelloLista);
		  
		list.setCellRenderer(new ImmaginiListCellRender());
		  
		JLabel labelImmagine = new JLabel();
		JScrollPane AnteprimaImmagine = new JScrollPane(labelImmagine);
			
			
		ImmaginiListSelectionListener listaListener = new ImmaginiListSelectionListener(list,labelImmagine,this);
		list.addListSelectionListener(listaListener);
		  
		//ScrollPane scrollPane = new ScrollPane();
		//contentPane.add(scrollPane, BorderLayout.CENTER);
		
		
		JScrollPane listScroller = new JScrollPane(list);
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		splitPane.setLeftComponent(listScroller);
		splitPane.setRightComponent(AnteprimaImmagine);
		splitPane.setOneTouchExpandable(true);
		splitPane.setDividerLocation(100);
		splitPane.setContinuousLayout(true);
		
		this.getContentPane().add(splitPane);
		
		
		
		//parte inferiore
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JButton btnOk = new JButton("OK");
		panel.add(btnOk);
		
		JButton btnAnnulla = new JButton("Annulla");
		panel.add(btnAnnulla);
		
		/*Inserisco degli ascoltatori per il frameImmagini*/
		
		FrameImmaginiListener frameImmaginiListener = new FrameImmaginiListener(this,frameCreaFiliale,textImmagine);
		
		/* Quando clicco sul pulsante OK*/
		
		btnOk.addActionListener(frameImmaginiListener);		
		btnOk.setActionCommand(FrameImmaginiListener.PULSANTE_OK);
		
		
		/* Quando clicco sul pulsante Annulla*/
		
		btnAnnulla.addActionListener(frameImmaginiListener);
		btnAnnulla.setActionCommand(FrameImmaginiListener.PULSANTE_ANNULLA);
		
		
		setVisible(true);
	}
	
	
	
	
	
	public String getImmagini() {
		
		URL directory = this.getClass().getResource("/");
		
		String modifica=directory.toString();
		
		modifica=modifica.substring(6,modifica.length()-4)+"immagini/";
		
		modifica=modifica.replace('/', '\\');
		
		return modifica;
		
	}
	
	/**
	 * Restituisce il percorso dell'immagine cercata
	 * @return La stringa contenente il percorso dell'immagine cercata
	 * */
	public String getPercorso() {
		return this.percorso;
	}
	
	/**
	 * Imposta il percorso dell'immagine che ho trovato
	 * @param percorso il percorso da impostare;
	 * */
	public void setPercorso(String percorso) {
		this.percorso = percorso;
		return;
	}

}
