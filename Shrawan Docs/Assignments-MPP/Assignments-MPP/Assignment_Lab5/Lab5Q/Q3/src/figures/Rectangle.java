package figures;

public class Rectangle implements FigureShape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double computeArea() {
        return this.width * this.length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
