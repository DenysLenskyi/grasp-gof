package com.foxminded.patterns.structural.decorator;

public class PineapplePizzaDecorator extends PizzaDecorator {

  public PineapplePizzaDecorator(Pizza decoratedPizza) {
    super(decoratedPizza);
  }

  @Override
  public void printIngredients() {
    decoratedPizza.printIngredients();
    addPineapple();
  }

  private void addPineapple() {
    System.out.println("Pineapple");
  }
}
