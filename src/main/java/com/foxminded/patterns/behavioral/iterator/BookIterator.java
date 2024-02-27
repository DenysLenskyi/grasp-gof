package com.foxminded.patterns.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator {

  protected List<Book> bookArray;

  protected int pos = 0;

  public BookIterator(List<Book> bookArray) {
    this.bookArray = bookArray;
  }

  @Override
  public boolean hasNext() {
    if (pos >= bookArray.size() || bookArray.get(pos) == null) {
      return false;
    } else {
      return true;
    }
  }

  @Override
  public Object next() {
    Book book = bookArray.get(pos);
    pos += 1;
    return book;
  }
}
