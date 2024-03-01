package assignment.lab5.prob2;

import assignment.lab5.prob2.duck.DecoyDuck;
import assignment.lab5.prob2.duck.Duck;
import assignment.lab5.prob2.duck.MallardDuck;
import assignment.lab5.prob2.duck.RedHeadDuck;
import assignment.lab5.prob2.duck.RubberDuck;

public class Main {

	public static void main(String[] args) {
		Duck[] ducks = {
				new MallardDuck(),new DecoyDuck(),new RedHeadDuck(), new RubberDuck()
		};
		for(Duck d: ducks) {
			System.out.println(d.getClass().getSimpleName()+":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}
	}
}
