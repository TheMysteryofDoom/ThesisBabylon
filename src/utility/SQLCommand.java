package utility;

public interface SQLCommand {
	String LOGIN_USER = "SELECT username, password FROM adminaccounts";
	
	String INSERT_PATIENT = "INSERT INTO "
			+ "patient(patientID, firstName, lastName, middleName,"
			+ " birthMonth, birthDay, birthYear, gender, birthPlace, "
			+ " citizenship, religion, civil, job, patientStatus)"
			+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	String INSERT_PATEINT_CONTACT_INFO = "INSERT INTO "
			+ "patientcontactinfo(contactID, contactNo1, contactNo2,  contactNo3,"
			+ " type1, type2, type3, email)"
			+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
	
	String INSERT_PATIENT_ADDRESS = "INSERT INTO "
			+ "patientaddress(addressID, street, city, country, zipcode) "
			+ "VALUES(?, ?, ?, ?, ?)";
	
	String INSERT_PATIENT_EMC = "INSERT INTO "
			+ "patientemergencycontact(emergencycontactID, fisrtName, lastName, middleName, contactNo)"
			+ "VALUES(?, ?, ?, ?, ?)";
	
	
	String GET_PATIENT = "SELECT * "
			+ "patientregistry";
	
	String GET_PATIENT_ADDRESS = "SELECT *"
			+ "patientaddewssregistry";
	
	String GET_PATIENT_CONTACT = "SELECT *"
			+ "patientcontactregistry";
	
	String GET_PATIENT_EMERGENCY_CONTACT = "SELECT *"
			+ "patientemergencycontact";
}
