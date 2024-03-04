package com.foxminded.patterns.behavioral.visitor;

public class MushroomsVisitor implements Visitor {

        @Override
        public void visit(Pizza pizza) {
                pizza.addIngredient("Mushrooms");
        }
}
