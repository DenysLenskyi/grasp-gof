package com.foxminded.patterns.creational.prototype;

public class Automobile implements Cloneable {

  private static final String BRAND = "Denys Lenskyi Custom Motors";
  private static final String SHOP_NAME = "Lenskyi Corner Store";
  private static final int YEAR = 2024;
  private static final Automobile PASSENGER =
      new Automobile(Type.PASSENGER, BRAND, SHOP_NAME, YEAR);
  private static final Automobile TRUCK = new Automobile(Type.TRUCK, BRAND, SHOP_NAME, YEAR);
  private static final Automobile MINIVAN = new Automobile(Type.MINIVAN, BRAND, SHOP_NAME, YEAR);

  private int number;
  private String colour;
  private Type type;
  private String brand;
  private int year;
  private String shopName;

  // etc

  private Automobile(Type type, String brand, String shopName, int year) {
    this.type = type;
    this.brand = brand;
    this.shopName = shopName;
    this.year = year;
  }

  public static Automobile getPassenger(int number, String colour) {
    Automobile automobile = PASSENGER.clone();
    automobile.setNumber(number);
    automobile.setColour(colour);
    return automobile;
  }

  public static Automobile getTruck(int number, String colour) {
    Automobile automobile = TRUCK.clone();
    automobile.setNumber(number);
    automobile.setColour(colour);
    return automobile;
  }

  public static Automobile getMinivan(int number, String colour) {
    Automobile automobile = MINIVAN.clone();
    automobile.setNumber(number);
    automobile.setColour(colour);
    return automobile;
  }

  @Override
  protected Automobile clone() {
    try {
      return (Automobile) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  @Override
  public String toString() {
    return "Automobile{"
        + "number="
        + number
        + ", colour='"
        + colour
        + '\''
        + ", type="
        + type
        + ", brand='"
        + brand
        + '\''
        + ", year="
        + year
        + ", shopName='"
        + shopName
        + '\''
        + '}';
  }
}
