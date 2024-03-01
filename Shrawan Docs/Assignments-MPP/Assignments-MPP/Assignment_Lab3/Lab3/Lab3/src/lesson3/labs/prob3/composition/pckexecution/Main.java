package lesson3.labs.prob3.composition.pckexecution;

import lesson3.labs.prob3.composition.Circle;
import lesson3.labs.prob3.composition.Cylinder;
import lesson3.labs.prob3.composition.Shape;

public class Main {

	public static void main(String[] args) {
		Shape shape = new Cylinder(6, 2);
		System.out.println(shape.computeArea());
		
		Shape circle = new Circle(2);
		System.out.println(circle.computeArea());
		
		Cylinder cylinder = new Cylinder(6,2);
		System.out.println(cylinder.computeArea());
		System.out.println(cylinder.computeVolume());
	}
}
