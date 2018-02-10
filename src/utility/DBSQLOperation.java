package utility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//JDBC will do Hibernate soon for retrieval, need to study hash and

public class DBSQLOperation implements SQLCommand{
	public static ResultSet retrievePatient(Connection connection){
		ResultSet patient = null;
		
		if(connection != null){
			try{
				PreparedStatement pstmnt = connection.prepareStatement(GET_ALL_RECORDS);
				
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
