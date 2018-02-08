package controller;

import model.PatientContactBean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterContact extends ActionSupport implements ModelDriven<PatientContactBean> {
	private PatientContactBean pcb = new PatientContactBean();
	
	
	@Override
	public PatientContactBean getModel(){
		return pcb;
		
	}
}
