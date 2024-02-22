package com.foxminded.patterns.behavioral.chainofresponsibility.emergency;

import java.util.ArrayList;
import java.util.List;

public class EmergencyCodeHandler {

  private static final String ERROR = "Unknown code, can't handle...";
  private List<String> responses;

  public String getResponse(int code) {

    EmergencyCodeHandler criminalEmergencyHandler = new CriminalEmergencyHandler();
    EmergencyCodeHandler fireEmergencyHandler = new FireEmergencyHandler();
    EmergencyCodeHandler healthEmergencyHandler = new HealthEmergencyHandler();

    List<EmergencyCodeHandler> emergencyServices = new ArrayList<>();
    emergencyServices.add(criminalEmergencyHandler);
    emergencyServices.add(fireEmergencyHandler);
    emergencyServices.add(healthEmergencyHandler);

    responses = new ArrayList<>();

    emergencyServices.forEach(e -> responses.add(e.getResponse(code)));

    return responses.stream().filter(r -> r != null).findFirst().orElse(ERROR);
  }
}
