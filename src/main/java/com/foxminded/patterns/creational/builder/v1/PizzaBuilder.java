package com.foxminded.patterns.creational.builder.v1;

public class PizzaBuilder {

  public Pizza getPizza() {
    Pizza pizza = new Pizza();
    return pizza
        .addIngredient(Ingredients.DOUGH)
        .addIngredient(Ingredients.SAUCE)
        .addIngredient(Ingredients.CHEESE);
  }
}
