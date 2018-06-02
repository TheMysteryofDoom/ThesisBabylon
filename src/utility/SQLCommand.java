package utility;

public interface SQLCommand {
	String LOGIN_USER = "SELECT username, password FROM adminaccounts";
	
	String INSERT_ADMIN = "INSERT INTO"
			+ "admin (adminID, firstName, lastName, lastName, "
			+ "middleName, email, contactNo, "
			+ "role, gender)";
	
	String INSERT_PATIENT = "INSERT INTO "
			+ "patient(patientID, firstName, lastName, middleName,"
			+ " birthDay, gender, birthPlace, "
			+ " citizenship, religion, civil, job, contactNo1, contactNo2,"
			+ " contactNo3, type1, type2, type3, email, street, city,"
			+ " country, zipcode, emcFirstName, emcLastName, emcMiddleName,"
			+ " emcContactNo, relationship, isAlive, hospitalID, pinID)"
			+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
			+ "  ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


	String INSERT_MEDICAL_STATUS = "INSERT INTO "
			+ "medicalstatus(patientID, medicalStatusid, bloodPressure, prcr,"
			+ " repiratoryRate, temperature, weight, height,"
			+ " headCircumference, chestCircumference, Abdominal, medHistory,"
			+ " treatmentPlan)"
			+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";		

	
	String INSERT_UPLOAD = "INSERT INTO "
			+"upload(patientID, filePath, fileUploadContentType ) VALUES(?, ?, ?)";
			
	
	
	
	String GET_PATIENT = "select * from"
			+ "patient where patientID=?";
	
	String GET_PATIENT_ADDRESS = "SELECT *"
			+ "patientaddewssregistry";
	
	String GET_PATIENT_CONTACT = "SELECT *"
			+ "patientcontactregistry";
	
	String GET_PATIENT_EMERGENCY_CONTACT = "SELECT *"
			+ "patientemergencycontact";
}
