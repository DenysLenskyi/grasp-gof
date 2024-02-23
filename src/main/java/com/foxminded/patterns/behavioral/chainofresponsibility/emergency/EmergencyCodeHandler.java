package com.foxminded.patterns.behavioral.chainofresponsibility.emergency;

import com.foxminded.patterns.behavioral.chainofresponsibility.model.EmergencyRequest;

import java.util.ArrayList;
import java.util.List;

public class EmergencyCodeHandler {

  private static final String ERROR = " - is unknown code, can't handle...";
  private List<String> responses;

  private EmergencyCodeHandler emergencyCodeHandler;

  public List<String> processRequest(EmergencyRequest request) {

    responses = new ArrayList<>();

    request
        .getCodes()
        .forEach(
            code -> {
              String response;
              emergencyCodeHandler = new FireEmergencyHandler();
              response = emergencyCodeHandler.handleRequest(code);
              responses.add(response);
              if (response == null) {
                emergencyCodeHandler = new CriminalEmergencyHandler();
                response = emergencyCodeHandler.handleRequest(code);
                responses.add(response);
                if (response == null) {
                  emergencyCodeHandler = new HealthEmergencyHandler();
                  response = emergencyCodeHandler.handleRequest(code);
                  responses.add(response);
                  if (response == null) {
                    emergencyCodeHandler = new EmergencyCodeHandler();
                    response = emergencyCodeHandler.handleRequest(code);
                    responses.add(response);
                  }
                }
              }
            });

    return responses.stream().filter(r -> r != null).toList();
  }

  public String handleRequest(Integer code) {
    return code + ERROR;
  }
}
