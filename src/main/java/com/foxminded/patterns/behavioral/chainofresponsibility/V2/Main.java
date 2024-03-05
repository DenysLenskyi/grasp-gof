package com.foxminded.patterns.behavioral.chainofresponsibility.V2;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<ServiceHandler> handlers = new ArrayList<>();
    ServiceHandler criminal = new CriminalEmergencyHandler();
    ServiceHandler fire = new FireEmergencyHandler();
    ServiceHandler health = new HealthEmergencyHandler();
    handlers.add(criminal);
    handlers.add(fire);
    handlers.add(health);
    HandlerChain chain = new HandlerChain(handlers);
    List<Integer> codes = new ArrayList<>();
    codes.add(102);
    codes.add(101);
    codes.add(103);
    codes.add(104);
    Request request = new Request(codes);
    chain.handle(request);
  }
}
