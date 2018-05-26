package controller;

import utility.DBSQLOperation;
import utility.DBSingletonConnection;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.MedicalDataBean;



public class UpdateMedicalStatusAction extends ActionSupport implements ModelDriven<MedicalDataBean>{

	
	public String execute(){
		System.out.println("Medical Status is mapped here.");
		// get the patientID here from search.

		
		return SUCCESS;
		
	}
	
	
	
	@Override
	public MedicalDataBean getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
