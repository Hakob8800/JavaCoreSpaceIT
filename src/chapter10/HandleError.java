package chapter10;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 1;
        int b = 1;
        int c = 1;
        for (int i = 0; i < 20; i++) {
            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println(e);
                a = 0;
            }
            System.out.println(a);
            System.out.println("b:" + b + ", c:" + c);
        }
    }
}
