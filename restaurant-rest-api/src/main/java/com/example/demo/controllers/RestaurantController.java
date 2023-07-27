package com.example.demo.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Restaurant;
import com.example.demo.services.RestaurantService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1/restaurants")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class RestaurantController {

	
	private RestaurantService service;
	
	
	@GetMapping
	private List<Restaurant> findAll(){
		
		return this.service.findAll();
	}
	

	@GetMapping("/{arg}")
	private List<Restaurant> findByCuisine(@PathVariable String arg){
		
		return this.service.findByCuisine(arg);
	}

	@PostMapping
	private ResponseEntity<Restaurant> save(@RequestBody Restaurant entity){
		
		
		Restaurant addedEntity =this.service.create(entity);
		
		return ResponseEntity.status(201).body(addedEntity);
	}
	
	@PutMapping
	private ResponseEntity<Restaurant> update(@RequestBody Restaurant entity){
		
		
		Restaurant addedEntity =this.service.update(entity);
		
		return ResponseEntity.status(200).body(addedEntity);
	}
	
}
