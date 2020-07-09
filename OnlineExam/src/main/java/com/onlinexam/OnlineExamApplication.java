package com.onlinexam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.onlinexam.Entity.ExamQuestions;
import com.onlinexam.Entity.Options;
import com.onlinexam.repo.AttemptRepo;
import com.onlinexam.repo.OptionRepo;
import com.onlinexam.repo.Questionrepo;

@SpringBootApplication
public class OnlineExamApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OnlineExamApplication.class, args);
	}
	@Autowired private Questionrepo repo;
	@Autowired private OptionRepo repo1;
	@Autowired private AttemptRepo repo2;
	@Override
	public void run(String... args) throws Exception {
//		ExamQuestions que=new ExamQuestions();
//		que.setQuestions("what is your name?");
//		repo.save(que);
//		ExamQuestions que1=new ExamQuestions();
//		que1.setQuestions("what is your age?");
//		repo.save(que1);
//		
//		
//		Options op =new Options();
//		op.setId(1);
//		op.setOptionName("A).shubham \n B).pratik \n C).akash \n D).amit");
//		repo1.save(op);
		
		ExamQuestions que=new ExamQuestions();
		que.setQuestions("What is String?");
		
		List<Options> options = new ArrayList<Options>();
		
		Options op1 = new Options();
		op1.setOptionName("variable");
		op1.setIscorrect(false);
		
		Options op2 = new Options();
		op2.setOptionName("Class");
		op2.setIscorrect(true);
		
		Options op3 = new Options();
		op3.setOptionName("Mutable");
		op3.setIscorrect(false);
		
		Options op4 = new Options();
		op4.setOptionName("Synchronised");
		op4.setIscorrect(false);
		
		options.add(op1);
		options.add(op2);
		options.add(op3);
		options.add(op4);
		
		que.setOptions(options);

		
		
		repo.save(que);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
