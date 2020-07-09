package com.BookManagement.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class BookEntity extends CommonClass {
	private String bookName;
	@OneToMany(cascade = CascadeType.ALL)
	List<StudentEntity> student;
	@OneToMany(cascade = CascadeType.ALL)
	private List<IssuesEntity> issue;
}
