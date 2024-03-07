package com.foxminded.patterns.behavioral.state;

public class StoveImpl implements Stove {

  private StoveState state;

  public StoveImpl() {
    this.state = new ColdState();
  }

  @Override
  public void setState(StoveState state) {
    this.state = state;
  }

  @Override
  public void cookPizza() {
    this.state.cookPizza();
  }

  @Override
  public void getReadyForWork() {
    this.state.prepareForWork(this);
  }

  @Override
  public void overheat() {
    this.state.overheat(this);
  }

  @Override
  public void coolDown() {
    this.state.coolDown(this);
  }
}
