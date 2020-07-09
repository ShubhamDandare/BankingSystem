package com.onlinexam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinexam.Entity.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
