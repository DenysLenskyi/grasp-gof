package com.foxminded.patterns.behavioral.visitor;

import com.foxminded.patterns.behavioral.visitor.model.IngredientVisitor;
import com.foxminded.patterns.behavioral.visitor.model.Visitor;
import com.foxminded.patterns.behavioral.visitor.model.ingredient.BeckonIngredient;
import com.foxminded.patterns.behavioral.visitor.model.ingredient.CheeseIngredient;
import com.foxminded.patterns.behavioral.visitor.model.pizza.Pizza;
import com.foxminded.patterns.behavioral.visitor.model.pizza.PizzaImpl;

public class Main {
  public static void main(String[] args) {
    Pizza pizza = new PizzaImpl();
    pizza.addIngredient(new BeckonIngredient());
    pizza.addIngredient(new CheeseIngredient());
    Visitor visitor = new IngredientVisitor();
    pizza.accept(visitor);
    pizza.printIngredients();
  }
}
