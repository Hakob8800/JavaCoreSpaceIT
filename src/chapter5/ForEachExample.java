package chapter5;

import javax.naming.BinaryRefAddr;

public class ForEachExample {

    public static void main(String[] args) {
        int[] arr = {34, 45, 23, 4, 677, 3, 21};
        int sum = 0;
        for (int x : arr) {
            System.out.println(x);
            sum+=x;
        }
    }

}

