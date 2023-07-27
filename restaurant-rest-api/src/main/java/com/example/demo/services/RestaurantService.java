package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Restaurant;
import com.example.demo.repos.RestaurantRepository;
import java.util.*;

@Service
public class RestaurantService {

	
	private RestaurantRepository repo;

	@Autowired
	public RestaurantService(RestaurantRepository repo) {
		super();
		System.out.println("=========="+ repo.getClass());
		this.repo = repo;
	}
	
	
	public List<Restaurant> findAll(){
		
		return this.repo.findAll();
	}
	
	
	public Restaurant create(Restaurant entity) {
		return this.repo.save(entity);
	}
	
	public Restaurant update(Restaurant entity) {
		return this.repo.save(entity);
	}
	
	
}
