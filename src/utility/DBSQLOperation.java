package utility;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.PatientBean;
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
					if(dbUsername == user.getUsername() && dbPassword == user.getPassword()){
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
				pstmnt.setString(14, pb.getContactNo1());
				pstmnt.setString(15, pb.getContactNo2());
				pstmnt.setString(16, pb.getContactNo3());
				pstmnt.setString(17, pb.getType1());
				pstmnt.setString(18, pb.getType2());
				pstmnt.setString(19, pb.getType3());
				pstmnt.setString(20, pb.getEmail());
				pstmnt.setString(21, pb.getStreet());
				pstmnt.setString(22, pb.getCity());
				pstmnt.setString(23, pb.getCountry());
				pstmnt.setString(24, pb.getZipcode());
				pstmnt.setString(25, pb.getEmcFirstName());
				pstmnt.setString(26, pb.getEmcLastName());
				pstmnt.setString(27, pb.getEmcMiddleName());
				pstmnt.setString(28, pb.getEmcContactNo());
				pstmnt.setString(28, pb.getRelationship());
				pstmnt.setBoolean(29, pb.isAlive());
				pstmnt.setString(30, pb.getPatientCardID());
				//insert
				pstmnt.executeUpdate();
				isSuccessful = true;
			}catch(SQLException sqle){
				sqle.printStackTrace();
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
	
	
	

}
