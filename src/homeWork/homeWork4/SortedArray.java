package homeWork.homeWork4;


public class SortedArray {

    public static void main(String[] args) {

        int[] arr = {23, 3, 32, 5, 11, -5, -234, 111, 0};

        int breakPoint = arr.length;
        int tmp;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < breakPoint - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;
                }
            }
            breakPoint--;
        }
        for (int x : arr) {
            System.out.print(x + ", ");
        }
        System.out.println();


        breakPoint = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = arr.length - 1; i > breakPoint; i--) {
                if (arr[i] > arr[i - 1]) {
                    tmp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = tmp;
                }
            }
            breakPoint++;
        }
        for (int x : arr) {
            System.out.print(x + ", ");
        }

    }

}
