package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

public class Search {
	static PreparedStatement pstmt;
	public static boolean validate(String patientId){
		boolean status = false;
		try{
			 Class.forName("com.mysql.jdbc.Driver");  
				
			   Connection con = DriverManager
					   .getConnection("jdbc:mysql://localhost:3306/codersofbabylon2","root","");  
			     
			   PreparedStatement ps = (PreparedStatement) con.prepareStatement(  
			     "select * from patient where patientID=?"); 
		
			   ps.setString(1,patientId);  
			   ResultSet rs = ps.executeQuery();  
			   status = rs.next(); 
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
	}

}
