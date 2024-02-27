package com.foxminded.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
  private List<String> ingredients;

  public Pizza() {}

  public Pizza(List<String> ingredients) {
    this.ingredients = ingredients;
  }

  public void printIngredients() {
    this.ingredients.forEach(System.out::println);
  }

  public void addIngredient(String ingredient) {
    if (this.ingredients == null) {
      ingredients = new ArrayList<>();
    }
    this.ingredients.add(ingredient);
  }
}
