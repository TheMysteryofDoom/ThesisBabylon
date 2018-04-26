package utility;

public interface SQLCommand {
	String LOGIN_USER = "SELECT username, password FROM adminaccounts";
	
	String INSERT_PATIENT = "INSERT INTO "
			+ "patient(patientID, firstName, lastName, middleName,"
			+ " birthMonth, birthDay, birthYear, gender, birthPlace, "
			+ " citizenship, religion, civil, job, contactNo1, contactNo2,"
			+ " contactNo3, type1, type2, type3, type3, street, city,"
			+ " country, zipcode, emcFirstName, emcLastName, emcMiddleName,"
			+ " emcContactNo, relationship)"
			+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
			+ "  ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	
	
	String GET_PATIENT = "SELECT * "
			+ "patientregistry";
	
	String GET_PATIENT_ADDRESS = "SELECT *"
			+ "patientaddewssregistry";
	
	String GET_PATIENT_CONTACT = "SELECT *"
			+ "patientcontactregistry";
	
	String GET_PATIENT_EMERGENCY_CONTACT = "SELECT *"
			+ "patientemergencycontact";
}
