package com.foxminded.patterns.structural.bridge.dish;

import com.foxminded.patterns.structural.bridge.enums.DishType;

public class ThirdDish extends Dish {

  public ThirdDish(String name) {
    super(name, DishType.THIRD);
  }
}
