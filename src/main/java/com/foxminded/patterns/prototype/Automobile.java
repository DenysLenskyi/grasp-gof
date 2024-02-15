package com.foxminded.patterns.prototype;

public class Automobile implements Cloneable {

  private int number;
  private String colour;
  private Type type;
  private String brand;
  private int year;
  private String shopName;
  // etc

  private static Automobile instance;

  static {
    instance = new Automobile();
    instance.setBrand("Denys Lenskyi Custom Motors");
    instance.setYear(2024);
    instance.setShopName("Lenskyi Corner Store");
  }

  private Automobile() {}

  public static Automobile getPassenger(int number, String colour) throws CloneNotSupportedException {
    Automobile automobile = (Automobile) instance.clone();
    automobile.setType(Type.PASSENGER);
    automobile.setNumber(number);
    automobile.setColour(colour);
    return automobile;
  }

  public static Automobile getTruck(int number, String colour) throws CloneNotSupportedException {
    Automobile automobile = (Automobile) instance.clone();
    automobile.setType(Type.TRUCK);
    automobile.setNumber(number);
    automobile.setColour(colour);
    return automobile;
  }

  public static Automobile getMinivan(int number, String colour) throws CloneNotSupportedException {
    Automobile automobile = (Automobile) instance.clone();
    automobile.setType(Type.MINIVAN);
    automobile.setNumber(number);
    automobile.setColour(colour);
    return automobile;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public void setColour(String colour) {
    this.colour = colour;
  }

  public Type getType() {
    return type;
  }

  private void setType(Type type) {
    this.type = type;
  }

  private void setBrand(String brand) {
    this.brand = brand;
  }

  private void setYear(int year) {
    this.year = year;
  }

  private void setShopName(String shopName) {
    this.shopName = shopName;
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
