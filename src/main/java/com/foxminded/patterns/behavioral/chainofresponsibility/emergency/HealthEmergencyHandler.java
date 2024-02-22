package com.foxminded.patterns.behavioral.chainofresponsibility.emergency;

public class HealthEmergencyHandler extends EmergencyCodeHandler {

  private static final String HEALTH_EMERGENCY_RESPONSE = "Health emergency request handled!";

  public HealthEmergencyHandler() {}

  @Override
  public String getResponse(int code) {
    if (code == 103) {
      return HEALTH_EMERGENCY_RESPONSE;
    }
    return null;
  }
}
