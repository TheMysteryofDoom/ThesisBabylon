package controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.AdminBean;
import model.EmergencyContactBean;
import model.PatientAddressBean;

public class RegisterAdmin extends ActionSupport implements ModelDriven<AdminBean> {

	private static final long serialVersionUID = 1L;
	private AdminBean adb = new AdminBean();
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
				session.save(adb); //insert into sql statement equivalent
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
	public AdminBean getModel() {
		return adb;
	}
	}