package controller;

import java.sql.Connection;

import utility.DBSQLOperation;
import utility.DBSingletonConnection;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.MedicalDataBean;



public class UpdateMedicalStatusAction extends ActionSupport implements ModelDriven<MedicalDataBean>{

	MedicalDataBean mdb = new MedicalDataBean();
	Connection connection = DBSingletonConnection.getConnection();
	String status = "error";
	public String execute(){
		System.out.println("Medical Status is mapped here.");
		
		if(DBSQLOperation.insertMedicalStatus(mdb, connection)){
			System.out.println("Medical status updated");
			status = "success";
			return status;
		}else{
			System.err.println("Medical Satus did not insert.");
			status= "error";
			return status;
		}

		
		
		
	}
	
	
	
	@Override
	public MedicalDataBean getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
