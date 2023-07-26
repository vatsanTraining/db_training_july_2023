package com.training.utils;

import java.io.*;
import java.sql.*;
import java.util.Properties;

public class ConnectionFactory {

	
	public String[] readFromFile() {
		
		File file = new File("Dbconnection.properties");
		
		try {
			InputStream instream = new FileInputStream(file);
			
			Properties props = new Properties();
			
			props.load(instream);
			
		 String url =	props.getProperty("datasource.url");
		String userName =	props.getProperty("datasource.username");
		String password =	props.getProperty("datasource.password");

			System.out.println(url + userName+password);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
}
