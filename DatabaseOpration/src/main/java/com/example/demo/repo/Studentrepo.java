package com.example.demo.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.*;

public interface Studentrepo extends JpaRepository<Student, Long> {



}
