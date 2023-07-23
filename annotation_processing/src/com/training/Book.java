package com.training;


import com.training.stereotypes.Id;
import com.training.stereotypes.Table;

@Table(tableName = "book_details")
public class Book {

    @Id(columName="book_number")
    private int bookNumber;


}
