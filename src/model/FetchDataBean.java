package model;

public class FetchDataBean {
	String patientID;
	
	//form input values;
	//Personal information 	
	//Person

	String firstName;
	String lastName;
	String middleName;
	String birthDay;
	String gender;
	String birthPlace;
	 String citizenship;
	 String religion;
	 String civil;
	 String job;
	
	//patient contact information
	 String contactNo1;
	 String contactNo2;
	 String contactNo3;
	 String type1;
	 String type2;
	 String type3;
	 String email;
	
	//patient address information
	 String street;
	 String city;
	 String country;
	 String zipcode;
	
	//patient emergency contact
	 String emcFirstName;
	 String emcLastName;
	 String emcMiddleName;
	 String emcContactNo;
	 String relationship;
	//patients Status
	 boolean isAlive;
	
	//Patient Card ID
	 String patientCardID;
	 String pinID;
	public String getPatientID() {
		return patientID;
	}
	public void setPatientID(String string) {
		this.patientID = string;
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
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
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
	public String getPinID() {
		return pinID;
	}
	public void setPinID(String pinID) {
		this.pinID = pinID;
	}
	
	public Object clone() {
	      Object clone = null;
	      
	      try {
	         clone = super.clone();
	         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }
	      
	      return clone;
	   }
	 
	 

}
