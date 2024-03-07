package com.foxminded.patterns.behavioral.state;

public class OverheatedState implements StoveState {

  @Override
  public void cookPizza() {
    throw new RuntimeException("Overheated!");
  }

  @Override
  public void coolDown(Stove stove) {
    stove.setState(new ColdState());
  }

  @Override
  public void prepareForWork(Stove stove) {
    stove.setState(new ReadyState());
  }

  @Override
  public void overheat(Stove stove) {
    System.out.println("Already overheated!");
  }
}
