package com.foxminded.patterns.behavioral.observer;

public interface StormAlert {
  void addObserver(AlertObserver observer);

  void removeObserver(AlertObserver observer);

  Integer getGrade();

  void setGrade(Integer grade);
}
