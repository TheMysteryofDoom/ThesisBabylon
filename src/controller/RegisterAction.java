package controller;



import java.io.File;
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
	File userFile = new File("E:\\"+pb.getPatientID());
	Connection connection = DBSingletonConnection.getConnection();

	
	@Override
	public String execute(){
		System.out.println("Register Full Patient Action is mapped here.");
		// pb will be assembled year
		pb.setFirstName(session.get("pFirstName").toString());
		pb.setLastName(session.get("pLastName").toString());
		pb.setMiddleName(session.get("pMiddleName").toString());
		pb.setBirthMonth(session.get("pBirthMonth").toString());
		pb.setBirthDay(Integer.parseInt(session.get("pBirthDay").toString()));
		pb.setBirthYear(Integer.parseInt(session.get("pBirthYear").toString()));
		pb.setBirthPlace(session.get("pBirthPlace").toString());
		pb.setGender(session.get("pGender").toString());
		pb.setCitizenship(session.get("pCitizenship").toString());
		try {
			pb.setReligion(session.get("pReligion").toString());
		} catch (NullPointerException h) {
			pb.setReligion("Atheist");
		}
		pb.setCivil(session.get("pCivil").toString());
		pb.setJob(session.get("pJob").toString());
		// =======================================================
		pb.setContactNo1(session.get("pContactA").toString());
		pb.setType1(session.get("pTypeA").toString());
		pb.setContactNo2(session.get("pContactB").toString());
		try{
			pb.setType2(session.get("pTypeB").toString());
		} catch (NullPointerException h){
			pb.setType2("N/A");
		}
		pb.setContactNo3(session.get("pContactC").toString());
		try{
			pb.setType3(session.get("pTypeC").toString());
		} catch (NullPointerException h){
			pb.setType3("N/A");
		}
		pb.setEmail(session.get("pEmail").toString());
		// =======================================================
		pb.setStreet(session.get("pStreet").toString());
		pb.setCity(session.get("pCity").toString());
		pb.setCountry(session.get("pCountry").toString());
		pb.setZipcode(session.get("pZip").toString());
		// =======================================================
		System.out.println(request.getParameter("EMCfirstName").toString());
		System.out.println(request.getParameter("EMCmiddleName").toString());
		System.out.println(request.getParameter("EMClastName").toString());
		System.out.println(request.getParameter("EMCtype").toString());
		// **************
		pb.setEmcFirstName(request.getParameter("EMCfirstName").toString());
		pb.setEmcMiddleName(request.getParameter("EMCmiddleName").toString());
		pb.setEmcLastName(request.getParameter("EMClastName").toString());
		pb.setRelationship(request.getParameter("EMCtype").toString());
		pb.setAlive(true);
		//===============================
		// An SQLException will be generated because patientCardID and PatientID are missing.
		// Those values are not provided by the form.
		pb.setPatientID(0001);
		pb.setPatientCardID("2785382128");
		//===============================
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
		session.put("pBirthPlace", request.getAttribute("birthPlace"));
		session.put("pCitizenship", request.getAttribute("citizenship"));
		session.put("pReligion", request.getAttribute("religion"));
		session.put("pCivil", request.getAttribute("civil"));
		session.put("pJob", request.getAttribute("job"));

		return "success";
	}
	
	public String part2To3(){ //Contact to Address
		session.put("pContactA", request.getAttribute("contactNo1"));
		session.put("pTypeA", request.getAttribute("type1"));
		session.put("pContactB", request.getAttribute("contactNo2"));
		session.put("pTypeB", request.getAttribute("type2"));
		session.put("pContactC", request.getAttribute("contactNo3"));
		session.put("pTypeC", request.getAttribute("type3"));
		session.put("pEmail", request.getAttribute("email"));
	
		return "success";
	}
	public String part3To4(){ //Address to Emergency Contact
		session.put("pStreet", request.getAttribute("street"));
		session.put("pCity", request.getAttribute("city"));
		session.put("pCountry", request.getAttribute("country"));
		session.put("pZip", request.getAttribute("zipcode"));
		return "success";
	}
	
	// Back Buttons
	public String part2To1(){
		return "success";
	}
	public String part3To2(){
		return "success";
	}
	public String part4To3(){

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
