package com.foxminded.patterns.behavioral.memento;

import java.util.HashMap;
import java.util.Map;

public class TextFileHistory {

  private Map<String, TextFileMemento> history;

  public TextFileHistory() {
    this.history = new HashMap<>();
  }

  public void addVersion(String name, TextFileMemento memento) {
    history.put(name, memento);
  }

  public TextFileMemento getVersion(String name) {
    return history.get(name);
  }
}
