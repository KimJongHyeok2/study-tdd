package com.web.tdd.service;

import org.springframework.stereotype.Service;

import com.web.tdd.domain.GeforceEntity;
import com.web.tdd.repository.SampleRepository;

@Service
public class SampleService {

	private final SampleRepository repository;

	public SampleService(SampleRepository repository) {
		this.repository = repository;
	}
	
	public GeforceEntity findByName(String name) {
		return repository.findByName(name);
	}
	
	public void add(GeforceEntity entity) {
		repository.add(entity);
	}
	
}