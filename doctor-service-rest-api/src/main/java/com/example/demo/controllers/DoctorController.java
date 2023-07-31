package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/{dept}")
	public List<Doctor> findByDept(@PathVariable("dept") String dept){
		
		return this.service.findByDepartment(dept);
	}
	
	
	@PostMapping
	public ResponseEntity<Doctor> save(@RequestBody Doctor entity){
		
		Doctor addedEntity = this.service.addDoctor(entity);
		
		return ResponseEntity.status(201).body(addedEntity);
	
	}
	
	@PutMapping
	public ResponseEntity<Doctor> update(@RequestBody Doctor entity){
		
		Doctor updatedEntity = this.service.update(entity);
		
		return ResponseEntity.status(200).body(updatedEntity);
	
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> removeById(@PathVariable("id") int id){
		
		System.out.println("Id in controller:=>"+ id);
		int rowDeleted = this.service.remove(id);
		
		return ResponseEntity.ok().body("RowsDeleted:=> "+rowDeleted);
		
	}
	
}
