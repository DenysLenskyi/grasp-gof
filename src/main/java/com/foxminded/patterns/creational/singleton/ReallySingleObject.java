package com.foxminded.patterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class ReallySingleObject {
  private int id;
  private static List<ReallySingleObject> instances;

  static {
    instances = new ArrayList<>(10);
    int i = 0;
    while (i < 10) {
      instances.add(new ReallySingleObject(i));
      i++;
    }
  }

  private ReallySingleObject(int id) {
    this.id = id;
  }

  public static ReallySingleObject getInstance(int id) {
    return instances.get(id);
  }

  @Override
  public String toString() {
    return "ReallySingleObject{" + "id=" + id + '}';
  }
}
