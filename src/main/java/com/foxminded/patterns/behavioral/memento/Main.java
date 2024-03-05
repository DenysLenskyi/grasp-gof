package com.foxminded.patterns.behavioral.memento;

public class Main {
  public static void main(String[] args) {
    TextFileHistory history = new TextFileHistory();
    String h1 = "H1";
    String h2 = "H2";
    String h3 = "H3";
    String p1 = "P1";
    String p2 = "P2";
    String p3 = "P3";
    TextFile file = new TextFile(h1, h2, h3, p1, p2, p3);

    file.setParagraph3("P3 version1");
    history.addVersion("V1", file.createMemento(file));

    file.setParagraph3("P3 version2");
    history.addVersion("V2", file.createMemento(file));
    System.out.println(file);

    file = file.restore(history.getVersion("V1"));
    System.out.println(file);
  }
}
