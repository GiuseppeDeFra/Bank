package it.unisalento.pps.progettoEsame.business;

import java.io.FileOutputStream;
import java.util.ArrayList;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import it.unisalento.pps.progettoEsame.model.ListaOperazioni;
import it.unisalento.pps.progettoEsame.model.Operazione;
import it.unisalento.pps.progettoEsame.model.Percorso;
import it.unisalento.pps.progettoEsame.model.Data;

public class SalvaDocumento {
	
	ArrayList<Operazione> listaOperazioni = new ArrayList<Operazione>();
	
	 private static Font bigFont  = new Font(Font.FontFamily.TIMES_ROMAN, 18,  Font.BOLD);
	// private static String FILE = "C:\\Users\\Giuseppe\\eclipse-workspace\\banca\\pdf\\ciao.pdf";
	
	private static SalvaDocumento instance;
	
	public static synchronized SalvaDocumento getInstance() {
		
		if(instance == null)
			
			instance = new SalvaDocumento();
		
		return instance;
	}
	
	/**
	 * Salva la lista di operazioni bancarie in formato pdf
	 * @param lista l'arrayList di operazioni bancarie da stampare in pdf
	 */
	public boolean salvaDocumento(ArrayList<Operazione> lista) {
		
		Percorso percorso = new Percorso();
		Data data = new Data();
		
		String file=percorso.getPdf()+data.getDataOggiCompleta()+".pdf";
		
		  try {
			   Document document = new Document();
			   PdfWriter.getInstance(document, new FileOutputStream(file));
			   document.open();
			   Paragraph testo = new Paragraph();
			   aggiungiLineaVuota(testo, 1);
			   testo.add(new Paragraph("Elenco operazioni bancarie", bigFont));
			   aggiungiLineaVuota(testo, 1);
			   
			   aggiungiTabella(testo,lista);
			   
			   document.add(testo);
			   
			   document.close();
			  } catch (Exception e) {
			   e.printStackTrace();
			  }
		  
		  return true;	
		
	}
	
	
	 private static void aggiungiTabella(Paragraph testo, ArrayList<Operazione> operazioni) throws BadElementException {
		 
		 PdfPTable tabella = new PdfPTable(5);

		  // tabella.setBorderColor(BaseColor.GRAY);
		  // tabella.setPadding(4);
		  // tabella.setSpacing(4);
		  // tabella.setBorderWidth(1);

		  PdfPCell c1 = new PdfPCell(new Phrase("ID_Operazione"));
		  c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		  c1.setGrayFill(0.8f);
		  tabella.addCell(c1);

		  c1 = new PdfPCell(new Phrase("Data"));
		  c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		  c1.setGrayFill(0.8f);
		  tabella.addCell(c1);

		  c1 = new PdfPCell(new Phrase("Importo"));
		  c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		  c1.setGrayFill(0.8f);
		  tabella.addCell(c1);
		  
		  c1 = new PdfPCell(new Phrase("Descrizione"));
		  c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		  c1.setGrayFill(0.8f);
		  tabella.addCell(c1);
		  
		  c1 = new PdfPCell(new Phrase("Data Accettazione"));
		  c1.setHorizontalAlignment(Element.ALIGN_CENTER);
		  c1.setGrayFill(0.8f);
		  tabella.addCell(c1);  
		  
		  
		  
		  tabella.setHeaderRows(1);
		  
		  
		  for(int i=0; i<operazioni.size(); i++) {
			  
			  tabella.addCell(operazioni.get(i).getIdOperazione());
			  tabella.addCell(operazioni.get(i).getData());
			  tabella.addCell(operazioni.get(i).getImporto());
			  tabella.addCell(operazioni.get(i).getDescrizione());
			  tabella.addCell(operazioni.get(i).getDataAccettazione());
			  
		  }


		  testo.add(tabella);

		 }
	 
	 
	 private static void aggiungiLineaVuota(Paragraph paragraph, int number) {
		  for (int i = 0; i < number; i++) {
		   paragraph.add(new Paragraph(" "));
		  }
		 }
	 

}
