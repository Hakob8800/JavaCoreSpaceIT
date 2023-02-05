package chapter8.figureArea;

public class FindAreas {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(5.5, 3.3);
        Triangle t = new Triangle(23.3, 32.2);
        Figure figRef;

        figRef = r;
        System.out.println("Area of rectangle = " + figRef.area());
        figRef = t;
        System.out.println("Area of triangle = "+figRef.area());


    }

}
