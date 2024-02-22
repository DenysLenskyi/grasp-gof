package com.foxminded.patterns.behavioral.chainofresponsibility;

import com.foxminded.patterns.behavioral.chainofresponsibility.emergency.EmergencyCodeHandler;

public class EmergencyImpl implements Emergency {

  private EmergencyCodeHandler emergencyCodeHandler;

  @Override
  public void getResponse(int code) {
    emergencyCodeHandler = new EmergencyCodeHandler();
    System.out.println(emergencyCodeHandler.getResponse(code));
  }
}
