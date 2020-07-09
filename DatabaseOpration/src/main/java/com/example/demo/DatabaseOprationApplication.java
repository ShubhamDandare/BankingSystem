package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Entity.Address;
import com.example.demo.Entity.Hobies;
import com.example.demo.Entity.Student;
import com.example.demo.Entity.Subject;
import com.example.demo.repo.Addressrepo;
import com.example.demo.repo.Hobbiesrepo;
import com.example.demo.repo.Studentrepo;
import com.example.demo.repo.SubjectRepo;

@SpringBootApplication
public class DatabaseOprationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseOprationApplication.class, args);
	}

	@Autowired
	private Studentrepo repo2;
	@Autowired
	private SubjectRepo repo;
	@Autowired
	private Hobbiesrepo repo1;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Student pratik =Student.builder().id(1).name("pratik").contact("123456").hobies(Hobies.builder().id(1).name("codeing")).subject(Subject.builder().id(1).name("english"))
//				.add(Address.builder().id(1).city("pune").landmark("karvenager").pincode("440024").build());
		Subject s1 = Subject.builder().id(1).name("english").build();
		Subject s2 = Subject.builder().id(2).name("marathi").build();
		Subject s3 = Subject.builder().id(3).name("science").build();
		Subject s4 = Subject.builder().id(4).name("math").build();
		Subject s5 = Subject.builder().id(5).name("history").build();

		List<Subject> sub = new ArrayList<Subject>();
		sub.add(s1);
		sub.add(s2);
		sub.add(s3);
		sub.add(s4);
		sub.add(s5);
		repo.saveAll(sub);

		Hobies hobies1 = Hobies.builder().id(1).name("codeing").build();
		Hobies hobies2 = Hobies.builder().id(2).name("codeing").build();
		Hobies hobies3 = Hobies.builder().id(3).name("codeing").build();
		Hobies hobies4 = Hobies.builder().id(4).name("codeing").build();

		Set<Hobies> set = new HashSet<>();
		set.add(hobies1);
		set.add(hobies2);
		set.add(hobies3);
		set.add(hobies4);
		repo1.saveAll(set);

		Student student1 = Student.builder().id(1).name("pratik").contact("123456")
				.add(Address.builder().id(1).city("pune").landmark("karvenager").pincode("440024").build()).build();
		Student student2 = Student.builder().id(2).name("shubham").contact("123456")
				.add(Address.builder().id(2).city("pune").landmark("shivajinager").pincode("440024").build()).build();
		Student student3 = Student.builder().id(3).name("amit").contact("123456")
				.add(Address.builder().id(3).city("pune").landmark("vimannager").pincode("440024").build()).build();
		List<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		repo2.saveAll(list);

	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//	}

//	@Autowired private EmpRepo repo;
//	
//	private static final Logger log = LoggerFactory.getLogger(DatabaseOprationApplication.class);
//
//	@Override
//	public void run(String... args) throws Exception {
//		Employe  e = new Employe();
//		e.setAddres("Addrss");
//		e.setName("PK");
//		repo.save(e);
//
//	
//	log.error("Data save ");

}
