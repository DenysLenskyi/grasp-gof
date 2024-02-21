package com.foxminded.patterns.creational.builder;

public class Main {
  public static void main(String[] args) {

    PizzaBuilder pizzaBuilder = new PizzaBuilder();
    Pizza basePizza = pizzaBuilder.getPizza();
    System.out.println("base pizza : " + basePizza.toString());

    PizzaBuilder builderHawaii = new PizzaBuilderHawaii();
    System.out.println("hawaii : " + builderHawaii.getPizza().toString());

    PizzaBuilder seafoodPizza = new PizzaBuilderSeafood();
    System.out.println("seafood : " + seafoodPizza.getPizza().toString());
  }
}
