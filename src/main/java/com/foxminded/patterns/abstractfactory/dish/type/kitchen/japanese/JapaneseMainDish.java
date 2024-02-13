package com.foxminded.patterns.abstractfactory.dish.type.kitchen.japanese;

import com.foxminded.patterns.abstractfactory.dish.type.MainDish;
import com.foxminded.patterns.abstractfactory.enums.DishType;

public class JapaneseMainDish extends MainDish {

  private static final String SUSHI = "Sushi";
  private static final String INGREDIENTS = "Fish, rice";

  public JapaneseMainDish() {
    super(DishType.MAIN, SUSHI, INGREDIENTS);
  }
}
