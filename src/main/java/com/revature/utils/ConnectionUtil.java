package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	//This class will be used to connect to the database.
	public static Connection getConnection() throws SQLException {
		 
		//For many frameworks using JDBC it 		is necessary to "register" the 		driver in order for the framework 		to be aware of it.
		try {
			Class.forName("org.postgresql.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//What do we need in order to access our database?
		String url = "jdbc:postgresql://java-react-june142021-hassan.cnznml1svf3j.us-east-2.rds.amazonaws.com:5432/demos";
				
		//The default port for postgresql is 5432. 
		//Above string url is connected to our demos database.
					
		String username = "postgres"; //It is possible to use environment variables to hide this information
		String password = "hassan2021aws"; //You would access them with System.getenv("var-name");
		
		return DriverManager.getConnection (url, username, password);
	}
	
	//Test to see if we're getting the expected output before doing anything else.
	public static void main(String[] args) {
		try(Connection conn = ConnectionUtil.getConnection()){
			 System.out.println("Connection Successful!");
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		
		//DAOs create interfaces before they create classes. DAOs are created for backend not frontend like menus.
	}

}
