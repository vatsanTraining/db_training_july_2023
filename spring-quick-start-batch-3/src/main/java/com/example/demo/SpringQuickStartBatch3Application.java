package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Doctor;
import com.example.demo.model.Patient;
import com.example.demo.model.TestReport;

@SpringBootApplication
public class SpringQuickStartBatch3Application {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext ctx	 =SpringApplication.run(SpringQuickStartBatch3Application.class, args);
	
	System.out.println(ctx.getBean("ram",Doctor.class));
	
	System.out.println(ctx.getBean(Patient.class));
	
	System.out.println(ctx.getBean(TestReport.class));
	
	
	ctx.close();
	}

	
	@Bean
	public Doctor ram() {
		
		return Doctor
				.builder()
				.doctorId(1010)
				.doctorName("Ramesh")
				.department("ent")
				.phoneNumber(1120201).build();
	}
	
	@Bean
	public Doctor shyam() {
		
		return Doctor
				.builder()
				.doctorId(1020)
				.doctorName("Shyam")
				.department("ent")
				.phoneNumber(2120201).build();
	}
	
	@Bean
	public Patient hari() {
		
		return Patient.builder()
				.patientId(6060)
				.patientName("Hari")
				.age(56)
				.phoneNumber(9293923)
				.build();
		
	}
	
}
