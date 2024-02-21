package com.foxminded.patterns.structural.facade;

public class Main {
  public static void main(String[] args) {
    CalculatorFacade facade = new CalculatorFacadeImpl();
    System.out.println(facade.calculate(5, 2, "sum"));
    System.out.println(facade.calculate(5, 2, "div"));
    System.out.println(facade.calculate(5, 2, "multi"));
    System.out.println(facade.calculate(5, 2, "sub"));
  }
}
