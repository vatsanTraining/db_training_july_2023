package com.training.ifaces;
import java.util.*;
import com.training.Patient;

public interface PatientRepository {

	
	 boolean add(Patient patient);
		
	 boolean add(Patient ...patients);
	
	 Set<Patient> findAll();
}
