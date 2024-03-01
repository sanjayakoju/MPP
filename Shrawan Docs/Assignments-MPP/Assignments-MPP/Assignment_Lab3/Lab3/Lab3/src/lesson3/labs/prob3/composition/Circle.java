package lesson3.labs.prob3.composition;

public class Circle implements Shape {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double computeArea() {
		return Math.PI * this.radius * this.radius;
	}

}
