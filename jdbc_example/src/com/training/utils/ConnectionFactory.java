package com.training.utils;
import java.io.*;
import java.sql.*;
import java.util.Properties;
public class ConnectionFactory {

	
	public static Connection getMySqlConnection() {
		
		Connection con =null;
		
		
		try {
		
			File file = new File("DbConnection.properties");
			
			InputStream inStream = new FileInputStream(file);
			
			Properties props = new Properties();
			
			  props.load(inStream);
			  
			  con= DriverManager.getConnection(
					  props.getProperty("datasource.url"),
					  props.getProperty("datasource.username"),
					  props.getProperty("datasource.password"));
			  
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		return con;
	}
	
	
	

}
