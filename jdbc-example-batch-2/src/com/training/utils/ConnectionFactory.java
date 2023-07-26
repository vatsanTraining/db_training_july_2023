package com.training.utils;

import java.io.*;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConnectionFactory {

	
	public static Map<String,String> readFromFile() {
		
		File file = new File("Dbconnection.properties");
		
		Map<String, String> map = new HashMap<>();

		try {
			InputStream instream = new FileInputStream(file);
			
			Properties props = new Properties();
			
			props.load(instream);
			
	   map.put("url",props.getProperty("datasource.url"))	;
		map.put("username", props.getProperty("datasource.username"));
		map.put("password", props.getProperty("datasource.password"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
				
		return map;
	}

	public static Connection getMySqlConnection() {
		
		Connection con =null;
		
		try {
			
			
			con = DriverManager.getConnection(readFromFile().get("url"), 
					                          readFromFile().get("username"), 
					                          readFromFile().get("password")); 
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return con;
	}
	public static void main(String[] args) {
		
		System.out.println(getMySqlConnection());
	}
}
