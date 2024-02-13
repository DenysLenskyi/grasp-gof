package com.foxminded.patterns.abstractfactory.dish.type.kitchen.japanese;

import com.foxminded.patterns.abstractfactory.dish.type.SoupDish;
import com.foxminded.patterns.abstractfactory.enums.DishType;

public class JapaneseSoupDish extends SoupDish {

  private static final String MISO_SOUP = "Miso soup";
  private static final String INGREDIENTS = "Water, seaweed";

  public JapaneseSoupDish() {
    super(DishType.SOUP, MISO_SOUP, INGREDIENTS);
  }
}
