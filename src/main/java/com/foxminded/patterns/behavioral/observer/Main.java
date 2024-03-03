package com.foxminded.patterns.behavioral.observer;

public class Main {
  public static void main(String[] args) {
    StormAlert alert = new StormAlertImpl();
    AlertObserver infra = new InfrastructureServiceAlertObserver();
    AlertObserver air = new AirportAlertObserver();
    AlertObserver school = new SchoolAlertObserver();
    alert.addObserver(infra);
    alert.addObserver(air);
    alert.addObserver(school);
    int i = 0;
    while (i < 10) {
      if (i == 9) {
        alert.removeObserver(infra);
      }
      System.out.println("Alert grade = " + i);
      alert.setGrade(i);
      i++;
    }
  }
}
