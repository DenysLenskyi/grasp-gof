package com.foxminded.patterns.behavioral.mediator.concierge;

public class MaintenanceService implements ConciergeService {

  private boolean isInProcess = false;

  public MaintenanceService() {}

  @Override
  public void serve() {
    System.out.println("Calling to a Maintenance Service");
    isInProcess = true;
  }

  @Override
  public String isInProcess() {
    return "Calling maintenance, status: " + isInProcess;
  }

  @Override
  public void setInProcess(boolean inProcess) {
    isInProcess = inProcess;
  }
}
