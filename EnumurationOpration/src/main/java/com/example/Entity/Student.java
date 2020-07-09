package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.example.Enum.StudentEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Table
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Student extends StudentMapping{

	private String name;
	private String addres;
	@Enumerated(EnumType.STRING)
	private StudentEnum status;
}
