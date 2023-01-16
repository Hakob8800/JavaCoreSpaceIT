package chapter7.varArgs;

public class VarArgsDemo {

    public static void main(String[] args) {

        VarArgs va = new VarArgs();
        va.test(1);
        va.test(1,2,2,3,23);
        va.test(1,34,32,12,4312,1,21,32,12,32,12,21);
        va.test();

    }

}
