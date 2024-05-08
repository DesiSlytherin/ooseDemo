package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Book;
import com.example.demo.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {
  @Autowired
  private BookService service;

  @PostMapping("/borrow")
  public String borrowBook(Book book)
  {
    String status = service.getBook(book.getId());
    if(status.equals("Book borrowed successfully"))
      return "redirect:/disp";
    else
      return "redirect:/";
  }

  @PostMapping("/return")
  public String returnBook(Book book)
  {
    String status = service.giveBook(book.getId());
    if(status.equals("Book returned successfully"))
      return "redirect:/disp";
    else
      return "redirect:/";
  }
}