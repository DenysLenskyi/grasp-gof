package com.foxminded.patterns.abstractfactory.dish.type;

import com.foxminded.patterns.abstractfactory.dish.Dish;
import com.foxminded.patterns.abstractfactory.enums.DishType;

/** This class is a part of Abstract Factory Pattern */
public class DesertDish extends Dish {

  public DesertDish(DishType dishType, String name, String ingredients) {
    super(dishType, name, ingredients);
  }
}
