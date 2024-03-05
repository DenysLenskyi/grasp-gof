package com.foxminded.patterns.behavioral.observer;

public class AirportAlertObserver implements AlertObserver {

  @Override
  public void reactToAlert(StormAlert alert) {
    if (alert.getGrade() > 5) {
      System.out.println("Airports have reacted to the alert");
    }
  }
}