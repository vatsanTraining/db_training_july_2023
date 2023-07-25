package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CibilScore;
import com.example.demo.services.CibilScoreService;

@RestController
@RequestMapping(path = "/api/v1")
public class CibilScoreController {

	
	@Autowired
	private CibilScoreService service;
	
	
	@GetMapping(path = "/cibilscores")
	public List<CibilScore> findAll(){
		
		return this.service.findAll();
	}
	@GetMapping(path = "/cibilscores/{panCardNumber}")
	public CibilScore findById(@PathVariable("panCardNumber") String id){
		
		return this.service.findById(id);
		
	}

	@PostMapping(path = "/cibilscores")
	public ResponseEntity<CibilScore> create(@RequestBody CibilScore entity){
		
		  this.service.save(entity);
		
		return ResponseEntity.status(201).body(entity);
		
	}
	
}
