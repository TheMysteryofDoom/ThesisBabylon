package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="patientregistry")
public class PatientSpouseBean {
	
	@Id
	@GeneratedValue
	private int spouseId;	
	private String spouseName;
	private String spouselastName;
	private String spousemiddleName;
	private String status;
	public int getSpouseId() {
		return spouseId;
	}
	public void setSpouseId(int spouseId) {
		this.spouseId = spouseId;
	}
	public String getSpouseName() {
		return spouseName;
	}
	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}
	public String getSpouselastName() {
		return spouselastName;
	}
	public void setSpouselastName(String spouselastName) {
		this.spouselastName = spouselastName;
	}
	public String getSpousemiddleName() {
		return spousemiddleName;
	}
	public void setSpousemiddleName(String spousemiddleName) {
		this.spousemiddleName = spousemiddleName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
