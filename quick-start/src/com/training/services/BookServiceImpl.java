package com.training.services;

import com.training.ifaces.BookService;
import com.training.model.Book;

public class BookServiceImpl implements BookService {

	private Book[] bookList;
	
	private static int pos = 0;
	
	public BookServiceImpl() {
		super();
		this.bookList=new Book[3];
	}

	@Override
	public boolean save(Book book) {
		
	this.bookList[pos]= book;
	  
	    pos++;
		return pos <3?true:false;
	}

	@Override
	public Book[] findAll() {
		return this.bookList;
	}

}
