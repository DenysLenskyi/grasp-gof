package com.foxminded.patterns.structural.adapter;

public interface FrenchLibraryAdapter {
  String getBookName();

  String getBookDescription();

  void setFrenchLibrary(FrenchLibrary frenchLibrary);
}
