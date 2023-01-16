package chapter7;

public class Test {

    int a;
    int b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    boolean equalTo(Test ob) {
        return ob.a == a && ob.b == b;
    }
}
