package com.foxminded.patterns.structural.adapter;

public class FrenchLibraryImpl implements FrenchLibrary {

  @Override
  public String obtenirLeNomDuLivre() {
    return "Trois Mousquetaires";
  }

  @Override
  public String obtenirLaDescriptionDuLivre() {
    return """
"Les Trois Mousquetaires" est un roman d'aventure intemporel écrit par l'éminent auteur français Alexandre Dumas. 
Situé dans la France du XVIIe siècle, l'histoire suit les péripéties du jeune d'Artagnan alors qu'il se rend à Paris 
pour rejoindre les célèbres Mousquetaires de la Garde. Aux côtés de ses fidèles camarades Athos, Porthos et Aramis, 
d'Artagnan se retrouve mêlé à un tourbillon d'intrigues politiques, de duels et de romances alors qu'ils naviguent 
dans le paysage périlleux de la vie à la cour sous le règne de Louis XIII. Rempli d'action trépidante, de camaraderie 
et de personnages mémorables, "Les Trois Mousquetaires" est un récit classique de loyauté, d'honneur et d'aventure 
qui continue de captiver les lecteurs de tous âges.
""";
  }
}
