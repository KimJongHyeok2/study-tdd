package com.web.tdd.domain;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class GeforceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private Timestamp registerDate;
	
	@PrePersist
	public void date() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String toDate = sdf.format(date);
		Timestamp toTimestamp = Timestamp.valueOf(toDate);
		this.registerDate = this.registerDate == null? this.registerDate = toTimestamp:this.registerDate;
	}
	
	@Builder
	public GeforceEntity(String name) {
		this.name = name;
	}
	
}