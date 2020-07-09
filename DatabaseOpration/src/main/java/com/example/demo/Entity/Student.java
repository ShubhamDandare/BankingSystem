package com.example.demo.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "StudentDetails")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String contact;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address add;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Subject> subject;
	@ManyToMany(cascade = { CascadeType.ALL })
	private Set<Hobies> hobies = new HashSet<>();
}
