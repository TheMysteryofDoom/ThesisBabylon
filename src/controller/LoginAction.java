package controller;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

import model.AccessBean;
import utility.*;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction implements SessionAware{
	SessionMap<String,String> sessionmap;  
	AccessBean user = new AccessBean();
	private String username,password;  
	public String getUsername() {  
	    return username;  
	}  
	  
	public void setUsername(String username) {  
	    this.username = username;  
	}  
	  
	public String getUserpass() {  
	    return password;  
	}  
	  
	public void setUserpass(String password) {  
	    this.password = password;  
	}  
	  
	public String execute(){  
	    if(User.validate(username, password)){  
	        return "success";  
	    }  
	    else{  
	        return "error";  
	    }  
	}  
	
	
	
	public void setSession(Map map) {  
	    sessionmap=(SessionMap)map;  
	    sessionmap.put("login","true");  
	}  
	  
	public String logout(){  
	    sessionmap.invalidate();  
	    return "success";  
	}  
	
	
}
