package controller;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.MedicalDataBean;


public class FileUploadAction extends ActionSupport implements ModelDriven<MedicalDataBean>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String status;
	public String execute(){
		try{
			status = "SUCCESS";
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}
	
	@Override
	public MedicalDataBean getModel() {
		// TODO Auto-generated method stub
		return null;
	}

}
