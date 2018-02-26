package controller;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.PatientBean;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import utility.HibernateListener;


public class LoadAction extends ActionSupport implements ModelDriven<PatientBean>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<PatientBean> patientList = new ArrayList<>();
	private PatientBean pb = new PatientBean();
	String status = ERROR;
	SessionFactory sessionFactory = 
			new Configuration().configure().buildSessionFactory();
	
	
	public String execute(){
		SessionFactory sessionFactory = (SessionFactory) ServletActionContext.getServletContext()
				.getAttribute(HibernateListener.KEY_NAME);
		try{
			
		
		Session session = sessionFactory.openSession();
		patientList = session.createQuery("from PatientBean").list();
		}catch(Exception e){
			e.printStackTrace();
		}
	
	return SUCCESS;
	
	}
	
	@Override
	public PatientBean getModel(){
		return pb;
		
	}
	
	public List<PatientBean> getPatientList() {
		return patientList;
	}
	public void setPatientList(List<PatientBean> patientList) {
		this.patientList = patientList;
	}
}
