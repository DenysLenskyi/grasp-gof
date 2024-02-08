package com.foxminded.patterns.factory.dish;

import com.foxminded.patterns.factory.enums.DishType;
import java.util.List;

/**
 * This class is a part of Factory Method Pattern
 */
public class SaladDish extends Dish {
  public SaladDish(List<String> ingredients, String recipe) {
    super(DishType.SALAD, ingredients, recipe);
  }
}
