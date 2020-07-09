package com.onlinexam.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.onlinexam.Entity.ExamQuestions;
import com.onlinexam.repo.Questionrepo;

@RestController
@RequestMapping("/question")
public class QuestionsController {
	@Autowired
	private Questionrepo repo;

	@PostMapping("/create")
	public ExamQuestions que(@RequestBody ExamQuestions eq) {
		return repo.save(eq);
	}

	@PutMapping("/update")
	public ExamQuestions update(@RequestBody ExamQuestions eq) {
		return repo.save(eq);
	}

	@GetMapping("/find/{ID}")
	public ExamQuestions find(@PathVariable(value = "id") Long id) {
		ExamQuestions questions = repo.findById(id).orElseThrow(() -> new RuntimeException("question is not present "));
		return questions;
	}

	@GetMapping("/findall")
	public List<ExamQuestions> findall() {
		List<ExamQuestions> questions = repo.findAll();
		return questions;
	}

	@GetMapping("/delete/{ID}")
	public ExamQuestions delete(@PathVariable(value = "id") Long id) {
		ExamQuestions questions = repo.findById(id).orElseThrow(() -> new RuntimeException("question is not present "));
		return questions;
	}
}
