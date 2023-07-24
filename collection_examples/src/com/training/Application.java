package com.training;

import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;
import com.training.services.BookServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// super = sub  // always valid between related
		
		CrudRepository<Book>
		           repo = new BookServiceImpl(); 
		
		
		Book java =  new Book(101,"Head First Java",450);

		Book spring =  new Book(102,"Effective Spring",750);
		
		Book javascript =  new Book(103,"Javascript in Action",950);

		System.out.println("Is Added :="+repo.save(java)); 
		
		System.out.println("Is Added :="+repo.save(spring)); 

		System.out.println("Is Added :="+repo.save(javascript));
		
		repo.sortedList();
		
		List<Book> list = repo.findAll();
		
		 for(Book eachBook:list) {
              
			 System.out.println(eachBook);
		 }


	}

}
