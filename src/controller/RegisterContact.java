package controller;

import java.sql.Connection;

import model.PatientContactBean;
import utility.DBSQLOperation;
import utility.DBSingletonConnection;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterContact extends ActionSupport implements ModelDriven<PatientContactBean> {
	
	private static final long serialVersionUID = 1L;
	
	PatientContactBean pcb = new PatientContactBean();
	Connection connection = DBSingletonConnection.getConnection();
	
	public String execute(){
		if(DBSQLOperation.insertPatientContact(pcb, connection)){
			System.out.println("Contact inserted to db");
		}else{
			System.err.println("Contact did not insert,");
		}
		
		return SUCCESS;
	}
	
	@Override
	public PatientContactBean getModel(){
		return pcb;
		
	}
}
