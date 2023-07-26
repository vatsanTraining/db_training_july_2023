package com.training.services;

import java.util.ArrayList;
import java.util.List;

import com.training.Restaurant;
import com.training.ifaces.CrudRepository;

public class RestaurantService implements CrudRepository<Restaurant> {

	private List<Restaurant> list;
	
	
	public RestaurantService() {
		super();
       this.list = new ArrayList<>();
	}

	@Override
	public boolean save(Restaurant t) throws Exception {
		
		 if(t.getRating()<3.0) {
			 
			 throw new Exception("Very Low Rating not Adding to Db");
		 } else {
			 return this.list.add(t);
		 }
	}

	@Override
	public List<Restaurant> findAll() {
		return this.list;
	}

	
}
