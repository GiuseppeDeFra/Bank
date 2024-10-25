package it.unisalento.pps.progettoEsame.business;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import it.unisalento.pps.progettoEsame.model.Email;

/**
 * Gestisce l'invio delle email
 * */
public class SistemaEmail {
	
	
	private final String host = "smtp.gmail.com";  //l'host del server smtp	
	
	private final String user = "homebanking.pps2019.sist.mail@gmail.com";  //l'utente che invia le email
	
	private final String pass = "SistemaEmail13";  //la password dell'utente che invia le email
	
	private final String porta = "465"; //la porta usata dall'host del server smtp per inviare l'email
	
	private final String mittente = "homebanking.pps2019.sist.mail@gmail.com";
	
	
	
	private static SistemaEmail instance;
	
	public static synchronized SistemaEmail getInstance() {
		
		if(instance == null)
			
			instance = new SistemaEmail();
		
		return instance;
	}

	
	
	
	
	/**
	 * Crea una nuova email
	 * @param destinazione la Stringa dell'indirizzo email di destinazione
	 * @param oggetto la Stringa dell'oggetto della email
	 * @param testo la Stringa del testo della email 
	 * */
	public Email creaEmail(String destinazione, String oggetto, String testo) {
		
		Email email = new Email(destinazione,oggetto,testo);
		
		return email;
	}
	
	/**
	 * Invia una email
	 * @param email è l'Email da inviare
	 * */
	public void inviaEmail(Email email){
		
		try {
			
			boolean sessionDebug = false;
		
			Properties props = System.getProperties(); //per settare diversi tipi di proprietà
		
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", host);
			props.put("mail.smpt.port", porta);
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.required","true");
		
			Session mailSession = Session.getDefaultInstance(props,null);
			mailSession.setDebug(sessionDebug);
			Message msg = new MimeMessage(mailSession);
			msg.setFrom(new InternetAddress(mittente));
			InternetAddress[] address = {new InternetAddress(email.getDestinatario())};
			msg.setRecipients(Message.RecipientType.TO, address);
			msg.setSubject(email.getOggetto());
			msg.setSentDate(new Date());
			msg.setText(email.getTesto());
			
			Transport transport = mailSession.getTransport("smtp");
			transport.connect(host,user,pass);
			transport.sendMessage(msg, msg.getAllRecipients());
			transport.close();
			
			System.out.println("Messaggio inviato correttamente");	
		
		
		}catch(Exception ex){
			
			System.out.println(ex);	
		}
		return;
	}

}
