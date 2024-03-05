package com.foxminded.patterns.behavioral.visitor.model.pizza;

import com.foxminded.patterns.behavioral.visitor.model.Visitor;
import com.foxminded.patterns.behavioral.visitor.model.ingredient.Ingredient;

import java.util.ArrayList;
import java.util.List;

public class PizzaImpl implements Pizza {

  private List<Ingredient> ingredients;

  public PizzaImpl() {
    this.ingredients = new ArrayList<>();
  }

  @Override
  public void accept(Visitor visitor) {
    this.ingredients.forEach(i -> i.accept(visitor));
  }

  @Override
  public void addIngredient(Ingredient ingredient) {
    this.ingredients.add(ingredient);
  }

  @Override
  public void printIngredients() {
    this.ingredients.forEach(i -> System.out.println(i.getName()));
  }
}
