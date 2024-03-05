package com.foxminded.patterns.behavioral.chainofresponsibility.V2;

public class FireEmergencyHandler implements ServiceHandler {
  @Override
  public void handle(Request request) {
    request.getCodes().stream()
        .filter(c -> c == 101)
        .findAny()
        .ifPresent(code -> System.out.println("Fire emergency handled"));
  }
}
