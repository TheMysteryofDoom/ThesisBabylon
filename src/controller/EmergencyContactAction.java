package controller;

import java.sql.Connection;

import model.EmergencyContactBean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import utility.DBSQLOperation;
import utility.DBSingletonConnection;

public class EmergencyContactAction extends ActionSupport implements ModelDriven<EmergencyContactBean> {
	private static final long serialVersionUID = 1L;
	EmergencyContactBean ecb = new EmergencyContactBean();
	Connection connection = DBSingletonConnection.getConnection();
	
	public String execute(){
		if(DBSQLOperation.insertPatientEmergenctContact(ecb, connection)){
			System.out.println("Emergency contact inserted to db.");
			
		}else{
			System.err.println("Emergenct contact did not insert.");
		}
		
		return SUCCESS;
	}

	@Override
	public EmergencyContactBean getModel() {
	
		return ecb;
	}
}
