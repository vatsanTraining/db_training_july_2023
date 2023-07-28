package com.training;

import com.training.ifaces.DoctorRepository;
import com.training.services.DoctorService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Doctor ram = 
				new Doctor(1020,"Ramkumar", "ent", 383823823);
		
		System.out.println("Ent Doctor:=>"+ram.getDoctorName());
		
		Doctor shyam = new Doctor();
		
		 shyam.setDoctorName("Shyam");
		 shyam.setDoctorId(2030);
		 shyam.setDepartment("Eye");
		 shyam.setPhoneNumber(23838121);
		System.out.println("Eye Doctor:=>"+shyam.getDoctorName());
		
		
		Doctor mani = new Doctor(4020, "Mani", "Skin", 22383222);
		
		System.out.println(mani);
		
		//Substiutaion
		
		// supertype = subtype
		DoctorRepository repo = new DoctorService();
		
		 System.out.println("Is Added :="+ repo.add(mani));
		 System.out.println("Is Added :="+ repo.add(ram));
		 System.out.println("Is Added :="+ repo.add(shyam));

		 Doctor[] list = repo.findAll();
		 
		 for(Doctor eachDoctor:list) {
			 
			 if(eachDoctor!=null) {
				 System.out.println(eachDoctor);
			 }
		 }
		 
	}

}
