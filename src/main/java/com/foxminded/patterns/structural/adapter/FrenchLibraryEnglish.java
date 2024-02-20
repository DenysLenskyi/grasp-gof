package com.foxminded.patterns.structural.adapter;

public class FrenchLibraryEnglish implements FrenchLibraryAdapter {

  private FrenchLibrary frenchLibrary;

  @Override
  public String getBookName() {
    return frenchLibrary.obtenirLeNomDuLivre();
  }

  @Override
  public String getBookDescription() {
    return frenchLibrary.obtenirLaDescriptionDuLivre();
  }

  @Override
  public void setFrenchLibrary(FrenchLibrary frenchLibrary) {
    this.frenchLibrary = frenchLibrary;
  }
}
