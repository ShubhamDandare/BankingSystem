package com.BookManagement.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.BookManagement.Entity.IssuesEntity;
import com.BookManagement.service.Bookservice;

@RestController
public class Issuecontroler {
	@Autowired
	Bookservice bookService;

	@GetMapping("/getissue/{issueId}")
	public IssuesEntity get(@PathVariable(value = "issueID") Long id) {
		IssuesEntity entity = bookService.find(id);
		return entity;
	}
}
