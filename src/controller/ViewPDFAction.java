package controller;
import java.io.ByteArrayOutputStream;


import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;
//Medical Results
public class ViewPDFAction extends ActionSupport
	implements ServletResponseAware{
	
	public String exectute(){
		try{
			ByteArrayOutputStream baosPDF = new PDFGenerator()
			.generatePDF();
		}catch(Exception e){
			e.printStackTrace();
		}
		return NONE;
	}
	
}
