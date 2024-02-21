package com.foxminded.patterns.structural.bridge.dish;

import com.foxminded.patterns.structural.bridge.enums.DishType;

public class Dish {
  private String name;
  private DishType dishType;

  public Dish(String name, DishType dishType) {
    this.name = name;
    this.dishType = dishType;
  }

  public void printDescription() {
    System.out.println(dishType + " : " + name);
  }
}
