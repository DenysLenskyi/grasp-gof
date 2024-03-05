package com.foxminded.patterns.behavioral.mediator.concierge;

public interface ConciergeService {

  void serve();

  String isInProcess();

  void setInProcess(boolean inProcess);
}
