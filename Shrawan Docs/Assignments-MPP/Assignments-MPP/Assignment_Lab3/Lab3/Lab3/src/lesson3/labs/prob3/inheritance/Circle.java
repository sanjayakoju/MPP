package lesson3.labs.prob3.inheritance;

public class Circle extends Cylinder {

	public Circle(double radius) {
		super(0, radius);
	}
	
	double getRadius() {
		return super.getRadius();
	}

	@Override
	public double computeArea() {
		return Math.PI * this.getRadius() * this.getRadius();
	}
	
	

}
