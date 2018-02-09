package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name ="patientregistry")
public class PatientOccupationBean {
	
	@Id
	@GeneratedValue
	private int occupationId;

	
	private String job;
	private String employer;
	private String employerid;
	private String employersAddress;
	private String employerNo;
	
	public int getOccupationId() {
		return occupationId;
	}
	public void setOccupationId(int occupationId) {
		this.occupationId = occupationId;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getEmployer() {
		return employer;
	}
	public void setEmployer(String employer) {
		this.employer = employer;
	}
	public String getEmployerid() {
		return employerid;
	}
	public void setEmployerid(String employerid) {
		this.employerid = employerid;
	}
	public String getEmployersAddress() {
		return employersAddress;
	}
	public void setEmployersAddress(String employersAddress) {
		this.employersAddress = employersAddress;
	}
	public String getEmployerNo() {
		return employerNo;
	}
	public void setEmployerNo(String employerNo) {
		this.employerNo = employerNo;
	}
	
	
}
