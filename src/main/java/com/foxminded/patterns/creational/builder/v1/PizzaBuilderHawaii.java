package com.foxminded.patterns.creational.builder.v1;

public class PizzaBuilderHawaii extends PizzaBuilder {

  @Override
  public Pizza getPizza() {
    return super.getPizza()
        .addIngredient(Ingredients.BECKON)
        .addIngredient(Ingredients.MUSHROOMS)
        .addIngredient(Ingredients.PINEAPPLE);
  }
}
