package demo.example;

public class DiscountService {

	
	ProductRepo repo;
	
	public double getDiscount() {
		
		return repo.getDiscount();
	}
	
	public double getPrice() {
		
		double price =50000.00;
		return  price-price*getDiscount();
	}
}
