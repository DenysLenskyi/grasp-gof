package com.foxminded.patterns.factory;

import com.foxminded.patterns.factory.dish.Dish;
import com.foxminded.patterns.factory.enums.DishType;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    DishFactory dishFactory = new DishFactory();
    Dish soup = dishFactory.createDish(DishType.SOUP, List.of("Water", "Onions", "Pepper"), "Boil");
    Dish salad =
        dishFactory.createDish(
            DishType.SALAD, List.of("Cucumber", "Onions", "Tomato", "Oil"), "Slice and mix");
    Dish mainDish =
        dishFactory.createDish(DishType.MAIN_DISH, List.of("Potato", "Sausage", "Souse"), "Fry");
    Dish desert =
        dishFactory.createDish(
            DishType.DESERT, List.of("Cream", "Dove", "Berries"), "Well, its complicated");
    System.out.println(soup.toString());
    System.out.println(salad.toString());
    System.out.println(desert.toString());
    System.out.println(mainDish.toString());
  }
}
