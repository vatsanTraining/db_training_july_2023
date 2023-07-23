package com.training.demo.collection;


import java.util.*;

import com.training.demo.collection.model.Book;

public class UsingMapCollection {

    public static void main(String[] args) {


        Book java =new Book(101, "Head First Java", "Kathy sierra", 450);
        Book thinkJava =new Book(102, "Thinking in Java", "Bruce Erickel", 1450);
        Book effectJava= new Book(103, "Effective Java", "Sam Anderson", 750);
        Book effectJava2= new Book(104, "Effective Java-2", "Sam Berg", 950);

        HashMap<Integer,Book> hashMap = new HashMap<>();

        hashMap.put(1001 ,java);

        hashMap.put(1002 ,thinkJava);

        hashMap.put(1003 ,effectJava);

        /**
         * Duplicate key rewrites the value and return the existing key, else return null
         */
        hashMap.put(1003 ,effectJava2);


        System.out.println(hashMap);

        System.out.println(hashMap.get(1003));


           Set<Map.Entry<Integer,Book>> setView= hashMap.entrySet();


            Iterator itr = setView.iterator();

           while( itr. hasNext()){

               Map.Entry<Integer,Book> element =(Map.Entry<Integer,Book>)itr.next();



           }
           /*
           *  obj.methodName()    // instance method   eg=> ArrayList list = new ArrayList()  list.add()
           *  Class.methodName()   // static method   eg => Integer.parseInt()
           *  Interface.Interface  // Inner Interface   eg=> Map.Entry
            */

           for( Map.Entry<Integer,Book> element:setView){
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }


    }
}
