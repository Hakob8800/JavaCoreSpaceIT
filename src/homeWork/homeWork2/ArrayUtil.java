package homeWork.homeWork2;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] arr = {23, 37, 23, 5, -45, -23, 34, 3, 7, 12};
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
        System.out.println("\nmax is " + max);
        System.out.println("min is " + min);

    }
}
