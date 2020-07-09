package com.onlinexam.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinexam.Entity.AttemptQue;
import com.onlinexam.repo.AttemptRepo;

@RestController
@RequestMapping("/attempt")
public class AttemptqueController {
	@Autowired
	private AttemptRepo repo;

	@PostMapping("/create")
	public AttemptQue save(@RequestBody AttemptQue que) {
		return repo.save(que);
	}

	@PutMapping("/update")
	public AttemptQue update(@RequestBody AttemptQue que) {
		return repo.save(que);
	}

	@GetMapping("/find/{ID}")
	public AttemptQue find(@PathVariable(value = "id") Long id) {
		AttemptQue que = repo.findById(id).orElseThrow(() -> new RuntimeException("question is not attempt"));
		return que;
	}

	@GetMapping("/delete/{ID}")
	public AttemptQue delete(@PathVariable(value = "id") Long id) {
		AttemptQue que = repo.findById(id).orElseThrow(() -> new RuntimeException("question is not attempt"));
		return que;
	}
}