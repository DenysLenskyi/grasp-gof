package com.foxminded.patterns.creational.abstractfactory.mealfactory.kitchen;

import com.foxminded.patterns.creational.abstractfactory.dish.Dish;
import com.foxminded.patterns.creational.abstractfactory.dish.type.kitchen.american.AmericanDesertDish;
import com.foxminded.patterns.creational.abstractfactory.dish.type.kitchen.american.AmericanMainDish;
import com.foxminded.patterns.creational.abstractfactory.dish.type.kitchen.american.AmericanSoupDish;
import com.foxminded.patterns.creational.abstractfactory.mealfactory.MealFactory;
import java.util.List;

public class AmericanMealFactory implements MealFactory {

  @Override
  public List<Dish> getMeal() {
    return List.of(new AmericanSoupDish(), new AmericanMainDish(), new AmericanDesertDish());
  }
}
