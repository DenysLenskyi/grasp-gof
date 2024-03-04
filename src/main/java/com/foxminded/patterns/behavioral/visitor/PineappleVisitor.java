package com.foxminded.patterns.behavioral.visitor;

public class PineappleVisitor implements Visitor {

        @Override
        public void visit(Pizza pizza) {
                pizza.addIngredient("Pineapple");
        }
}
