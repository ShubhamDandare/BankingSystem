package com.example.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Student;
import com.example.Repo.StudentRepo;

@RestController
@RequestMapping("/student")
public class Stcontroler {
	@Autowired
	private StudentRepo repo;

	@PostMapping("/create")
	public Student save(@RequestBody Student st) {
		return repo.save(st);
	}

}
