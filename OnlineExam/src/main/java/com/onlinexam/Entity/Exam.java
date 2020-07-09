package com.onlinexam.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Exam extends CommonEntity {
	private String examName;
	private String negativeMarks;
	
	@OneToOne(cascade = CascadeType.ALL)
	private User user;
	@OneToMany(cascade = CascadeType.ALL)
	private List<AttemptQue> attempts;
//	@OneToMany(cascade = CascadeType.ALL)
//	private List<ExamQuestions> questions;

}
