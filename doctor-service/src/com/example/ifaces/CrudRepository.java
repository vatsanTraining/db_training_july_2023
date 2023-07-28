package com.example.ifaces;
import java.util.*;
public interface CrudRepository<T> {

	 int add(T t);
	List<T> findAll();
}
