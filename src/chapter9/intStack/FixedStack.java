package chapter9.intStack;

public class FixedStack implements IntStack {

    private int[] arr;
    private int tos;

    public FixedStack(int size) {
        arr = new int[size];
        tos = -1;
    }
    public void push(int item){
        if(tos==arr.length-1){
            System.out.println("Stack is full");
        }
        else arr[++tos]=item;
    }

    public int pop(){
        if(tos<0){
            System.out.println("Stack is empty");
            return 0;
        }
        else return arr[tos--];
    }

}
