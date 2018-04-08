package controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.AccountEntity;

public class AccountAction extends ActionSupport implements ModelDriven<AccountEntity>{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -118835801386775362L;
	private AccountEntity ae = new AccountEntity();
	
	
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
				session.save(ae); //insert into sql statement equivalent
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
	public AccountEntity getModel() {
		// TODO Auto-generated method stub
		return ae;
	}
	

}
