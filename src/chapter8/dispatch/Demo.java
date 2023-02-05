package chapter8.dispatch;

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A r;
        r = a;
        r.call();
        r = b;
        r.call();
        r = c;
        r.call();
    }
}
