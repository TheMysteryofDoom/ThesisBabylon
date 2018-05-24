package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FetchDataUtil {
	public ResultSet fetchData(){
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			   Connection con = DriverManager
					   .getConnection("jdbc:mysql://localhost:3306/codersofbabylon2","root","");  
			   PreparedStatement ps = con.prepareStatement(  
					     "select firstName, lastName, middleName, birthDay, "
					     + " gender, birthPlace, citizenship, "
					     + " religion, civil, job, contactNo1, contactNo2, contactNo3, "
					     + " type1, type2, type3, email, street, city, country,"
					     + " zipcode, emcFirstName, emcLastName, emcContactNo, "
					     + " relationship from patient where patientID=?"); 
			ResultSet rs = ps.executeQuery();
			return rs;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
