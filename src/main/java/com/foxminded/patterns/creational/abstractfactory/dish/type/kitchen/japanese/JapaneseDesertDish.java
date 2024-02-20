package com.foxminded.patterns.creational.abstractfactory.dish.type.kitchen.japanese;

import com.foxminded.patterns.creational.abstractfactory.dish.type.DesertDish;
import com.foxminded.patterns.creational.abstractfactory.enums.DishType;

public class JapaneseDesertDish extends DesertDish {

  private static final String CARAMEL_APPLE = "Caramel apple";
  private static final String INGREDIENTS = "Caramel, apple";

  public JapaneseDesertDish() {
    super(DishType.DESERT, CARAMEL_APPLE, INGREDIENTS);
  }
}
