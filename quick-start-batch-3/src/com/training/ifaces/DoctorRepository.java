package com.training.ifaces;

import com.training.Doctor;

public interface DoctorRepository {
 
	/*
	 * Overloaded Add method with one argument 
	 * and with varArgs
	 */
	 boolean add(Doctor doctor);
	
	 boolean add(Doctor ...doctors);
	
	 Doctor[] findAll();
}
