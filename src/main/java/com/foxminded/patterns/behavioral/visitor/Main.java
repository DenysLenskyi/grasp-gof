package com.foxminded.patterns.behavioral.visitor;

public class Main {

        public static void main(String[] args) {
                Pizza pizza = new PizzaImpl();
                pizza.accept(new CheeseVisitor());
                pizza.accept(new BeckonVisitor());
                pizza.accept(new MushroomsVisitor());
                pizza.accept(new PineappleVisitor());
                pizza.accept(new SeafoodVisitor());
                pizza.printIngredients();
        }
}
