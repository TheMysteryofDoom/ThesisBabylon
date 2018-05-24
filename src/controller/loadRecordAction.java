package controller;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import model.PatientBean;
//import utility.SQLCommand;






//import com.itextpdf.text.Document;
//import com.itextpdf.text.Image;
//import com.itextpdf.text.Image;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
//import com.itextpdf.text.pdf.codec.Base64.InputStream;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
//Use ItextPDF Jar file.
public class loadRecordAction extends ActionSupport implements ModelDriven<PatientBean>,SessionAware,ServletRequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected Map<String,Object> session;
	protected HttpServletRequest request;
	
	private PatientBean pb = new PatientBean();
	@Override
	public String execute(){
		String status = SUCCESS;
		
		try{
			System.out.println(request.getAttribute("patientid"));
		
			
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

	@Override
	public void setSession(Map sess) {
		this.session = sess;
	}

	@Override
	public void setServletRequest(HttpServletRequest req) {
		// TODO Auto-generated method stub
		this.request = req;
	}
	
	
	
}
