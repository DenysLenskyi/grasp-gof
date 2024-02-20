package com.foxminded.patterns.creational.factorymethod.dish;

import com.foxminded.patterns.creational.factorymethod.enums.DishType;
import java.util.List;

/**
 * This class is a part of Factory Method Pattern
 */
public class DesertDish extends Dish {
  public DesertDish(List<String> ingredients, String recipe) {
    super(DishType.DESERT, ingredients, recipe);
  }
}
