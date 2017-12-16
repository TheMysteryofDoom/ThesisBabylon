package controller;
import model.AccessBean;
import utility.*;
import org.hibernate.mapping.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	AccessBean access;
	User user = new User(); 
	//Users userLogin;
	@Override
	public void validate(){
		if(access.getUsername().length()==(0)){
			this.addFieldError("access.username", "Username is required");
		}
		if(access.getPassword().length()==(0)){
			this.addFieldError("access.password", "Password is required");
		}
	}
	@Override
	public String execute(){
		if(){
			
		}else{
			
		}
	}
	
	
	
	
	public AccessBean getUser() {
        return access;
    }
 
    public void setUser(AccessBean access) {
        this.access = access;
    }    
	
	
	
}
