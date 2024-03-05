package com.foxminded.patterns.behavioral.chainofresponsibility.V2;

import java.util.List;

public class HandlerChain {

  private final List<ServiceHandler> handlers;

  public HandlerChain(List<ServiceHandler> handlers) {
    this.handlers = handlers;
  }

  public void handle(Request request) {
    handlers.forEach(h -> h.handle(request));
  }
}
