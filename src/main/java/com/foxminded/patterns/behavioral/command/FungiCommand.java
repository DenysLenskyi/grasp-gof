package com.foxminded.patterns.behavioral.command;

public class FungiCommand implements Command {
  @Override
  public void cookPizza(Pizza pizza) {
    pizza.addIngredient("Cheese");
    pizza.addIngredient("Mushrooms");
  }
}
