package com.BookManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BookManagement.Entity.IssuesEntity;

public interface IssueRepo extends JpaRepository<IssuesEntity, Long> {

}
