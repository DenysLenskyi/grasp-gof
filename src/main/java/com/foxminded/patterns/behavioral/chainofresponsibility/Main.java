package com.foxminded.patterns.behavioral.chainofresponsibility;

import com.foxminded.patterns.behavioral.chainofresponsibility.model.EmergencyRequest;

public class Main {
  public static void main(String[] args) {
    Emergency emergency = new EmergencyImpl();
    EmergencyRequest request = new EmergencyRequest();
    request.addCode(103);
    request.addCode(102);
    request.addCode(104);
    request.addCode(101);
    emergency.getResponse(request);
  }
}
