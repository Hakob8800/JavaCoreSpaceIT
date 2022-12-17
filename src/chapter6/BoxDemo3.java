package chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {

        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.height = 12;
        myBox1.depth = 14;
        myBox1.width = 22;

        myBox2.width = 24;
        myBox2.height = 32;
        myBox2.depth = 33;

        myBox1.volume();
        myBox2.volume();
    }
}
