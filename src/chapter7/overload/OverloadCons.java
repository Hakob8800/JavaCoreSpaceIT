package chapter7.overload;

public class OverloadCons {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box(6,4,2);
        Box myBox3 = new Box(7);
        System.out.println(myBox1.volume());
        System.out.println(myBox2.volume());
        System.out.println(myBox3.volume());
    }
}
