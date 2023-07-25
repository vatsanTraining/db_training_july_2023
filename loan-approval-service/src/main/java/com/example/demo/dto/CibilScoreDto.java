package com.example.demo.dto;


public class CibilScoreDto {

	
String panNumber;
	
String customerName;
	
int cibilScore;

public CibilScoreDto() {
	super();
	// TODO Auto-generated constructor stub
}

public CibilScoreDto(String panNumber, String customerName, int cibilScore) {
	super();
	this.panNumber = panNumber;
	this.customerName = customerName;
	this.cibilScore = cibilScore;
}

public String getPanNumber() {
	return panNumber;
}

public void setPanNumber(String panNumber) {
	this.panNumber = panNumber;
}

public String getCustomerName() {
	return customerName;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public int getCibilScore() {
	return cibilScore;
}

public void setCibilScore(int cibilScore) {
	this.cibilScore = cibilScore;
}



}
