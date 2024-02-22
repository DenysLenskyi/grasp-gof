package com.foxminded.patterns.structural.flyweight;

import com.foxminded.patterns.structural.flyweight.unit.CavalryUnit;
import com.foxminded.patterns.structural.flyweight.unit.InfantryUnit;
import com.foxminded.patterns.structural.flyweight.unit.Unit;
import com.foxminded.patterns.structural.flyweight.unit.UnitData;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    UnitData unitData = new UnitData();
    final String infSound = unitData.getInfantrySound();
    final String infTex = unitData.getInfantryTexture();
    final String cavSound = unitData.getCavalrySound();
    final String cavTex = unitData.getCavalryTexture();

    Unit inf1 = new InfantryUnit(5, 10, infSound, infTex);
    Unit inf2 = new InfantryUnit(7, 29, infSound, infTex);

    Unit cav1 = new CavalryUnit(3,6,cavSound,cavTex);
    Unit cav2 = new CavalryUnit(10,5,cavSound,cavTex);
    Unit cav3 = new CavalryUnit(1,7,cavSound,cavTex);

    List<Unit> army = List.of(inf1,inf2,cav3,cav2,cav1);
    army.forEach(u -> u.setCoordinates(10, 10));
    army.forEach(Unit::printCoordinates);
    army.forEach(u -> {
      u.printTextureInfo();
      u.printSound();
    });
  }
}
