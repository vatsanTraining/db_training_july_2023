package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Doctor ram = 
				new Doctor(1020,"Ramkumar", "ent", 383823823);
		
		System.out.println("Ent Doctor:=>"+ram.getDoctorName());
		
		Doctor shyam = new Doctor();
		
		System.out.println("Eye Doctor:=>"+shyam.getDoctorName());
		
		
		Doctor mani = new Doctor(4020, "Mani", "Skin", 22383222);
		
		System.out.println(mani);
		
		
	}

}
