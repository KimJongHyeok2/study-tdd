package com.web.tdd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.tdd.domain.GeforceEntity;

public interface CombineRepository extends JpaRepository<GeforceEntity, Long> {
	public List<GeforceEntity> findByName(String name);
}