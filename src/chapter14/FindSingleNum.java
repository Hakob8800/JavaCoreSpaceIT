package chapter14;

import java.util.Arrays;

public class FindSingleNum {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 3, 5, 2, 5, 3, 1, 1, 9};
        System.out.println(findSingleNum(arr));
        System.out.println(xorMeth(arr));
        System.out.println(sortMeth(arr));


    }

    static int findSingleNum(int[] arr) {
        int ind = arr.length - 1;
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int k : arr) {
                if (k == arr[ind]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[ind];
            }
            ind--;

        }
        return 0;
    }

    static int xorMeth(int[] arr) {
        int res = 0;
        for (int j : arr) {
            res ^= j;
        }
        return res;
    }

    static int sortMeth(int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }

}
