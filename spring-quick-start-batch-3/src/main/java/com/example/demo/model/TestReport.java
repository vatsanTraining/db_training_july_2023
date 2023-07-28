package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

@Component
public class TestReport {

	private Patient patient;
	private Doctor doctor;
	
	
	@Autowired
	public TestReport(Patient patient,@Qualifier("shyam") Doctor doctor) {
		super();
		this.patient = patient;
		this.doctor = doctor;
	}
	
	
	
}
