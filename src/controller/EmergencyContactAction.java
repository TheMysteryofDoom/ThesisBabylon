package controller;

import model.EmergencyContactBean;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmergencyContactAction extends ActionSupport implements ModelDriven<EmergencyContactBean> {
	private static final long serialVersionUID = 1L;
	private EmergencyContactBean ecb = new EmergencyContactBean();
	
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
				session.save(ecb); //insert into sql statement equivalent
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
	public EmergencyContactBean getModel() {
		// TODO Auto-generated method stub
		return ecb;
	}
}
