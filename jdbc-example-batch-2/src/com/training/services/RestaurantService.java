package com.training.services;

import java.util.ArrayList;
import java.util.List;

import com.training.Restaurant;
import com.training.ifaces.CrudRepository;
import com.training.utils.ConnectionFactory;

import java.sql.*;
public class RestaurantService implements CrudRepository<Restaurant> {

	private Connection  con;
	
	
	public RestaurantService() {
		super();
       this.con = ConnectionFactory.getMySqlConnection();
	}

	@Override
	public boolean save(Restaurant t) throws Exception {
		
		 if(t.getRating()<3.0) {
			 
			 throw new Exception("Very Low Rating not Adding to Db");
		 } else {
			 
			 String sql = "insert into restaurant_july_2023 values(?,?,?,?,?)";
			 
			 int rowAdded =0;
			 
			 try(PreparedStatement pstmt = con.prepareStatement(sql)) {
				
				 pstmt.setInt(1, t.getRestaurantId());
				 pstmt.setString(2, t.getRestaurantName());
				 pstmt.setDouble(3, t.getRating());
				 pstmt.setString(4, t.getcuisine());
				 pstmt.setLong(5, t.getPincode());

				 rowAdded = pstmt.executeUpdate();
				 
			} catch (Exception e) {
			
				 e.printStackTrace();
			}
			 
			 return rowAdded==1?true:false;
		 }
	}

	@Override
	public List<Restaurant> findAll() {
		return null;
	}

	
}
