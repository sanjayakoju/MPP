package labs.prob4.duckapp;

import labs.prob4.behaviour.CannotFly;
import labs.prob4.behaviour.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehaviour = new CannotFly();
        quackBehaviour = new MuteQuack();
    }
}
