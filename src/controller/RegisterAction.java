package controller;



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
	Connection connection = DBSingletonConnection.getConnection();
	@Override
	public String execute(){
		String status = "error";
		if(DBSQLOperation.insertPatient(pb, connection)){
			System.out.println("Patient saved to database.");
			status = "success";
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
