package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import com.example.demo.entity.CibilScore;

@SpringBootApplication
public class CibilScoreServiceApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	ctx=SpringApplication.run(CibilScoreServiceApplication.class, args);
	
	 System.out.println(ctx.getBean("suresh",CibilScore.class));
	 
	 ctx.close();
	 
	}

	@Bean
	public CibilScore ramesh() {
		
		return CibilScore.builder()
				.panNumber("AAXXP1023")
				.customerName("Ramesh")
				.cibilScore(650)
				.build();
	}
	
	@Bean
	public CibilScore suresh() {
		
		return CibilScore.builder()
				.panNumber("BBXXP1023")
				.customerName("Suresh")
				.cibilScore(620)
				.build();
	}
	
}
