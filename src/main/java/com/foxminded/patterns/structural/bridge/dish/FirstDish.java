package com.foxminded.patterns.structural.bridge.dish;

import com.foxminded.patterns.structural.bridge.enums.DishType;

public class FirstDish extends Dish {

  public FirstDish(String name) {
    super(name, DishType.FIRST);
  }
}
