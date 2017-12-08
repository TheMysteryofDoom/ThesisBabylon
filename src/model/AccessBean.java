package model;
import javax.persistence.*;

@Entity(name="loginAccess") //make the AccessBean persistent class.
public class AccessBean {
	@Id //primary key
	@GeneratedValue //makes incremental sequence
	private int id;
	@Column(name="name", length=250, nullable= false)
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
	public void facade(){
		//functions call here...
	}
	
	boolean isValid(){
		boolean valid;
		if(getUsername() == username && getPassword() == password){
			valid = true;
		}else{
			valid = false;
		}
		return valid;
	}
	
	
	
}
