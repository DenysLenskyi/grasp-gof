package com.foxminded.patterns.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public interface Collection {

  Iterator getIterator();

  void setIterator(Iterator iterator);

  List<Book> getBookList();
}
