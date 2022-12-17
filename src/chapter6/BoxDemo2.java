package chapter6;

public class BoxDemo2 {
    public static void main(String[] args) {

        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.depth = 10;
        myBox1.width = 15;
        myBox1.height = 20;
        double vol;
        vol = myBox1.depth * myBox1.height * myBox1.width;
        System.out.println("־בתול myBox1 = " + vol);

        myBox2.height = 8;
        myBox2.depth = 12;
        myBox2.width = 14;
        vol = myBox2.height * myBox2.width * myBox2.depth;
        System.out.println("־בתול myBox2 = "+ vol);
    }
}
