package controller;



import java.io.File;
import java.sql.Connection;

import model.PatientBean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;



import utility.DBSQLOperation;
import utility.DBSingletonConnection;


public class RegisterAction extends ActionSupport implements ModelDriven<PatientBean>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PatientBean pb = new PatientBean();
	File userFile = new File("E:\\"+pb.getPatientID());
	Connection connection = DBSingletonConnection.getConnection();
	@Override
	public String execute(){
		String status = "error";
		if(DBSQLOperation.insertPatient(pb, connection)){
			System.out.println("Patient saved to database.");
			if(userFile.mkdir()){
				status = "success";
			}else{
				System.err.println("Did not create File.");
				System.err.println("STATUS: ERROR");
			}
			
		}else{
			
			System.err.println("Patient did not insert to database.");
		}
	return status;
	}



	@Override
	public PatientBean getModel() {
		
		return pb;
	}
	
	

}
