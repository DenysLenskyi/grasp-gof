package com.foxminded.patterns.structural.bridge;

import com.foxminded.patterns.structural.bridge.dish.Dish;
import com.foxminded.patterns.structural.bridge.meal.AmericanMeal;
import com.foxminded.patterns.structural.bridge.meal.JapaneseMeal;
import com.foxminded.patterns.structural.bridge.meal.Meal;
import com.foxminded.patterns.structural.bridge.meal.UkrainianMeal;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Meal ukr = new UkrainianMeal();
    ukr.addFirstDish(new Dish());
    ukr.addSecondDish(new Dish());
    ukr.addThirdDish(new Dish());

    Meal usa = new AmericanMeal();
    usa.addFirstDish(new Dish());
    usa.addSecondDish(new Dish());
    usa.addThirdDish(new Dish());

    Meal jap = new JapaneseMeal();
    jap.addFirstDish(new Dish());
    jap.addSecondDish(new Dish());
    jap.addThirdDish(new Dish());

    List<Meal> meals = List.of(ukr, jap, usa);
    meals.forEach(Meal::printMeal);
  }
}
