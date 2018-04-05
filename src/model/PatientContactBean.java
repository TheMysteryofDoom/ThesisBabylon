package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name ="patientcontactregistry")

public class PatientContactBean {
	
	@Id
	@GeneratedValue
	@Column(name = "CONTACT_ID", unique = true, nullable = false)
	private int  contactId;
	
	@Column(name = "CONTACT_NO1", unique = false, nullable = false)
	private String contactNo1;
	
	@Column(name = "CONTACT_NO2", unique = false, nullable = true)
	private String contactNo2;
	
	@Column(name = "CONTACT_NO3", unique = false, nullable = true)
	private String contactNo3;
	
	@Column(name = "EMAIL", unique = false, nullable = false)
	private String email;
	
	@ManyToOne
	private PatientBean pb;
	
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getContactNo1() {
		return contactNo1;
	}
	public void setContactNo1(String contactNo1) {
		this.contactNo1 = contactNo1;
	}
	public String getContactNo2() {
		return contactNo2;
	}
	public void setContactNo2(String contactNo2) {
		this.contactNo2 = contactNo2;
	}
	public String getContactNo3() {
		return contactNo3;
	}
	public void setContactNo3(String contactNo3) {
		this.contactNo3 = contactNo3;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public PatientBean getPb() {
		return pb;
	}
	public void setPb(PatientBean pb) {
		this.pb = pb;
	}
	

}
