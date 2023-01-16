package chapter7.static_;

public class UseStatic {

    final static int a = 10;
    static int b;

    static void meth(int x) {
        System.out.println("x is " + x);
        System.out.println("a is " + a);
        System.out.println("b is " + b);
    }

    static {
        b = a * 3;
        System.out.println("here is b init");
    }

    public static void main(String[] args) {
        meth(56);
    }
}

