package assignment.lab5.prob2.duck;

import assignment.lab5.prob2.FlyBehavior;
import assignment.lab5.prob2.QuackBehavior;
import assignment.lab5.prob2.behavior.CannotFly;
import assignment.lab5.prob2.behavior.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior=(FlyBehavior) new CannotFly();
		quackBehavior=(QuackBehavior) new Squeak();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("displaying");
	}

}
