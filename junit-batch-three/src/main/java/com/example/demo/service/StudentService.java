package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

public class StudentService {

	
	
	public List<String> getNames(){
		
		List<String> nameList = Arrays.asList("Ram","Shyam","Shiv");
		
		return nameList;
				
	}
	
	public double getDiscount(String code) {
		
		int codeNumber;
		double discount = 0.10;

		try {
			codeNumber = Integer.parseInt(code);
			
			
			if(codeNumber<500) {
				
				discount =.05;
			}
			
		} catch (RuntimeException e) {

			 throw new NumberFormatException("Invalid Code 999");
		}
		
		return discount;

	}
}
