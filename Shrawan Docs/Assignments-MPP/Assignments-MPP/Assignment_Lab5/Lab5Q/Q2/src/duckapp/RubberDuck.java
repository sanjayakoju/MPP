package duckapp;

import behaviour.CannotFly;
import behaviour.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehaviour = new CannotFly();
        quackBehaviour = new Squeak();
    }
}
