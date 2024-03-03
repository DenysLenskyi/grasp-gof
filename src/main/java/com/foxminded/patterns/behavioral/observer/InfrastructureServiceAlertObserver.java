package com.foxminded.patterns.behavioral.observer;

public class InfrastructureServiceAlertObserver implements AlertObserver {

  @Override
  public void reactToAlert(StormAlert alert) {
    if (alert.getGrade() > 3) {
      System.out.println("Infrastructure services have reacted to the alert");
    }
  }
}