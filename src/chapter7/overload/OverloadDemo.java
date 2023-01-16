package chapter7.overload;

public class OverloadDemo {

    void test() {
        System.out.println("method without parameters");
    }

    void test(int a) {
        System.out.println("method with single parameter a " + a);
    }

    void test(int a, int b) {
        System.out.println("method with two parameters a and b " + a + " " + b);
    }

    void test(double d) {
        System.out.println("method with one parameter type double " + d);
    }

}
