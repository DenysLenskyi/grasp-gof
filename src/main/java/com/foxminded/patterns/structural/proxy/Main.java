package com.foxminded.patterns.structural.proxy;

public class Main {
  public static void main(String[] args) {
    CalculatorProxy calculatorProxy = new CalculatorCache();
    System.out.println(calculatorProxy.calculate(2, 2, "Add"));
    System.out.println(calculatorProxy.calculate(2, 2, "Add"));
    System.out.println(calculatorProxy.calculate(2, 2, "Add"));
    System.out.println(calculatorProxy.calculate(23, 2, "Add"));
    System.out.println(calculatorProxy.calculate(23, 2, "Add"));
  }
}
