package com.foxminded.patterns.behavioral.chainofresponsibility.model;

import java.util.ArrayList;
import java.util.List;

public class EmergencyRequest {

  private List<Integer> codes;

  public EmergencyRequest() {
  }

  public void addCode(int code) {
    if (this.codes == null) {
      codes = new ArrayList<>();
    }
    codes.add(code);
  }

  public List<Integer> getCodes() {
    return codes;
  }
}
