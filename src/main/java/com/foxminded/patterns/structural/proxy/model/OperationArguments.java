package com.foxminded.patterns.structural.proxy.model;

import java.util.Objects;

public class OperationArguments {

  private Integer a;
  private Integer b;
  private String operationName;

  public OperationArguments(Integer a, Integer b, String operationName) {
    this.a = a;
    this.b = b;
    this.operationName = operationName;
  }

  public Integer getA() {
    return a;
  }

  public Integer getB() {
    return b;
  }

  public String getOperationName() {
    return operationName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof OperationArguments that)) return false;

    if (!Objects.equals(a, that.a)) return false;
    if (!Objects.equals(b, that.b)) return false;
    return Objects.equals(operationName, that.operationName);
  }

  @Override
  public int hashCode() {
    int result = a != null ? a.hashCode() : 0;
    result = 31 * result + (b != null ? b.hashCode() : 0);
    result = 31 * result + (operationName != null ? operationName.hashCode() : 0);
    return result;
  }
}
