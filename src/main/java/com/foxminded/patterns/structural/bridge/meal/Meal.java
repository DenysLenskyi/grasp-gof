package com.foxminded.patterns.structural.bridge.meal;

import com.foxminded.patterns.structural.bridge.dish.Dish;

import java.util.ArrayList;
import java.util.List;

public class Meal {

  protected List<Dish> dishes;

  public Meal() {
    this.dishes = new ArrayList<>();
  }

  public void printMeal() {
    this.dishes.forEach(Dish::printDescription);
  }

  public void addFirstDish(Dish dish) {
    this.dishes.add(dish);
  }

  public void addSecondDish(Dish dish) {
    this.dishes.add(dish);
  }

  public void addThirdDish(Dish dish) {
    this.dishes.add(dish);
  }
}