package com.foxminded.patterns.creational.builder;

public class PizzaBuilder {

  public Pizza getPizza() {
    Pizza pizza = new Pizza();
    return pizza
        .addIngredient(Ingredients.DOUGH)
        .addIngredient(Ingredients.SAUCE)
        .addIngredient(Ingredients.CHEESE);
  }
}
