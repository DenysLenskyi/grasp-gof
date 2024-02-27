package com.foxminded.patterns.behavioral.iterator;

public class Main {
  public static void main(String[] args) {
    Collection bookCollection = new BookCollection();

    bookCollection.setIterator(new BookIteratorName(bookCollection.getBookList()));
    while (bookCollection.getIterator().hasNext()) {
      String str = (String) bookCollection.getIterator().next();
      System.out.println(str);
    }
    System.out.println();

    bookCollection.setIterator(new BookIteratorAuthor(bookCollection.getBookList()));
    while (bookCollection.getIterator().hasNext()) {
      String str = (String) bookCollection.getIterator().next();
      System.out.println(str);
    }
    System.out.println();

    bookCollection.setIterator(new BookIteratorYear(bookCollection.getBookList()));
    while (bookCollection.getIterator().hasNext()) {
      String str = String.valueOf(bookCollection.getIterator().next());
      System.out.println(str);
    }
  }
}
