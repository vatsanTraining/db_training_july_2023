package com.training.services;

import com.training.ifaces.*;

import java.util.Arrays;
import java.util.List;

import com.training.*;
public class RestaurantService implements CrudRepository {
	
	
	private Restaurant[] list;
	
	private static int pos=0;

	public RestaurantService() {
		super();
		this.list = new Restaurant[3];
	}

	@Override
	public boolean add(Restaurant obj) {
		
		boolean isAdded = false;
		
		if(pos<3) {
			this.list[pos]=obj;
			isAdded = true;
			
			pos++;
		} 
	  return isAdded;	
	}



	@Override
	public Restaurant[] findAll() {
		return this.list;
	}

	
	public List<String> getNames(){
		
		return Arrays.asList("Ramesh","mani","Suresh","Magesh",null);
	}
	
	public String findNameById(int idx) {
		
		return getNames().get(idx);
	}
}
