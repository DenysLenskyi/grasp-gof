package com.foxminded.patterns.behavioral.visitor;

public class CheeseVisitor implements Visitor {

        @Override
        public void visit(Pizza pizza) {
                pizza.addIngredient("Cheese");
        }
}
