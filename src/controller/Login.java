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
	Map<String, Object> m;

	public String execute(){  
		String status = "error";
		
		if(DBSQLOperation.loginAdmin(user, connection)){
			
			m.put("a", user.getUsername());
			m.put("b", user.getPassword());
			status = "success";
			
		}else{
			
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
