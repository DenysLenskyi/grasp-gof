package com.foxminded.patterns.behavioral.visitor;

public class SeafoodVisitor implements Visitor {

        @Override
        public void visit(Pizza pizza) {
                pizza.addIngredient("Seafood");
        }
}
