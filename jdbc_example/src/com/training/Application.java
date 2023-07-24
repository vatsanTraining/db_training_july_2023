package com.training;

import java.util.List;
import java.util.function.*;

import com.training.model.Book;
import com.training.services.BookServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookServiceImpl repo=
				new BookServiceImpl();
		
//		Book java =  new Book(102,"Spring in Action",850);
//
//		System.out.println("is Row Added:="+ repo.save(java));
		

		List<Book> list = repo.findAll();
		
		
		
		
		Predicate<Book> condition =
				(arg) -> arg.getRatePerUnit()>500;
				
		
				System.out.println("Book Price Greater than 500");
		
		for(Book eachBook:list) {
			
			if(condition.test(eachBook)) {
				System.out.println(eachBook);
			}
		}
		
		//Consumer<Object> con = (arg) -> System.out.println(arg);
	
		System.out.println("List of All Books");

		list.forEach(System.out::println);

		repo.closeConnection();
	}

}
