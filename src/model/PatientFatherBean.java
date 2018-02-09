package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="patientregistry")
public class PatientFatherBean {

	@Id
	@GeneratedValue
	private int fatherId;	
	
	private String fathersFirstName;
	private String fathersLastName;
	private String fathersMiddleName;
	public int getId() {
		return fatherId;
	}
	public void setId(int id) {
		this.fatherId = id;
	}
	public String getFathersFirstName() {
		return fathersFirstName;
	}
	public void setFathersFirstName(String fathersFirstName) {
		this.fathersFirstName = fathersFirstName;
	}
	public String getFathersLastName() {
		return fathersLastName;
	}
	public void setFathersLastName(String fathersLastName) {
		this.fathersLastName = fathersLastName;
	}
	public String getFathersMiddleName() {
		return fathersMiddleName;
	}
	public void setFathersMiddleName(String fathersMiddleName) {
		this.fathersMiddleName = fathersMiddleName;
	}
	
	
}
