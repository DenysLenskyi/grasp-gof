package com.foxminded.patterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
  private List<String> ingredients;

  public Pizza() {
    this.ingredients = new ArrayList<>();
  }

  public void addIngredient(String ingredient) {
    this.ingredients.add(ingredient);
  }

  public void printIngredients() {
    this.ingredients.forEach(System.out::println);
  }
}
