package com.foxminded.patterns.structural.bridge.kitchen;

import com.foxminded.patterns.structural.bridge.dish.Dish;
import com.foxminded.patterns.structural.bridge.dish.FirstDish;
import com.foxminded.patterns.structural.bridge.dish.SecondDish;
import com.foxminded.patterns.structural.bridge.dish.ThirdDish;

import java.util.ArrayList;
import java.util.List;

public class UkrainianKitchen implements Kitchen {

  private List<Dish> dishes;

  @Override
  public void cookMeal() {
    dishes = new ArrayList<>();
    dishes.add(new FirstDish("Borsch"));
    dishes.add(new SecondDish("Pierogies"));
    dishes.add(new ThirdDish("Romova babka"));

    System.out.println("Ukrainian meal");
    dishes.forEach(Dish::printDescription);
  }
}
