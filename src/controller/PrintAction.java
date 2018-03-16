package controller;
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;

import model.PatientBean;
//import utility.SQLCommand;

import com.itextpdf.text.Document;
//import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
//import com.itextpdf.text.pdf.codec.Base64.InputStream;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
//Use ItextPDF Jar file.
public class PrintAction extends ActionSupport implements ModelDriven<PatientBean>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//private InputStream inputStream;
	
	private PatientBean pb = new PatientBean();
	@Override
	public String execute(){
		String status = ERROR;
		Document document = new Document(); 
		//ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		//Connection conn = null;
		
		try{
		/*	//Database connection 
			//String URL = "jdbc:mysql://localhost:3306/codersofbabylon";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/codersofbabylon","","");
			// UPDATE DB CONNECTION ONCE HASHED.
			String sql = "SELECT firstName FROM patientregistry WHERE";
			sql += "lastName = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				name = 
			}
			PdfWriter.getInstance(document, buffer);
			
			document.open();
			Paragraph p = new Paragraph();
			//retrieve here The Name of the User from Database.
			p.add("MARK LUIS GABRIEL V. TICZON");
			
			document.add(p);
			document.close();
			document.close(); 

			
			inputStream  =  new ByteArrayInputStream(buffer.toByteArray()); */
			String firstName = pb.getFirstName();
			PdfWriter.getInstance(document, new FileOutputStream("e:\\Sample_Output.pdf"));
			document.open();
			document.add(new Paragraph("TEST PRINTING"));
			document.add(new Paragraph(firstName));
			document.close();
			
			status = SUCCESS;
			
			
			
		}catch(Exception e){
			status = ERROR;
			e.printStackTrace();
		}
		return status;
	}

/*	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	} */

	@Override
	public PatientBean getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
