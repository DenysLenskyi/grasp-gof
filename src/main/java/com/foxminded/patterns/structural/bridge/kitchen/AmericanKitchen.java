package com.foxminded.patterns.structural.bridge.kitchen;

import com.foxminded.patterns.structural.bridge.dish.Dish;
import com.foxminded.patterns.structural.bridge.dish.FirstDish;
import com.foxminded.patterns.structural.bridge.dish.SecondDish;
import com.foxminded.patterns.structural.bridge.dish.ThirdDish;
import java.util.ArrayList;
import java.util.List;

public class AmericanKitchen implements Kitchen {

  private List<Dish> dishes;

  @Override
  public void cookMeal() {
    dishes = new ArrayList<>();
    dishes.add(new FirstDish("Mushroom-potato soup"));
    dishes.add(new SecondDish("Club sandwich"));
    dishes.add(new ThirdDish("Classic cheesecake"));

    System.out.println("American meal");
    dishes.forEach(Dish::printDescription);
  }
}
