package controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.PatientAddressBean;


import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAddress extends ActionSupport implements ModelDriven<PatientAddressBean>{
	private static final long serialVersionUID = 1L;
	private PatientAddressBean pab = new PatientAddressBean();
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
				session.save(pab); //insert into sql statement equivalent
				transaction.commit();
				status = SUCCESS;
			 }else{
				 System.err.println("session is null");
			 }
			
		}catch(Exception e){
			transaction.rollback();
		}
		return status;
	}
	@Override
	public PatientAddressBean getModel(){
		return pab;
		
	}
	
}
