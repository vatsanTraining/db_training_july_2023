package com.training.services;

import java.util.Set;
import java.util.TreeSet;

import com.training.Patient;
import com.training.ifaces.PatientRepository;

public class PatientService implements PatientRepository {

	
	private TreeSet<Patient> patientList;
	
	
	
	public PatientService() {
		super();
    
		this.patientList = new TreeSet<>();
	}
	@Override
	public boolean add(Patient patient) throws Exception {
		
		if(patient.getAge()<0 || patient.getAge()>100) {
			throw new Exception("Invalid Age ");
		}
		
		return this.patientList.add(patient);
	}

	@Override
	public boolean add(Patient... patients) {

       // TODO return values to be improved
		
		boolean status = false;
		for(Patient eachElement : patients) {
			
			status =this.patientList.add(eachElement);
		}
		return status;
	}

	@Override
	public Set<Patient> findAll() {
		return this.patientList;
	}

}
