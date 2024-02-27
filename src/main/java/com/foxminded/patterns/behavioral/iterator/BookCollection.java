package com.foxminded.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection implements Collection {

  private List<Book> bookList;
  private Iterator iterator;

  public BookCollection() {
    this.bookList = new ArrayList<>();
    bookList.add(new Book("name1", "author1", 2024));
    bookList.add(new Book("name2", "author2", 2024));
    bookList.add(new Book("name3", "author3", 2024));
  }

  @Override
  public Iterator getIterator() {
    return iterator;
  }

  @Override
  public void setIterator(Iterator iterator) {
    this.iterator = iterator;
  }

  @Override
  public List<Book> getBookList() {
    return bookList;
  }
}