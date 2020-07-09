  package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.employe.Employe;

@SpringBootApplication
@RestController
public class FirstdemoApplication {
	
	private static final Logger log = LoggerFactory.getLogger(FirstdemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FirstdemoApplication.class, args);
	}
@GetMapping("/asd/{NAME}")
public String sayhello(@PathVariable(name = "NAME") String name) {
	log.info("test");
	return "hi "+name;
}
//	@GetMapping("/pqr")
//	public String sum() {
//		return "hello world";
//	}

@GetMapping("/as/{NAME}")
public String sayhell(@PathVariable(name = "NAME") String name) {
	log.info("test");
	return "hi "+name;


}
@PostMapping("/hi")
public String test(@RequestBody String asd) {
	return "hello "+asd;
	
}
@Value("${employe.info}") String str;
@PostMapping("/employe")
public Employe postemploye(@RequestBody Employe emp) {
	String e=emp.getName().concat(str );
	emp.setName(e);
	
	return emp;
} 
@Value("${programing}") String st;
@GetMapping("/programing")
public String test() {
	return st;
}
@Autowired
private Employe employe;
@GetMapping("/employe/info")
public String getemploye() {
	
	return employe.getId()+" "+employe.getName()+" "+employe.getAddress();
	
}
}
