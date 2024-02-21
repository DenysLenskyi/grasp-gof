package com.foxminded.patterns.creational.builder;

public class PizzaBuilderSeafood extends PizzaBuilder {

  public Pizza getSeafoodPizza() {
    return getPizza().addIngredient(Ingredients.SEAFOOD);
  }
}
