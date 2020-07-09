package com.onlinexam.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.onlinexam.Entity.Result;
import com.onlinexam.service.ExamService;

@RestController
public class ResultControler {

	
	@Autowired ExamService examService;
	
	@GetMapping("/getResult/{ExamID}")
	public Result get(@PathVariable(value = "ExamID") Long id) {
		Result save = examService.save(id);
		return save;
	}
	
}
