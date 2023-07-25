package com.example.demo;

import java.io.IOException;

public class BookService {

	
	public String findBestBook(String subject,String code) throws NumberFormatException{
		
		
		int codeValue = Integer.parseInt(code);
		
		
		String suggestion="Facebook";
		
		if(subject.equals("java")) {
			suggestion="Effective Java";
		}
		
		return suggestion;
	}
}
