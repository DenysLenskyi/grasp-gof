package com.foxminded.patterns.behavioral.command;

public class Main {
  public static void main(String[] args) {
    Waiter waiter = new Waiter();
    Pizza pizza = new Pizza();
    waiter.getCommand("Margo").cookPizza(pizza);
    pizza.printIngredients();
    System.out.println();
    Pizza pizza2 = new Pizza();
    waiter.getCommand("Marinara").cookPizza(pizza2);
    pizza2.printIngredients();
    System.out.println();
    Pizza pizza3 = new Pizza();
    waiter.getCommand("Fungi").cookPizza(pizza3);
    pizza3.printIngredients();
    System.out.println();
    Pizza pizza4 = new Pizza();
    waiter.getCommand("Abrakadabra").cookPizza(pizza4);
    pizza4.printIngredients();
  }
}
