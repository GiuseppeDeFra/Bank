package it.unisalento.pps.progettoEsame.dao;

import java.util.ArrayList;

import it.unisalento.pps.progettoEsame.dbConnection.DbConnection;
import it.unisalento.pps.progettoEsame.model.Cliente;

/**
 * Ottiene i dati del Cliente dal Database
 * */
public class ClienteDAO {
	
	private static ClienteDAO instance;
	
	public static synchronized ClienteDAO getInstance() {
		
		if(instance == null)
			
			instance = new ClienteDAO();
		
		return instance;
	}

	/**
	 * Cerca un singolo Cliente usando il suo Username
	 * @param username è la Stringa username corrispondente al cliente da trovare 
	 * */
	public Cliente cercaDaUsername(String username) {
		
		Cliente cliente=new Cliente();
		
		ArrayList<String[]> risultato = DbConnection.getInstance().eseguiQuery("SELECT * FROM cliente WHERE Username='"+username+"' ");
		
		if(risultato.size()==0)
			
			return null;
		
		String[] riga=risultato.get(0);
		
		cliente.setUsername(riga[0]);
		cliente.setPassword(riga[1]);
		cliente.setCodiceFiscale(riga[2]);
		cliente.setNome(riga[3]);
		cliente.setCognome(riga[4]);
		cliente.setDataNascita(riga[5]);
		cliente.setVia(riga[6]);
		cliente.setCitta(riga[7]);
		cliente.setProvincia(riga[8]);
		cliente.setEmail(riga[9]);
		cliente.setCodiceFiliale(riga[10]);
		cliente.setAccettato(riga[11]);
		
				
		return cliente;
	}
	
	/**
	 * Inserisce nel database un unico cliente
	 * @param cliente è l'oggetto Cliente da inserire
	 * */
	public boolean salvaCliente(Cliente cliente) {
		
		
		boolean esito=DbConnection.getInstance().eseguiAggiornamento("INSERT INTO cliente VALUES ('"+cliente.getUsername()+"', '"+cliente.getPassword()+"', '"+cliente.getCodiceFiscale()+"', '"+cliente.getNome()+"', '"+cliente.getCognome()+"', '"+cliente.getDataNascita()+"','"+cliente.getVia()+"','"+cliente.getCitta()+"','"+cliente.getProvincia()+"','"+cliente.getEmail()+"','"+cliente.getCodiceFiliale()+"','"+cliente.getAccettato()+"') ");
		
		System.out.println("INSERT INTO cliente VALUES ('"+cliente.getUsername()+"', '"+cliente.getPassword()+"', '"+cliente.getCodiceFiscale()+"', '"+cliente.getNome()+"', '"+cliente.getCognome()+"', '"+cliente.getDataNascita()+"','"+cliente.getVia()+"','"+cliente.getCitta()+"','"+cliente.getProvincia()+"','"+cliente.getEmail()+"','"+cliente.getCodiceFiliale()+"','"+cliente.getAccettato()+"') ");
		
		return esito;
	}

}
