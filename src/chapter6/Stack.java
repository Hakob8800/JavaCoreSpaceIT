package chapter6;

public class Stack {

     private int[] stck;
     private int tos;

    Stack(int size){
        stck = new int[size];
        tos = -1;
    }

    void push(int item){
        if(tos==stck.length-1){
            System.out.println("stack is full");
        }
        else {
            stck[++tos]=item;
        }
    }
    int pop(){
        if(tos<0){
            System.out.println("stack is empty");
            return 0;
        }
        else {
            return stck[tos--];
        }
    }
}
