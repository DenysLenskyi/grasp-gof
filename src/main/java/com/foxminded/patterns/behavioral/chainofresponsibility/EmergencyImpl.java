package com.foxminded.patterns.behavioral.chainofresponsibility;

import com.foxminded.patterns.behavioral.chainofresponsibility.emergency.CriminalEmergencyCodeHandler;
import com.foxminded.patterns.behavioral.chainofresponsibility.emergency.EmergencyCodeChainHandler;
import com.foxminded.patterns.behavioral.chainofresponsibility.emergency.FireEmergencyCodeHandler;
import com.foxminded.patterns.behavioral.chainofresponsibility.emergency.HealthEmergencyCodeHandler;
import com.foxminded.patterns.behavioral.chainofresponsibility.model.EmergencyRequest;

public class EmergencyImpl implements Emergency {

  private EmergencyCodeChainHandler emergencyCodeChainHandler;

  @Override
  public void getResponse(EmergencyRequest request) {
    emergencyCodeChainHandler = new EmergencyCodeChainHandler();
    emergencyCodeChainHandler.addHandler(new CriminalEmergencyCodeHandler());
    emergencyCodeChainHandler.addHandler(new FireEmergencyCodeHandler());
    emergencyCodeChainHandler.addHandler(new HealthEmergencyCodeHandler());
    emergencyCodeChainHandler.processRequest(request).forEach(System.out::println);
  }
}
