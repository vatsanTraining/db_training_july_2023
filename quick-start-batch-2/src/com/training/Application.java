package com.training;

public class Application {

	public static void main(String[] args) {
		
		
		Restaurant udupi =
				new Restaurant(1010, "Udupi Krishna", 4.6);
		
		System.out.println("Best Restaurant in the City:=" +udupi.getRestaurantName());

	}

}
