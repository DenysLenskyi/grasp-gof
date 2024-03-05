package com.foxminded.patterns.behavioral.memento;

class TextFileMemento {

  private String h1;
  private String h2;
  private String h3;
  private String paragraph1;
  private String paragraph2;
  private String paragraph3;

  public TextFileMemento(
      String h1, String h2, String h3, String paragraph1, String paragraph2, String paragraph3) {
    this.h1 = h1;
    this.h2 = h2;
    this.h3 = h3;
    this.paragraph1 = paragraph1;
    this.paragraph2 = paragraph2;
    this.paragraph3 = paragraph3;
  }

  public String getH1() {
    return h1;
  }

  public void setH1(String h1) {
    this.h1 = h1;
  }

  public String getH2() {
    return h2;
  }

  public void setH2(String h2) {
    this.h2 = h2;
  }

  public String getH3() {
    return h3;
  }

  public void setH3(String h3) {
    this.h3 = h3;
  }

  public String getParagraph1() {
    return paragraph1;
  }

  public void setParagraph1(String paragraph1) {
    this.paragraph1 = paragraph1;
  }

  public String getParagraph2() {
    return paragraph2;
  }

  public void setParagraph2(String paragraph2) {
    this.paragraph2 = paragraph2;
  }

  public String getParagraph3() {
    return paragraph3;
  }

  public void setParagraph3(String paragraph3) {
    this.paragraph3 = paragraph3;
  }
}
