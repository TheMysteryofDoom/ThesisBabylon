package controller;



import java.sql.Connection;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import model.PatientBean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import utility.DBSQLOperation;
import utility.DBSingletonConnection;

import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.interceptor.ServletRequestAware;

public class RegisterAction extends ActionSupport implements ModelDriven<PatientBean>,SessionAware,ServletRequestAware{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected Map<String,Object> session;
	protected HttpServletRequest request;
	
	PatientBean pb = new PatientBean();
	Connection connection = DBSingletonConnection.getConnection();

	
	@Override
	public String execute(){
		String status = "error";
		System.out.println(session.get("username"));
		if(DBSQLOperation.insertPatient(pb, connection)){
			System.out.println("Patient saved to database.");
			status = "success";
		}else{
			
			System.err.println("Patient did not insert to database.");
		}
	return status;
	}
	
	public String part1To2(){ // Base to Contact
		
		session.put("pFirstName", request.getAttribute("firstName"));
		session.put("pLastName", request.getAttribute("lastName"));
		session.put("pMiddleName", request.getAttribute("middleName"));
		session.put("pBirthMonth", request.getAttribute("birthMonth"));
		session.put("pBirthDay", request.getAttribute("birthDay"));
		session.put("pBirthYear", request.getAttribute("birthYear"));
		session.put("pGender", request.getAttribute("gender"));
		//System.out.println(session.get("pGender"));
		session.put("pBirthPlace", request.getAttribute("birthPlace"));
		session.put("pCitizenship", request.getAttribute("citizenship"));
		session.put("pReligion", request.getAttribute("religion"));
		session.put("pCivil", request.getAttribute("civil"));
		session.put("pJob", request.getAttribute("job"));

		return "success";
	}
	
	public String part2To3(){ //Contact to Contact Person
		session.put("pContactA", request.getAttribute("contactNo1"));
		session.put("pTypeA", request.getAttribute("type1"));
		session.put("pContactB", request.getAttribute("contactNo2"));
		session.put("pTypeB", request.getAttribute("type2"));
		session.put("pContactC", request.getAttribute("contactNo3"));
		session.put("pTypeC", request.getAttribute("type3"));
		session.put("pEmail", request.getAttribute("email"));
	
		return "success";
	}
	
	// Back Buttons
	public String part2To1(){
		return "success";
	}
	public String part3To2(){
		return "success";
	}


	@Override
	public PatientBean getModel() {
		
		return pb;
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
