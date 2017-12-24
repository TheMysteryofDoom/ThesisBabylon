package utility;
import model.AccessBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

//import org.hibernate.Query;
//import org.hibernate.Session;

//Session for DB
public class User {
	public static boolean validate(String username,String password){  
		 boolean status=false;  
		  try{  
		  Class.forName("com.mysql.jdbc.Driver");  
			//  Class.forName("oracle.jdbc.driver.OracleDriver"); 
		   Connection con = DriverManager
				   .getConnection("jdbc:mysql://localhost:3306/codersofbabylon","root","");  
		     
		   PreparedStatement ps=con.prepareStatement(  
		     "Select * from login where username=? and password=?");  
		   ps.setString(1,username);  
		   ps.setString(2,password);  
		   ResultSet rs=ps.executeQuery();  
		   status = rs.next();  
		  }catch(Exception e){e.printStackTrace();}  
		 return status;  
		}  
	}


