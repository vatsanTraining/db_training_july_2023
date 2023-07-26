package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Customer;
import com.example.demo.model.Invoice;
import com.example.demo.model.Product;

@SpringBootApplication
public class SpringQuickstartBatch2Application {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	ctx=SpringApplication.run(SpringQuickstartBatch2Application.class, args);
	
	 System.out.println(ctx.getBean(Invoice.class));
	 
	}

	@Bean
	public Customer ram() {
		
		return Customer.builder()
				      .firstName("Ram")
				     .mobileNumber(92939239)
				     .email("ram@abc.com")
				     .build();
	}
	
	@Bean
	public Product tv() {
		
		return Product.builder()
				      .productId(393939)
				     .productName("samsungtv")
				     .ratePerUnit(40000)
				     .build();

	}
	
	@Bean
	public Product laptop() {
		
		return Product.builder()
				      .productId(793939)
				     .productName("dell")
				     .ratePerUnit(50000)
				     .build();

	}
}
