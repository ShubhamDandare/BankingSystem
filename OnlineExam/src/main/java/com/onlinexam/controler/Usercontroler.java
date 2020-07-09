package com.onlinexam.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinexam.Entity.Options;
import com.onlinexam.Entity.User;
import com.onlinexam.repo.OptionRepo;
import com.onlinexam.repo.UserRepo;

@RestController
@RequestMapping("/user")
public class Usercontroler {
	@Autowired
	private UserRepo repo;

	@PostMapping("/create")
	public User save(@RequestBody User user) {
		return repo.save(user);
	}
	@GetMapping("/find/{Id}")
	public User find(@PathVariable(value = "ID") Long id) {
	User user= repo.findById(id).orElseThrow(() -> new RuntimeException());
		return user;
	}
	
}
