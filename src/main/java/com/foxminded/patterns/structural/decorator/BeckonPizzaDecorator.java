package com.foxminded.patterns.structural.decorator;

public class BeckonPizzaDecorator extends PizzaDecorator {

  public BeckonPizzaDecorator(Pizza decoratedPizza) {
    super(decoratedPizza);
  }

  @Override
  public void printIngredients() {
    decoratedPizza.printIngredients();
    addBeckon();
  }

  private void addBeckon() {
    System.out.println("Beckon");
  }
}
