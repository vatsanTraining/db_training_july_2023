package com.training.demo.collection.services;

import java.util.ArrayList;


import java.util.Collection;
import java.util.Iterator;
import java.util.Optional;

import com.training.demo.collection.exceptions.ElementNotFoundException;
import com.training.demo.collection.ifaces.BookOperation;
import com.training.demo.collection.model.Book;

public class BookManagerImpl implements BookOperation<Book> {

    private ArrayList<Book> list ;

    public BookManagerImpl() {

        this.list=new ArrayList<>();
    }

    @Override
    public boolean add(Book obj) {
        return this.list.add(obj);
    }

    @Override
    public Optional<Book> findById(int id)  throws ElementNotFoundException {

        Iterator<Book> itr = this.list.iterator();
        Book book=null;

        while(itr.hasNext()) {
            book = itr.next();
            if (book.getBookId() == id) {
                return Optional.of(book);
            }

        }
        throw new ElementNotFoundException("Book with "+id + " is Not found");

    }

    @Override
    public Collection<Book> findAll() {

        return this.list;
    }

    @Override
    public void deleteById(int id) throws ElementNotFoundException {


          Book bookToDelete = findById(id).get();

          this.list.remove(bookToDelete);

    }

    @Override
    public Book changePrice(int id, double newPrice)  throws ElementNotFoundException{

        Book book = findById(id).get();

        book.setRatePerUnit(newPrice);

        return book;

    }
}
