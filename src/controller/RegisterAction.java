package controller;



import java.util.ArrayList;
import java.util.List;

import model.PatientBean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import utility.HibernateListener;

public class RegisterAction extends ActionSupport implements ModelDriven<PatientBean>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<PatientBean> patientList = new ArrayList<>();
	
	private PatientBean pb = new PatientBean();
	@Override
	public String execute(){
		/*String status = ERROR;
		SessionFactory sessionFactory = 
				new Configuration().configure().buildSessionFactory();
		
		Session session = null;
		Transaction transaction = null;
		try{
			session = sessionFactory.openSession();
			 if(session!=null){
				//transaction = session.beginTransaction();
				session.save(pb); //insert into sql statement equivalent
				session.getTransaction().commit();
				//transaction.commit();
				patientList = null;
				patientList = session.createQuery("from patientregistry").list();
				status = SUCCESS;
			 }else{
				 System.err.println("session is null");
			 }
			
		}catch(Exception e){
			//transaction.rollback();
			e.printStackTrace();
		}
		return status; */
	return SUCCESS;
	}
	@Override
	public PatientBean getModel(){
		return pb;
		
	}
	
	@SuppressWarnings("unchecked")
	public String addPatient() {
		String status = ERROR;
		SessionFactory sessionFactory = (SessionFactory) ServletActionContext.getServletContext()
				.getAttribute(HibernateListener.KEY_NAME);
		
		Session session = null;
	//	Transaction transaction = null;
		try{
			session = sessionFactory.openSession();
			 if(session!=null){
				//transaction = session.beginTransaction();
				 session.beginTransaction();
				session.save(pb); //insert into sql statement equivalent
				session.getTransaction().commit();
				//transaction.commit();
				patientList = null;
				patientList = session.createQuery("from PatientBean").list();
				status = SUCCESS;
			 }else{
				 System.err.println("session is null");
			 }
			
		}catch(Exception e){
			//transaction.rollback();
			e.printStackTrace();
		}
		return status;
	}
	@SuppressWarnings("unchecked")
	public String fetchPatient() {
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
	public List<PatientBean> getPatientList() {
		return patientList;
	}
	public void setPatientList(List<PatientBean> patientList) {
		this.patientList = patientList;
	}
	
}
