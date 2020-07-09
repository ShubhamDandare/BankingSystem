package com.BookManagement.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class StudentEntity extends CommonClass {
private String name;
}
