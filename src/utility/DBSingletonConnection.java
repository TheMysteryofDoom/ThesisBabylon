package utility;
import java.sql.*;

public class DBSingletonConnection {
	private static Connection connection;
	
	private DBSingletonConnection(){
		
	}
	
	private static Connection getDBConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/codersofbabylon2","root","");
			
		}catch(ClassNotFoundException nfe){
			System.err.println(nfe.getMessage());
		}catch(SQLException sqle){
			System.err.println(sqle.getMessage());
		}
		return connection;
	}
	public static Connection getConnection(){
		return ((connection ==null)?getDBConnection():connection);
	}
}
