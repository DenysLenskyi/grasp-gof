package com.foxminded.patterns.behavioral.state;

public class ColdState extends StoveState {

  @Override
  public void cookPizza() {
    throw new RuntimeException("An unheated stove can't cook a pizza!");
  }
}
