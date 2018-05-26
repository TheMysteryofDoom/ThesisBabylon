package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import utility.DBSQLOperation;
import utility.DBSingletonConnection;
import utility.Search;
import model.PatientBean;
import model.FetchDataBean;








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
	Connection connection = DBSingletonConnection.getConnection();
	private PatientBean pb = new PatientBean();
	ResultSet resultSet = null;
	 
	@Override
	public String execute(){
		String status = null;
		if(request.getParameter("patientid")!=null){
			try{
				System.out.println(request.getParameter("patientid")); //Gets the PatientID Input
				String patientid = request.getParameter("patientid");
				System.out.println(patientid);
				//Perform Database operations here based on patientID
				
				
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/codersofbabylon2","root","");
				ArrayList al = null;
	            ArrayList pid_list = new ArrayList();
				String query = "select * from patient where patientid = '"+patientid+"'";
				PreparedStatement pstmt = connection.prepareStatement(query);
				// pstmt.setInt(1, pb.getPatientID());
				resultSet = pstmt.executeQuery();
				session.put("patientDetails", resultSet);
				 //==============================
				 while(resultSet.next()){
					System.out.println("Printing values.....");
					System.out.println(resultSet.getString(1));
					System.out.println(resultSet.getString(2));
					System.out.println(resultSet.getString(3));
					 
					 return status = "success";
				 }
			}catch(Exception e){
				status = ERROR;
				e.printStackTrace();
			}
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
