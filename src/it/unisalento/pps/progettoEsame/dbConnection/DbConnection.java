package it.unisalento.pps.progettoEsame.dbConnection;

/*
 * Classe dedicata alla gestione del Database.
 * Gestisce l'apertura e la chiusura della connessione col Database
 * Fornisce i metodi per l'esecuzione delle query sul Database
 */
import java.sql.*;
import java.util.ArrayList;


public class DbConnection {

   private static Connection db;       // La connessione col Database
   private static boolean connesso;    // Flag che indica se la connessione e' attiva o meno
   private static DbConnection instance; //istanza statica della classe
   
   /* PARAMETRI DA CAMBIARE IN CASO DI CONNESSIONE A DATABASE DIVERSI */
   private static final String NOME_DATABASE="home_banking";
   private static final String NOME_UTENTE="root";
   private static final String PASSWORD_UTENTE="";

   public static DbConnection getInstance() {
	   if(instance == null)
		   instance = new DbConnection();
	   if(connesso != true) 
		   
			connetti(NOME_DATABASE,NOME_UTENTE,PASSWORD_UTENTE);
	   
	   return instance;
   }
   
   // Apre la connessione con il Database
   public static boolean connetti(String nomeDB, String nomeUtente, String pwdUtente) {

	  connesso = false;
      try {

         // Carico il driver JDBC per la connessione con il database MySQL
    	  // Dopo aver caricato il file mysql-connector-java-8.0.12.jar e inserito nella cartella lib del progetto negozio
    	  // devo caricarlo con eclipse, andando sul file tasto destro Build Path -> Add to Build Path 
    	  //oppure vedere su internet come inserire un file .jar nella CLASSPATH del programma
         Class.forName("com.mysql.cj.jdbc.Driver");
         
         
         /* � stata aggiunta la stringa dopo la password perch� con la nuova versione di mysql-connector-java-8.0.12.jar 
          * bisognava settare i parametri relativi all'oroglogio il Timezone, questa stringa risolve gli errori */
         db=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/"+nomeDB+"?user="+nomeUtente+"&password="+pwdUtente+"&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
         connesso=true;
         
      } catch (Exception e) {
    	  
    	  e.printStackTrace(); 
    	  
      }
      
      return connesso;
   }
   
   

   // Esegue una query di selezione dati sul Database
   // query: una stringa che rappresenta un'istruzione SQL di tipo SELECT da eseguire
   // colonne: il numero di colonne di cui sara' composta la tupla del risultato
   // ritorna un Vector contenente tutte le tuple del risultato
   public ArrayList<String[]> eseguiQuery(String query) {
	   ArrayList<String[]> v = null;
      String [] record;
      int colonne = 0;
      try {
         Statement stmt = db.createStatement();     // Creo lo Statement per l'esecuzione della query
         ResultSet rs = stmt.executeQuery(query);   // Ottengo il ResultSet dell'esecuzione della query
         v = new ArrayList<String[]>();
         ResultSetMetaData rsmd = rs.getMetaData();
         colonne = rsmd.getColumnCount();

         while(rs.next()) {   // Creo il vettore risultato scorrendo tutto il ResultSet
            record = new String[colonne];
            for (int i=0; i<colonne; i++) record[i] = rs.getString(i+1);
            v.add( (String[]) record.clone() );
         }
         rs.close();     // Chiudo il ResultSet
         stmt.close();   // Chiudo lo Statement
      } catch (Exception e) { e.printStackTrace(); }

      return v;
   }
   
   

   // Esegue una query di aggiornamento sul Database
   // query: una stringa che rappresenta un'istuzione SQL di tipo UPDATE da eseguire
   // ritorna TRUE se l'esecuzione e' adata a buon fine, FALSE se c'e' stata un'eccezione
   public boolean eseguiAggiornamento(String query) {
      int numero = 0;
      boolean risultato = false;
      try {
         Statement stmt = db.createStatement();
         numero = stmt.executeUpdate(query);
         risultato = true;
         stmt.close();
      } catch (Exception e) {
         e.printStackTrace();
         risultato = false;
      }
      return risultato;
   }

   // Chiude la connessione con il Database
   public void disconnetti() {
      try {
         db.close();
         connesso = false;
      } catch (Exception e) { e.printStackTrace(); }
   }

   public boolean isConnesso() {    return connesso; }   // Ritorna TRUE se la connessione con il Database e' attiva
}