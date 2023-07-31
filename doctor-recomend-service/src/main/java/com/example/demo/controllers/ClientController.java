package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.DoctorDto;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ClientController {

	
	private RestTemplate template;
	
	
	@GetMapping(path="/client/doctors/{dept}")
	public DoctorDto[] getDoctors(@PathVariable("dept") String dept) {
		
		String url ="http://DOCTOR-SERVICE/api/v1/doctors/"+dept;
		
		return template.getForObject(url, DoctorDto[].class);
	}
	
}
