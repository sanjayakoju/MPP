package assignment.lab3.prob3;

public class Condo extends Proprety {
	
	private int numberOfFloors;
	
	public Condo(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public double computeRent(){
		return 500 * numberOfFloors;
	}
}
