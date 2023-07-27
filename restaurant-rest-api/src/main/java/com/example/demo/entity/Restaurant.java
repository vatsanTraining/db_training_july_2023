package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "restaurant_july_2023")
public class Restaurant  {

	@Id
	@Column(name = "restaurant_id")
	private int restaurantId;
	
	@Column(name = "restaurant_name",length = 45)
	private String restaurantName;
	
	@Column(name = "rating")
	private double rating;
	
	@Column(name = "cuisine",length = 45)
	private String cuisine;
	
	@Column(name = "pincode")
	private long pincode;
	
	public Restaurant() {
		super();
	
	}


	public Restaurant(int restaurantId, String restaurantName, double rating, String cuisine, long pincode) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.rating = rating;
		this.cuisine = cuisine;
		this.pincode = pincode;
	}



	public String getcuisine() {
		return cuisine;
	}



	public void setcuisine(String cuisine) {
		this.cuisine = cuisine;
	}



	public long getPincode() {
		return pincode;
	}



	public void setPincode(long pincode) {
		this.pincode = pincode;
	}



	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {

		return this.restaurantId+","+this.restaurantName+","+this.rating;
	}
	
	
	
	
	
}
