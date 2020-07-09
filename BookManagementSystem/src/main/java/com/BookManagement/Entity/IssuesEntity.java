package com.BookManagement.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table
@Entity
public class IssuesEntity extends CommonClass {
private Date issueDate;
private Date issueExpiry;
private String fine;
}
