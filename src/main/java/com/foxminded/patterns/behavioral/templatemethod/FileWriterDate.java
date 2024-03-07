package com.foxminded.patterns.behavioral.templatemethod;

import java.time.LocalDate;

public class FileWriterDate extends FileWriter {

  @Override
  protected void addDate() {
    this.content.append(LocalDate.now()).append('\n');
  }

  @Override
  protected void addTime() {}
}
