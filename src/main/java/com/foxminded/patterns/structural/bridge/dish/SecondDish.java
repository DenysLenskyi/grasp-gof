package com.foxminded.patterns.structural.bridge.dish;

import com.foxminded.patterns.structural.bridge.enums.DishType;

public class SecondDish extends Dish {

  public SecondDish(String name) {
    super(name, DishType.SECOND);
  }
}
