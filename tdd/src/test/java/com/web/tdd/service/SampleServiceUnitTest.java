package com.web.tdd.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.web.tdd.domain.GeforceEntity;
import com.web.tdd.repository.SampleRepository;
import com.web.tdd.repository.impl.SampleRepositoryImpl;

public class SampleServiceUnitTest {

	private SampleRepositoryImpl repository;
	
	private SampleService service;
	
	@Before
	public void setUp() {
		repository = new SampleRepositoryImpl();
		repository.add(new GeforceEntity("GTX 2080TI"));
		service = new SampleService(repository);
	}
	
	@Test
	public void get() {
		GeforceEntity entity = service.findByName("GTX 2080TI");
		assertEquals("GTX 2080TI", entity.getName());
	}
	
	@Test
	public void getByMockito() {
		// setUp
		SampleRepository repository = Mockito.mock(SampleRepository.class);
		Mockito.when(repository.findByName("GTX 2080TI"))
		.thenReturn(new GeforceEntity("GTX 2080TI"));
		SampleService service = new SampleService(repository);
		
		// when
		GeforceEntity entity = service.findByName("GTX 2080TI");
		
		// then
		assertEquals("GTX 2080TI", entity.getName());
	}
	
}
