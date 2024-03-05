package com.foxminded.patterns.behavioral.chainofresponsibility.emergency;

import com.foxminded.patterns.behavioral.chainofresponsibility.model.EmergencyRequest;

public class HealthEmergencyCodeHandler extends EmergencyCodeChainHandler {

  private static final String HEALTH_EMERGENCY_RESPONSE = "Health emergency request handled!";

  public HealthEmergencyCodeHandler() {
  }

  @Override
  public String handleRequest(EmergencyRequest request) {
    if (request.getCodes().contains(103)) {
      return HEALTH_EMERGENCY_RESPONSE;
    }
    return null;
  }
}
