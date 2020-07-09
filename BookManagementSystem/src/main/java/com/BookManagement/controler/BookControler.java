package com.BookManagement.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookManagement.Entity.BookEntity;
import com.BookManagement.Entity.IssuesEntity;
import com.BookManagement.Repository.BookRepo;
import com.BookManagement.Repository.IssueRepo;
import com.BookManagement.service.Bookservice;


@RestController
@RequestMapping("/Book")
public class BookControler {
	@Autowired
	private BookRepo bookrepo;
	@Autowired Bookservice bookservice;
	
	@PostMapping("/create")
	public BookEntity save(@RequestBody BookEntity bookentity) {
		return bookrepo.save(bookentity);
	}
	@PostMapping("/save")
	public BookEntity save1(@RequestBody BookEntity bookentity) {
		return bookservice.save(bookentity);
	}
	@GetMapping("/findAll")
	public List<BookEntity> findall() {
		List<BookEntity> find = bookrepo.findAll();
		return find;
	}
}
