package com.example.services;

import java.util.List;
import java.sql.*;
import com.example.ifaces.CrudRepository;
import com.example.utils.ConnectionFactory;
import com.training.entity.Doctor;

public class DoctorService implements CrudRepository<Doctor> {

	
	 private Connection con;
	 
	 
	
	public DoctorService() {
		super();
		this.con = ConnectionFactory.getMySqlConnection();
	}

	@Override
	public int add(Doctor t) {

		int rowAdded = 0;
		String sql = "insert into doctor_july_2023 values(?,?,?,?)";
		try(PreparedStatement pstmt = con.prepareStatement(sql)){
			
		
			pstmt.setInt(1, t.getDoctorId());
			pstmt.setString(2, t.getDoctorName());
			pstmt.setString(3, t.getDepartment());
			pstmt.setLong(4, t.getPhoneNumber());
			
		rowAdded = pstmt.executeUpdate();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return rowAdded;
	}

	@Override
	public List<Doctor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
