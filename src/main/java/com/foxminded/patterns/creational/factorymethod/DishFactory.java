package com.foxminded.patterns.creational.factorymethod;

import com.foxminded.patterns.creational.factorymethod.dish.*;
import com.foxminded.patterns.creational.factorymethod.enums.DishType;

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
