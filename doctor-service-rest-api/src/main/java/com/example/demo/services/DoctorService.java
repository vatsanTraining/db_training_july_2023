package com.example.demo.services;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repos.DoctorRepository;

import lombok.AllArgsConstructor;

import java.util.*;

@Service
@AllArgsConstructor
public class DoctorService {

	
	private DoctorRepository repo;
	
	
	public List<Doctor> findAll(){
		
		return this.repo.findAll();
	}
	
    public List<Doctor> findByDepartment(String dept){
		
		return this.repo.getByDept(dept);
	}
    
    
    public Doctor addDoctor(Doctor entity) {
    	
    	return this.repo.save(entity);
    }
	
	
}
