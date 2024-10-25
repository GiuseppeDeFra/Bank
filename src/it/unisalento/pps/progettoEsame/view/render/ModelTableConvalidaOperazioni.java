package it.unisalento.pps.progettoEsame.view.render;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import it.unisalento.pps.progettoEsame.model.Operazione;

public class ModelTableConvalidaOperazioni extends AbstractTableModel {
	
	private ArrayList<Operazione> dati;
	
	private String[] titoli= {"Id_Operazione", "Data", "Importo", "Descrizione"};
	
	
	public ModelTableConvalidaOperazioni(ArrayList<Operazione> dati) {
		super();
		this.dati = dati;
	}
	
	public ArrayList<Operazione> getDati() {
		return dati;
	}


	@Override
	public int getRowCount() {
		//if(dati!=null) return dati.size();
		//else return 0;
		return dati.size();
	}

	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		//ArrayList<Utente>
		//data binding
		//String riga[]=dati.get(rowIndex);
		Operazione operazione = dati.get(rowIndex);
		if(columnIndex==0) return operazione.getIdOperazione();
		else if(columnIndex==1) return operazione.getData();
		else if(columnIndex==2) return operazione.getImporto();
		else if(columnIndex==3) return operazione.getDescrizione();
		return null;
	}

	@Override
	public Class getColumnClass(int column) {
		/*
		if(column==2) return Boolean.class; //mi mette il pulsantino chechbox
		else
		*/ 
		return String.class;
	}
	
	/**
	 * Facendo doppio click sulle celle non si modificano i valori
	 * */
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
	

	/**
	 * Funzione setta i valori per ogni cella
	 * */
	@Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		//String[] riga= {};
		/*
		Operazione operazione = dati.get(rowIndex);
        if(columnIndex==0) dati.get(rowIndex).setIdOperazione(aValue.toString());
        if(columnIndex==1) dati.get(rowIndex).setdata(aValue.toString());
        if(columnIndex==2) dati.get(rowIndex).setImporto(aValue.toString());
        if(columnIndex==3) dati.get(rowIndex).setDescrizione(aValue.toString());
        fireTableCellUpdated(rowIndex, columnIndex);// notify listeners
        
        */
    }
	
	/**
	 * Imposta i titoli delle colonne
	 * */
	@Override
	public String getColumnName(int column) {
		
		return this.titoli[column];
		
	}


}
