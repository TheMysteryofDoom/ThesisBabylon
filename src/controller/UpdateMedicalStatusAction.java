package controller;

import java.sql.Connection;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import utility.DBSQLOperation;
import utility.DBSingletonConnection;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import model.MedicalDataBean;



public class UpdateMedicalStatusAction extends ActionSupport implements ModelDriven<MedicalDataBean>,SessionAware,ServletRequestAware{

	protected Map<String,Object> session;
	protected HttpServletRequest request;
	MedicalDataBean mdb = new MedicalDataBean();
	Connection connection = DBSingletonConnection.getConnection();
	String status = "error";
	public String execute(){
		System.out.println("Medical Status is mapped ssssshere.");
		//===================Setter Method
		mdb.setPatientId(Integer.parseInt(request.getParameter("patientID")));
		//mdb.setMedicalStatusid(Integer.parseInt(request.getParameter("patientID")));
		mdb.setBloodPressure(Float.parseFloat(request.getParameter("bloodPressure")));
		mdb.setPrcr(Float.parseFloat(request.getParameter("prcr")));
		mdb.setRepiratoryRate(Float.parseFloat(request.getParameter("respiratoryRate")));
		mdb.setTemperature(Float.parseFloat(request.getParameter("temperature")));
		mdb.setWeight(Float.parseFloat(request.getParameter("weight")));
		mdb.setHeight(Float.parseFloat(request.getParameter("height")));
		mdb.setHeadCircumference(Float.parseFloat(request.getParameter("headCirc")));
		mdb.setChestCircumference(Float.parseFloat(request.getParameter("chestCirc")));
		mdb.setAbdominal(Float.parseFloat(request.getParameter("abdCirc")));

		//=============================================================
		System.out.println(request.getParameter("medHistory"));
		System.out.println(request.getParameter("treatmentPlan"));
		//===================
		
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
	@Override
	public void setSession(Map sess) {
		this.session = sess;
	}

	@Override
	public void setServletRequest(HttpServletRequest req) {
		// TODO Auto-generated method stub
		this.request = req;
	}
	

}
