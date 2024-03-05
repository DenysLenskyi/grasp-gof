package com.foxminded.patterns.behavioral.interpreter;

import com.foxminded.patterns.behavioral.command.Pizza;
import com.foxminded.patterns.behavioral.command.Waiter;

import java.util.List;

/**
 * input pattern: "--pizza_name=<name>
 * --add_ingredients=<ingredient1>,<ingredient2>,<ingredient3>..."
 */
public class PizzaInterpreterImpl implements PizzaInterpreter {

  @Override
  public Pizza cookCustomPizza(String recipe) {
    Pizza pizza = null;
    Waiter waiter = new Waiter();
    RecipeParser recipeParser = new RecipeParser();
    CustomPizzaRecipe customPizzaRecipe = recipeParser.parse(recipe);

    switch (customPizzaRecipe.getPizzaName()) {
      case "Margo" ->
          pizza =
              makeCustomPizza(
                  waiter, customPizzaRecipe.getPizzaName(), customPizzaRecipe.getIngredients());

      case "Fungi" ->
          pizza =
              makeCustomPizza(
                  waiter, customPizzaRecipe.getPizzaName(), customPizzaRecipe.getIngredients());
      case "Marinara" ->
          pizza =
              makeCustomPizza(
                  waiter, customPizzaRecipe.getPizzaName(), customPizzaRecipe.getIngredients());
      default -> {
        pizza = new Pizza();
        customPizzaRecipe.getIngredients().forEach(pizza::addIngredient);
      }
    }
    return pizza;
  }

  private Pizza makeCustomPizza(Waiter waiter, String name, List<String> ingredients) {
    Pizza pizza = new Pizza();
    waiter.getCommand(name).cookPizza(pizza);
    ingredients.forEach(pizza::addIngredient);
    return pizza;
  }
}
