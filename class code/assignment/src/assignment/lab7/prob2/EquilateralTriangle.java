package assignment.lab7.prob2;

public class EquilateralTriangle implements Polygon {
	
	final private double side;
	
	public EquilateralTriangle(double side) {
		this.side = side;
	}
 
	
	public double getLength() {
		return side;
	}


	@Override
	public double[] getSides() {
		// TODO Auto-generated method stub
		return new double[]{side, side, side};
	}

}
