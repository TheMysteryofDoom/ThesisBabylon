package interceptor;

import java.util.Map;

import model.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class AuthenticationInterceptor implements Interceptor{
	
	@Override
	public void destroy() {
		//release resources here
	}

	@Override
	public void init() {
		// create resources here
	}
	@Override
	public String intercept(ActionInvocation actionInvocation)
			throws Exception {
		System.out.println("inside auth interceptor");
		Map<String, Object> sessionAttributes = actionInvocation.getInvocationContext().getSession();
		
		User user = (User) sessionAttributes.get("USER");
		
		if(user == null){
			return Action.LOGIN;
		}else{
			Action action = (Action) actionInvocation.getAction();
			if(action instanceof UserAware){
				((UserAware) action).setUser(user);
			}
			return actionInvocation.invoke();
		}
	}

}
