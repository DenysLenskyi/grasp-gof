package com.foxminded.patterns.behavioral.state;

public class Main {
  public static void main(String[] args) {
    Stove stove = new StoveImpl();
    try {
      stove.cookPizza();
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }

    stove.getReadyForWork();
    stove.cookPizza();

    stove.coolDown();
    try {
      stove.cookPizza();
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }

    stove.overheat();

    stove.getReadyForWork();
    stove.overheat();
    try {
      stove.cookPizza();
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }

  }
}
