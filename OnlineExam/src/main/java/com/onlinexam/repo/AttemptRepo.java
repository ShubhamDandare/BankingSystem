package com.onlinexam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinexam.Entity.AttemptQue;

public interface AttemptRepo extends JpaRepository<AttemptQue, Long> {

}
