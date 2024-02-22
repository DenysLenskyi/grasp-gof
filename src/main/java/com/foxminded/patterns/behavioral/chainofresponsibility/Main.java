package com.foxminded.patterns.behavioral.chainofresponsibility;

public class Main {
  public static void main(String[] args) {
    Emergency emergency = new EmergencyImpl();
    emergency.getResponse(101);
    emergency.getResponse(102);
    emergency.getResponse(103);
    emergency.getResponse(104);
  }
}
