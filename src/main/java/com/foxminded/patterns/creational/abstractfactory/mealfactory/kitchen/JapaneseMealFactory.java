package com.foxminded.patterns.creational.abstractfactory.mealfactory.kitchen;

import com.foxminded.patterns.creational.abstractfactory.dish.Dish;
import com.foxminded.patterns.creational.abstractfactory.dish.type.kitchen.japanese.JapaneseDesertDish;
import com.foxminded.patterns.creational.abstractfactory.dish.type.kitchen.japanese.JapaneseMainDish;
import com.foxminded.patterns.creational.abstractfactory.dish.type.kitchen.japanese.JapaneseSoupDish;
import com.foxminded.patterns.creational.abstractfactory.mealfactory.MealFactory;
import java.util.List;

public class JapaneseMealFactory implements MealFactory {

  @Override
  public List<Dish> getMeal() {
    return List.of(new JapaneseSoupDish(), new JapaneseMainDish(), new JapaneseDesertDish());
  }
}
