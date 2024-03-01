package duckapp;

import behaviour.FlyWithWings;
import behaviour.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
}
