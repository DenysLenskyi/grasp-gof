package com.foxminded.patterns.abstractfactory.dish.type.kitchen.ukrainian;

import com.foxminded.patterns.abstractfactory.dish.type.SoupDish;
import com.foxminded.patterns.abstractfactory.enums.DishType;

public class UkrainianSoupDish extends SoupDish {

  private static final String BORSCH = "Borsch";
  private static final String INGREDIENTS = "Onion, carrot, cabbage, beetroot, tomato";

  public UkrainianSoupDish() {
    super(DishType.SOUP, BORSCH, INGREDIENTS);
  }
}
