package com.foxminded.patterns.structural.decorator;

public class SeafoodPizzaDecorator extends PizzaDecorator {

  public SeafoodPizzaDecorator(Pizza decoratedPizza) {
    super(decoratedPizza);
  }

  @Override
  public void printIngredients() {
    decoratedPizza.printIngredients();
    addSeafood();
  }

  private void addSeafood() {
    System.out.println("Seafood");
  }
}
