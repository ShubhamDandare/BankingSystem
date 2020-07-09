package com.example.demo.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.repo.Studentrepo;

@RestController
@RequestMapping("/student")
public class StudentControler {
	@Autowired
	private Studentrepo studentrepo;

	@PostMapping("/create")
	public Student test(@RequestBody Student st) {
		Student save = studentrepo.save(st);
		return save;
	}

	@GetMapping("/FindAll")
	public List<Student> findall() {
		List<Student> findAll = studentrepo.findAll();
		return findAll;
	}

	@GetMapping("/find/{ID}")
	public Student find(@PathVariable(value = "ID") Long id) {
		Student st = studentrepo.findById(id).orElseThrow(() -> new RuntimeException("student is not present"));
		return st;
	}

	@GetMapping("/delete/{ID}")
	public Student delete(@PathVariable(value = "ID") Long id) {
		Student st = studentrepo.findById(id).orElseThrow(() -> new RuntimeException("student is not present"));
		return st;
	}

	@PutMapping("/update")
	public Student update(@RequestBody Student st) {
		Student save = studentrepo.save(st);
		return save;
	}
}