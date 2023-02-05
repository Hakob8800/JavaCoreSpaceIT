package homeWork.homeWork1;

public class IfForExample {
    public static void main(String[] args) {

        int a = 5;
        int b = 15;
        if (a > b) {
            System.out.println("max is: " + a);
        } else if (b > a) {
            System.out.println("max is: " + b);
        } else {
            System.out.println("a and b are equal");
        }

        for (int i = a; i <= b; i++) {
            System.out.print(i + ", ");
        }

        char c1 = (char) a;
        char c2 = (char) b;
        System.out.println("\nchar of number 5 is " + c1);
        System.out.println("char of number 15 is " + c2);

        if (a == b) {
            System.out.println("a and b are equal");
        } else {
            System.out.println("a and b are not equal");
        }


    }
}
