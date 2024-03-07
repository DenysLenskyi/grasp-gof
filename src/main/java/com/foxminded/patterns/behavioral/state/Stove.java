package com.foxminded.patterns.behavioral.state;

public interface Stove {
        void setState(StoveState state);

        void cookPizza();

        void getReadyForWork();

        void overheat();

        void coolDown();
}
