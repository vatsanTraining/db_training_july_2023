package com.training.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookServiceImpl implements CrudRepository<Book> {

	private List<Book> bookList;
	
	public BookServiceImpl() {
		super();
		
		this.bookList = new ArrayList<>();
	}

	@Override
	public boolean save(Book book) {
		
		return this.bookList.add(book);  
		
	}

	@Override
	public List<Book> findAll() {
		return this.bookList;   
		
	}

	@Override
	public void sortedList() {
		
		Collections.sort(this.bookList);
		
//		Collections.sort(this.bookList,new Comparator<Book>() {
//			
//			public int compare(Book obj1, Book obj2) {
//				if( obj1.getRatePerUnit()> obj2.getRatePerUnit()) return -1;
//				if( obj1.getRatePerUnit()< obj2.getRatePerUnit()) return 1;
//				return 0;
//			}
//		});
		
	}

	@Override
	public Book findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
