package com.training.ifaces;

import java.util.*;
public interface CrudRepository<T> {

	boolean save(T t) throws Exception;
	List<T> findAll();
	
}
