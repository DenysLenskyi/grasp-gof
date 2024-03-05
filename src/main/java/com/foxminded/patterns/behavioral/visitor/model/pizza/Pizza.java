package com.foxminded.patterns.behavioral.visitor.model.pizza;

import com.foxminded.patterns.behavioral.visitor.model.Visitor;
import com.foxminded.patterns.behavioral.visitor.model.ingredient.Ingredient;

public interface Pizza {
  void accept(Visitor visitor);

  void addIngredient(Ingredient ingredient);

  void printIngredients();
}
