package homeWork.homeWork7;

public class Calculator {

    double plus(int a, int b) {
        return a + b;
    }

    double minus(int a, int b) {
        return a - b;
    }

    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("cannot be divided by zero");
            return -1;
        }
        return a / b;
    }

    double multiply(int a, int b) {
        return a * b;
    }

}
