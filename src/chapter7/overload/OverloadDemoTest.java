package chapter7.overload;

import chapter7.overload.OverloadDemo;

public class OverloadDemoTest {
    public static void main(String[] args) {

        OverloadDemo ovd = new OverloadDemo();
        ovd.test();
        ovd.test(2);
        ovd.test(3.8);
        ovd.test(54,45);

    }
}
