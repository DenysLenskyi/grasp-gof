package com.foxminded.patterns.behavioral.command;

public class Main {
  public static void main(String[] args) {
    Waiter waiter = new Waiter();
    waiter.getCommand("Margo").cookPizza().printIngredients();
    System.out.println();
    waiter.getCommand("Marinara").cookPizza().printIngredients();
    System.out.println();
    waiter.getCommand("Fungi").cookPizza().printIngredients();
    System.out.println();
    waiter.getCommand("Abrakadabra").cookPizza().printIngredients();
  }
}
