package com.foxminded.patterns.behavioral.state;

public class ReadyState implements StoveState {

  @Override
  public void cookPizza() {
    System.out.println("Cooking...");
  }

  @Override
  public void coolDown(Stove stove) {
    stove.setState(new ColdState());
  }

  @Override
  public void prepareForWork(Stove stove) {
    System.out.println("The stove is ready for a work!");
  }

  @Override
  public void overheat(Stove stove) {
    stove.setState(new OverheatedState());
  }
}
