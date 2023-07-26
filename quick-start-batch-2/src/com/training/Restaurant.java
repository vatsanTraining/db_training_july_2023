package com.training;

public class Restaurant {

	private int restaurantId;
	private String restaurantName;
	private double rating;
	
	public Restaurant() {
		super();
	
	}

	public Restaurant(int restaurantId, String restaurantName, double rating) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.rating = rating;
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
	
	
	
	
	
}
