package com.foxminded.patterns.structural.facade;

public class Main {
  public static void main(String[] args) {
    CalculatorFacade facade = new CalculatorFacadeImpl();
    System.out.println(facade.calculate(5, 2, "Add"));
    System.out.println(facade.calculate(5, 2, "Divide"));
    System.out.println(facade.calculate(5, 2, "Multiply"));
    System.out.println(facade.calculate(5, 2, "Subtract"));
  }
}
