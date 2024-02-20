package com.foxminded.patterns.structural.decorator;

public abstract class PizzaDecorator implements Pizza {

  protected Pizza decoratedPizza;

  public PizzaDecorator(Pizza decoratedPizza) {
    this.decoratedPizza = decoratedPizza;
  }

  @Override
  public void printIngredients() {
    decoratedPizza.printIngredients();
  }
}
