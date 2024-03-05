package com.foxminded.patterns.behavioral.visitor.model;

import com.foxminded.patterns.behavioral.visitor.model.ingredient.*;

public class IngredientVisitor implements Visitor {

  @Override
  public void visit(CheeseIngredient ingredient) {
    ingredient.setName("Cheese");
  }

  @Override
  public void visit(BeckonIngredient ingredient) {
    ingredient.setName("Beckon");
  }

  @Override
  public void visit(MushroomsIngredient ingredient) {
    ingredient.setName("Mushrooms");
  }

  @Override
  public void visit(PineappleIngredient ingredient) {
    ingredient.setName("Pineapple");
  }

  @Override
  public void visit(SeafoodIngredient ingredient) {
    ingredient.setName("Seafood");
  }
}
