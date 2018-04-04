package model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table (name ="patientregistry", uniqueConstraints = {
		@UniqueConstraint(columnNames = "ID")
})
public class PatientBean implements Serializable{
	/**
	 * =-=-
	 */
	private static final long serialVersionUID = -3041691189736927433L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private int ID;
	
	//form input values;
	//Personal information 	
	//Person
	@Column(name = "FIRST_NAME", unique = false, nullable = false, length = 100)
	private String firstName;
	
	@Column(name = "LAST_NAME", unique = false, nullable = false, length = 100)
	private String lastName;
	
	@Column(name = "MIDDLE_NAME", unique = false, nullable = false, length = 100)
	private String middleName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="PATIENT_ID")
	private Set<AccountEntity> account;
	
	@Column(name = "BIRTH_MONTH", unique = false, nullable = false, length = 50)
	private String birthMonth;
	
	@Column(name = "BIRTHDAY", unique = false, nullable = false)
	private int birthDay;
	private int birthYear;
	
	@Column(name = "GENDER", unique = false, nullable = false, length = 50)
	private String gender;
	
	@Column(name = "BIRTH_PLACE", unique = false, nullable = false, length =100)
	private String birthPlace;
	
	@Column(name = "CITIZENSHIP", unique = false, nullable = false, length = 50)
	private String citizenship;
	
	@Column(name = "RELIGION", unique = false, nullable = false, length = 50)
	private String religion;
	
	@Column(name = "CIVIL_STATUS", unique = false, nullable = false, length = 50)
	private String civil;

	@Column(name = "OCCUPATION", unique = false, nullable = false, length = 50)
	private String job;
	//patients Status
	@Column(name = "STATUS", unique = false, nullable = false, length = 10)
	private String status;

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
	public String getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getCitizenship() {
		return citizenship;
	}
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getCivil() {
		return civil;
	}
	public void setCivil(String civil) {
		this.civil = civil;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Set<AccountEntity> getAccount() {
		return account;
	}
	public void setAccount(Set<AccountEntity> account) {
		this.account = account;
	}
	
	
	
}

