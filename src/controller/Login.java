package controller;
import java.sql.Connection;
import java.util.Map;



import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ModelDriven;

import utility.*;

//import com.opensymphony.xwork2.ActionSupport;


public class Login implements SessionAware{ 
	
SessionMap<String,String> sessionmap;  
	
	private String username;
	private String password;  
	public String getUsername() {  
	    return username;  
	}  
	  
	public void setUsername(String username) {  
	    this.username = username;  
	}  
	  

	  
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute(){  
		System.out.println(username);
	    sessionmap.put("username", username);
	    if(User.validate(username, password)){  
	        return "success";  
	    }  
	    else{  
	        return "error";  
	    }  
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
