package com.foxminded.patterns.behavioral.visitor.model.ingredient;

import com.foxminded.patterns.behavioral.visitor.model.Visitor;

public interface Ingredient {
        String getName();

        void setName(String name);

        void accept(Visitor visitor);
}
