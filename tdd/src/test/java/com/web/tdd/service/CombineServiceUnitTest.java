package com.web.tdd.service;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.web.tdd.domain.GeforceEntity;
import com.web.tdd.repository.CombineRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CombineServiceUnitTest {

	@Autowired
	private CombineRepository repository;
	
	@Test
	public void list() throws Exception {
		List<GeforceEntity> entityList = repository.findAll();
		assertThat(entityList.size(), is(0));
	}
	
	@Test
	public void save() throws Exception {
		repository.save(GeforceEntity.builder().name("GTX 1080").build());
		repository.save(GeforceEntity.builder().name("GTX 2080").build());
		repository.save(GeforceEntity.builder().name("GTX 2080TI").build());
		repository.save(GeforceEntity.builder().name("RTX 2060").build());
		repository.save(GeforceEntity.builder().name("RTX 2080").build());
		repository.save(GeforceEntity.builder().name("RTX 2080TI").build());
		List<GeforceEntity> entityList = repository.findAll();
		assertThat(entityList.size(), is(6));
	}
	
}
