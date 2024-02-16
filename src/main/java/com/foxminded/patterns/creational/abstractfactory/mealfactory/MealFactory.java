package com.foxminded.patterns.creational.abstractfactory.mealfactory;

import com.foxminded.patterns.creational.abstractfactory.dish.Dish;

import java.util.List;

/** This class is a part of Abstract Factory Pattern */
public interface MealFactory {

  List<Dish> getMeal();
}
