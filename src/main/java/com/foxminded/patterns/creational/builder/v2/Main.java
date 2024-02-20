package com.foxminded.patterns.creational.builder.v2;

public class Main {
  public static void main(String[] args) {
    Pizza cheeseBeckon = Pizza.builder().withCheese("Cheese").withBeckon("Beckon").build();
    System.out.println(cheeseBeckon);

    Pizza seafood = Pizza.builder().withSeafood("shrimps").withCheese("cheese").build();
    System.out.println(seafood);
  }
}
