package controller;
import java.sql.Connection;
import java.util.Map;

import model.User;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;

import utility.*;

//import com.opensymphony.xwork2.ActionSupport;


public class Login implements SessionAware, ModelDriven<User>{ 
	
	private SessionMap<String,Object> sessionMap;
	//SessionMap object is injected by Struts2
	
	
	User user = new User();
	Connection connection = DBSingletonConnection.getConnection();
	

	public String execute(){  
		String status = "error";

			if(DBSQLOperation.loginAdmin(user, connection)){
				System.out.println("USER LOGGED IN");
				sessionMap.put("logined", "true");
				status = "success";
			}else{
				System.err.println("Admin login failed");
			}
			return status;
		}
	
	

	  
	public String logout(){
		try{
			if(sessionMap!=null){
				sessionMap.invalidate();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	   
	    return "success";  
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}




	@Override
	public void setSession(Map<String,Object>map){
		sessionMap = (SessionMap<String, Object>)map;
	}

	

	
	
}
