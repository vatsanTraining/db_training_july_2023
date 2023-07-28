package com.example;

import java.util.List;
import java.util.function.Predicate;


import com.example.ifaces.CrudRepository;
import com.example.services.DoctorService;
import com.training.entity.Doctor;

public class Application {

	public static void main(String[] args) {

		Doctor ram = 
				new Doctor(1025,"Aravind", "ent", 173553823);
		
		CrudRepository<Doctor> repo = new DoctorService();
		
		//System.out.println("Is Added :=>"+ repo.add(ram));
		
		
		List<Doctor> list = repo.findAll();
		
		
//		for(Doctor eachDoctor:list) {
//			
//			System.out.println(eachDoctor);
//		}
//		
		
		list.forEach(System.out::println);  //Method Reference
		
		// Predicate is a Functional Interface
		
		Predicate<Doctor> cond =
				   (e) -> e.getDepartment().equalsIgnoreCase("ent"); //lambda
				   
				   

				   System.out.println("Ent Doctors");
					for(Doctor eachDoctor:list) {
						
						if(cond.test(eachDoctor)) {
						   System.out.println(eachDoctor);
						}
					}
				
		
	}

}
