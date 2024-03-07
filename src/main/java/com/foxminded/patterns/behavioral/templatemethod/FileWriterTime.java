package com.foxminded.patterns.behavioral.templatemethod;

import java.time.LocalTime;

public class FileWriterTime extends FileWriter {

  @Override
  protected void addDate() {}

  @Override
  protected void addTime() {
    this.content.append(LocalTime.now()).append('\n');
  }
}
