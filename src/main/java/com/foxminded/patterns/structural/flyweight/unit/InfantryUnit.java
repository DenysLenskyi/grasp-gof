package com.foxminded.patterns.structural.flyweight.unit;

public class InfantryUnit implements Unit {

  private int x = 0;
  private int y = 0;
  private String sound;
  private String texture;

  public InfantryUnit(int x, int y, String sound, String texture) {
    this.x = x;
    this.y = y;
    this.sound = sound;
    this.texture = texture;
  }

  public InfantryUnit() {
  }

  @Override
  public void printCoordinates() {
    System.out.println("x : " + x);
    System.out.println("y : " + y);
  }

  @Override
  public void setCoordinates(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public void printSound() {
    System.out.println(sound);
  }

  @Override
  public void printTextureInfo() {
    System.out.println(texture);
  }

  public void setSound(String sound) {
    this.sound = sound;
  }

  public void setTexture(String texture) {
    this.texture = texture;
  }
}
