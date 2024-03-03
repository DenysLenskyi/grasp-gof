package com.foxminded.patterns.behavioral.state;

public class ReadyState extends StoveState {
  @Override
  public void cookPizza() {
    System.out.println("Cooking...");
  }
}
