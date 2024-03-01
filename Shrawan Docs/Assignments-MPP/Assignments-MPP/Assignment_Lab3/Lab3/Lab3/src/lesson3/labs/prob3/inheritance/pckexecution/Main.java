package lesson3.labs.prob3.inheritance.pckexecution;

import lesson3.labs.prob3.inheritance.Circle;
import lesson3.labs.prob3.inheritance.Cylinder;

public class Main {

	public static void main(String[] args) {
		Cylinder cylinder = new Cylinder(6, 2);
		
		System.out.println(cylinder.computeVolume());
		System.out.println(cylinder.computeArea());
		
		// it doesn't make sense to compute volume on a circle
		Cylinder circleCyl = new Circle(2);
		System.out.println(circleCyl.computeVolume());
		
		Circle circle = new Circle(2);
		System.out.println(circle.computeArea());
		
	}
}
