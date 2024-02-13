package com.foxminded.patterns.abstractfactory.mealfactory.kitchen;

import com.foxminded.patterns.abstractfactory.dish.Dish;
import com.foxminded.patterns.abstractfactory.dish.type.kitchen.japanese.JapaneseDesertDish;
import com.foxminded.patterns.abstractfactory.dish.type.kitchen.japanese.JapaneseMainDish;
import com.foxminded.patterns.abstractfactory.dish.type.kitchen.japanese.JapaneseSoupDish;
import com.foxminded.patterns.abstractfactory.mealfactory.MealFactory;
import java.util.List;

public class JapaneseMealFactory implements MealFactory {

  @Override
  public List<Dish> getMeal() {
    return List.of(new JapaneseSoupDish(), new JapaneseMainDish(), new JapaneseDesertDish());
  }
}
