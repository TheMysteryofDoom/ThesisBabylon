package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name ="patientemergencycontact")
public class EmergencyContactBean {
	@Id
	@GeneratedValue
	
	private int emergencyId;
	
	private String firstName;
	private String lastName;
	private String middleName;
	private String type;
	
	public int getEmergencyId() {
		return emergencyId;
	}
	public void setEmergencyId(int emergencyId) {
		this.emergencyId = emergencyId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
	
	
	
}
