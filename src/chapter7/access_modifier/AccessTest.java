package chapter7.access_modifier;

import chapter7.access_modifier.ModifierTest;

public class AccessTest {

    public static void main(String[] args) {

        ModifierTest modTest = new ModifierTest();
        modTest.a = 10;
        modTest.b = 12;
        //modTest.c = 14; /// Œÿ»¡ ¿ ///
        modTest.setC(14);

    }

}
