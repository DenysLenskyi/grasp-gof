package com.foxminded.patterns.structural.bridge.kitchen;

import com.foxminded.patterns.structural.bridge.dish.Dish;
import com.foxminded.patterns.structural.bridge.dish.FirstDish;
import com.foxminded.patterns.structural.bridge.dish.SecondDish;
import com.foxminded.patterns.structural.bridge.dish.ThirdDish;
import java.util.ArrayList;
import java.util.List;

public class JapaneseKitchen implements Kitchen {

  private List<Dish> dishes;

  @Override
  public void cookMeal() {
    dishes = new ArrayList<>();
    dishes.add(new FirstDish("Miso soup"));
    dishes.add(new SecondDish("Teryaki chicken"));
    dishes.add(new ThirdDish("Sakura cheese cake"));

    System.out.println("Japanese meal");
    dishes.forEach(Dish::printDescription);
  }
}
