package utility;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.EmergencyContactBean;
import model.PatientAddressBean;
import model.PatientBean;
import model.PatientContactBean;
import model.User;

//Create encryption 

public class DBSQLOperation implements SQLCommand{
	
	//Login method
	public static boolean loginAdmin(User user, Connection connection){
		String dbUsername, dbPassword;
		boolean isSuccessful = false;
		if(connection != null){
			try{
				PreparedStatement pstmnt = connection.prepareStatement(LOGIN_USER);
				pstmnt.executeQuery(LOGIN_USER);
				ResultSet rs = pstmnt.getResultSet();
				
				while(rs.next()){
					dbUsername = rs.getString("username");
					dbPassword = rs.getString("password");
					if(dbPassword == user.getUsername() && dbPassword == user.getPassword()){
						System.out.println("OK");
						isSuccessful = true;
					}
					
				}
				
			}catch(SQLException sqle){
				sqle.printStackTrace();
			}
		}
		return isSuccessful;
	}
	
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
				pstmnt.setString(4, pb.getMiddleName());
				pstmnt.setString(5, pb.getBirthMonth());
				pstmnt.setInt(6, pb.getBirthDay());
				pstmnt.setInt(7, pb.getBirthYear());
				pstmnt.setString(8, pb.getGender());
				pstmnt.setString(9, pb.getBirthPlace());
				pstmnt.setString(10, pb.getCitizenship());
				pstmnt.setString(11, pb.getReligion());
				pstmnt.setString(12, pb.getCivil());
				pstmnt.setString(13, pb.getJob());
				pstmnt.setString(14, pb.getStatus());
				pstmnt.executeUpdate();
				isSuccessful = true;
			}catch(SQLException sqle){
				sqle.printStackTrace();
			}
		}
		
		return isSuccessful;
	}
	
	//method to save patients address to database.
	public static boolean insertPatientAddress(PatientAddressBean pab, Connection connection){
		boolean isSuccessful = false;
		if(connection != null){
			try{
				PreparedStatement pstmnt = 
						connection.prepareStatement(INSERT_PATIENT_ADDRESS);
				pstmnt.setInt(1, pab.getAddressId());
				pstmnt.setString(2, pab.getStreet());
				pstmnt.setString(3, pab.getCity());
				pstmnt.setString(4, pab.getCountry());
				pstmnt.setString(5, pab.getZipcode());
				
				pstmnt.executeQuery();
			}catch(SQLException sqle){
				System.err.println(sqle.getMessage());
			}
		}
		return isSuccessful;
	}
	
	//method to save patient contact to database.
	public static boolean insertPatientContact(PatientContactBean pcb, Connection connection){
		boolean isSuccessful = false;
		if(connection != null){
			try{
				PreparedStatement pstmnt =
						connection.prepareStatement(INSERT_PATEINT_CONTACT_INFO);
				pstmnt.setInt(1, pcb.getContactId());
				pstmnt.setString(2, pcb.getContactNo1());
				pstmnt.setString(3, pcb.getContactNo2());
				pstmnt.setString(4, pcb.getContactNo3());
				pstmnt.setString(5, pcb.getEmail());
				pstmnt.executeQuery();
				isSuccessful = true;
			}catch(SQLException sqle){
				System.err.println(sqle.getMessage());
			}
			
		}
		return isSuccessful;
	}
	
	//method to insert Patients Emergency Contact.
	public static boolean insertPatientEmergenctContact(EmergencyContactBean ecb, Connection connection){
		boolean isSuccessful = false;
		if(connection != null){
			try{
				PreparedStatement pstmnt = 
						connection.prepareStatement(INSERT_PATIENT_EMC);
				
				pstmnt.setInt(1, ecb.getEmergencyId());
				pstmnt.setString(2, ecb.getFirstName());
				pstmnt.setString(3, ecb.getLastName());
				pstmnt.setString(4, ecb.getMiddleName());
				
				pstmnt.executeQuery();
				isSuccessful = true;
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
