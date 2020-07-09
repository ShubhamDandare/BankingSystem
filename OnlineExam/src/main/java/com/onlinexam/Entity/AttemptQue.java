package com.onlinexam.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
 @Entity
public class AttemptQue extends CommonEntity {
	@OneToOne(cascade = CascadeType.ALL)
	private ExamQuestions question;
	private String selectedOption;

}
