package chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.depth = 10;
        myBox.height = 15;
        myBox.width = 20;
        double vol;
        vol = myBox.depth * myBox.height * myBox.width;
        System.out.println("־בתול נאגום " + vol);
    }
}
