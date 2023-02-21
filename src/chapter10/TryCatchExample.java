package chapter10;

public class TryCatchExample {
    static void byZero(){
        int a = 0;
        int b = 12/a;
    }
    public static void main(String[] args)  {
      try{
          int a = 9;
          byZero();
      }
      catch (ArithmeticException e){
          System.out.println(e);
      }
        System.out.println("after catch");
    }
}
