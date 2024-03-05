package com.foxminded.patterns.behavioral.visitor.model;

import com.foxminded.patterns.behavioral.visitor.model.ingredient.*;

public interface Visitor {
  void visit(CheeseIngredient ingredient);

  void visit(BeckonIngredient ingredient);

  void visit(MushroomsIngredient ingredient);

  void visit(PineappleIngredient ingredient);

  void visit(SeafoodIngredient ingredient);
}
