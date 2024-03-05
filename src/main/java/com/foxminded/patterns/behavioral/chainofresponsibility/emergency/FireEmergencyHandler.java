package com.foxminded.patterns.behavioral.chainofresponsibility.emergency;

public class FireEmergencyHandler extends EmergencyCodeHandler {

  private static final String FIRE_EMERGENCY_RESPONSE = "Fire emergency request handled!";

  public FireEmergencyHandler() {}

  @Override
  public String handleRequest(Integer code) {
    if (code == 101) {
      return FIRE_EMERGENCY_RESPONSE;
    }
    return null;
  }
}
