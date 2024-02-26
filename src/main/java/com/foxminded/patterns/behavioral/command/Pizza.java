package com.foxminded.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
  private List<String> ingredients;

  public Pizza(List<String> ingredients) {
    this.ingredients = ingredients;
  }

  public void printIngredients() {
    this.ingredients.forEach(System.out::println);
  }
}
