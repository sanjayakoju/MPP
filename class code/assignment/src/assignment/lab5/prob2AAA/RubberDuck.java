package assignment.lab5.prob2AAA;



public class RubberDuck extends Duck{

	public RubberDuck() {
		flyBehavior=new CannotFly();
		quackBehavior=new Squeak();
	}

	@Override
	public void display() {
		System.out.println("displaying");
	}
}
