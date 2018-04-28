package controller;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
//import org.hibernate.Session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.*;



import com.opensymphony.xwork2.ActionSupport;

//import model.AccessBean;
//import utility.*;
import model.*;

//import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport implements SessionAware{
	SessionMap<String,String> sessionmap;

	 private String userId,userPassword;
	Session session = null;
	String returnResult = "";


		public String execute(){
			User loginUser = null;
			try{
				Configuration configuration = new Configuration();
				configuration.configure("user_Authentication/hibernate.cfg.xml");
				StandardServiceRegistryBuilder regBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
				SessionFactory sessionFactory = configuration.buildSessionFactory(regBuilder.build());
				session = sessionFactory.openSession();

				if(session.isConnected()){
					System.out.println("Connection success");
				}else{
					System.out.println("Connection failed");
				}

				try{
					loginUser = (User)session.load(User.class, userId.trim());
					if(!loginUser.equals(null)){
						if(userPassword.equals(loginUser.getUserPassword())){
							returnResult = "success";
						}
					}else{
						returnResult = "error";
					}
				}catch(Exception e){
					e.printStackTrace();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			//System.out.println(username);
		//    sessionmap.put("username", username);
		 //   if(User.validate(username, password)){
		  //      return "success";
		//    }
		//    else{
		//        return "error";
	//	    }
			 
			return returnResult;
		}


	public String getUserId() {
			return userId;
		}


		public void setUserId(String userId) {
			this.userId = userId;
		}


		public String getUserPassword() {
			return userPassword;
		}


		public void setUserPassword(String userPassword) {
			this.userPassword = userPassword;
		}


	public void setSession(Map map) {  //This happens before execute
	    sessionmap=(SessionMap)map;
	    sessionmap.put("login","true");
	}

	public String logout(){
	    sessionmap.invalidate();
	    return "success";
	}


}
