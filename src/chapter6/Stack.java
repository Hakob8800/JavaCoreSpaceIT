package chapter6;

public class Stack {

    private int[] stck = new int[10];
    private int tos = -1;


    public void push(int item) {
        if (tos == stck.length - 1) {
            extend();
        }
        stck[++tos] = item;

    }

    public int pop() {
        if (tos < 0) {
            return 0;
        } else {
            return stck[tos--];
        }
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    public int get(){
        if(tos<0){
            return -1;
        }
        else {
            return stck[tos];
        }

    }

    private void extend() {
        int[] tmp = new int[stck.length + 10];
        for (int i = 0; i < stck.length; i++) {
            tmp[i] = stck[i];
        }
        stck = tmp;
    }
}
