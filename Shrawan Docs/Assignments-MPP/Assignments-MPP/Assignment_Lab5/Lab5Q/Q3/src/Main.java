import figures.Circle;
import figures.FigureShape;
import figures.Rectangle;
import figures.Triangle;

public class Main {
    public static void main(String[] args) {
        FigureShape[] figureShapes = {new Circle(2), new Rectangle(4, 7), new Triangle(5, 10)};
        double totalArea = 0;
        for (FigureShape figureShape : figureShapes) {
            double v = figureShape.computeArea();
            totalArea += v;
        }
        System.out.println("Sum of Areas " + totalArea);

    }
}
