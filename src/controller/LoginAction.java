package controller;
import model.AccessBean;
import utility.*;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	AccessBean access;
	User user = new User(); 
	//Users userLogin;
	@Override
	public void validate(){
		try{
			if(access.getUsername().length()==(0)){
				this.addFieldError("access.username", "Username is required");
			}
			if(access.getPassword().length()==(0)){
				this.addFieldError("access.password", "Password is required");
			}
		}catch(NullPointerException npe){
			System.err.println("NULL!");
		}
		
	}
	@Override
	public String execute(){
		if(user.find(access.getUsername(), access.getPassword())){
			return SUCCESS;
		}else{
			this.addActionError("Invalid username and password");
		}
		return INPUT;
	}
	
	
	
	public AccessBean getUser() {
        return access;
    }
 
    public void setUser(AccessBean access) {
        this.access = access;
    }    
	
	
	
}
