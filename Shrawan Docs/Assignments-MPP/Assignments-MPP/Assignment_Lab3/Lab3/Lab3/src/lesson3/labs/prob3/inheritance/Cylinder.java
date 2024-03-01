package lesson3.labs.prob3.inheritance;

public class Cylinder {
	
	private double height;
	private double radius;
	
	public Cylinder(double height, double radius) {
		this.height = height;
		this.radius = radius;
	}
	
	double getHeight() {
		return this.height;
	}
	
	double getRadius() {
		return this.radius;
	}
	
	public double computeArea() {
		double surfaceArea = 2 * Math.PI *  this.radius * (this.height + this.radius);
		return surfaceArea;
	}
	
	
	public double computeVolume() {
		return Math.PI * (this.radius * this.radius) * this.height;
	}
	
	
	

}
