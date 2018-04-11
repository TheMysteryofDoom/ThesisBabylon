package utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.PatientAddressBean;
import model.PatientBean;

//Create encryption 

public class DBSQLOperation implements SQLCommand{
	
	
	//Insert Patient to Database
	public static boolean insertPatient(PatientBean pb, Connection connection){
		boolean isSuccessful = false;
		
		if(connection != null){
			try{
				PreparedStatement pstmnt = 
						connection.prepareStatement(INSERT_PATIENT);
				pstmnt.setInt(1, pb.getPatientID());
				pstmnt.setString(2, pb.getFirstName());
				pstmnt.setString(3, pb.getLastName());
				pstmnt.setString(3, pb.getMiddleName());
				pstmnt.setString(4, pb.getBirthMonth());
				pstmnt.setInt(5, pb.getBirthDay());
				pstmnt.setInt(6, pb.getBirthYear());
				pstmnt.setString(7, pb.getGender());
				pstmnt.setString(8, pb.getBirthPlace());
				pstmnt.setString(8, pb.getCitizenship());
				pstmnt.setString(9, pb.getReligion());
				pstmnt.setString(10, pb.getCivil());
				pstmnt.setString(11, pb.getStatus());
				
				
				pstmnt.executeUpdate();
				isSuccessful = true;
			}catch(SQLException sqle){
				System.err.println(sqle.getMessage());
			}
		}
		
		return isSuccessful;
	}
	
	public static boolean insertPatientAddress(PatientAddressBean pab, Connection connection){
		boolean isSuccessful = false;
		if(connection != null){
			try{
				PreparedStatement pstmnt = 
						connection.prepareStatement(INSERT_PATIENT_ADDRESS);
				
				
				pstmnt.executeQuery();
			}catch(SQLException sqle){
				System.err.println(sqle.getMessage());
			}
		}
		return isSuccessful;
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
