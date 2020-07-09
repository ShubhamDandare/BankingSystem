package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Subject;


public interface SubjectRepo extends JpaRepository<Subject, Long>{
	
}

