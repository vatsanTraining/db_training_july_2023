package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.services.DoctorService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1/doctors")

@AllArgsConstructor
public class DoctorController {

	
	private DoctorService service;
	
	
	@GetMapping
	public List<Doctor> findAll(){
		
		return this.service.findAll();
	}
	
}
