package figures;

public class Circle implements FigureShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getRadius() {
        return radius;
    }
}
