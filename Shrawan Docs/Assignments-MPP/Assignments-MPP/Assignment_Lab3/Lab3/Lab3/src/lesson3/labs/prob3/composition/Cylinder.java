package lesson3.labs.prob3.composition;

public class Cylinder implements Shape {

	private double radius;
	private double height;
	
	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}

	@Override
	public double computeArea() {
		double surfaceArea = 2 * Math.PI *  this.radius * (this.height + this.radius);
		return surfaceArea;
	}
	
	public double computeVolume() {
		return Math.PI * (this.radius * this.radius) * this.height;
	}


}
