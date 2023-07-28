package com.example.utils;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class ConnectionFactory {

	
	
	public static String[] readFromFile() {
		
		File file = new File("DbConnection.properties");
		
		String[] values = new String[3];
		try {
			InputStream instream = new FileInputStream(file);
			
			Properties props = new Properties();
			
			 props.load(instream);
			
			 values[0]= props.getProperty("datasource.url");
			 values[1] = props.getProperty("datasource.username");
			 values[2] = props.getProperty("datasource.password");
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return values;
	}
	
	public static Connection getMySqlConnection() {
		
		Connection con =null;
		try {
			
			String[] values = readFromFile();
			
			con = DriverManager.getConnection(values[0],values[1],values[2]);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return con;
	}
	
	
}
