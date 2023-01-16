package chapter7.recurs;

import chapter7.recurs.Factorial;

public class RecursTest {

    public static void main(String[] args) {

        Factorial f = new Factorial();
        System.out.println(f.fact(6));
        System.out.println(f.fact(9));
        System.out.println(f.fact(12));

    }

}
