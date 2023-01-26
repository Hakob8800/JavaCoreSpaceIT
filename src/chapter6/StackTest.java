package chapter6;

public class StackTest {
    public static void main(String[] args) {

        Stack stack1 = new Stack();

        for (int i = 0; i < 10; i++) {
            stack1.push(i);
        }

       if(stack1.pop()==4) System.out.println("4");


        System.out.println(stack1.pop());

    }
}
