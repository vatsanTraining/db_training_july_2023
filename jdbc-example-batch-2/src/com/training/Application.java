package com.training;

import com.training.ifaces.CrudRepository;
import com.training.services.RestaurantService;

public class Application {

	public static void main(String[] args) {
		
		
		Restaurant udupi =
				new Restaurant(1010, "Udupi Krishna", 4.6);
		
		Restaurant bbq =
				new Restaurant(2010, "Barbeque Nation", 3.8);

		Restaurant shivsagar =
				new Restaurant(3010, "Shiv Sagar", 4.2);

		Restaurant athithi =
				new Restaurant(4010, "Athithi", 2.2);
		System.out.println("Best Restaurant in the City:=" +udupi.getRestaurantName());

		System.out.println(udupi);
		
		
		CrudRepository<Restaurant> repo = new RestaurantService();
		
		System.out.println(repo instanceof RestaurantService);
		 
		 try {
			System.out.println("Is Added :="+repo.save(shivsagar)); 
			 System.out.println("Is Added :="+repo.save(bbq)); 
			 System.out.println("Is Added :="+repo.save(udupi));
			 System.out.println("Is Added :="+repo.save(athithi));
			 
		} catch (Exception e) {

			System.err.println(e.getMessage());
			e.printStackTrace();
		} 

		 
		 for(Restaurant eachElement: repo.findAll()) {
			 System.out.println(eachElement);
		 }
		
		
		
		
	}

}
