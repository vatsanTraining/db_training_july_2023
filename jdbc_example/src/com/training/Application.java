package com.training;

import java.util.List;

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
		
		for(Book eachBook:list) {
			System.out.println(eachBook);
		}
		repo.closeConnection();
	}

}
