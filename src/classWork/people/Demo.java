package classWork.people;

import java.util.Collections;

public class Demo {

    public static void main(String[] args) {

        People ob1 = new People("Bob",52);
        People ob2 = new People("Mike",14);
        People ob3 = new People("Helen",24);
        People ob4 = new People("Jack",25);

        People[] arr = new People[10];
        arr[0]=ob1;
        arr[1]=ob2;
        arr[2]=ob3;
        arr[3]=ob4;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                System.out.println(arr[i].toString());
            }
        }

    }

}
