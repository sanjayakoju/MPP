package lesson3.labs.prob4;

import lesson3.labs.prob4.mypkg.Condo;
import lesson3.labs.prob4.mypkg.House;
import lesson3.labs.prob4.mypkg.Property;
import lesson3.labs.prob4.mypkg.Trailer;

public class Driver {

	public static void main(String[] args) {

		Property[] objects = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
	}
}
