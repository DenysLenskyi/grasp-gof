package com.foxminded.patterns.behavioral.visitor.model.ingredient;

import com.foxminded.patterns.behavioral.visitor.model.Visitor;

public class SeafoodIngredient implements Ingredient {

  private String name;

  public SeafoodIngredient() {}

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
