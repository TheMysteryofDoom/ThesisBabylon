package controller;



import model.PatientBean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RegisterAction extends ActionSupport implements ModelDriven<PatientBean>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PatientBean pb = new PatientBean();
	
	public String execute(){
		String status = ERROR;
		SessionFactory sessionFactory = 
				new Configuration().configure().buildSessionFactory();
		
		Session session = null;
		Transaction transaction = null;
		try{
			session = sessionFactory.openSession();
			 if(session!=null){
				transaction = session.beginTransaction();
				session.save(pb); //insert into sql statement equivalent
				transaction.commit();
			 }else{
				 System.err.println("session is null");
			 }
			
		}catch(Exception e){
			transaction.rollback();
		}
		return status;
	}
	@Override
	public PatientBean getModel(){
		return pb;
		
	}
}
