package com.web.tdd.repository;

import com.web.tdd.domain.GeforceEntity;

public interface SampleRepository {
	public GeforceEntity findByName(String name);
	public void add(GeforceEntity entity);
}