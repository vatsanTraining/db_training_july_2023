package com.example;

import java.util.List;

import javax.print.Doc;

import com.example.ifaces.CrudRepository;
import com.example.services.DoctorService;
import com.training.entity.Doctor;

public class Application {

	public static void main(String[] args) {

		Doctor ram = 
				new Doctor(1020,"Ramkumar", "ent", 383823823);
		
		CrudRepository<Doctor> repo = new DoctorService();
		
		System.out.println("Is Added :=>"+ repo.add(ram));
		
		
		List<Doctor> list = repo.findAll();
		
		
		for(Doctor eachDoctor:list) {
			
			System.out.println(eachDoctor);
		}
		
	}

}
