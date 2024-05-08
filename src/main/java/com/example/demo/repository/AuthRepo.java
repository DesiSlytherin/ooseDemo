package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Authentication;

@Repository
public interface AuthRepo extends JpaRepository<Authentication, String>{
  Authentication findByUsernameAndPassword(String username, String password);
}