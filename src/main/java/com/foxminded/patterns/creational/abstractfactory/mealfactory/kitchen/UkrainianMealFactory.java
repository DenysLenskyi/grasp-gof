package com.foxminded.patterns.creational.abstractfactory.mealfactory.kitchen;

import com.foxminded.patterns.creational.abstractfactory.dish.Dish;
import com.foxminded.patterns.creational.abstractfactory.dish.type.kitchen.ukrainian.UkrainianDesertDish;
import com.foxminded.patterns.creational.abstractfactory.dish.type.kitchen.ukrainian.UkrainianMainDish;
import com.foxminded.patterns.creational.abstractfactory.dish.type.kitchen.ukrainian.UkrainianSoupDish;
import com.foxminded.patterns.creational.abstractfactory.mealfactory.MealFactory;

import java.util.List;

public class UkrainianMealFactory implements MealFactory {

  @Override
  public List<Dish> getMeal() {
    return List.of(new UkrainianSoupDish(), new UkrainianMainDish(), new UkrainianDesertDish());
  }
}
