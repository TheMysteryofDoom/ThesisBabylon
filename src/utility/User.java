package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class User {
	static PreparedStatement pstmt;
	public static boolean validate(String username, String password){  
		 boolean status=false;  
		  try{  
			  Class.forName("com.mysql.jdbc.Driver");  
				
			   Connection con = DriverManager
					   .getConnection("jdbc:mysql://localhost:3306/codersofbabylon2","root","");  
			     
			   PreparedStatement ps = con.prepareStatement(  
			     "SELECT * FROM admin WHERE username=? and password=?"); 
		
			   ps.setString(1,username);  
			   ps.setString(2,password);  
			   ResultSet rs = ps.executeQuery();  
			   status = rs.next();  
			  }catch(Exception e){e.printStackTrace();}  
			 return status;  
			}  
		}


