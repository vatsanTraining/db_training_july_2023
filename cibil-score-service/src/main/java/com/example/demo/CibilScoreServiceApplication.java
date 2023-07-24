package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import com.example.demo.entity.CibilScore;
import com.example.demo.services.CibilScoreService;

@SpringBootApplication
public class CibilScoreServiceApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext	ctx=SpringApplication.run(CibilScoreServiceApplication.class, args);
	
	 CibilScore suresh=ctx.getBean("suresh",CibilScore.class);
	 CibilScore ramesh=ctx.getBean("ramesh",CibilScore.class);

	 CibilScoreService service = ctx.getBean(CibilScoreService.class);
	 
	 service.save(suresh);
	 service.save(ramesh);
	 
	 
	 service.findAll().forEach(System.out::println);
	 
	 
	 
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
