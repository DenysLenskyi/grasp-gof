package com.foxminded.patterns.behavioral.state;

public interface StoveState {

  void cookPizza();

  void coolDown(Stove stove);

  void prepareForWork(Stove stove);

  void overheat(Stove stove);
}
