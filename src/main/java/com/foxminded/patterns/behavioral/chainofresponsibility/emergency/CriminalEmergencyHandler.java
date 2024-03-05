package com.foxminded.patterns.behavioral.chainofresponsibility.emergency;

public class CriminalEmergencyHandler extends EmergencyCodeHandler {

  private static final String CRIMINAL_EMERGENCY_RESPONSE = "Criminal emergency request handled!";

  public CriminalEmergencyHandler() {}

  @Override
  public String handleRequest(Integer code) {
    if (code == 102) {
      return CRIMINAL_EMERGENCY_RESPONSE;
    }
    return null;
  }
}
