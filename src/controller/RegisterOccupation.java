package controller;

import model.PatientOccupationBean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterOccupation extends ActionSupport implements ModelDriven<PatientOccupationBean> {
	
	private static final long serialVersionUID = 1L;
	private PatientOccupationBean pob = new PatientOccupationBean();
	
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
				session.save(pob); //insert into sql statement equivalent
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
	public PatientOccupationBean getModel() {
		// TODO Auto-generated method stub
		return pob;
	}
	

}
