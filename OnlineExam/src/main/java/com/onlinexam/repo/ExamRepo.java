package com.onlinexam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinexam.Entity.Exam;

public interface ExamRepo extends JpaRepository<Exam, Long> {

}
