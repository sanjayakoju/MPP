package figures;

public class Triangle implements FigureShape{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return 1/2 * this.base * this.height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
}
