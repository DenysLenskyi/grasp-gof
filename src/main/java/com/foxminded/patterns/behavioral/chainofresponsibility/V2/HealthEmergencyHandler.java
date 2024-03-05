package com.foxminded.patterns.behavioral.chainofresponsibility.V2;

public class HealthEmergencyHandler implements ServiceHandler {
  @Override
  public void handle(Request request) {
    request.getCodes().stream()
        .filter(c -> c == 103)
        .findAny()
        .ifPresent(code -> System.out.println("Health emergency handled"));
  }
}
