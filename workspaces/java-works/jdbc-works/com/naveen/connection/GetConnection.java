package com.naveen.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// this call will take the user name and 
// password or other fields to connect with DB 
public class GetConnection {

	
	public static Connection getMysqlConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			return DriverManager.getConnection
						("jdbc:mysql://localhost/citi_db", "root", "kanchan@1"); 
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return null; 
	}
	
	public static Connection getOracleConnection() {return null;}
	public static Connection getDB2Connection() { return null; }
	
	
}
