package model;

import java.io.Serializable;



public class EmergencyContactBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8396694675075444441L;

	private int emergencyId;
	

	private String firstName;
	private String lastName;
	private String middleName;
	private String type;

	public void setEmergencyId(Integer emergencyId) {
		this.emergencyId = emergencyId;
	}

	

	
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
