package chapter7;

public class PassOb {
    public static void main(String[] args) {

        Test ob1 = new Test(12,21);
        Test ob2 = new Test(12,21);
        Test ob3 = new Test(23,22);
        System.out.println(ob1.equalTo(ob2));
        System.out.println(ob1.equalTo(ob3));
        System.out.println(ob2.equalTo(ob3));
    }
}
