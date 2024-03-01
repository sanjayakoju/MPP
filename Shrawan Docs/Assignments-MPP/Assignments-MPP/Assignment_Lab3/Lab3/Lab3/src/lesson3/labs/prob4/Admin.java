package lesson3.labs.prob4;

import lesson3.labs.prob4.mypkg.Property;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property o : properties) {
			totalRent += o.computeRent();
		}
		return totalRent;
	}
}
