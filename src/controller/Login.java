package controller;
import java.sql.Connection;
import java.util.Map;

import model.User;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;
import utility.*;

//import com.opensymphony.xwork2.ActionSupport;

public class Login implements SessionAware, ModelDriven<User>{ 
	
	
	User user = new User();
	Connection connection = DBSingletonConnection.getConnection();
	

	public String execute(){  
		String status = "error";
		try{
			
			
		}
	
	return status;
	}  
	  
	public String logout(){  
	   
	    return "success";  
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	

	@Override
	public void setSession(Map<String, Object> m) {
		this.m = m;
		
	}

	
	
}
