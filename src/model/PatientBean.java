package model;

import java.io.Serializable;



public class PatientBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3041691189736927433L;


	private int patientID;
	
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
	private String job;
	
	//patient contact information
	private String contactNo1;
	private String contactNo2;
	private String contactNo3;
	private String type1;
	private String type2;
	private String type3;
	private String email;
	
	//patient address information
	private String street;
	private String city;
	private String country;
	private String zipcode;
	
	//patient emergency contact
	private String emcFirstName;
	private String emcLastName;
	private String emcMiddleName;
	private String emcContactNo;
	private String relationship;
	//patients Status
	private boolean isAlive;
	
	//Patient Card ID
	private String patientCardID;
	
	public int getPatientID() {
		return patientID;
	}
	public void setPatientID(int patientID) {
		this.patientID = patientID;
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
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
	public String getType1() {
		return type1;
	}
	public void setType1(String type1) {
		this.type1 = type1;
	}
	public String getType2() {
		return type2;
	}
	public void setType2(String type2) {
		this.type2 = type2;
	}
	public String getType3() {
		return type3;
	}
	public void setType3(String type3) {
		this.type3 = type3;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getEmcFirstName() {
		return emcFirstName;
	}
	public void setEmcFirstName(String emcFirstName) {
		this.emcFirstName = emcFirstName;
	}
	public String getEmcLastName() {
		return emcLastName;
	}
	public void setEmcLastName(String emcLastName) {
		this.emcLastName = emcLastName;
	}
	public String getEmcMiddleName() {
		return emcMiddleName;
	}
	public void setEmcMiddleName(String emcMiddleName) {
		this.emcMiddleName = emcMiddleName;
	}
	public String getEmcContactNo() {
		return emcContactNo;
	}
	public void setEmcContactNo(String emcContactNo) {
		this.emcContactNo = emcContactNo;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public String getPatientCardID() {
		return patientCardID;
	}
	public void setPatientCardID(String patientCardID) {
		this.patientCardID = patientCardID;
	}
	
	
	
}

