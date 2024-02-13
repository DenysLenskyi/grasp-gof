package com.foxminded.patterns.abstractfactory.dish.type.kitchen.ukrainian;

import com.foxminded.patterns.abstractfactory.dish.type.DesertDish;
import com.foxminded.patterns.abstractfactory.enums.DishType;

public class UkrainianDesertDish extends DesertDish {

  private static final String VARENYKI_WITH_CHERRY = "Cherry-Varenyki";
  private static final String INGREDIENTS = "Varenyki, cream";

  public UkrainianDesertDish() {
    super(DishType.DESERT, VARENYKI_WITH_CHERRY, INGREDIENTS);
  }
}
