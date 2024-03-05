package com.foxminded.patterns.behavioral.interpreter;

public class RecipeParser {

  public CustomPizzaRecipe parse(String recipe) {
    CustomPizzaRecipe customPizzaRecipe = new CustomPizzaRecipe();

    String[] recipeCommands = recipe.split("--");

    for (String str : recipeCommands) {
      if (str.contains("pizza_name")) {
        customPizzaRecipe.setPizzaName(str.split("=")[1].trim());
      } else if (str.contains("add_ingredients")) {
        for (String ingredient : str.split("=")[1].split(",")) {
          customPizzaRecipe.getIngredients().add(ingredient.trim());
        }
      }
    }

    return customPizzaRecipe;
  }
}
