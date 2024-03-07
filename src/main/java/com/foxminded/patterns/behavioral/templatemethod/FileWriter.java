package com.foxminded.patterns.behavioral.templatemethod;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class FileWriter {

  protected StringBuilder content;

  public FileWriter() {
    this.content = new StringBuilder();
  }

  public void writeToFile(String string) {
    writeContent(string);
    addDate();
    addTime();
  }

  private void writeContent(String string) {
    this.content.append(string).append('\n');
  }

  protected abstract void addDate();

  protected abstract void addTime();

  public void getOutput() {
    System.out.println(this.content.toString());
  }
}
