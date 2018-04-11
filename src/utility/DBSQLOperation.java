package utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.PatientBean;

//JDBC will do Hibernate soon for retrieval, need to study hash and

public class DBSQLOperation implements SQLCommand{
	
	public static boolean insertPatient(PatientBean pb, Connection connection){
		boolean isSuccessful = false;
		
		if(connection != null){
			
		}
	}
	
	public static ResultSet retrievePatient(Connection connection){
		ResultSet patient = null;
		
		if(connection != null){
			try{
				PreparedStatement pstmnt = connection.prepareStatement(GET_PATIENT);
				
				patient = pstmnt.executeQuery();
				
			
			} catch(SQLException sqle){
				System.err.println(sqle.getMessage());
			}
		}else{
			throw new RuntimeException();
		}
		return patient;
	}
	
	public static ResultSet retrievePatientAddress(Connection connection){
		ResultSet address = null;
		
		if(connection != null){
			try{
				PreparedStatement pstmnt = connection.prepareStatement(GET_PATIENT_ADDRESS);
				
				address = pstmnt.executeQuery();
			} catch(SQLException sqle){
				System.err.println(sqle.getMessage());
			}
		}else{
			throw new RuntimeException();
		}
		return address;
	}
	
	public static ResultSet retrievePatientContact(Connection connection){
		ResultSet contact = null;
		
		if(connection != null){
			try{
				PreparedStatement pstmnt = connection.prepareStatement(GET_PATIENT_CONTACT);
				
				contact = pstmnt.executeQuery();
			} catch(SQLException sqle){
				System.err.println(sqle.getMessage());
			}
		}else{
			throw new RuntimeException();
		}
		return contact;
	}
	
	public static ResultSet retrievePatientEmergancyContact(Connection connection){
		ResultSet ec = null;
		
		if(connection != null){
			try{
				PreparedStatement pstmnt = connection.prepareStatement(GET_PATIENT_EMERGENCY_CONTACT);
				
				ec = pstmnt.executeQuery();
			} catch(SQLException sqle){
				System.err.println(sqle.getMessage());
			}
		}else{
			throw new RuntimeException();
		}
		return ec;
	}
	

}
