package com.foxminded.patterns.prototype;

public class Main {
  public static void main(String[] args) {
    Automobile pass = Automobile.getPassenger(1, "black");
    Automobile truck = Automobile.getTruck(2, "blue");
    Automobile mini = Automobile.getMinivan(3, "red");
    System.out.println(pass);
    System.out.println(truck);
    System.out.println(mini);
  }
}
