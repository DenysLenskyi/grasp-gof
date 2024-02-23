package com.foxminded.patterns.structural.flyweight.unit;

public class UnitData {
  private String infantrySound;
  private String infantryTexture;
  private String cavalrySound;
  private String cavalryTexture;

  {
    infantrySound = "I am an infantry unit. I can make infantry sound!";
    cavalrySound = "I am an cavalry unit. I can make cavalry sound!";
    infantryTexture = "I am an infantry unit this is my texture";
    cavalryTexture = "I am an cavalry unit this is my texture";
  }

  public String getInfantrySound() {
    return infantrySound;
  }

  public String getInfantryTexture() {
    return infantryTexture;
  }

  public String getCavalrySound() {
    return cavalrySound;
  }

  public String getCavalryTexture() {
    return cavalryTexture;
  }
}
