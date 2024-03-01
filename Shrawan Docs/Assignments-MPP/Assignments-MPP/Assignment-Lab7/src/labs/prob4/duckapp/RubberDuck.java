package labs.prob4.duckapp;


import labs.prob4.behaviour.CannotFly;
import labs.prob4.behaviour.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehaviour = new CannotFly();
        quackBehaviour = new Squeak();
    }
}
