package com.foxminded.patterns.behavioral.visitor;

public interface Pizza {
        void accept(Visitor visitor);

        void addIngredient(String ingredient);

        void printIngredients();
}
