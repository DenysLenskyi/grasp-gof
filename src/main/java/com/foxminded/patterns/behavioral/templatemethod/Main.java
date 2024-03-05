package com.foxminded.patterns.behavioral.templatemethod;

public class Main {
  public static void main(String[] args) {
    FileWriter file1 = new FileWriterDate();
    file1.writeToFile("Hello world!");
    file1.getOutput();
    System.out.println();
    FileWriter file2 = new FileWriterTime();
    file2.writeToFile("World hello!");
    file2.getOutput();
  }
}
