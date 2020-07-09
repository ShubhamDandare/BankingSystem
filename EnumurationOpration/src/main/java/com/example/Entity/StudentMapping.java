package com.example.Entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



import lombok.Data;
@Data
@MappedSuperclass
public class StudentMapping {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
@Temporal(TemporalType.TIMESTAMP)
	private Date createdate =new Date(System.currentTimeMillis());
}
