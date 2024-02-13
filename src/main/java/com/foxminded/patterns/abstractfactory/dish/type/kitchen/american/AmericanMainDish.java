package com.foxminded.patterns.abstractfactory.dish.type.kitchen.american;

import com.foxminded.patterns.abstractfactory.dish.type.MainDish;
import com.foxminded.patterns.abstractfactory.enums.DishType;

public class AmericanMainDish extends MainDish {

  private static final String BURGER = "Burger";
  private static final String INGREDIENTS = "Beef, bread, french fries";

  public AmericanMainDish() {
    super(DishType.DESERT, BURGER, INGREDIENTS);
  }
}
