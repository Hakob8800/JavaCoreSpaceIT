package chapter9.intStack;

import java.util.Arrays;

public class DynStack implements IntStack {

    private int[] arr;
    private int tos;

    public DynStack(int size) {
        arr = new int[size];
        tos = -1;
    }


    @Override
    public void push(int item) {
        if (tos == arr.length - 1) {
            extend();
        }
        arr[++tos] = item;

    }

    @Override
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else return arr[tos--];
    }

    private void extend() {
        int[] tmp = new int[arr.length * 2];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        arr = tmp;
    }
}
