package com.foxminded.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class PizzaImpl implements Pizza {

        private List<String> ingredients;

        public PizzaImpl() {
                this.ingredients = new ArrayList<>();
        }

        @Override
        public void accept(Visitor visitor) {
                visitor.visit(this);
        }

        @Override
        public void addIngredient(String ingredient) {
                this.ingredients.add(ingredient);
        }

        @Override
        public void printIngredients() {
                System.out.println("Ingredients:");
                for (int i = 0; i < this.ingredients.size(); i++) {
                        System.out.println(i + 1 + ". " + this.ingredients.get(i));
                }
        }
}
