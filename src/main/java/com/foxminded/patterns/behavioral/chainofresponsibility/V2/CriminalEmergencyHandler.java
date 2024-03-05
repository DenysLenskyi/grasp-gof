package com.foxminded.patterns.behavioral.chainofresponsibility.V2;

public class CriminalEmergencyHandler implements ServiceHandler {
  @Override
  public void handle(Request request) {
    request.getCodes().stream()
        .filter(c -> c == 102)
        .findAny()
        .ifPresent(code -> System.out.println("Criminal emergency handled"));
  }
}
