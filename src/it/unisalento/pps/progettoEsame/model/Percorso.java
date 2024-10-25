package it.unisalento.pps.progettoEsame.model;

import java.io.File;
import java.net.URL;

public class Percorso {
	
	private URL directory;
	
	//this.getClass().getResource("/it/");     //posso solo navigare nella cartella bin del programma, cioè nei package esistenti
	
	public String getDirectory() {
		
		return directory.toString();
	}
	
	/* Dalla directory della classe riesco a risalire alla cartella immagini
	 * modificando opportunamente la stringa e cambiado il carattere \ in / */
	
	public String getImmagini() {
		
		directory=this.getClass().getResource("/");
		
		String modifica=directory.toString();
		
		modifica=modifica.substring(6,modifica.length()-4)+"immagini/";
		
		modifica=modifica.replace('/', '\\');
		
		return modifica;
		
	}
	
	
	/**
	 * Mi restituisce il percorso della cartella pdf
	 * @return la Stringa del percorso della cartella pdf
	 */
	public String getPdf() {
		
		directory=this.getClass().getResource("/");
		
		String modifica=directory.toString();
		
		modifica=modifica.substring(6,modifica.length()-4)+"pdf/";
		
		modifica=modifica.replace('/', '\\');
		
		return modifica;
		
	}

	
	
	/* Mi stampa i file che ci sono nella cartella immagini*/
	public void getfile() {
		
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
		      }
		  }
		
	}

}
