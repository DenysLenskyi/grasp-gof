package com.foxminded.patterns.structural.composite;

public class Main {
  public static void main(String[] args) {
    Counter leaf1 = new CounterLeaf();
    Counter leaf2 = new CounterLeaf();
    CounterNode node1 = new CounterNode();
    CounterNode node2 = new CounterNode();

    node1.addChild(leaf1);
    node1.addChild(leaf2);
    node1.increment();

    node2.addChild(node1);
    node2.increment();
    node2.increment();
    node2.getCount();
    System.out.println();

    node1.decrement();
    node2.getCount();
    System.out.println();

    node2.decrement();
    node2.getCount();
  }
}
