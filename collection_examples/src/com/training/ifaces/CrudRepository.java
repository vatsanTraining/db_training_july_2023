package com.training.ifaces;

import java.util.*;
public interface CrudRepository<T> {

	boolean save(T entity) ;
	List<T> findAll();
	void sortedList();
	T findById(int id);
	
}
