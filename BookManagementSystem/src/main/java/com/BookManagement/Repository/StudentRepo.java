package com.BookManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookManagement.Entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Long>{

}
