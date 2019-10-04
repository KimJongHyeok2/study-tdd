package com.web.tdd.repository.impl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.web.tdd.domain.GeforceEntity;
import com.web.tdd.repository.SampleRepository;

@Repository
public class SampleRepositoryImpl implements SampleRepository {

	private Map<String, GeforceEntity> entityMap = new HashMap<>();
	
	@Override
	public GeforceEntity findByName(String name) {
		return entityMap.get(name);
	}

	@Override
	public void add(GeforceEntity entity) {
		entityMap.put(entity.getName(), entity);
	}

}