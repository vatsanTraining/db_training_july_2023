package com.training;

import java.util.Set;

import com.training.ifaces.PatientRepository;
import com.training.services.PatientService;

public class CollectionApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Patient vicky = new Patient(900, "vicky", 45, 92923239);
		Patient vishal = new Patient(200, "ishika", 55, 7292439);
		Patient vivek = new Patient(902, "yashika", 65, 92963239);
		
		
		PatientRepository repo = new PatientService();
		
		System.out.println("Is Added :=>"+ repo.add(vivek));
		System.out.println("Is Added :=>"+ repo.add(vishal));
		System.out.println("Is Added :=>"+ repo.add(vicky));
		
		 
	
		Set<Patient> elements = repo.findAll();
		
		 for(Patient eachPatient: elements) {
			 
			 System.out.println(eachPatient);
		 }
		
	}

}
