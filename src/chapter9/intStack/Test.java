package chapter9.intStack;

import chapter9.interfaceCallBack.CallBack;

public class Test {
    public static void main(String[] args) {
        FixedStack fs = new FixedStack(5);
        DynStack ds = new DynStack(5);
        fs.push(3);
        fs.push(3);
        fs.push(3);
        fs.push(3);
        fs.push(3);
        fs.push(3);
        System.out.println(fs.pop());
        System.out.println(fs.pop());
        System.out.println(fs.pop());
        System.out.println(fs.pop());
        System.out.println(fs.pop());
        System.out.println(fs.pop());
        ds.push(4);
        ds.push(4);
        ds.push(4);
        ds.push(4);
        ds.push(4);
        ds.push(4);
        ds.push(4);
        ds.push(4);
        System.out.println(ds.pop());
        System.out.println(ds.pop());
        System.out.println(ds.pop());
        System.out.println(ds.pop());
        ds.clear();
        CallBack.sayHi();
    }
}
