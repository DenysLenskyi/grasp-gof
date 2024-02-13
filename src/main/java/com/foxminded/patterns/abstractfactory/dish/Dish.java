package com.foxminded.patterns.abstractfactory.dish;

import com.foxminded.patterns.abstractfactory.enums.DishType;

/** This class is a part of Abstract Factory Pattern */
public class Dish {

  private DishType dishType;
  private String name;
  private String ingredients;

  public Dish(DishType dishType, String name, String ingredients) {
    this.dishType = dishType;
    this.name = name;
    this.ingredients = ingredients;
  }

  public DishType getDishType() {
    return dishType;
  }

  public void setDishType(DishType dishType) {
    this.dishType = dishType;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIngredients() {
    return ingredients;
  }

  public void setIngredients(String ingredients) {
    this.ingredients = ingredients;
  }

  @Override
  public String toString() {
    return "Dish{"
        + "dishType="
        + dishType
        + ", name='"
        + name
        + '\''
        + ", ingredients='"
        + ingredients
        + '\''
        + '}';
  }
}
