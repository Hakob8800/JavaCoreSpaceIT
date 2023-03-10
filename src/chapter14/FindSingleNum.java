package chapter14;

public class FindSingleNum {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 3, 5, 2, 5};
        System.out.println(findSingleNum(arr));
        System.out.println(meth(arr));


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

    static int meth(int[] arr) {
        int res = 0;
        for (int j : arr) {
            res ^= j;
        }
        return res;
    }

}
