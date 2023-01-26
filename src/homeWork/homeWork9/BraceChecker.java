package homeWork.homeWork9;

import chapter6.Stack;

public class BraceChecker {

    private final String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                stack.push(arr[i]);
            }
            if (arr[i] == ')') {
                if ((char) stack.get() == '(') {
                    stack.pop();
                    continue;
                } else if (stack.get() == '[' || stack.get() == '{') {
                    System.out.println("Error! There is opened " + (char) stack.pop() + " but closed ), index:" + i);
                    return;
                } else {
                    System.out.println("Error! There is  no opened scope! index " + i);
                    return;
                }
            }

            if (arr[i] == ']') {
                if ((char) stack.get() == '[') {
                    stack.pop();
                    continue;
                } else if (stack.get() == '(' || stack.get() == '{') {
                    System.out.println("Error! There is opened " + (char) stack.pop() + " but closed ], index:" + i);
                    return;
                } else {
                    System.out.println("Error! There is  no opened scope! index " + i);
                    return;
                }
            }

            if (arr[i] == '}') {
                if ((char) stack.get() == '{') {
                    stack.pop();
                    continue;
                } else if (stack.get() == '[' || stack.get() == '(') {
                    System.out.println("Error! There is opened " + (char) stack.pop() + " but closed }, index:" + i);
                    return;
                } else {
                    System.out.println("Error! There is  no opened scope! index " + i);
                    return;
                }
            }

        }


    }

}

