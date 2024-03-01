package assignment.lab7.prob2;

public interface Polygon extends ClosedCurve {
	
	double[] getSides();

	default double computePerimeter() {
		// TODO Auto-generated method stub
		double[] sides = getSides();
		double sum = 0;
		for(double side : sides) {
			sum += side;
		}
		return sum;
	}

}
