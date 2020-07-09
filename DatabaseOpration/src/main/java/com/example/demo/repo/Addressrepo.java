package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Address;

public interface Addressrepo extends JpaRepository<Address, Long> {

}
