package chapter3;

public class Average {
    public static void main(String[] args) {
        double nums[] = {10.2, 12.4, 21.3, 21.5, 32.2};
        double result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        System.out.println("Среднее значение равно " + result / nums.length);
    }
}
