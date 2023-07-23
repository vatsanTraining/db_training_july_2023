package com.training.demo.collection;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import com.training.demo.collection.model.Book;

public class UsingLinkList {

    public static void main(String[] args) {

        Book java =   new Book(101, "Head First Java", "Kathy sierra", 450);
        Book advJava =   new Book(102, "Thinking in Java", "Bruce Erickel", 450);
        Book effJava =   new Book(103, "Effective Java", "Sam Anderson", 450);


        LinkedList<Book> bkList = new LinkedList<>();



        bkList.add(java);
        bkList.add(advJava);
        bkList.add(effJava);

        ListIterator<Book> itr = bkList.listIterator();


             while(itr.hasNext()){

                 System.out.println(itr.next());
             }

        while(itr.hasPrevious()){

            System.out.println(itr.previous());
        }




    }
}
