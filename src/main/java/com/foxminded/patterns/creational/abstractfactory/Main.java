package com.foxminded.patterns.creational.abstractfactory;

import com.foxminded.patterns.creational.abstractfactory.dish.Dish;
import com.foxminded.patterns.creational.abstractfactory.mealfactory.MealFactory;
import com.foxminded.patterns.creational.abstractfactory.mealfactory.kitchen.AmericanMealFactory;
import com.foxminded.patterns.creational.abstractfactory.mealfactory.kitchen.JapaneseMealFactory;
import com.foxminded.patterns.creational.abstractfactory.mealfactory.kitchen.UkrainianMealFactory;

import java.util.List;

public class Main {

  private static MealFactory mealFactory;

  public static void main(String[] args) {
    System.out.println("Ukrainian meal:");
    getUkrainianMeal().forEach(System.out::println);
    System.out.println();
    System.out.println("American meal:");
    getAmericanMeal().forEach(System.out::println);
    System.out.println();
    System.out.println("Japanese meal:");
    getJapaneseMeal().forEach(System.out::println);
  }

  private static List<Dish> getUkrainianMeal() {
    mealFactory = new UkrainianMealFactory();
    return mealFactory.getMeal();
  }

  private static List<Dish> getAmericanMeal() {
    mealFactory = new AmericanMealFactory();
    return mealFactory.getMeal();
  }

  private static List<Dish> getJapaneseMeal() {
    mealFactory = new JapaneseMealFactory();
    return mealFactory.getMeal();
  }
}
