package chapter7.overload;

public class Box {

    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box() {
        width = -1;
        depth = -1;
        height = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * depth * height;
    }
}
