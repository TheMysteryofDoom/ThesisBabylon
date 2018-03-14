package controller;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

public class PrintAction {
	
	
	public String execute(){
		Document document = new Document();
		
		try{
			PdfWriter.getInstance(document,
					new FileOutputStream("image"));
			
			Image ID = Image.getInstance("");
			document.add("");
			
			document.close(); 
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
