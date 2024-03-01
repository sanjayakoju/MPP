package labs.prob4.duckapp;


import labs.prob4.behaviour.FlyBehaviour;
import labs.prob4.behaviour.QuackBehaviour;

public abstract class Duck {
    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

    public void quack() {
        this.quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("swimming");
    }

    public void display() {
        System.out.println("displaying");
    }

    public void fly() {
        this.flyBehaviour.fly();
    }

}
