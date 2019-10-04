package com.web.tdd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.tdd.domain.GeforceEntity;
import com.web.tdd.repository.CombineRepository;
import com.web.tdd.service.CombineService;

@Service
public class CombineServiceImpl implements CombineService {

	@Autowired
	private CombineRepository repository;
	
	@Override
	public List<GeforceEntity> list() {
		return repository.findAll();
	}

	@Override
	public List<GeforceEntity> save() {
		repository.save(GeforceEntity.builder().name("GTX 1080").build());
		repository.save(GeforceEntity.builder().name("GTX 2080").build());
		repository.save(GeforceEntity.builder().name("GTX 2080TI").build());
		repository.save(GeforceEntity.builder().name("RTX 2060").build());
		repository.save(GeforceEntity.builder().name("RTX 2080").build());
		repository.save(GeforceEntity.builder().name("RTX 2080TI").build());
		return repository.findAll();
	}

}
