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
	
    public Doctor update(Doctor entity) {
    	
    	//UPSERT
    	return this.repo.save(entity);
    }
    
    
    public int remove(int id) {
    	
    	int rowDeleted =0;
    	System.out.println("id"+id);
    	Optional<Doctor> isExisit = this.repo.findById(id);
    	
    	  if(isExisit.isPresent()) {
    		  this.repo.deleteById(id);
    		  rowDeleted=1;
    	  }
    	
    	return rowDeleted;
    }
	
}
