package com.foxminded.patterns.behavioral.iterator;

import java.util.List;

public class BookIteratorName extends BookIterator {

  public BookIteratorName(List<Book> bookArray) {
    super(bookArray);
  }

  @Override
  public Object next() {
    Book book = bookArray.get(pos);
    pos += 1;
    return book.getName();
  }
}
