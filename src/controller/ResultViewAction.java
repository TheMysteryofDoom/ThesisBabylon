package controller;

import java.sql.Connection;
import java.sql.ResultSet;

import model.PatientBean;
import model.ResultBean;
import utility.DBSQLOperation;
import utility.DBSingletonConnection;

import com.opensymphony.xwork2.ActionSupport;

public class ResultViewAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Connection connection = DBSingletonConnection.getConnection();
	
	public String execute(){
		try{
			ResultSet patient = DBSQLOperation.retrievePatient(connection);
			ResultSet address = DBSQLOperation.retrievePatientAddress(connection);
			ResultSet contact = DBSQLOperation.retrievePatientContact(connection);
			ResultSet emergency = DBSQLOperation.retrievePatientEmergancyContact(connection);
			
			while(patient.next()){
				ResultBean result1 = new ResultBean();
				
				result1.setFirstName(patient.getString("firstName"));
				
				
			}
			while(address.next()){
				ResultBean result2 = new ResultBean();
				
				result2.setStreet(address.getString("street"));
				
			}
			
			while(contact.next()){
				
			}
			
			while(emergency.next()){
				
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return SUCCESS;
	}
}
