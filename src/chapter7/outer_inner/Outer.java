package chapter7.outer_inner;

public class Outer {

    int outerX = 12;

    void test(){
        Inner inner = new Inner();
        inner.displayX();
    }

    class Inner{
        void displayX(){
            System.out.println("OuterX is "+outerX);
        }
    }

}
