package com.foxminded.patterns.abstractfactory.dish.type.kitchen.ukrainian;

import com.foxminded.patterns.abstractfactory.dish.type.MainDish;
import com.foxminded.patterns.abstractfactory.enums.DishType;

public class UkrainianMainDish extends MainDish {

  private static final String VARENYKI = "Varenyki";
  private static final String INGREDIENTS = "cabbage, egg, onion, salo";

  public UkrainianMainDish() {
    super(DishType.MAIN, VARENYKI, INGREDIENTS);
  }
}
