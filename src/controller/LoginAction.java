package controller;

import org.hibernate.mapping.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	
	public String execute() throws Exception{
		if(username){
			Map session = (Map) ActionContext.getContext().getSession();
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	public String logout() throws Exception{
		Map session = (Map) ActionContext.getContext().getSession();
		return SUCCESS;
	}
}
