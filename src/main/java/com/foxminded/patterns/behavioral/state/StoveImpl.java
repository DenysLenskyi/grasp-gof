package com.foxminded.patterns.behavioral.state;

import java.util.HashMap;
import java.util.Map;

public class StoveImpl implements Stove {

  private int numPizzasCookedInARow = 0;
  private StoveState state;
  private Map<String, StoveState> states;

  {
    this.states = new HashMap<>();
    states.put("ready", new ReadyState());
    states.put("cold", new ColdState());
    states.put("overHeated", new OverHeatedState());
  }

  public StoveImpl() {
    this.state = states.get("cold");
  }

  @Override
  public void getReady() {
    this.state = states.get("ready");
    numPizzasCookedInARow = 0;
  }

  @Override
  public void cookPizza() {
    this.state.cookPizza();
    numPizzasCookedInARow++;
    if (numPizzasCookedInARow > 10) {
      this.state = states.get("overHeated");
    }
  }

  @Override
  public void coolDown() {
    this.state = states.get("cold");
  }
}
