package labs.prob4.duckapp;

import labs.prob4.behaviour.FlyWithWings;
import labs.prob4.behaviour.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("display");
    }
}
