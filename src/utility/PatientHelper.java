package utility;

import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class PatientHelper {
	//method to save user data in database
		public int registerUser(String firstName, String lastName){
			int i = 0;
			try{
				String sql = "INSERT INTO VALUES(?)";
				PreparedStatement ps = (PreparedStatement) DBSingletonConnection.getConnection().prepareStatement(sql);
				ps.setString(1, firstName);
				ps.setString(2, lastName);
				
				i = ps.executeUpdate();
				return i;
			}catch(SQLException sqle){
				sqle.printStackTrace();
				
			}catch(Exception e){
				e.printStackTrace();
			}
			return i;
		}

}
