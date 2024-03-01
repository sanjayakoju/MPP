package labs.prob4.duckapp;

import labs.prob4.behaviour.FlyWithWings;
import labs.prob4.behaviour.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
}
