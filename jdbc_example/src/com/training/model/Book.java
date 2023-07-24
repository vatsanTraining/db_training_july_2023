package com.training.model;

public class Book implements Comparable<Book>{

	private int bookNumber;
	private String bookName;
	private double ratePerUnit;
	
	public Book() {
		super();
	}

	public Book(int bookNumber, String bookName, double ratePerUnit) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.ratePerUnit = ratePerUnit;
	}

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	
	@Override
	public String toString() {
		
		return this.bookName + ","+this.ratePerUnit;
	}

	@Override
	public int compareTo(Book o) {
		return this.bookName.compareTo(o.bookName);
	}
	
}
