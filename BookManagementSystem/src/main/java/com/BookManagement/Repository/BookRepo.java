package com.BookManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookManagement.Entity.BookEntity;

public interface BookRepo extends JpaRepository<BookEntity, Long> {

}
