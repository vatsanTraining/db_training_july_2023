package com.training.services;

import com.training.Doctor;
import com.training.ifaces.DoctorRepository;

public class DoctorService implements DoctorRepository {
	
	private Doctor[] list ;
	
	private static int pos=0;

	public DoctorService() {
		super();
		
		this.list = new Doctor[5];
	}

	@Override
	public boolean add(Doctor doctor) {

		boolean result = false;
		if(pos<4) {
		
			this.list[pos] =doctor;
				pos++;
				
				result =true;
		}
		return result;
	}

	@Override
	public boolean add(Doctor... doctors) {
		return false;
	}

	@Override
	public Doctor[] findAll() {

		return this.list;
	}

}
