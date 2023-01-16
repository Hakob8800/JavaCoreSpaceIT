package chapter6;

public class StackTest {
    public static void main(String[] args) {

        Stack stack1 = new Stack(10);

        for (int i = 0; i < 10; i++) {
            stack1.push((i+3)*2);
        }
        stack1.push(3);

        for (int i = 0; i < 10; i++) {
            System.out.println(stack1.pop());
        }
        System.out.println(stack1.pop());

    }
}
