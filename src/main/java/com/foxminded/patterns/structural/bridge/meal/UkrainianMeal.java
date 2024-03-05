package com.foxminded.patterns.structural.bridge.meal;

import com.foxminded.patterns.structural.bridge.dish.Dish;
import com.foxminded.patterns.structural.bridge.dish.FirstDish;
import com.foxminded.patterns.structural.bridge.dish.SecondDish;
import com.foxminded.patterns.structural.bridge.dish.ThirdDish;

public class UkrainianMeal extends Meal {

  @Override
  public void addFirstDish(Dish dish) {
    dish = new FirstDish("Borsch");
    this.dishes.add(dish);
  }

  @Override
  public void addSecondDish(Dish dish) {
    dish = new SecondDish("Pierogies");
    this.dishes.add(dish);
  }

  @Override
  public void addThirdDish(Dish dish) {
    dish = new ThirdDish("Romova babka");
    this.dishes.add(dish);
  }
}
