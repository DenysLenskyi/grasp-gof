package com.foxminded.patterns.structural.decorator;

public class MushroomsPizzaDecorator extends PizzaDecorator {

  public MushroomsPizzaDecorator(Pizza decoratedPizza) {
    super(decoratedPizza);
  }

  @Override
  public void printIngredients() {
    decoratedPizza.printIngredients();
    addMushrooms();
  }

  private void addMushrooms() {
    System.out.println("Mushrooms");
  }
}
