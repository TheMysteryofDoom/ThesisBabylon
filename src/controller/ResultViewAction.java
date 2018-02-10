package controller;

import java.sql.Connection;
import java.sql.ResultSet;

import model.PatientBean;
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
				//p
				
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return SUCCESS;
	}
}
