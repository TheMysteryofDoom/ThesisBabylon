package controller;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

import model.PatientBean;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.codec.Base64.InputStream;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class PrintAction extends ActionSupport  implements ModelDriven<PatientBean>{
	private InputStream inputStream;
	
	public String execute(){
		String status = ERROR;
		Document document = new Document(); 
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();

		
		try{
			PdfWriter.getInstance(document, buffer);
			
			document.open();
			Paragraph p = new Paragraph();
			//import here The Name of the User from Database.
			p.add("MARK LUIS GABRIEL V. TICZON");
			
			document.add(p);
			document.close();
			document.close(); 

		
			inputStream = new ByteArrayInputStream(buffer.toByteArray());
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}
	
	
	
}