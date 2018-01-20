package controller;

import javax.transaction.Transaction;

import org.hibernate.SessionFactory;

import model.PatientBean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import freemarker.template.Configuration;

public class RegisterAction extends ActionSupport implements ModelDriven<PatientBean>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PatientBean pb = new PatientBean();
	
	public String execute(){
		String status = ERROR;
		Transaction transaction = null;
		try{
			
			
		}catch(Exception e){
			transaction.rollback();
		}
		return status;
	}
}
