package com.web.tdd.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.tdd.domain.GeforceEntity;
import com.web.tdd.service.CombineService;

@RestController
public class SampleController {

	@Autowired
	private CombineService service;
	
	@GetMapping("/list")
	public List<GeforceEntity> list() {
		List<GeforceEntity> list = null;
		try {
			list = service.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	@GetMapping("/save")
	public List<GeforceEntity> save() {
		List<GeforceEntity> list = null;
		try {
			list = service.save();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
}