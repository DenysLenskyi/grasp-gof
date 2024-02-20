package com.foxminded.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CounterNode implements Counter {

  private int count = 0;
  private List<Counter> children = new ArrayList<>();

  @Override
  public void increment() {
    count++;
    children.forEach(Counter::increment);
  }

  @Override
  public void decrement() {
    count--;
    children.forEach(Counter::decrement);
  }

  @Override
  public void getCount() {
    System.out.println("Node count : " + count);
    children.forEach(Counter::getCount);
  }

  public void addChild(Counter counter) {
    this.children.add(counter);
  }
}
