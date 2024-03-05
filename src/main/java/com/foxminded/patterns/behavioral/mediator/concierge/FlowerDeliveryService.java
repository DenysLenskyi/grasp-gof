package com.foxminded.patterns.behavioral.mediator.concierge;

public class FlowerDeliveryService implements ConciergeService {

  private boolean isInProcess = false;

  public FlowerDeliveryService() {}

  @Override
  public void serve() {
    System.out.println("Calling to a Flower Delivery Service");
    isInProcess = true;
  }

  @Override
  public String isInProcess() {
    return "Calling flower delivery, status: " + isInProcess;
  }

  @Override
  public void setInProcess(boolean inProcess) {
    isInProcess = inProcess;
  }
}
