package controller;

import java.sql.Connection;


import utility.DBSQLOperation;
import utility.DBSingletonConnection;
import model.PatientAddressBean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAddress extends ActionSupport implements ModelDriven<PatientAddressBean>{
	private static final long serialVersionUID = 1L;
	
	PatientAddressBean pab = new PatientAddressBean();
	Connection connection = DBSingletonConnection.getConnection();
	
	public String execute(){
		String status = "error";
		if(DBSQLOperation.insertPatientAddress(pab, connection)){
			System.out.println("Address inserted to DB");
			status = "success";
		}else{
			System.err.println("Address did not insert.");
		}
		return status;
	}
	@Override
	public PatientAddressBean getModel(){
		return pab;
		
	}
	
}
