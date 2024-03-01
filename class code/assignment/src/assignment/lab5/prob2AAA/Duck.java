package assignment.lab5.prob2AAA;



public abstract class Duck {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public void quack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("Swimming");
	}
	
	public abstract void display();
	
	public void fly() {
		flyBehavior.fly();
	}
}
