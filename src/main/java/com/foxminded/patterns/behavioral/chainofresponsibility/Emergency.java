package com.foxminded.patterns.behavioral.chainofresponsibility;

import com.foxminded.patterns.behavioral.chainofresponsibility.model.EmergencyRequest;

public interface Emergency {

  void getResponse(EmergencyRequest request);
}
