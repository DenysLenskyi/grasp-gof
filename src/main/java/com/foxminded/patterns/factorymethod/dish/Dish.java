package com.foxminded.patterns.factorymethod.dish;

import com.foxminded.patterns.factorymethod.enums.DishType;

import java.util.List;

/**
 * This class is a part of Factory Method Pattern
 */
public class Dish {
  private DishType dishType;
  private List<String> ingredients;
  private String recipe;

  public Dish() {}

  public Dish(DishType dishType, List<String> ingredients, String recipe) {
    this.dishType = dishType;
    this.ingredients = ingredients;
    this.recipe = recipe;
  }

  public DishType getDishType() {
    return dishType;
  }

  public void setDishType(DishType dishType) {
    this.dishType = dishType;
  }

  public List<String> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<String> ingredients) {
    this.ingredients = ingredients;
  }

  public String getRecipe() {
    return recipe;
  }

  public void setRecipe(String recipe) {
    this.recipe = recipe;
  }

  @Override
  public String toString() {
    return "Dish{"
        + "dishType="
        + dishType
        + ", ingredients="
        + ingredients
        + ", recipe='"
        + recipe
        + '\''
        + ", class = "
        + this.getClass()
        + '}';
  }
}
