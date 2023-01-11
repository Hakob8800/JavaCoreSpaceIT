package homeWork.homeWork5;

public class ArrayUtilMethods {

    public void maxValueOfArray(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        System.out.println("Max is: " + max);
    }

    public void minValueOfArray(int[] arr) {
        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        System.out.println("Min is: " + min);
    }

    public void bubbleSort(int[] arr) {
        int tmp = 0;
        int length = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < length; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
            length--;
        }
    }

    public void evenCount(int[] arr) {
        int evenCount = 0;
        for (int x : arr) {
            if (x % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Count of even numbers: " + evenCount);
    }

    public void oddCount(int[] arr) {
        int oddCount = 0;
        for (int x : arr) {
            if (x % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Count of odd numbers: " + oddCount);
    }

    public void sumOfArr(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        System.out.println("sum of numbers: " + sum);
    }


}
