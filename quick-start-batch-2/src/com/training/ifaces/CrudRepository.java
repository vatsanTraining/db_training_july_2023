package com.training.ifaces;

import com.training.*;

public interface CrudRepository {

	boolean add(Restaurant obj) ;
	
	Restaurant[] findAll();
	
}
