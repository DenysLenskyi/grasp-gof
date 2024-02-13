package com.foxminded.patterns.abstractfactory.mealfactory.kitchen;

import com.foxminded.patterns.abstractfactory.dish.Dish;
import com.foxminded.patterns.abstractfactory.dish.type.kitchen.ukrainian.UkrainianDesertDish;
import com.foxminded.patterns.abstractfactory.dish.type.kitchen.ukrainian.UkrainianMainDish;
import com.foxminded.patterns.abstractfactory.dish.type.kitchen.ukrainian.UkrainianSoupDish;
import com.foxminded.patterns.abstractfactory.mealfactory.MealFactory;

import java.util.List;

public class UkrainianMealFactory implements MealFactory {

  @Override
  public List<Dish> getMeal() {
    return List.of(new UkrainianSoupDish(), new UkrainianMainDish(), new UkrainianDesertDish());
  }
}
