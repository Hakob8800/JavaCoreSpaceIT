package chapter8.figureArea;

public class Rectangle extends Figure {

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area () {
        return dim1 * dim2;
    }
}
