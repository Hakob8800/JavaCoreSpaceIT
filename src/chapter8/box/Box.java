package chapter8.box;

public class Box {
    private int width;
    private int height;
    private int depth;

    Box(Box ob) {
        width = ob.width;
        depth = ob.depth;
        height = ob.height;
    }

    Box(int width, int depth, int height) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    Box() {
        depth = -1;
        height = -1;
        width = -1;
    }

    Box(int len) {
        width = height = depth = len;
    }

    int volume() {
        return width * depth * height;
    }
}
