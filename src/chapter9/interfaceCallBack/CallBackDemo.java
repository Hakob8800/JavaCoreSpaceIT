package chapter9.interfaceCallBack;

public class CallBackDemo {
    public static void main(String[] args) {
        Client c = new Client();
        CallBack cb;
        c.callBack(4);
        c.myCallBack(5);
        cb = c;
        cb.callBack(45);
        //не можем вызивать метод myCallBack
    }
}
