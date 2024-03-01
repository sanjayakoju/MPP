package lesson3.labs.prob4.mypkg;

public class Condo extends Property{

	private int numFloors;
	
	public Condo(int numFloors) {
		super();
		this.numFloors = numFloors;
	}
	
	@Override
	public double computeRent() {
		return 400 * this.numFloors;
	}

}
