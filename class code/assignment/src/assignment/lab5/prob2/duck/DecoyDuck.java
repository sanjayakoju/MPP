package assignment.lab5.prob2.duck;

import assignment.lab5.prob2.FlyBehavior;
import assignment.lab5.prob2.QuackBehavior;
import assignment.lab5.prob2.behavior.CannotFly;
import assignment.lab5.prob2.behavior.MuteQuack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		flyBehavior=(FlyBehavior) new CannotFly();
		quackBehavior=(QuackBehavior) new MuteQuack();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("displaying");
	}

	
}
