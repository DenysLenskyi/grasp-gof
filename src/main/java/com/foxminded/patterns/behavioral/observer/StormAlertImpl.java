package com.foxminded.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class StormAlertImpl implements StormAlert {
  private Integer grade;
  private List<AlertObserver> observers;

  public StormAlertImpl() {
    observers = new ArrayList<>();
  }

  @Override
  public void addObserver(AlertObserver observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(AlertObserver observer) {
    observers.remove(observer);
  }

  @Override
  public Integer getGrade() {
    return grade;
  }

  @Override
  public void setGrade(Integer grade) {
    this.grade = grade;
    observers.forEach(observer -> observer.reactToAlert(this));
  }
}
