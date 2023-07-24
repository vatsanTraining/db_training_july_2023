package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CibilScore;
import com.example.demo.ifaces.CibilScoreRepository;

@Service
public class CibilScoreService {

	
	private CibilScoreRepository repo;

	@Autowired
	public CibilScoreService(CibilScoreRepository repo) {
		super();
		this.repo = repo;
	}
	
	public CibilScore save(CibilScore entity) {
		
		return this.repo.save(entity);
	}
	
  public List<CibilScore> findAll() {
		
		return this.repo.findAll();
	}
	

}
