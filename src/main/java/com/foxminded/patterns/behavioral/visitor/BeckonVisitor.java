package com.foxminded.patterns.behavioral.visitor;

public class BeckonVisitor implements Visitor {

        @Override
        public void visit(Pizza pizza) {
                pizza.addIngredient("Beckon");
        }
}
