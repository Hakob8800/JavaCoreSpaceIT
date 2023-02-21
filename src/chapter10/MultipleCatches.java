package chapter10;

public class MultipleCatches {

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 10 / a;
            System.out.println(args[0]);
            int[] arr = {1};
            arr[3]=1;
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

}
