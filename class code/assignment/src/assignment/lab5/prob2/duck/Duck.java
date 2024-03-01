package assignment.lab5.prob2.duck;

import assignment.lab5.prob2.FlyBehavior;
import assignment.lab5.prob2.QuackBehavior;

public abstract class Duck {

	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void swim() {
		System.out.println("Swimming");
	}
	
	public void fly() {
		flyBehavior.fly();
	}
	
	public void quack() {
		quackBehavior.quack();
	}
}
