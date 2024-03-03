package com.foxminded.patterns.behavioral.state;

public class OverHeatedState extends StoveState {

  @Override
  public void cookPizza() {
    throw new RuntimeException("An overheated stove can't cook a pizza!");
  }
}
