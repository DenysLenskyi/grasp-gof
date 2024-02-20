package com.foxminded.patterns.structural.decorator;

public class CheesePizza implements Pizza {

  @Override
  public void printIngredients() {
    System.out.println("Cheese");
  }
}
