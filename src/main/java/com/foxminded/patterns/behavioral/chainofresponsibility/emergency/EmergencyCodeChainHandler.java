package com.foxminded.patterns.behavioral.chainofresponsibility.emergency;

import com.foxminded.patterns.behavioral.chainofresponsibility.model.EmergencyRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmergencyCodeChainHandler {

  private static final String ERROR = "Some of the codes are unknown... Can't handle";

  private List<EmergencyCodeChainHandler> handlers;

  public EmergencyCodeChainHandler() {}

  public void addHandler(EmergencyCodeChainHandler handler) {
    if (handlers == null) {
      handlers = new ArrayList<>();
    }
    this.handlers.add(handler);
  }

  public List<String> processRequest(EmergencyRequest request) {

    List<String> responses = new ArrayList<>();

    this.handlers.forEach(h -> responses.add(h.handleRequest(request)));

    List<String> output =
        responses.stream().filter(r -> r != null).collect(Collectors.toCollection(ArrayList::new));

    if (output.size() < request.getCodes().size()) output.add(ERROR);

    return output;
  }

  public String handleRequest(EmergencyRequest request) {
    return ERROR;
  }
}
