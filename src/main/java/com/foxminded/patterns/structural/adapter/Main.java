package com.foxminded.patterns.structural.adapter;

public class Main {
  private static FrenchLibraryAdapter frenchLibraryAdapter;
  private static FrenchLibrary frenchLibrary;

  public static void main(String[] args) {
    frenchLibrary = new FrenchLibraryImpl();
    frenchLibraryAdapter = new FrenchLibraryEnglish();
    frenchLibraryAdapter.setFrenchLibrary(frenchLibrary);
    System.out.println(frenchLibraryAdapter.getBookName());
    System.out.println();
    System.out.println(frenchLibraryAdapter.getBookDescription());
  }
}
