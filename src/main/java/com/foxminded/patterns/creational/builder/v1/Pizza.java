package com.foxminded.patterns.creational.builder.v1;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

        private List<Ingredients> ingredients = new ArrayList<>();
        private PizzaBuilder builder;

        public Pizza addIngredient(Ingredients ingredient) {
                this.ingredients.add(ingredient);
                return this;
        }

        @Override
        public String toString() {
                return "Pizza{" +
                        "ingredients=" + ingredients.toString() +
                        '}';
        }
}
