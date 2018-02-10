package utility;
//import model.AccessBean;
//import controller.LoginAction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.List;

//import org.hibernate.Query;
//import org.hibernate.Session;

//Session for DB
public class User {
	static PreparedStatement pstmt;
	public static boolean validate(String username, String password){  
		 boolean status=false;  
		 /* Connection connection = null;
		 try {
				Class.forName("com.mysql.jdbc.Driver");
				
				connection = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/codersofbabylon","root","");
				pstmt = connection.prepareStatement(  
					     "SELECT * FROM login"); 
			///	pstmt.setString(1,username);  
			//	pstmt.setString(2,password); 
				ResultSet rs = pstmt.executeQuery();
			 
				
			//	   status = rs.next();  
				while(rs.next()){
					if(username.equals(rs.getString("username")) && password.equals(rs.getString("password"))){
						status = rs.next();
						break;

					}else{
						status = false;
					}
				}
		}catch(ClassNotFoundException cnfe){
			System.err.println("Class not found: "+cnfe.getMessage());
		}catch(SQLException sqle){
			System.err.println("SQL Exception "+ sqle.getMessage());
		}
		 return status; */ 
		
		  try{  
		  Class.forName("com.mysql.jdbc.Driver");  
			
		   Connection con = DriverManager
				   .getConnection("jdbc:mysql://localhost:3306/codersofbabylon","root","");  
		     
		   PreparedStatement ps=con.prepareStatement(  
		     "SELECT * FROM login where username=? and password=?"); 
	
		   ps.setString(1,username);  
		   ps.setString(2,password);  
		   ResultSet rs = ps.executeQuery();  
		   status = rs.next();  
		  }catch(Exception e){e.printStackTrace();}  
		 return status;  
		}  
	}



