package com.training.demo.collection.model;

import java.util.Objects;

public class Book  implements Comparable<Book> {

    private int bookId;
    private String bookName;
    private String author;
    private double ratePerUnit;

    public Book() {
    }

    public Book(int bookId, String bookName, String author, double ratePerUnit) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.ratePerUnit = ratePerUnit;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRatePerUnit() {
        return ratePerUnit;
    }

    public void setRatePerUnit(double ratePerUnit) {
        this.ratePerUnit = ratePerUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookId == book.bookId && Double.compare(book.ratePerUnit, ratePerUnit) == 0 && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, bookName, author, ratePerUnit);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", ratePerUnit=" + ratePerUnit +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        /*
        compareTo is a method in String class , which implements
        the conditions to compare
         */
        return this.bookName.compareTo(o.bookName);
    }
}
