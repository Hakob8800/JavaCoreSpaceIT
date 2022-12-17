package chapter6;

public class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }
    Box(){

    }

    public void volume() {
        System.out.println("־בתול נאגום " + width * depth * height);
    }

    public double reVolume() {
        return width * depth * height;
    }

    public void setDim(double h, double w, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
