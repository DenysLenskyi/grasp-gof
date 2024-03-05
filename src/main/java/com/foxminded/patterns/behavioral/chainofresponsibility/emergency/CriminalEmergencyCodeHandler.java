package com.foxminded.patterns.behavioral.chainofresponsibility.emergency;

import com.foxminded.patterns.behavioral.chainofresponsibility.model.EmergencyRequest;

public class CriminalEmergencyCodeHandler extends EmergencyCodeChainHandler {

  private static final String CRIMINAL_EMERGENCY_RESPONSE = "Criminal emergency request handled!";

  public CriminalEmergencyCodeHandler() {
  }

  @Override
  public String handleRequest(EmergencyRequest request) {

    if (request.getCodes().contains(102)) {
      return CRIMINAL_EMERGENCY_RESPONSE;
    }
    return null;
  }
}
