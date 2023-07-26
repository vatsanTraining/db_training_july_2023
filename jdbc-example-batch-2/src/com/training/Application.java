package com.training;

import com.training.ifaces.CrudRepository;
import com.training.services.RestaurantService;

public class Application {

	public static void main(String[] args) {
		
		
		Restaurant udupi =
				new Restaurant(1010, "Udupi Krishna", 4.6,"indian",601010);
		
		Restaurant bbq =
				new Restaurant(2010, "Barbeque Nation", 3.8,"mexican",202020);

		Restaurant shivsagar =
				new Restaurant(3010, "Shiv Sagar", 4.2,"punjabi",1020303);

		Restaurant athithi =
				new Restaurant(4010, "Athithi", 2.2,"north indian",505050);
		
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
