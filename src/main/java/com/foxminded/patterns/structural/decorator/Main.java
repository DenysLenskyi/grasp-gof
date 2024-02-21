package com.foxminded.patterns.structural.decorator;

public class Main {
  public static void main(String[] args) {
    Pizza pizza =
        new BeckonPizzaDecorator(
            new MushroomsPizzaDecorator(
                new PineapplePizzaDecorator(new SeafoodPizzaDecorator(new CheesePizza()))));
    pizza.printIngredients();
  }
}
