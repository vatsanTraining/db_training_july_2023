package com.training.demo.collection;


import java.util.*;

import com.training.demo.collection.model.Book;

public class UsingSetCollection {

    public static void main(String[] args) {


       Book java =new Book(101, "Head First Java", "Kathy sierra", 450);
       Book thinkJava =new Book(102, "Thinking in Java", "Bruce Erickel", 1450);
       Book effectJava= new Book(103, "Effective Java", "Sam Anderson", 750);

        Book effectJava2= new Book(103, "Effective Java", "Sam Anderson", 750);

      HashSet<Book> hashSet = new HashSet<Book>();

       hashSet.add(java);
       hashSet.add(thinkJava);
       hashSet.add(effectJava);
        hashSet.add(effectJava2);

        System.out.println("Hash Set Output- Not ordered in anyway");
        System.out.println(hashSet);
        System.out.println("Expected -3 Actual=>"+hashSet.size());


        TreeSet<Book> treeSet = new TreeSet<Book>();

        treeSet.add(java);
        treeSet.add(thinkJava);
        treeSet.add(effectJava);
        treeSet.add(effectJava2);

//        /*
//        Based on the comparable implemented in book class in this case its on Book Name
//         */
        System.out.println("Tree Set Output- Ordered By Book Name");
        System.out.println(treeSet);

        System.out.println("Expected -3 Actual=>"+treeSet.size());



    }
}
