package assignment.lab5.prob2AAA;



public class MallarDuck extends Duck{
	
	
	public MallarDuck() {
		flyBehavior=new FlyWithWings();
		quackBehavior=new Quack();
	}

	@Override
	public void display() {
		System.out.println("display");
	}

}
