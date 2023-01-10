package homeWork.homeWork5;

public class ArrayUtilMethods {

    int maxValueOfArray(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    int minValueOfArray(int[] arr) {
        int min = arr[0];
        for (int x : arr) {
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    void bubbleSort(int[] arr) {
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


}
