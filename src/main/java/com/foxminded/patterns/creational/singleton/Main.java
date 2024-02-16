package com.foxminded.patterns.creational.singleton;

public class Main {
  public static void main(String[] args) {
    ReallySingleObject reallySingleObject = ReallySingleObject.getInstance(9);
    System.out.println(reallySingleObject.toString());
  }
}
