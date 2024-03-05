package com.foxminded.patterns.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

public class CustomPizzaRecipe {

  private String pizzaName;
  private List<String> ingredients;

  public CustomPizzaRecipe() {
    this.ingredients = new ArrayList<>();
  }

  public String getPizzaName() {
    return pizzaName;
  }

  public void setPizzaName(String pizzaName) {
    this.pizzaName = pizzaName;
  }

  public List<String> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<String> ingredients) {
    this.ingredients = ingredients;
  }
}
