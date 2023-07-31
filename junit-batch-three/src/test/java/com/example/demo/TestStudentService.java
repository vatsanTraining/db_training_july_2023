package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.example.demo.service.StudentService;

class TestStudentService {
	
	
	StudentService service;
	
	@BeforeEach
	void init() {
		
		 service = new StudentService();

	}

	@Test
	@DisplayName(value = "getNames method should not return null")
	void testGetNames() {
		
		
	     List<String> actual = service.getNames();
	     
	     assertNotNull(actual);

	}
	

	@Test
	@DisplayName(value = "getNames method should return a list of three names")
	void testGetNamesSize() {
		
		
	     int  actual = service.getNames().size();

	     assertEquals(3, actual);

	}
	
	@Test
	@DisplayName(value = "Get Discount should throw Exception for Invalid Argument")
     void testGetDiscount() {
		
	Throwable obj =
			 assertThrows(NumberFormatException.class,
					    () -> service.getDiscount("Four"));
		
	  assertEquals("Invalid Code 999", obj.getMessage());
	
	}
	
	
	@AfterEach
	void tearDown() {
		
		 service = null;

		 System.out.println("After Each Called");
		 
	}


}
