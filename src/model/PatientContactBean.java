package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="patientaddressregistry")

public class PatientContactBean {
	
	@Id
	@GeneratedValue
	private int  contactId;
	
	private String contactNo1;
	private String contactNo2;
	private String contactNo3;
	private String email;
	
	
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

}
