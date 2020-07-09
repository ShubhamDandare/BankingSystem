package com.example.demo.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.repo.Studentrepo;

import javassist.NotFoundException;

@RestController

public class ExceptionControler {

	@GetMapping("/path")
	public String save() {
		throw new RuntimeException("########################exception occured###############");
	}

	@Autowired
	private Studentrepo repo;

	@GetMapping("/path/ID")
	public Student getStudent(@PathVariable(value = "ID") Long id) throws NotFoundException {
		return repo.findById(id).orElseThrow(() -> new NotFoundException("student not found"));
	}

}
