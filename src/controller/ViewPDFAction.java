package controller;
import java.io.ByteArrayOutputStream;



import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;
//Medical Results
public class ViewPDFAction extends ActionSupport
	implements ServletResponseAware{
	
	public String exectute(){
		try{
		//	ByteArrayOutputStream baosPDF = new PDFGenerator()
		//	.generatePDF();
		}catch(Exception e){
			e.printStackTrace();
		}
		return NONE;
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
