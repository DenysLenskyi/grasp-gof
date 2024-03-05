package com.foxminded.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class MarinaraCommand implements Command {
  @Override
  public void cookPizza(Pizza pizza) {
    pizza.addIngredient("Cheese");
    pizza.addIngredient("Tomato");
    pizza.addIngredient("Seafood");
  }
}
