package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Book;


@Repository
public interface BookRepo extends JpaRepository<Book, Integer>{
  Book  findById(int id);
}