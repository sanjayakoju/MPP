package assignment.lab5.prob2AAA;



public class DecoyDuck extends Duck{

	public DecoyDuck() {
		flyBehavior=new CannotFly();
		quackBehavior=new MuteQuack();
	}

	@Override
	public void display() {
		System.out.println("displaying");
	}
	
}