package com.onlinexam.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlinexam.repo.Questionrepo;

import lombok.Data;

@Data
@Entity
@Table
public class ExamQuestions extends CommonEntity {
	
	private String questions;
	@OneToMany(cascade = CascadeType.ALL)
	List<Options> options;

	
}
