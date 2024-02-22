package com.foxminded.patterns.structural.facade;

import com.foxminded.patterns.structural.facade.calculator.Divider;
import com.foxminded.patterns.structural.facade.calculator.Multiplier;
import com.foxminded.patterns.structural.facade.calculator.Subtracter;
import com.foxminded.patterns.structural.facade.calculator.Summariser;

public class CalculatorFacadeImpl implements CalculatorFacade {

  @Override
  public int calculate(int a, int b, String operationName) {
    int result = 0;
    switch (operationName) {
      case "Add" -> {
        Summariser summariser = new Summariser();
        result = summariser.add(a, b);
      }
      case "Multiply" -> {
        Multiplier multiplier = new Multiplier();
        result = multiplier.multiply(a, b);
      }
      case "Subtract" -> {
        Subtracter subtracter = new Subtracter();
        result = subtracter.subtract(a, b);
      }
      case "Divide" -> {
        Divider divider = new Divider();
        result = divider.divide(a, b);
      }
      default -> result = -1;
    }
    return result;
  }
}
