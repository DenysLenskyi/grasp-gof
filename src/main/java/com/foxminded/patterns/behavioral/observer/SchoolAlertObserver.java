package com.foxminded.patterns.behavioral.observer;

public class SchoolAlertObserver implements AlertObserver {

  @Override
  public void reactToAlert(StormAlert alert) {
    if (alert.getGrade() > 7) {
      System.out.println("Schools have reacted to the alert");
    }
  }
}