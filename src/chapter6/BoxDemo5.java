package chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box();
        double vol;

        box1.setDim(12,21,3);
        box2.setDim(22,7,4);

        vol = box1.reVolume();
        System.out.println("box1 ־בתול "+vol);
        vol = box2.reVolume();
        System.out.println("box2 ־בתול "+vol);

    }
}
