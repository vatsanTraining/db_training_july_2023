package com.training.demo.collection.utils;


import java.util.Comparator;

import com.training.demo.collection.model.Book;

public class AuthorComparator implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }

	}
