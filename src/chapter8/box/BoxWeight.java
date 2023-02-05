package chapter8.box;

public class BoxWeight extends Box {

    int weight;

    BoxWeight(BoxWeight o) {
        super(o);
        weight = o.weight;
    }

    BoxWeight(int weight, int height, int depth, int width) {
        super(width, depth, height);
        this.weight = weight;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(int len, int m) {
        super(len);
        weight = m;
    }



}
