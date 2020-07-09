package com.onlinexam.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinexam.Entity.Options;
import com.onlinexam.repo.OptionRepo;

@RestController
@RequestMapping("/option")
public class OptionController {
	@Autowired
	private OptionRepo repo;

	@PostMapping("/create")
	public Options save(@RequestBody Options op) {
		return repo.save(op);
	}

	@GetMapping("/find/{Id}")
	public Options find(@PathVariable(value = "ID") Long id) {
		Options options = repo.findById(id).orElseThrow(() -> new RuntimeException());
		return options;
	}

}
