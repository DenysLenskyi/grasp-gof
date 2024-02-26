package com.foxminded.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class MarinaraCommand implements Command {
  @Override
  public Pizza cookPizza() {
    List<String> ingredients = new ArrayList<>();
    ingredients.add("Cheese");
    ingredients.add("Tomato");
    ingredients.add("Seafood");
    return new Pizza(ingredients);
  }
}
