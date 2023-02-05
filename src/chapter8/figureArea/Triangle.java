package chapter8.figureArea;

public class Triangle extends Figure {

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area() {
        return dim1 * dim2 / 2;
    }

}
