package chapter9.interfaceCallBack;

public class Client implements CallBack {

    @Override
    public void callBack(int p) {
        System.out.println("method callBack from interface with parametr " + p);
    }

    public void myCallBack(int p) {
        System.out.println("method myCallBack from class with parametr " + p);
    }
}
