package com.foxminded.patterns.creational.builder.v1;

public class PizzaBuilderSeafood extends PizzaBuilder {

  public Pizza getSeafoodPizza() {
    return getPizza().addIngredient(Ingredients.SEAFOOD);
  }
}
