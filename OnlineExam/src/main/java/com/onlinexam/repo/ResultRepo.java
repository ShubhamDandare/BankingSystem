package com.onlinexam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinexam.Entity.Result;

public interface ResultRepo extends JpaRepository<Result, Long> {

}
