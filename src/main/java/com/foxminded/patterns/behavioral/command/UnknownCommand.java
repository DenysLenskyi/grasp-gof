package com.foxminded.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class UnknownCommand implements Command {
  @Override
  public Pizza cookPizza() {
    List<String> ingredients = new ArrayList<>();
    ingredients.add("unknown...");
    return new Pizza(ingredients);
  }
}
