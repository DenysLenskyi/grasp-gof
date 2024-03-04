package com.foxminded.patterns.behavioral.mediator.concierge;

public class CallTaxiService implements ConciergeService {

  private boolean isInProcess = false;

  public CallTaxiService() {}

  @Override
  public void serve() {
    System.out.println("Calling to a Taxi Service");
    isInProcess = true;
  }

  @Override
  public String isInProcess() {
    return "Calling taxi, status: " + isInProcess;
  }

  @Override
  public void setInProcess(boolean inProcess) {
    isInProcess = inProcess;
  }
}
