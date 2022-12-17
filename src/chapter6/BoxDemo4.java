package chapter6;

public class BoxDemo4 {
    public static void main(String[] args) {

        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.height = 8;
        myBox1.depth = 12;
        myBox1.width = 24;

        myBox2.width = 27;
        myBox2.height = 2;
        myBox2.depth = 13;

        vol = myBox1.reVolume();
        System.out.println("־בתול myBox1 נאגום " + vol);

        vol = myBox2.reVolume();
        System.out.println("־בתול myBox2 נאגום " + vol);
    }
}
