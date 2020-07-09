package com.onlinexam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinexam.Entity.Options;

public interface OptionRepo extends JpaRepository<Options, Long> {

}
