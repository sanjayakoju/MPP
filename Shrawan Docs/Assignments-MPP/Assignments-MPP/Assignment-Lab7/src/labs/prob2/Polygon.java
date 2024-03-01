package labs.prob2;

public interface Polygon extends ClosedCurve{

    double[] getSides();

    @Override
    default double computePerimeter() {
        double totPerimeter = 0;
        for(double d: getSides()) {
            totPerimeter += d;
        }
        return totPerimeter;
    }
}
