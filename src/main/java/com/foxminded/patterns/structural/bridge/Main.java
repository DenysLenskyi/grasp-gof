package com.foxminded.patterns.structural.bridge;

import com.foxminded.patterns.structural.bridge.kitchen.AmericanKitchen;
import com.foxminded.patterns.structural.bridge.kitchen.JapaneseKitchen;
import com.foxminded.patterns.structural.bridge.kitchen.Kitchen;
import com.foxminded.patterns.structural.bridge.kitchen.UkrainianKitchen;

public class Main {
  public static void main(String[] args) {
    Kitchen ukr = new UkrainianKitchen();
    ukr.cookMeal();
    System.out.println();

    Kitchen jap = new JapaneseKitchen();
    jap.cookMeal();
    System.out.println();

    Kitchen usa = new AmericanKitchen();
    usa.cookMeal();
  }
}
