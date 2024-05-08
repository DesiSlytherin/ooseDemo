package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookRepo;

@Service
public class BookService {
  @Autowired
  private BookRepo repo;
  
  public String getBook(int id){
    Book book = repo.findById(id);
    if(book.getBorrow() == 1)
      return "Book not available";
    else
    {
      book.setBorrow(1);
      repo.save(book);
      return "Book borrowed successfully";
    }
  }

  public String giveBook(int id){
    Book book = repo.findById(id);
    if(book.getBorrow() == 0)
      return "Invalid book";
    else
    {
      book.setBorrow(0);
      repo.save(book);
      return "Book returned successfully";
    }
  }
}