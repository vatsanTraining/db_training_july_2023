package com.training.demo.collection;

import com.training.demo.collection.services.BookManagerImpl;
import com.training.demo.collection.exceptions.ElementNotFoundException;
import com.training.demo.collection.ifaces.BookOperation;
import com.training.demo.collection.ifaces.CrudOperation;
import com.training.demo.collection.model.Book;
import java.util.*;

import com.training.demo.collection.utils.AuthorComparator;
public class Application {

    public static void main(String[] args) {

        BookOperation<Book> crud =

                new BookManagerImpl();


        System.out.println(crud.add(new Book(101, "Head First Java", "Kathy sierra", 450)));
        System.out.println(crud.add(new Book(102, "Thinking in Java", "Bruce Erickel", 1450)));
        System.out.println(crud.add(new Book(103, "Effective Java", "Sam Anderson", 750)));

        int key =1;

        switch (key){
                case 1:
                    Collection<Book>  list=  crud.findAll();
                     //Collections.sort((List)list);
                     Collections.sort((List)list,new AuthorComparator());
                     for (Book book : list) {
                        System.out.println(book);
                    }
                    break;
            case 3:
                try {
                    Optional<Book> found = crud.findById(102);
                    System.out.println("Found Book"+found.get());
                } catch (ElementNotFoundException e) {
                    System.out.println(e.getMessage());;
                }
                break;
            case 4:
                try {
                    System.out.println("updated: "+crud.changePrice(1002, 888));
                } catch (ElementNotFoundException e) {
                    throw new RuntimeException(e);
                }
                 break;
            case 5:
                try {
                    crud.deleteById(101);
                    for (Book book : crud.findAll()) {
                        System.out.println(book);
                    }
                } catch (ElementNotFoundException e) {
                    throw new RuntimeException(e);
                }

            default:
                System.out.println("Invalid Choice");
        }







    }
}
