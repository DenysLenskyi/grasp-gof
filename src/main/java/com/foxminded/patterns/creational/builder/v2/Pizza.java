package com.foxminded.patterns.creational.builder.v2;

public class Pizza {

  private String cheese;
  private String beckon;
  private String pineapple;
  private String mushrooms;
  private String seafood;

  private Pizza(Builder builder) {
    this.cheese = builder.cheese;
    this.beckon = builder.beckon;
    this.pineapple = builder.pineapple;
    this.mushrooms = builder.mushrooms;
    this.seafood = builder.seafood;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "Pizza{"
        + "cheese='"
        + cheese
        + '\''
        + ", beckon='"
        + beckon
        + '\''
        + ", pineapple='"
        + pineapple
        + '\''
        + ", mushrooms='"
        + mushrooms
        + '\''
        + ", seafood='"
        + seafood
        + '\''
        + '}';
  }

  public static class Builder {
    private String cheese;
    private String beckon;
    private String pineapple;
    private String mushrooms;
    private String seafood;

    private Builder() {}

    public Builder withCheese(String cheese) {
      this.cheese = cheese;
      return this;
    }

    public Builder withBeckon(String beckon) {
      this.beckon = beckon;
      return this;
    }

    public Builder withPineapple(String pineapple) {
      this.pineapple = pineapple;
      return this;
    }

    public Builder withMushrooms(String mushrooms) {
      this.mushrooms = mushrooms;
      return this;
    }

    public Builder withSeafood(String seafood) {
      this.seafood = seafood;
      return this;
    }

    public Pizza build() {
      return new Pizza(this);
    }
  }
}
