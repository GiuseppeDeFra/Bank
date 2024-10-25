package it.unisalento.pps.progettoEsame.model;

import java.util.Date;

public class Data {
	
	
	
	/**
	 * Ritorna la data di oggi
	 * @return la Stringa della data di oggi
	 */
	public String getDataOggi() {
		
		Date giorno = new Date();		
		return (giorno.getYear()+1900)+"-"+(((giorno.getMonth()+1)>10)?+(giorno.getMonth()+1):("0"+(giorno.getMonth()+1)))+"-"+(((giorno.getDate())>10)?+(giorno.getDate()):("0"+giorno.getDate()));
	}
	
	
	public String getDataOggiCompleta() {
		
		Date giorno = new Date();
		return (giorno.getYear()+1900)+"-"+(((giorno.getMonth()+1)>10)?+(giorno.getMonth()+1):("0"+(giorno.getMonth()+1)))+"-"+(((giorno.getDate())>10)?+(giorno.getDate()):("0"+giorno.getDate()))+"_"+(((giorno.getHours())>10)?+(giorno.getHours()):("0"+giorno.getHours()))+"-"+(((giorno.getMinutes())>10)?+(giorno.getMinutes()):("0"+giorno.getMinutes()))+"-"+(((giorno.getSeconds())>10)?+(giorno.getSeconds()):("0"+giorno.getSeconds()));
		
	}
	
	

}
