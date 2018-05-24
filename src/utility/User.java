package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class User {
	public static boolean validate(String username, String userpass){
		boolean status = false;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/codersofbabylon2","root","");
			PreparedStatement ps=con.prepareStatement("select * from admin where username=? and password=?");
			
			ps.setString(1, username);
			ps.setString(2, userpass);
			
			ResultSet rs = ps.executeQuery();
					
			status = rs.next();
		}catch(SQLException sqle){
			sqle.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		return status;
		}
}


