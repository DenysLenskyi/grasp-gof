package com.foxminded.patterns.behavioral.interpreter;

public class Main {
  public static void main(String[] args) {
    PizzaInterpreter pizzaInterpreter = new PizzaInterpreterImpl();
    pizzaInterpreter.cookCustomPizza("--pizza_name=Margo --add_ingredients=turkey,blueberry souse").printIngredients();
    System.out.println();
    pizzaInterpreter.cookCustomPizza("--pizza_name=Fungi --add_ingredients=cherry").printIngredients();
    System.out.println();
    pizzaInterpreter.cookCustomPizza("--pizza_name=Really plain pizza --add_ingredients=just bred").printIngredients();

  }
}
