package controller;
import java.util.HashMap;
import java.util.Map;




import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import utility.*;

//import com.opensymphony.xwork2.ActionSupport;


public class Login implements SessionAware{ 
	
SessionMap<String,String> sessionmap;  
	
	private String username;
	private String password; 
	//==============
	private static String hospitalID;
	//==============
	
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
		Map<String, String> hospitalNames = new HashMap<String, String>();
		hospitalNames.put("666", "Saint Somethings");
		hospitalNames.put("20010001", "Near Western University");
		
		System.out.println(username);
	   
	    if(User.validate(username, password)){  
	    	sessionmap.put("username", username);
	    	sessionmap.put("didRegister","");
	    	//===========================================
	    	System.out.println(hospitalID);
	    	sessionmap.put("hospitalID", hospitalID);
	    	try{
	    		sessionmap.put("hospitalName", hospitalNames.get(hospitalID));
	    	} catch (Exception f){
	    		sessionmap.put("hospitalName", "Heavenly Host Hospital");
	    	}
	    	//===========================================
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

	public static String getHospitalID() {
		return hospitalID;
	}

	public static void setHospitalID(String hospitalID) {
		Login.hospitalID = hospitalID;
	}  

	

	
	
}
