package homeWork.homeWork2;


public class ArrayUtil {
    public static void main(String[] args) {

        int[] arr = {23, 30, -23, 50, -45, 23, 34, 3, 7, 12};
        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("\nmax number: " + max);
        System.out.println("min number: " + min);

        int evenCount = 0;
        System.out.print("even numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                evenCount++;
            }
        }
        System.out.println("\nCount of even numbers: " + evenCount);

        int oddCount = 0;
        System.out.print("odd numbers: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                oddCount++;
            }
        }
        System.out.println("\nCount of odd numbers: " + oddCount);

        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("average value: " + sum / arr.length);
        System.out.println("sum of numbers: " + (int) sum);
        System.out.println("first element: " + arr[0]);
        System.out.println("last element: " + arr[arr.length - 1]);
        System.out.println("middle element: " + arr[arr.length / 2] + " (which index is " + arr.length / 2 + ")");
    }
}
