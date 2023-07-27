package com.training.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestRestaurantService {

	RestaurantService service;

	@Test
	@Disabled
	void test() {
		fail("Not yet implemented");
	}
	
	@BeforeEach
	void init() {
		 service = new RestaurantService();

	}

	@Test
	@DisplayName("Find All method should not return null")
	void testFindAllForNull() {
		
			
		assertNotNull(service.findAll());
		
	}
	
	@Test
	@DisplayName("Find All method should return a List of Size 3")
	void testFindAllForSize() {
		
		
		assertNotNull(service.findAll().length==3);
		
	}
	
	@Test
	@DisplayName("GetNames Method must return a List of size 5")
	void testFindForGetNames() {
		
		int actual = service.getNames().size();
		assertEquals(5,actual);
		
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {0,1,3})
	@DisplayName("findNameById Method should not have null values in odd postions")
	
	void testFindForFindNamesById(int idx) {
		
		String actual = service.findNameById(idx);
		assertNotNull(actual);
		
		
		
	}
}
