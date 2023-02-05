package homeWork.homeWork9;

import chapter6.Stack;

public class BraceChecker {

    private final String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    final private Stack stack = new Stack();

    public void check() {

        char[] arr = text.toCharArray();
        char lastBrace = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                stack.push(arr[i]);
            }
            if (arr[i] == ')') {
                lastBrace = (char) stack.pop();
                if (lastBrace == 0) {
                    System.out.println("Error! There is no opened scope but it closed ) index:" + i);
                } else if (lastBrace != '(') {
                    System.out.println("Error! There is opened " + lastBrace + " but closed ), index:" + i);
                }
            }

            if (arr[i] == '}') {
                lastBrace = (char) stack.pop();
                if (lastBrace == 0) {
                    System.out.println("Error! There is no opened scope but it closed } index:" + i);
                } else if (lastBrace != '{') {
                    System.out.println("Error! There is opened " + lastBrace + " but closed }, index:" + i);
                }
            }

            if (arr[i] == ']') {
                lastBrace = (char) stack.pop();
                if (lastBrace == 0) {
                    System.out.println("Error! There is no opened scope but it closed ] index:" + i);
                } else if (lastBrace != '[') {
                    System.out.println("Error! There is opened " + lastBrace + " but closed ], index:" + i);
                }
            }
        }
        while (!stack.isEmpty()) {
            System.out.println("Error! there is opened " + (char) stack.pop() + " but not closed");
        }

    }

}

