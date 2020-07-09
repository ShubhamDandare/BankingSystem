package com.onlinexam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinexam.Entity.ExamQuestions;

public interface Questionrepo extends JpaRepository<ExamQuestions, Long> {

}
