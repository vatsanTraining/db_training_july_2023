package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.CibilScoreDto;

@RestController
public class LoanApproval {

	
	private RestTemplate template;
	
	// Can use WebClient / to make async calls
	@Autowired
	public LoanApproval(RestTemplate template) {
		super();
		this.template = template;
	}

	
	@GetMapping(path = "/scores/{pan}")
	public String getScore(@PathVariable String pan) {
		
		String url = "http://CIBIL-SCORE-SERVICE/api/v1/cibilscores/"+pan;
		CibilScoreDto dto= this.template.getForObject(url, CibilScoreDto.class);

//		String url = "http://LOAN-APP-SERVICE/api/v1/apps/"+name;

		
		
		  return dto.getCibilScore()>700?"Approved":"Declined";
	
	}
	
	
}
