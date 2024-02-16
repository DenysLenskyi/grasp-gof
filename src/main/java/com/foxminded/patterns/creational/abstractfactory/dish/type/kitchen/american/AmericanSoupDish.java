package com.foxminded.patterns.creational.abstractfactory.dish.type.kitchen.american;

import com.foxminded.patterns.creational.abstractfactory.dish.type.SoupDish;
import com.foxminded.patterns.creational.abstractfactory.enums.DishType;

public class AmericanSoupDish extends SoupDish {

  private static final String SOUP = "Soup";
  private static final String INGREDIENTS = "U dont need a soup. Better get another burger";

  public AmericanSoupDish() {
    super(DishType.DESERT, SOUP, INGREDIENTS);
  }
}
