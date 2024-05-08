package com.example.demo.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
  @Id
  private int id;
  private String name;
  private int borrow;
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Integer getBorrow() {
    return borrow;
  }
  public void setBorrow(Integer borrow) {
    this.borrow = borrow;
  }
  public Book(int id, String name, Integer borrow) {
    this.id = id;
    this.name = name;
    this.borrow = borrow;
  }

  public Book(){

  }
}
