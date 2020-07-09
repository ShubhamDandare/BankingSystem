package com.onlinexam.controler;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinexam.Entity.Exam;
import com.onlinexam.repo.ExamRepo;

@RestController
@RequestMapping("/exam")
public class Examcontroller {

	@Autowired
	private ExamRepo repo;

	@PostMapping("/create")
	public Exam save(@RequestBody Exam exam) {
		return repo.save(exam);
	}

	@PutMapping("/update")
	public Exam update(@RequestBody Exam exam) {
		return repo.save(exam);
	}

	@GetMapping("/find/{ID}")
	public Exam find(@PathVariable(value = "ID") Long id) {
		Exam ex = repo.findById(id).orElseThrow(() -> new RuntimeException());
		return ex;
	}

}
