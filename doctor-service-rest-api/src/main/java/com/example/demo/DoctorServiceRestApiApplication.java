package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Doctor Management API"))
@CrossOrigin(originPatterns = "*")
public class DoctorServiceRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorServiceRestApiApplication.class, args);
	}

}
