package com.foxminded.patterns.factorymethod.dish;

import com.foxminded.patterns.factorymethod.enums.DishType;

import java.util.List;

/**
 * This class is a part of Factory Method Pattern
 */
public class MainDish extends Dish {
  public MainDish(List<String> ingredients, String recipe) {
    super(DishType.MAIN_DISH, ingredients, recipe);
  }
}
