package com.foxminded.patterns.behavioral.state;

public class Main {
  public static void main(String[] args) {
    Stove stove = new StoveImpl();
    try {
      stove.cookPizza();
    } catch (RuntimeException e) {
      System.out.println("Exception handled - " + e.getMessage());
    }
    stove.getReady();
    int i = 0;
    while (i < 11) {
      stove.cookPizza();
      i++;
    }
    try {
      stove.cookPizza();
    } catch (RuntimeException e) {
      System.out.println("Exeption handled - " + e.getMessage());
    }

    stove.coolDown();

    try {
      stove.cookPizza();
    } catch (RuntimeException e) {
      System.out.println("Exception handled");
      System.out.println(e.getMessage());
    }
  }
}
