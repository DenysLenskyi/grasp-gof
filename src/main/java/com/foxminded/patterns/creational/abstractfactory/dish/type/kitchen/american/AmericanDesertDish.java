package com.foxminded.patterns.creational.abstractfactory.dish.type.kitchen.american;

import com.foxminded.patterns.creational.abstractfactory.dish.type.DesertDish;
import com.foxminded.patterns.creational.abstractfactory.enums.DishType;

public class AmericanDesertDish extends DesertDish {

  private static final String CHEESECAKE = "Cheesecake";
  private static final String INGREDIENTS = "Mostly cheese and creme";

  public AmericanDesertDish() {
    super(DishType.DESERT, CHEESECAKE, INGREDIENTS);
  }
}
