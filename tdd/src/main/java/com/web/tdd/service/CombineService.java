package com.web.tdd.service;

import java.util.List;

import com.web.tdd.domain.GeforceEntity;

public interface CombineService {
	public List<GeforceEntity> list() throws Exception;
	public List<GeforceEntity> save() throws Exception;
}
