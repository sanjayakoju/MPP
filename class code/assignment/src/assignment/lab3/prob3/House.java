package assignment.lab3.prob3;


public class House extends Proprety {
	private double lotSize;
	
	public House(double lotSize) {
		this.lotSize = lotSize;
	}

	public double computeRent(){
		return 0.1 * lotSize;
	}
}
