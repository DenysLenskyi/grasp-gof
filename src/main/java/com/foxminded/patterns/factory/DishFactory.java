package com.foxminded.patterns.factory;

import com.foxminded.patterns.factory.dish.*;
import com.foxminded.patterns.factory.enums.DishType;

import java.util.List;

/** This class is a part of Factory Method Pattern */
public class DishFactory {

  public Dish createDish(DishType dishType, List<String> ingredients, String recipe) {
    return switch (dishType) {
      default -> null; // throw exception "no such dish type"
      case SOUP -> new SoupDish(ingredients, recipe);
      case SALAD -> new SaladDish(ingredients, recipe);
      case MAIN_DISH -> new MainDish(ingredients, recipe);
      case DESERT -> new DesertDish(ingredients, recipe);
    };
  }
}
