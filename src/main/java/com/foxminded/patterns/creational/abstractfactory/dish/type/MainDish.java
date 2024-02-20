package com.foxminded.patterns.creational.abstractfactory.dish.type;

import com.foxminded.patterns.creational.abstractfactory.dish.Dish;
import com.foxminded.patterns.creational.abstractfactory.enums.DishType;

/** This class is a part of Abstract Factory Pattern */
public class MainDish extends Dish {

  public MainDish(DishType dishType, String name, String ingredients) {
    super(dishType, name, ingredients);
  }
}
