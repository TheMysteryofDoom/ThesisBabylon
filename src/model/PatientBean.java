package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="patientregistry")
public class PatientBean {
	@Id
	@GeneratedValue
	private int id;
	
	//form input values;
	//Personal information 	
	//Person
	private String firstName;
	private String lastName;
	private String middleName;
	private String birthMonth;
	private int birthDay;
	private int birthYear;
	private String gender;
	private String birthPlace;
	private String citizenship;
	private String religion;
	private String civil;
	private String presentAddress;
	private String permanentAddress;
	private String cellno;
	private String homeno;
	private String email;
	//occupation
	private String job;
	private String employer;
	private String employerid;
	private String employersAddress;
	private String employerNo;
	//mothers name
	private String mothersFirstName;
	private String mothersLastName;
	private String mothersMiddleName;
	//fathers name
	private String fathersFirstName;
	private String fathersLastName;
	private String fathersMiddleName;
	
	//spouse
	private String spouseName;
	private String spouselastName;
	private String spousemiddleName;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getCellno() {
		return cellno;
	}
	public void setCellno(String cellno) {
		this.cellno = cellno;
	}
	public String getHomeno() {
		return homeno;
	}
	public void setHomeno(String homeno) {
		this.homeno = homeno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getMothersFirstName() {
		return mothersFirstName;
	}
	public void setMothersFirstName(String mothersFirstName) {
		this.mothersFirstName = mothersFirstName;
	}
	public String getMothersLastName() {
		return mothersLastName;
	}
	public void setMothersLastName(String mothersLastName) {
		this.mothersLastName = mothersLastName;
	}
	public String getMothersMiddleName() {
		return mothersMiddleName;
	}
	public void setMothersMiddleName(String mothersMiddleName) {
		this.mothersMiddleName = mothersMiddleName;
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

