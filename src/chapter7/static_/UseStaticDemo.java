package chapter7.static_;

import chapter7.static_.UseStatic;

public class UseStaticDemo {

    public static void main(String[] args) {
        UseStatic.meth(12);
        UseStatic.b = 32;
        UseStatic.meth(76);

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
    }

}
