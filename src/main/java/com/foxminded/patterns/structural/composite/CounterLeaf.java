package com.foxminded.patterns.structural.composite;

public class CounterLeaf implements Counter {

  private int count = 0;

  @Override
  public void increment() {
    count++;
  }

  @Override
  public void decrement() {
    count--;
  }

  @Override
  public void getCount() {
    System.out.println("Leaf count : " + count);
  }
}
