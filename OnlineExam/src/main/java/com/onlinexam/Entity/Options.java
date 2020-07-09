package com.onlinexam.Entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Options extends CommonEntity {
	private String optionName;
	private boolean iscorrect;
}
