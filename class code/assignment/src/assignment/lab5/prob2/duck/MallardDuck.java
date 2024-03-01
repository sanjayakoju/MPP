package assignment.lab5.prob2.duck;

import assignment.lab5.prob2.FlyBehavior;
import assignment.lab5.prob2.QuackBehavior;
import assignment.lab5.prob2.behavior.FlyWithWings;
import assignment.lab5.prob2.behavior.Quack;

public class MallardDuck extends Duck{
	
	public MallardDuck() {
		flyBehavior = (FlyBehavior) new FlyWithWings();
		quackBehavior = (QuackBehavior) new Quack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
	}
}
