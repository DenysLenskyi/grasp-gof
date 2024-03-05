package com.foxminded.patterns.behavioral.chainofresponsibility.emergency;

import com.foxminded.patterns.behavioral.chainofresponsibility.model.EmergencyRequest;

public class FireEmergencyCodeHandler extends EmergencyCodeChainHandler {

  private static final String FIRE_EMERGENCY_RESPONSE = "Fire emergency request handled!";

  public FireEmergencyCodeHandler() {
  }

  @Override
  public String handleRequest(EmergencyRequest request) {
    if (request.getCodes().contains(101)) {
      return FIRE_EMERGENCY_RESPONSE;
    }
    return null;
  }
}
