package com.onlinexam.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Result extends CommonEntity {
	@OneToOne(cascade = CascadeType.ALL)
	private User user;
	private String Totalmarks;
	private String correctAnswer;
	private String wrongAnswer;
	//private String negativemarks;
}
