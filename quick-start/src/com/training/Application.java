package com.training;

import com.training.ifaces.BookService;
import com.training.model.Book;
import com.training.services.BookServiceImpl;

public class Application {

	public static void main(String[] args) {

		Book java =  new Book(101,"Head First Java",450);

		Book spring =  new Book(102,"Effective Spring",750);
		
		Book javascript =  new Book(103,"Javascript in Action",950);


		//System.out.println(java);
		
		BookService service = new BookServiceImpl();
		
		 try {
			System.out.println("Is Added :="+service.save(java)); 
			 System.out.println("Is Added :="+service.save(spring)); 
			 System.out.println("Is Added :="+service.save(javascript)); 

			 System.out.println("Is Added :="+service.save(new Book()));
		} catch (ArrayIndexOutOfBoundsException e) {

			System.err.println("Array Size is Three - Only three elements can be stored");
		} 

		 Book[] list = service.findAll();
		 
		 for(Book eachBook:list) {
			 if(eachBook!=null) {
			 System.out.println(eachBook);
			 }
		 }
		
	}

}
