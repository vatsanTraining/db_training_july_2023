package com.training.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.training.model.Book;

import demo.example.ifaces.BookRepository;

public class BookServiceImpl  {

	
	private BookRepository bookRepo;

	public BookServiceImpl(BookRepository repo) {
		super();
		
		this.bookRepo = repo;
	}

	
	public double findMaximumPrice() {
		
		List<Book> bookList = this.bookRepo.getAllBooks();
		
		return bookList.stream()
				 .map(e -> e.getRatePerUnit()).max(Comparator.comparing(Double::doubleValue)).get();
	}
	

}
