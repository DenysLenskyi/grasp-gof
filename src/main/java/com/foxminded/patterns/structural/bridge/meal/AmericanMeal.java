package com.foxminded.patterns.structural.bridge.meal;

import com.foxminded.patterns.structural.bridge.dish.Dish;
import com.foxminded.patterns.structural.bridge.dish.FirstDish;
import com.foxminded.patterns.structural.bridge.dish.SecondDish;
import com.foxminded.patterns.structural.bridge.dish.ThirdDish;

public class AmericanMeal extends Meal {

  @Override
  public void addFirstDish(Dish dish) {
    dish = new FirstDish("Pork bone soup");
    this.dishes.add(dish);
  }

  @Override
  public void addSecondDish(Dish dish) {
    dish = new SecondDish("Burger");
    this.dishes.add(dish);
  }

  @Override
  public void addThirdDish(Dish dish) {
    dish = new ThirdDish("Classic cheesecake");
    this.dishes.add(dish);
  }
}
