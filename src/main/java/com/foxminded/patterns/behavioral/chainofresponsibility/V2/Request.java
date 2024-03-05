package com.foxminded.patterns.behavioral.chainofresponsibility.V2;

import java.util.List;

public class Request {

  private List<Integer> codes;

  public Request(List<Integer> codes) {
    this.codes = codes;
  }

  public List<Integer> getCodes() {
    return codes;
  }
}