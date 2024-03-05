package com.foxminded.patterns.behavioral.chainofresponsibility;

import com.foxminded.patterns.behavioral.chainofresponsibility.emergency.EmergencyCodeHandler;
import com.foxminded.patterns.behavioral.chainofresponsibility.model.EmergencyRequest;

public class EmergencyImpl implements Emergency {

  private EmergencyCodeHandler emergencyCodeHandler;

  @Override
  public void getResponse(EmergencyRequest request) {
    emergencyCodeHandler = new EmergencyCodeHandler();
    emergencyCodeHandler.processRequest(request).forEach(System.out::println);
  }
}
