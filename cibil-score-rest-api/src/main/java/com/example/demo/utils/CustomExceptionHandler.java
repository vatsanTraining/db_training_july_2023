package com.example.demo.utils;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class CustomExceptionHandler {

	
	@ExceptionHandler(Exception.class)
	public ExceptionMessage handleAllExceptions(Exception ex, WebRequest req) {
		
		return new ExceptionMessage(ex.getMessage(),
				   LocalDateTime.now(),
				   req.getDescription(false));
	}
}
