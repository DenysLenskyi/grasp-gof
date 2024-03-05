package com.foxminded.patterns.behavioral.interpreter;

import com.foxminded.patterns.behavioral.command.Pizza;

public interface PizzaInterpreter {
        Pizza cookCustomPizza(String recipe);
}
