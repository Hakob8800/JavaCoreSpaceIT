package chapter8.box;

public class DemoSuper {

    public static void main(String[] args) {

        BoxWeight myBox1 = new BoxWeight(12, 3, 2, 3);
        BoxWeight myBox2 = new BoxWeight(12, 3);
        BoxWeight myBox3 = new BoxWeight();
        BoxWeight myBox4 = new BoxWeight(myBox1);
        BoxWeight myBox5 = new BoxWeight();


    }

}
