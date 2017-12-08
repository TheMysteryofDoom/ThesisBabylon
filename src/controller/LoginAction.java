package controller;
import model.AccessBean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.Map;





import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<AccessBean>{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AccessBean access = new AccessBean();
	
	public String execute() {
		String status = ERROR;
		access.facade();
	//	if(){
	//		Map session = (Map) ActionContext.getContext().getSession();
	//		return SUCCESS;
	//	}else{
	//		return ERROR;
	//	}
		SessionFactory sessionFactory = 
				new Configuration().configure().buildSessionFactory();
		
		Session session = null;
		Transaction transaction = null;
		try{
			
			session = sessionFactory.openSession();
			 if(session!=null){
				transaction = session.beginTransaction();
				session.save(access); //insert into sql statement equivalent
				transaction.commit();
			 }else{
				 System.err.println("session is null");
			 }
			} catch(Exception e){
				transaction.rollback();
				}
			status = SUCCESS;
		
		return status;
	}
	public String logout() throws Exception{
		Map session = (Map) ActionContext.getContext().getSession();
		return SUCCESS;
	}
	@Override
	public AccessBean getModel() {
		// TODO Auto-generated method stub
		return null;
	}
}
