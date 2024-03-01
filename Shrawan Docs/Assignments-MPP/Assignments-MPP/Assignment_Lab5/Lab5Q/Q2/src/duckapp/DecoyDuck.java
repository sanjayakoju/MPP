package duckapp;

import behaviour.CannotFly;
import behaviour.MuteQuack;
import behaviour.Quack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehaviour = new CannotFly();
        quackBehaviour = new MuteQuack();
    }
}
