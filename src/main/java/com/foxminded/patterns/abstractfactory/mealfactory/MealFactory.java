package com.foxminded.patterns.abstractfactory.mealfactory;

import com.foxminded.patterns.abstractfactory.dish.Dish;

import java.util.List;

/** This class is a part of Abstract Factory Pattern */
public interface MealFactory {

  List<Dish> getMeal();
}
