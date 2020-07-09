package com.BookManagement.service;


import java.util.Date;
import java.util.List;


import java.time.LocalDate;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookManagement.Entity.BookEntity;
import com.BookManagement.Entity.IssuesEntity;
import com.BookManagement.Repository.BookRepo;
import com.BookManagement.Repository.IssueRepo;

@Service
public class Bookservice {
	@Autowired
	private BookRepo bookrepo;
	@Autowired
	private IssueRepo issuerepo;

	// public IssuesEntity saveall(IssuesEntity ie2 ) {
//		BookEntity bookEntity = bookrepo.findById(id).orElseThrow(() -> new RuntimeException("book is not present"));
////	Date d=new Date();
////	Calendar cal= Calendar.getInstance();
////	if(cal.add(cal.DATE, 7)==)
//		int count = 0;
////		Timer timer = new Timer();
//		Date currentDate = new Date(System.currentTimeMillis());
//	
//		boolean isbookReturn = false;
//		List<IssuesEntity> issue = bookEntity.getIssue();
////		for (IssuesEntity ie : issue) {
////			if (isbookReturn == true) {
////				if (ie.getIssueExpiry().before(currentDate)) {
////					count += 10;
////				}
////			}
////		}
//		IssuesEntity issue1 = new IssuesEntity();
//		issue1.setFine(String.valueOf(count));
//		issue1.setIssueDate(currentDate);
//
//		IssuesEntity create = issuerepo.save(issue1);
//		return create;
//
//	}   
//		BookEntity book=bookrepo.findById(ie2).orElseThrow(()->new RuntimeException("book not found"));
//		Date currentDate = new Date();
//		Date findDate = new Date(LocalDate.now().plusDays(7).toString().replace("-", "/"));
//		List<IssuesEntity> issueentity = book.getIssue();
//		for (IssuesEntity ie : issueentity) {
//
//		}
//		IssuesEntity ie = new IssuesEntity();
//		ie.setIssueDate(currentDate);
//		ie.setIssueExpiry(findDate);
//		return issuerepo.save(ie);
//
//}
	public IssuesEntity find(Long issueid) {
		BookEntity book = bookrepo.findById(issueid).orElseThrow(() -> new RuntimeException("book not found"));
		Date currentDate = new Date();
		Date findDate = new Date(LocalDate.now().plusDays(7).toString().replace("-", "/"));
		List<IssuesEntity> issueentity = book.getIssue();
		IssuesEntity ie = new IssuesEntity();
		ie.setIssueDate(currentDate);
		ie.setIssueExpiry(findDate);
		return issuerepo.save(ie);
	}
	public BookEntity save(BookEntity be) {
		Date todayDate =new Date();
		Date findDate = new Date(LocalDate.now().plusDays(7).toString().replace("-", "/"));
		IssuesEntity ie = new IssuesEntity();
		ie.setIssueDate(todayDate);
		ie.setIssueExpiry(findDate);
		return bookrepo.save(be);
	}

}
