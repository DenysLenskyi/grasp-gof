package com.foxminded.patterns.behavioral.state;

public class ColdState implements StoveState {

  @Override
  public void cookPizza() {
    throw new RuntimeException("I'm cold, cant cook.");
  }

  @Override
  public void coolDown(Stove stove) {
    System.out.println("The stove has been cooled down already");
  }

  @Override
  public void prepareForWork(Stove stove) {
    stove.setState(new ReadyState());
  }

  @Override
  public void overheat(Stove stove) {
    System.out.println("Can't overheat from the Cold state");
  }
}
