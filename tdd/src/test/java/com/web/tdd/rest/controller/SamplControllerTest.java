package com.web.tdd.rest.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class SamplControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void list() throws Exception {
		mockMvc.perform(get("/list"))
		.andExpect(status().isOk())
		.andDo(print());
	}
	
	@Test
	public void save() throws Exception {
		mockMvc.perform(get("/save"))
		.andExpect(status().isOk())
		.andDo(print());
	}
	
}