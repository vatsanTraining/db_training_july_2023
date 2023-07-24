package com.training.ifaces;

import com.training.model.Book;

public interface BookService {

	boolean save(Book book) ;
	Book[] findAll();
}
