package com.onlinexam.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity

public class User extends CommonEntity {
private String name;
private String dob;



//@OneToMany
//private Options op;
// @OneToOne
//private Result re;
// @OneToMany(cascade = CascadeType.ALL)
// private AttemptQue aq;
}
