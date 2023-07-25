package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info =@Info(title = "Cibil Score Service",version = "1.0"))
public class CibilScoreRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CibilScoreRestApiApplication.class, args);
	}

}
